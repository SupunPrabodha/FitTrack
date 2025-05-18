package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.addCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Walk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_walk)

        // Handle back button press
        onBackPressedDispatcher.addCallback(this) {
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val profile = findViewById<ImageView>(R.id.imageView6)
        profile.setOnClickListener {

            val intent = Intent(this, UserAccount::class.java)
            startActivity(intent)
            finish()
        }
        val back = findViewById<ImageView>(R.id.imageButton14)
        back.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
    }
}