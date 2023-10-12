package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LabourActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    // Creating Keys
    companion object {
        const val KEY9 = "com.example.Cafe.LabourActivity.KEY1"
        const val KEY10 = "com.example.Cafe.LabourActivity.KEY2"
        const val KEY11= "com.example.Cafe.LabourActivity.KEY3"
        const val KEY12 = "com.example.Cafe.LabourActivity.KEY4"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_labour)

        val past = findViewById<Button>(R.id.labourBtn1)
        val present = findViewById<Button>(R.id.labourBtn2)
        val em_paid = findViewById<TextInputEditText>(R.id.empaid)
        val service_hour = findViewById<TextInputEditText>(R.id.servicehour)
        val tech_hour = findViewById<TextInputEditText>(R.id.Techour)
        val No_service_staff = findViewById<TextInputEditText>(R.id.Noservicestaff)
        val Money_service = findViewById<TextInputEditText>(R.id.Moneyservice)
        val Money_tech = findViewById<TextInputEditText>(R.id.Moneytech)

        past.setOnClickListener{

            val empaid = em_paid.text.toString()
            val servicehour = service_hour.text.toString()
            val Techour =tech_hour.text.toString()
            val Noservicestaff = No_service_staff.text.toString()
            val Moneyservice = Money_service.text.toString()
            val Moneytech = Money_tech.text.toString()

            val data = Labour(empaid,servicehour,Techour,Noservicestaff,Moneyservice,Moneytech)
            database = FirebaseDatabase.getInstance().getReference("Labour")

            database.child(empaid).setValue(data).addOnSuccessListener {
                Toast.makeText(this, "Labour Details Added", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }

        }
        present.setOnClickListener{


            val empaid2 = em_paid.text.toString()
            val servicehour2 = service_hour.text.toString()
            val Techour2 =tech_hour.text.toString()
            val Noservicestaff2 = No_service_staff.text.toString()
            val Moneyservice2 = Money_service.text.toString()
            val Moneytech2 = Money_tech.text.toString()

            val intent = Intent(applicationContext,MoneyActivity::class.java)
            val intent2 = Intent(applicationContext,StageActivity::class.java)

            intent2.putExtra(KEY9,servicehour2)
            intent2.putExtra(KEY10,Techour2)
            intent2.putExtra(KEY11,Moneyservice2)
            intent2.putExtra(KEY12,Moneytech2)
            startActivity(intent)
        }

    }
}