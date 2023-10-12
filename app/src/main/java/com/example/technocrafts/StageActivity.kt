package com.example.technocrafts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage)


        // Retrieve user inputs of Infra from the intent
        val input1 = intent.getStringExtra(InfraActivity.KEY1)
        val input2 = intent.getStringExtra(InfraActivity.KEY2)
        val input3 = intent.getStringExtra(InfraActivity.KEY3)
        val input4 = intent.getStringExtra(InfraActivity.KEY4)


        // Retrieve user inputs of Investor from the intent
        val input5 = intent.getStringExtra(InvestorActivity.KEY1)
        val input6 = intent.getStringExtra(InvestorActivity.KEY2)
        val input7 = intent.getStringExtra(InvestorActivity.KEY3)
        val input8 = intent.getStringExtra(InvestorActivity.KEY4)
    }
}