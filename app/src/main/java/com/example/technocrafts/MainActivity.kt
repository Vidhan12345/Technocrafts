package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnbusIntent = findViewById<Button>(R.id.bus)

        btnbusIntent.setOnClickListener{
            intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
    }
        val btngovIntent = findViewById<Button>(R.id.gov)

        btngovIntent.setOnClickListener{
            intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
    }
}}