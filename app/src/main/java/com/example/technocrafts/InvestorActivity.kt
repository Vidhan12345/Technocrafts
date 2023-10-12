package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class InvestorActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    // Creating Keys
    companion object {
        const val KEY1 = "com.example.Cafe.InvestorActivity.KEY1"
        const val KEY2 = "com.example.Cafe.InvestorActivity.KEY2"
        const val KEY3 = "com.example.Cafe.InvestorActivity.KEY3"
        const val KEY4 = "com.example.Cafe.InvestorActivity.KEY4"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_investor)

        val past = findViewById<Button>(R.id.btncnf)
        val present = findViewById<Button>(R.id.btncnf2)
        val comname = findViewById<TextInputEditText>(R.id.name)
        val mutual = findViewById<TextInputEditText>(R.id.mutual)
        val investor = findViewById<TextInputEditText>(R.id.investor)
        val raise = findViewById<TextInputEditText>(R.id.raise)
        val raisedlast = findViewById<TextInputEditText>(R.id.raisedlast)
        val promoters = findViewById<TextInputEditText>(R.id.promoters)
        val shareholder = findViewById<TextInputEditText>(R.id.shareholder)
        val comval = findViewById<TextInputEditText>(R.id.comval)

        past.setOnClickListener{

            val com_name = comname.text.toString()
            val mutual_fund = mutual.text.toString()
            val inves_tor =investor.text.toString()
            val raise_r = raise.text.toString()
            val raised_last = raisedlast.text.toString()
            val promo_ters = promoters.text.toString()
            val share_holder = shareholder.text.toString()
            val com_val =comval.text.toString()

            val data = Investor(com_name,mutual_fund,inves_tor,raise_r,raised_last,promo_ters,share_holder,com_val)
            database = FirebaseDatabase.getInstance().getReference("Investor")

            database.child(com_name).setValue(data).addOnSuccessListener {
                Toast.makeText(this, "Investor Details Added", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }


        present.setOnClickListener{

            val com_name2 = comname.text.toString()
            val mutual_fund2 = mutual.text.toString()
            val inves_tor2 =investor.text.toString()
            val raise_r2 = raise.text.toString()
            val raised_last2 = raisedlast.text.toString()
            val promo_ters2 = promoters.text.toString()
            val share_holder2 = shareholder.text.toString()
            val com_val2 =comval.text.toString()

            val intent = Intent(applicationContext,LabourActivity::class.java)
            val intent2 = Intent(applicationContext,StageActivity::class.java)

            intent2.putExtra(KEY1,mutual_fund2)
            intent2.putExtra(KEY2,inves_tor2)
            intent2.putExtra(KEY3,raise_r2)
            intent2.putExtra(KEY4,promo_ters2)
            startActivity(intent)

        }



    }


    }
