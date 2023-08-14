package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class IfElseStatementsAndExporessions : AppCompatActivity() {

    val a = 10
    val b= 11
    val number = 21
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic_operators)
         Log.e("hello ifElse","Hihowareyoukotline")

        ifStatement()
        Log.e("expression", ifExpressions())
        Log.e("expressionMode", numberMode())

    }

    private fun ifStatement():String{
        val message:String
        if (a>b)
        {
            message = "a is grater than b=10"
        }else if(b>a){
            message = "b is grater than a"
        }else{
            message = "a is equal to b"
        }
        Log.e("HelloJi",message)
        return message
    }

    private fun ifStatement1(){
        if (a>b)
        {
            Log.e("a is grater than b=10","abc1")
        }else if(b>a){
            Log.e("b is grater than a","abc2")
        }else{
            Log.e("a is equal to b","abc3")
        }
    }

    fun ifExpressions():String{

      val result  = if (a>b)
        {
             "a is grater than b=10"
        }else if(b>a){
         "b is grater than a"
        }else{
            "a is equal to b"
        }

        return result
    }

    fun numberMode():String{
        val result = if (number%2==0) "Even" else "Odd"
        return result
    }
}