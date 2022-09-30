package com.tsunderead.kotlin_api

import android.os.AsyncTask
import android.util.Log
import com.tsunderead.asynctask.helperpackage.NetworkCaller
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class ApiCall(private val parent: NetworkCaller<JSONObject>): AsyncTask<String, Void, JSONObject>() {

    private val tag = "apicall"
    private val api_url = "https://api.mangadex.org"
    override fun onPreExecute() {
        Log.i(tag, "Starting APICALL")
    }

    override fun doInBackground(vararg param: String?): JSONObject? {
        val url = URL("$api_url/${param[0]}")
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        try {
            Log.i(tag, conn.toString())
            conn.connect()
            val inputStream = InputStreamReader(conn.inputStream)
            val reader = BufferedReader(inputStream)

            val output = StringBuilder()
            var line: String?;
            while(reader.readLine().also { line = it} != null) {
                publishProgress()
                output.append(line)
            }

            return JSONObject(output.toString())
        } catch (error: Exception) {
            Log.e(tag, error.toString())
            cancel(false)
        }
        return null
    }

    override fun onProgressUpdate(vararg values: Void?) {
        Log.v(tag, "New Line Received")
    }

    override fun onPostExecute(result: JSONObject?) {
        parent.onNetworkCallSuccess(result)
    }

    override fun onCancelled () {
        parent.onNetworkCallFail()
    }
}