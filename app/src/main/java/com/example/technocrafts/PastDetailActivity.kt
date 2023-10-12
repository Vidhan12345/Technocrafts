package com.example.technocrafts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class PastDetailActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_past_detail)

        val confirm = findViewById<Button>(R.id.btncnf)
        val comname = findViewById<TextInputEditText>(R.id.name)
        val mutual = findViewById<TextInputEditText>(R.id.mutual)
        val investor = findViewById<TextInputEditText>(R.id.investor)
        val raise = findViewById<TextInputEditText>(R.id.raise)
        val raisedlast = findViewById<TextInputEditText>(R.id.raisedlast)
        val promoters = findViewById<TextInputEditText>(R.id.promoters)
        val shareholder = findViewById<TextInputEditText>(R.id.shareholder)
        val comval = findViewById<TextInputEditText>(R.id.comval)

        confirm.setOnClickListener{

            val com_name = comname.text.toString()
            val mutual_fund = mutual.text.toString()
            val inves_tor =investor.text.toString()
            val raise_r = raise.text.toString()
            val raised_last = raisedlast.text.toString()
            val promo_ters = promoters.text.toString()
            val share_holder = shareholder.text.toString()
            val com_val =comval.text.toString()

            val data = Investor(com_name,mutual_fund,inves_tor,raise_r,raised_last,promo_ters,share_holder,com_val)
            database = FirebaseDatabase.getInstance().getReference("PassData")

            database.child(com_name).setValue(data).addOnSuccessListener {
                Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
        }


    }
