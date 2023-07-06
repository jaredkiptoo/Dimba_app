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
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignupActivity : AppCompatActivity() {
    lateinit var login : TextView
    lateinit var signup : Button
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var configpassword: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        login = findViewById(R.id.login1)
        signup = findViewById(R.id.btn_signup)
        email = findViewById(R.id.email)
        password = findViewById(R.id.Password)
        configpassword = findViewById(R.id.Confirmpassword)
        auth = Firebase.auth

        login.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }
        signup.setOnClickListener {
            SignUpUser()
        }
    }
    private fun SignUpUser(){
        val email = email.text.toString()
        val pass = password.text.toString()
        val configmpass = configpassword.text.toString()
        if (email.isBlank() || pass.isBlank() || configmpass.isBlank()){
            Toast.makeText(this,"Please Email and password can't be blank", Toast.LENGTH_LONG).show()
            return
        }
        else if (pass !=configmpass){
            Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
            return
        }

        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Signed up successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this,DashboardActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Failed to create", Toast.LENGTH_LONG).show()
            }

        }

    }
}