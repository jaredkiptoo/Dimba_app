package com.example.dimba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TransfersActivity : AppCompatActivity() {
    lateinit var dashboard2 : ImageView
    lateinit var pulisicnews : TextView
    lateinit var loftusnews : TextView
    lateinit var gundogannews : TextView
    lateinit var kanenews : TextView
    lateinit var pogbanews : TextView
    lateinit var maddisonnews : TextView
    lateinit var angelonews : TextView
    lateinit var fabionews : TextView
    lateinit var conornews : TextView
    lateinit var kimnews : TextView
    lateinit var firminonews : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfers)

        dashboard2 = findViewById(R.id.dashboard2)
        pulisicnews = findViewById(R.id.pulisicnews)
        loftusnews = findViewById(R.id.loftusnews)
        gundogannews = findViewById(R.id.gundogannews)
        kanenews = findViewById(R.id.kanenews)
        pogbanews = findViewById(R.id.pogbanews)
        maddisonnews = findViewById(R.id.maddisonnews)
        angelonews = findViewById(R.id.angelonews)
        fabionews = findViewById(R.id.fabionews)
        conornews = findViewById(R.id.conornews)
        kimnews = findViewById(R.id.kimnews)
        firminonews = findViewById(R.id.firminonews)

        dashboard2.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        pulisicnews.setOnClickListener {
            val intent = Intent(this, PulisicNewsActivity::class.java)
            startActivity(intent)
        }
        loftusnews.setOnClickListener {
            val intent = Intent(this, LoftusNewsActivity::class.java)
            startActivity(intent)
        }
        gundogannews.setOnClickListener {
            val intent = Intent(this, GundoganNewsActivity::class.java)
            startActivity(intent)
        }
        kanenews.setOnClickListener {
            val intent = Intent(this, KaneNewsActivity::class.java)
            startActivity(intent)
        }
        pogbanews.setOnClickListener {
            val intent = Intent(this, PogbaNewsActivity::class.java)
            startActivity(intent)
        }
        maddisonnews.setOnClickListener {
            val intent = Intent(this, MaddisonNewsActivity::class.java)
            startActivity(intent)
        }
        angelonews.setOnClickListener {
            val intent = Intent(this, AngeloNewsActivity::class.java)
            startActivity(intent)
        }
        fabionews.setOnClickListener {
            val intent = Intent(this, FabioNewsActivity::class.java)
            startActivity(intent)
        }
        conornews.setOnClickListener {
            val intent = Intent(this, ConorNewsActivity::class.java)
            startActivity(intent)
        }
        kimnews.setOnClickListener {
            val intent = Intent(this, KimNewsActivity::class.java)
            startActivity(intent)
        }
        firminonews.setOnClickListener {
            val intent = Intent(this, FirminoNewsActivity::class.java)
            startActivity(intent)
        }

    }
}