package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MoneyActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    // Creating Keys
    companion object {
        const val KEY13 = "com.example.Cafe.MoneyActivity.KEY1"
        const val KEY14 = "com.example.Cafe.MoneyActivity.KEY2"
        const val KEY15 = "com.example.Cafe.MoneyActivity.KEY3"
        const val KEY16 = "com.example.Cafe.MoneyActivity.KEY4"
        const val KEY17 = "com.example.Cafe.MoneyActivity.KEY5"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money)


        val past = findViewById<Button>(R.id.moneyBtn1)
        val present = findViewById<Button>(R.id.moneyBtn2)
        val Profit = findViewById<TextInputEditText>(R.id.profit)
        val Gross_sales = findViewById<TextInputEditText>(R.id.gross_sales)
        val Revenue = findViewById<TextInputEditText>(R.id.revenue)
        val net_worth = findViewById<TextInputEditText>(R.id.networth)
        val Ror = findViewById<TextInputEditText>(R.id.ror)
        past.setOnClickListener{

            val profit = Profit.text.toString()
            val gross_sales = Gross_sales.text.toString()
            val revenue =Revenue.text.toString()
            val networth = net_worth.text.toString()
            val ror = Ror.text.toString()

            val data = Infra(profit,gross_sales,revenue,networth,ror)
            database = FirebaseDatabase.getInstance().getReference("Money")

            database.child(profit).setValue(data).addOnSuccessListener {
                Toast.makeText(this, "Money Details Added", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }

        }
        present.setOnClickListener{
            val profit2 = Profit.text.toString()
            val gross_sales2 = Gross_sales.text.toString()
            val revenue2 =Revenue.text.toString()
            val networth2 = net_worth.text.toString()
            val ror2 = Ror.text.toString()

            val intent = Intent(applicationContext,StageActivity::class.java)

            intent.putExtra(KEY13,profit2)
            intent.putExtra(KEY14,gross_sales2)
            intent.putExtra(KEY15,revenue2)
            intent.putExtra(KEY16,networth2)
            intent.putExtra(KEY17,ror2)

            startActivity(intent)

        }
        
    }
}