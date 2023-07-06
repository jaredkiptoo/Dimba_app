package com.example.dimba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AngeloNewsActivity : AppCompatActivity() {
    lateinit var close1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angelo_news)

        close1 = findViewById(R.id.close1)

        close1.setOnClickListener {
            val intent = Intent(this, TransfersActivity::class.java)
            startActivity(intent)
        }
    }
}