package com.example.dimba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SigninActivity : AppCompatActivity() {
    lateinit var register : TextView
    lateinit var signin : Button
    private lateinit var email1: EditText
    private lateinit var password1: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        register = findViewById(R.id.register)
        signin = findViewById(R.id.btn_signin)
        email1 = findViewById(R.id.email1)
        password1 = findViewById(R.id.Password1)
        auth = FirebaseAuth.getInstance()

        register.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        signin.setOnClickListener {
            login()
        }

    }
    private fun login(){
        val email = email1.text.toString()
        val pass = password1.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Successfully LoggedIn", Toast.LENGTH_LONG).show()
                val intent = Intent(this,DashboardActivity::class.java)
                startActivity(intent)

            }
            else{
                Toast.makeText(this,"Log In failed", Toast.LENGTH_LONG).show()
            }
        }

    }
}