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
        val input5 = intent.getStringExtra(InvestorActivity.KEY5)
        val input6 = intent.getStringExtra(InvestorActivity.KEY6)
        val input7 = intent.getStringExtra(InvestorActivity.KEY7)
        val input8 = intent.getStringExtra(InvestorActivity.KEY8)

        // Retrieve user inputs of LABOUR from the intent
        val input9 = intent.getStringExtra(LabourActivity.KEY9)
        val input10 = intent.getStringExtra(LabourActivity.KEY10)
        val input11 = intent.getStringExtra(LabourActivity.KEY11)
        val input12 = intent.getStringExtra(LabourActivity.KEY12)

        // Retrieve user inputs of Money from the intent
        val input13 = intent.getStringExtra(MoneyActivity.KEY13)
        val input14 = intent.getStringExtra(MoneyActivity.KEY14)
        val input15 = intent.getStringExtra(MoneyActivity.KEY15)
        val input16 = intent.getStringExtra(MoneyActivity.KEY16)
        val input17 = intent.getStringExtra(MoneyActivity.KEY17)



if (input1!!.toInt() >= 100){
//not found
}


        //input 2
    if(input2!!.toInt() > 105600  ) {
val text1 = "Your company is performing good in terms of Infrastructure"
    }
    else if (input2!!.toInt() < 105600 && input2!!.toInt() > 10 ){
//  good
    }
    else if(input2!!.toInt() < 10){
    // bad
    }



    if(input3!!.toInt() > 42.5  )   {
        // million us dollars
    }
    else if(input3!!.toInt() < 42.5 && input3!!.toInt() > 7.8 ){
        //normal
    }
    else if(input3!!.toInt() < 7.8 ){
        //bad
    }


    if(input4!!.toInt() > 700  )   {
            // million us dollars
    }
    else if(input4!!.toInt() < 700 && input4!!.toInt() > 44 ){
            //normal
    }
    else if(input4!!.toInt() < 44){
            //bad
    }


    if(input5!!.toInt() > 700  )   {
//            no data   (to be delleted )
    }



    if(input6!!.toInt() > 6073  )   {
//      number of investors
    }
        else if(input6!!.toInt() < 6073 && input6!!.toInt() > 8){

    }
        else if(input6!!.toInt() < 8){

    }



    if(input7!!.toInt() > 150   )   {
//      in million
    }
    else if(input7!!.toInt() < 150 && input7!!.toInt() > 17 ){

    }
    else if(input7!!.toInt() < 17){

    }


    if(input7!!.toInt() > 150   )   {
//      in million
    }
    else if(input7!!.toInt() < 150 && input7!!.toInt() > 17 ){

    }
    else if(input7!!.toInt() < 17){

    }


    if(input8!!.toInt() > 49   )   {
//      percentage of share hold by promoters
    }
    else if(input8!!.toInt() < 49 && input8!!.toInt() > 47 ){

    }
    else if(input8!!.toInt() < 47){

    }


    if(input9!!.toInt() > 48   )   {
//      HOURS
    }
    else if(input9!!.toInt() < 48 && input9!!.toInt() > 40 ){

    }
    else if(input9!!.toInt() < 40){

    }


    if(input10!!.toInt() > 45   )   {
//      HOURS
    }
    else if(input10!!.toInt() < 45 && input10!!.toInt() > 40 ){

    }
    else if(input10!!.toInt() < 40){

    }



    if(input11!!.toInt() > 42.2   )   {
//      million US DOLLAR
    }
    else if(input11!!.toInt() < 42.5 && input11!!.toInt() > 4.5 ){

    }
    else if(input11!!.toInt() < 40){

    }


    if(input12!!.toInt() > 42.2   )   {
//      million US DOLLAR
    }
    else if(input12!!.toInt() < 42.5 && input11!!.toInt() > 4.5 ){

    }
    else if(input12!!.toInt() < 40){

    }








    }
}

