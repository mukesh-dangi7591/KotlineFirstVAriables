package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class WhenStatementAndExpression : AppCompatActivity() {
    val animal = "Dog"
    val number  = 13
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_statement_and_expression)

       whenStatement()
        whenExpression()
        whenUsingNumber()
    }

    fun whenStatement(){
        when(animal){
            "horse" -> Log.e("Animal is horse","yes")
            "cat" -> Log.e("Animal is Cat","yes")
            "Dog" -> Log.e("Animal is Dog","yes")
            else -> Log.e("Animal is Dog","yes")
        }
    }

    fun whenExpression(){
     val result  =   when(animal){
            "horse" ->"Animal is horse"
            "cat" ->"Animal is Cat"
            "Dog"->"Animal is Dog"
            else -> "Animal is Dog"
        }
        Log.e(result,"yes")
    }

    fun whenUsingNumber(){
     val result  =   when(animal){
            "11" ->"Eleven"
            "12" ->"Twelve"
            "13"->"Thirteen"
            else -> "Not in range"
        }
        Log.e(result,"confirmed")
    }
}