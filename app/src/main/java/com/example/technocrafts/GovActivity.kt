package com.example.technocrafts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class GovActivity : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gov)


        val past = findViewById<Button>(R.id.Confirm)
        val Gdp = findViewById<TextInputEditText>(R.id.gdp)
        val employee_rate = findViewById<TextInputEditText>(R.id.wmployeerate)
        val military = findViewById<TextInputEditText>(R.id.Militry)
        val Education = findViewById<TextInputEditText>(R.id.education)
        val Transport = findViewById<TextInputEditText>(R.id.transport)

        val gtv_1 = findViewById<TextView>(R.id.gtv1)
        val gtv_2 = findViewById<TextView>(R.id.gtv2)
        val gtv_3 = findViewById<TextView>(R.id.gtv3)
        val gtv_4 = findViewById<TextView>(R.id.gtv4)
        val gtv_5 = findViewById<TextView>(R.id.gtv5)


        past.setOnClickListener{

            val gdp = Gdp.text.toString()
            val wmployeerate = employee_rate.text.toString()
            val Militry =military.text.toString()
            val education = Education.text.toString()
            val transport = Transport.text.toString()

            if(gdp.toInt()!!>=27){
                gtv_1.text = "Excellent GDP"
            }else if(gdp.toInt()!!<27 && gdp.toInt()!! >3.75){
                gtv_1.text = "Normal GDP"
            }
            else {
                gtv_1.text="Country  may face economic downturns in several sectors."
            }



            if(wmployeerate.toInt()!!>=122){
                gtv_2.text = "Infrastructure development will at its peak"
            }else if(wmployeerate.toInt()!!<122 && gdp.toInt()!! >120){
                gtv_2.text = "Infrastructure development will be normal"
            }
            else {
                gtv_2.text="Less scope of I nfrastructure development due to lesser fund"
            }



            if(Militry.toInt()!!>=766){
                gtv_3.text = "Good budget for military development"
            }else if(Militry.toInt()!!<766 && gdp.toInt()!! >82){
                gtv_3.text = "Military development will be normal"
            }
            else {
                gtv_3.text="Country may face issues in military development"
            }



            if(education.toInt()!!>=810){
                gtv_4.text = "Investment in education system is excellent, no need of further improvement"
            }else if(education.toInt()!!<810 && gdp.toInt()!! >14){
                gtv_4.text = "Investment in education system is normal and good"
            }
            else {
                gtv_4.text="Investment in education system is not great, country may face its disadvantages in  future"
            }


            if(transport.toInt()!!>=78){
                gtv_5.text = "Investment in transportion system is too much, money should be utilized for development of other section of country "
            }else if(transport.toInt()!!<78 && gdp.toInt()!! >77){
                gtv_5.text = "Investment in transportion system is normal, no need for improvement"
            }
            else {
                gtv_5.text="Investment in transportion system is low, country may face issues in transportation"
            }

            val data = Gov(gdp,wmployeerate,Militry,education,transport)
            database = FirebaseDatabase.getInstance().getReference("Government")

            database.child(gdp).setValue(data).addOnSuccessListener {
                Toast.makeText(this, "Government Details Added", Toast.LENGTH_SHORT).show()


            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }


//        present.setOnClickListener{
//
//            val com_name2 = comname.text.toString()
//            val mutual_fund2 = mutual.text.toString()
//            val inves_tor2 =investor.text.toString()
//            val raise_r2 = raise.text.toString()
//            val raised_last2 = raisedlast.text.toString()
//            val promo_ters2 = promoters.text.toString()
//            val share_holder2 = shareholder.text.toString()
//            val com_val2 =comval.text.toString()
//
//            val intent = Intent(applicationContext,LabourActivity::class.java)
//            val intent2 = Intent(applicationContext,StageActivity::class.java)
//
//            intent2.putExtra(InvestorActivity.KEY5,mutual_fund2)
//            intent2.putExtra(InvestorActivity.KEY6,inves_tor2)
//            intent2.putExtra(InvestorActivity.KEY7,raise_r2)
//            intent2.putExtra(InvestorActivity.KEY8,promo_ters2)
//            startActivity(intent)
//
//        }

    }
}