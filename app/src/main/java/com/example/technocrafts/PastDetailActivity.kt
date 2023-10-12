package com.example.technocrafts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class PastDetailActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_detail)

        val confirm = findViewById<Button>(R.id.btncnf)
        val comname = findViewById<Button>(R.id.name)
        val mutual = findViewById<Button>(R.id.mutual)
        val investor = findViewById<Button>(R.id.investor)
        val raise = findViewById<Button>(R.id.raise)
        val raisedlast = findViewById<Button>(R.id.raisedlast)
        val promoters = findViewById<Button>(R.id.promoters)
        val shareholder = findViewById<Button>(R.id.shareholder)
        val comval = findViewById<Button>(R.id.comval)

        confirm.setOnClickListener{

            val com_name = comname.text.toString()
            val mutual_fund = mutual.text.toString()
            val inves_tor =investor.text.toString()
            val raise_r = raise.text.toString()
            val raised_last = raisedlast.text.toString()
            val promo_ters = promoters.text.toString()
            val share_holder = shareholder.text.toString()
            val com_val =comval.text.toString()

            Investor(com_name,mutual_fund,inves_tor,raise_r,raised_last,promo_ters,share_holder,com_val)
            database = FirebaseDatabase.getInstance().getReference("PastData")
        }

    }
}