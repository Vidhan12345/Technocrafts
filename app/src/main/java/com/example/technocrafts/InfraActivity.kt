package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class InfraActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    // Creating Keys
    companion object {
        const val KEY1 = "com.example.Cafe.InfraActivity.KEY1"
        const val KEY2 = "com.example.Cafe.InfraActivity.KEY2"
        const val KEY3 = "com.example.Cafe.InfraActivity.KEY3"
        const val KEY4 = "com.example.Cafe.InfraActivity.KEY4"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infra)

        val past = findViewById<Button>(R.id.infraBtn1)
        val present = findViewById<Button>(R.id.infraBtn2)
        val hardinfra = findViewById<TextInputEditText>(R.id.hard_infra)
        val softinfra = findViewById<TextInputEditText>(R.id.soft_infra)
        val service_staff = findViewById<TextInputEditText>(R.id.serviceStaff)
        val technical_staff = findViewById<TextInputEditText>(R.id.techinalStaff)
        val ad_vert = findViewById<TextInputEditText>(R.id.advert)

        past.setOnClickListener{

            val hard_infra = hardinfra.text.toString()
            val soft_infra = softinfra.text.toString()
            val serviceStaff =service_staff.text.toString()
            val technicalStaff = technical_staff.text.toString()
            val advert = ad_vert.text.toString()



            val data = Infra(hard_infra,soft_infra,serviceStaff,technicalStaff,advert)
            database = FirebaseDatabase.getInstance().getReference("Infra")

            database.child(hard_infra).setValue(data).addOnSuccessListener {
                hardinfra.text?.clear()
                softinfra.text?.clear()
                service_staff.text?.clear()
                technical_staff.text?.clear()
                ad_vert.text?.clear()
                Toast.makeText(this, "Infrastructure Details Added", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }

        }
        present.setOnClickListener{

            val hard_infra2 = hardinfra.text.toString()
            val soft_infra2= softinfra.text.toString()
            val serviceStaff2 =service_staff.text.toString()
            val technicalStaff2 = technical_staff.text.toString()
            val advert2 = ad_vert.text.toString()


            val intent1 = Intent(applicationContext,InvestorActivity::class.java)
            val intent2 = Intent(this,StageActivity::class.java)

            intent2.putExtra(KEY1,hard_infra2)
            intent2.putExtra(KEY2,soft_infra2)
            intent2.putExtra(KEY3,serviceStaff2)
            intent2.putExtra(KEY4,technicalStaff2)
            startActivity(intent1)
        }
    }
    }
