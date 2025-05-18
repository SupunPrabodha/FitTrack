package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val walk = findViewById<ImageView>(R.id.walk)
        walk.setOnClickListener {

            val intent = Intent(this, Walk::class.java)
            startActivity(intent)
            finish()
        }

        val sleep = findViewById<ImageView>(R.id.sleep)
        sleep.setOnClickListener {

            val intent = Intent(this, Sleep::class.java)
            startActivity(intent)
            finish()
        }

        val water = findViewById<ImageView>(R.id.water)
        water.setOnClickListener {

            val intent = Intent(this, Water::class.java)
            startActivity(intent)
            finish()
        }

        val heart = findViewById<ImageView>(R.id.heart)
        heart.setOnClickListener {

            val intent = Intent(this, Heart::class.java)
            startActivity(intent)
            finish()
        }

        val diet = findViewById<ImageView>(R.id.diet)
        diet.setOnClickListener {

            val intent = Intent(this, Diet::class.java)
            startActivity(intent)
            finish()
        }

        val profile = findViewById<ImageView>(R.id.imageView3)
        profile.setOnClickListener {

            val intent = Intent(this, UserAccount::class.java)
            startActivity(intent)
            finish()
        }
    }
}