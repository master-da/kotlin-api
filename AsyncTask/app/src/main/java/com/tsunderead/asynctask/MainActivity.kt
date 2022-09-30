package com.tsunderead.asynctask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeActivityButton = findViewById<Button>(R.id.changeActivity);
        changeActivityButton.setOnClickListener {
            val intent = Intent(this@MainActivity, AsyncTaskActivity::class.java)
            startActivity(intent)
        }
    }
}