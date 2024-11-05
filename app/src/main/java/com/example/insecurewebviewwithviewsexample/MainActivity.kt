package com.example.exportedwebviewwithviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openWebViewButton = findViewById<Button>(R.id.openWebViewButton)
        openWebViewButton.setOnClickListener {
            Log.i("MainActivity", "Button clicked")
            val url = "https://www.smh.com.au"
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url", url)
            startActivity(intent)
        }
    }
}