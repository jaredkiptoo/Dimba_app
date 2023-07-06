package com.example.dimba

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    lateinit var email : ImageView
    lateinit var phone : ImageView
    lateinit var twitter : ImageView
    lateinit var instagram : ImageView
    lateinit var dashboard3 : ImageView
    lateinit var maps : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        email = findViewById(R.id.emailarrow)
        phone = findViewById(R.id.phonearrow)
        twitter= findViewById(R.id.twitterarrow)
        instagram= findViewById(R.id.instagramarrow)
        dashboard3 = findViewById(R.id.dashboard3)
        maps = findViewById(R.id.addressarrow)

        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "dimbasolutions@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Dimba Application")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Sir,..")
            startActivity(Intent.createChooser(emailIntent, "Send email"))

        }

        phone.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0790751743")
            startActivity(dialIntent)
        }

        twitter.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Dimba_1"))
            startActivity(browserIntent)
        }

        instagram.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/dimba_4/"))
            startActivity(browserIntent)
        }

        dashboard3.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        maps.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}