package com.example.technocrafts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class StageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stage)

//        Importing TextView
        val tv1 = findViewById<TextView>(R.id.textView5)
        val tv2 = findViewById<TextView>(R.id.textView6)
        val tv3 = findViewById<TextView>(R.id.textView7)
        val tv4 = findViewById<TextView>(R.id.textView8)
        val tv5 = findViewById<TextView>(R.id.textView9)
        val tv6 = findViewById<TextView>(R.id.textView10)
        val tv7 = findViewById<TextView>(R.id.textView11)
        val tv8 = findViewById<TextView>(R.id.textView12)
        val tv9 = findViewById<TextView>(R.id.textView13)
        val tv10 =findViewById<TextView>(R.id.textView14)

        // Retrieve user inputs of Infra from the intent
//        val input1 = intent.getStringExtra("KEY1")
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




//
//        tv2.text = "Input 2: $input2"
//        textView3.text = "Input 3: $input3"
//        textView4.text = "Input 4: $input4"
//
//
//
//
//if (input1!!.toInt() >= 100){
////not found
//}
//



        val demo = input2?.toIntOrNull()
        //input 2
        if (input2 != null) {
            if (demo != null) {
                if(demo>150600){
                    var text1 = "Your company is spending more money on infrastructure than needed .  "
                    tv1.text = "$text1"
                } else if (demo < 105600 && demo > 10 ){
                    var text1 = "Your company is spending Right amount of money need for expansion infrastructure than needed .  "
                    tv1.text = "$text1"
                } else if(demo< 10){
                    var text1 = "Your company needs to spend more money on infrastructure if you want to Grow . "
                    tv1.text = "$text1"
                }
            }
        }





    if(input3!!.toFloat() > 42.5  )   {
tv2.text = "Your company is investing more than the money you need for service staff . You can optimise it by laying of some staff"
    }
    else if(input3!!.toFloat() < 42.5 && input3!!.toInt() > 7.8 ){
tv2.text = "There is no wastage of money in terms of service staff."
    }
    else if(input3!!.toFloat() < 7.8 ){
        tv2.text="You need to pay attention on your service staff you have less people than needed for Service Staff "
    }


    if(input4!!.toInt() > 700  )   {
   tv3.text = "You need to pay attention on your expenditure on the technical staff you are "
    }
    else if(input4!!.toInt() < 700 && input4!!.toInt() > 44 ){
        tv3.text = " expenditure on the technical staff os sufficient"
    }
    else if(input4!!.toInt() < 44){
            tv3.text = "Your expendeture on technical staff is insuficient"
    }


    if(input5!!.toInt() > 700  )   {
//            no data   (to be delleted )
    }


//      number of investors
    if(input6!!.toInt() > 6073  )   {
        tv4.text = "You have grater number of investors"
    }
        else if(input6!!.toInt() < 6073 && input6!!.toInt() > 8){
        tv4.text = "You have sufficient number of investors"
    }
        else if(input6!!.toInt() < 8){
        tv4.text = "You have insufficient number of investors"
    }



    if(input7!!.toInt() > 150   )   {
//      in million
        tv5.text = "Raised fund is more than needed"
    }
    else if(input7!!.toInt() < 150 && input7!!.toInt() > 17 ){
        tv5.text = "Raised fund is sufficient for working efficiently"
    }
    else if(input7!!.toInt() < 17){
        tv5.text = "Raised fund is insufficient for working of organisation"
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
        tv6.text = "Working hours of service staff is more than required hours"
    }
    else if(input9!!.toInt() < 48 && input9!!.toInt() > 40 ){
        tv6.text = "Working hours of service staff is sufficient"
    }
    else if(input9!!.toInt() < 40){
        tv6.text = "Working hours of service staff is less than required hours"
    }


    if(input10!!.toInt() > 45   )   {
//      HOURS
        tv7.text = "Working hours of technical staff is more than required hours"
    }
    else if(input10!!.toInt() < 45 && input10!!.toInt() > 40 ){
        tv7.text = "Working hours of technical staff is sufficient"
    }
    else if(input10!!.toInt() < 40){
        tv7.text = "Working hours of service staff is less than required hours"
    }



    if(input11!!.toInt() > 42.2   )   {
//      million US DOLLAR
        tv8.text="You are overspending on service staff"
    }
    else if(input11!!.toInt() < 42.5 && input11!!.toInt() > 4.5 ){
        tv8.text="You are spending on service staff is sufficient"
    }
    else if(input11!!.toInt() < 40){
        tv8.text="You are spending on service staff is insufficient"
    }


    if(input12!!.toInt() > 42.2   )   {
//      million US DOLLAR
        tv9.text="You are overspending on technical staff"
    }
    else if(input12!!.toInt() < 42.5 && input12!!.toInt() > 4.5 ){
        tv9.text="You are spending on technical staff is sufficient"
    }
    else if(input12!!.toInt() < 40){
        tv9.text="You are spending on technical staff is insufficient"
    }


    if(input13!!.toInt() > 245)   {
//      billion US DOLLAR
        tv10.text = "Your company is making Good Profit"
    }
    else if(input13!!.toInt() < 245 && input13!!.toInt() > 3){
tv10.text= "No need to worry about Profit it will soon find its way to you "
    }
    else if(input13!!.toInt() < 3){
tv10.text = "Need to work in profit making "
    }


    if(input14!!.toInt() > 514)   {
//      billion US DOLLAR

    }
    else if(input14!!.toInt() < 514 && input14!!.toInt() > 10){

    }
    else if(input14!!.toInt() < 10){

    }

// GRoss sales and revenue generated are same

    if(input15!!.toInt() > 514)   {
//      billion US DOLLAR

    }
    else if(input15!!.toInt() < 514 && input15!!.toInt() > 10){

    }
    else if(input15!!.toInt() < 10){

    }

// Networth of company
    if(input16!!.toInt() > 1336)   {
//      billion US DOLLAR

    }
    else if(input16!!.toInt() < 1336 && input16!!.toInt() > 25){

    }
    else if(input16!!.toInt() < 25){

    }


        // Networth of company
    if(input17!!.toInt() > 15)   {
//      billion US DOLLAR

    }
    else if(input17!!.toInt() < 15 && input17!!.toInt() > 13){

    }
    else if(input17!!.toInt() < 13){

    }



//
//
//        tv1.text = "Your company is spending more money on infrastructure than needed . "
//        tv2.text = "Your company is investing more than the money you need for service staff . You can optimise it by laying of some staff"
//        tv3.text = "You need to pay attention on your expenditure on the technical staff you are "
//        tv4.text = "You have more investors and less valuation"
//        tv5.text = "Raised fund is more than needed"
//        tv6.text = "Working hours of service staff is more than required hours"
//        tv7.text = "Raised fund is more than needed"
//        tv8.text = "You are overspending on service staff"
//        tv9.text = "You are overspending on technical staff"
//        tv10.text = "Your company is making Good Profit"
//
//
//
//        tv1.text = "Your company needs to spend some Money On Infrastructure  . "
//        tv2.text = "Your company is investing more than the money you need for service staff . You can optimise it by laying of some staff"
//        tv3.text = "You need to pay attention on your expenditure on the technical staff you are "
//        tv4.text = "You have more investors and less valuation"
//        tv5.text = "Raised fund is more than needed"
//        tv6.text = "Working hours of service staff is more than required hours"
//        tv7.text = "Raised fund is more than needed"
//        tv8.text = "You are overspending on service staff"
//        tv9.text = "You are overspending on technical staff"
//        tv10.text = "Your company is making Good Profit"



        tv1.text = "Your company needs to spend some Money On Infrastructure  . "
        tv2.text = "Your company is investing more than the money you need for service staff . You can optimise it by laying of some staff"
        tv3.text = "You need to pay attention on your expenditure on the technical staff you are "
        tv4.text = "You have more investors and less valuation"
        tv5.text = "Raised fund is more than needed"
        tv6.text = "Working hours of service staff is more than required hours"
        tv7.text = "Raised fund is not enough needed"
        tv8.text = "You are overspending on service staff"
        tv9.text = "You are overspending on technical staff"
        tv10.text = "Your company is making Loss"

    }
}

