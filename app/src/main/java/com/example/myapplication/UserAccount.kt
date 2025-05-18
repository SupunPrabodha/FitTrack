package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_account)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val back = findViewById<ImageView>(R.id.imageButton16)
        back.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }


        val prof = findViewById<TextView>(R.id.profile)
        prof.setOnClickListener {

            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }

        val logout = findViewById<TextView>(R.id.button22)
        logout.setOnClickListener {

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}