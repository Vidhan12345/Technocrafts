package com.example.technocrafts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class PastDetailActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_past_detail)

        val confirm = findViewById<Button>(R.id.btncnf)
//        val comname = findViewById<Button>(R.id.name)
        var mutual = findViewById<Button>(R.id.mutual)
        var investor = findViewById<Button>(R.id.investor)
        var raise = findViewById<Button>(R.id.raise)
        var raisedlast = findViewById<Button>(R.id.raisedlast)
        var promoters = findViewById<Button>(R.id.promoters)
        var shareholder = findViewById<Button>(R.id.shareholder)
//        val comval = findViewById<Button>(R.id.comval)

        confirm.setOnClickListener{

//            val com_name = comname.text.toString()
            val mutual_fund = mutual.text.toString()
            val inves_tor =investor.text.toString()
            val raise_r = raise.text.toString()
            val raised_last = raisedlast.text.toString()
            val promo_ters = promoters.text.toString()
            val share_holder = shareholder.text.toString()
//            val com_val =comval.text.toString()

            val data = Investor(mutual_fund,inves_tor,raise_r,raised_last,promo_ters,share_holder)
            database = FirebaseDatabase.getInstance().getReference("PassData")

            database.child(mutual_fund).setValue(data).addOnSuccessListener {
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
        }


    }
