package com.tsunderead.asynctask

import android.os.AsyncTask.execute
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.tsunderead.kotlin_api.ApiCall

class AsyncTaskActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)

        val apicall = findViewById<Button>(R.id.apicall)
        apicall.setOnClickListener {
            ApiCall().execute("manga")
        }

    }
}