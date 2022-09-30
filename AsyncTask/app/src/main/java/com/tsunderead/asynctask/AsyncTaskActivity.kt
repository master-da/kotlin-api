package com.tsunderead.asynctask

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tsunderead.asynctask.helperpackage.NetworkCaller
import com.tsunderead.asynctask.helperpackage.RCAdapter
import com.tsunderead.asynctask.helperpackage.RCItem
import com.tsunderead.kotlin_api.ApiCall
import org.json.JSONObject

class AsyncTaskActivity : AppCompatActivity(), NetworkCaller<JSONObject> {

    private var tag = "Main"
    lateinit var recyclerView: RecyclerView
    lateinit var lst: ArrayList<RCItem>
    lateinit var apiResponce: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)

        recyclerView = findViewById(R.id.mangaList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        lst = arrayListOf<RCItem>()

        apiResponce = findViewById(R.id.apiResponce)
        val apicall = findViewById<Button>(R.id.apicall)
        apicall.setOnClickListener {
            apiResponce.text = "Starting api call..."
            ApiCall(this).execute("manga")
        }

    }

    // Overrides NetworkCaller methods
    override fun onNetworkCallSuccess(result: JSONObject?) {


        val mangaList = result!!.getJSONArray("data")
        apiResponce.text = "Api Call Successful\nReceived ${mangaList.length()} data"

        for (manga in 0 until mangaList.length()) {
            var title: String = ""
            try {
                title = mangaList.getJSONObject(manga).getJSONObject("attributes").getJSONObject("title").getString("en")
            } catch (er: Exception) {
                Log.e(tag, er.toString());
                title = manga.toString()
            } finally {
                lst.add(RCItem("Title $title"))
            }
        }
Log.i(tag, lst.toString())
        recyclerView.adapter = RCAdapter(lst)
    }

    override fun onNetworkCallFail() {
        Log.e(tag, "Network Call Failed")
    }
}