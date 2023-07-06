package com.example.dimba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    lateinit var dashboard : ImageView
    lateinit var notifications : ImageView
    lateinit var gornews : TextView
    lateinit var kitnews : TextView
    lateinit var glazernews : TextView
    lateinit var roynews : TextView
    lateinit var ericnews : TextView
    lateinit var messinews : TextView
    lateinit var internews : TextView
    lateinit var pepnews : TextView
    lateinit var davidnews : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        dashboard = findViewById(R.id.dashboard)
        notifications = findViewById(R.id.notifications)
        gornews = findViewById(R.id.gornews)
        kitnews = findViewById(R.id.kitnews)
        glazernews = findViewById(R.id.glazernews)
        roynews = findViewById(R.id.roynews)
        ericnews = findViewById(R.id.ericnews)
        messinews = findViewById(R.id.messinews)
        internews = findViewById(R.id.internews)
        pepnews = findViewById(R.id.pepnews)
        davidnews = findViewById(R.id.davidnews)

        dashboard.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        notifications.setOnClickListener {
            val intent = Intent(this, StatsActivity::class.java)
            startActivity(intent)
        }
        gornews.setOnClickListener {
            val intent = Intent(this, GorNewsActivity::class.java)
            startActivity(intent)
        }
        kitnews.setOnClickListener {
            val intent = Intent(this, ManUkitActivity::class.java)
            startActivity(intent)
        }
        glazernews.setOnClickListener {
            val intent = Intent(this, GlazerNewsActivity::class.java)
            startActivity(intent)
        }
        roynews.setOnClickListener {
            val intent = Intent(this, RoyNewsActivity::class.java)
            startActivity(intent)
        }
        ericnews.setOnClickListener {
            val intent = Intent(this, EricNewsActivity::class.java)
            startActivity(intent)
        }
        messinews.setOnClickListener {
            val intent = Intent(this, MessiNewsActivity::class.java)
            startActivity(intent)
        }
        messinews.setOnClickListener {
            val intent = Intent(this, InterNewsActivity::class.java)
            startActivity(intent)
        }
        pepnews.setOnClickListener {
            val intent = Intent(this, PepNewsActivity::class.java)
            startActivity(intent)
        }
        davidnews.setOnClickListener {
            val intent = Intent(this, DavidNewsActivity::class.java)
            startActivity(intent)
        }
        internews.setOnClickListener {
            val intent = Intent(this, InterNewsActivity::class.java)
            startActivity(intent)
        }
    }
}