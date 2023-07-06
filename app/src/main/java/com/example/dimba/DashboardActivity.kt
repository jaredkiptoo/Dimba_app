package com.example.dimba

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.NonCancellable.cancel

class DashboardActivity : AppCompatActivity() {
    lateinit var home: CardView
    lateinit var transfer:CardView
    lateinit var premier:CardView
    lateinit var laliga:CardView
    lateinit var profile:CardView
    lateinit var logout:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home =findViewById(R.id.cardHome)
        transfer = findViewById(R.id.cardTransfers)
        premier =findViewById(R.id.cardPremierleague)
        laliga =findViewById(R.id.cardLaliga)
        profile =findViewById(R.id.cardProfile)
        logout = findViewById(R.id.cardLogout)


        home.setOnClickListener {
            Toast.makeText(applicationContext,"Welcome", Toast.LENGTH_LONG).show()
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        transfer.setOnClickListener {
            Toast.makeText(applicationContext,"Transfers",Toast.LENGTH_LONG).show()
            val intent = Intent(this,TransfersActivity::class.java)
            startActivity(intent)
        }
        premier.setOnClickListener {
            Toast.makeText(applicationContext,"Premier League",Toast.LENGTH_LONG).show()
            val intent = Intent(this,PremierLeagueActivity::class.java)
            startActivity(intent)
        }
        laliga.setOnClickListener {
            Toast.makeText(applicationContext,"Laliga",Toast.LENGTH_LONG).show()
            val intent = Intent(this,TableActivity::class.java)
            startActivity(intent)
        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext,"Profile",Toast.LENGTH_LONG).show()
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
        logout.setOnClickListener {
            Toast.makeText(applicationContext, "Logout", Toast.LENGTH_LONG).show()
            var box = AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED",DialogInterface.OnClickListener { dialog, id ->finishAffinity()  })
            box.setNegativeButton("CANCEL",DialogInterface.OnClickListener { dialog, id ->NonCancellable.cancel()  })

            var alert=box.create()
            alert.setTitle("Dimba")
            alert.show()


        }
    }
}