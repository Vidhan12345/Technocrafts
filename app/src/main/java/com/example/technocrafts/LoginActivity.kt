package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnsignIntent = findViewById<Button>(R.id.btnSignUp)

        btnsignIntent.setOnClickListener {
            intent = Intent(applicationContext,InfraActivity::class.java)
            startActivity(intent)
        }
    }
}