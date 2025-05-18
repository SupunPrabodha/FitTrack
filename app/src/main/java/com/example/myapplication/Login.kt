package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<TextView>(R.id.SignUp_txt)
        button.setOnClickListener {

            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }
        val login = findViewById<TextView>(R.id.Login)
        login.setOnClickListener {

            val intent = Intent(this, OnboardScreen1::class.java)
            startActivity(intent)
            finish()
        }
    }
}