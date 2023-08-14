package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FunctionsAndDefaultArguments : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functions_and_default_arguments)
        println(" sum of two numbers1 = ${add(2,6)}")
      val result =   add(9,6)
        println(" sum of two numbers2 = $result")


        println("inline function 1 = ${add2(9,2)}")
        println("inline function 2 = ${add3(8,3)}")

        evenOrOdd(12)
        evenOrOdd(13)

        defaultArguments(4)//argument
        defaultArguments()//default arguments

    }

    fun add(num1:Int,num2:Int):Int{
        val sum = num1+num2
        return sum
    }

    //InLine function
    fun add2(num1:Int,num2:Int):Int = num1+num2

    //InLine function
    fun add3(num1:Int,num2:Int) = num1+num2

    fun evenOrOdd(num:Int){
        val unitTypefunction = if(num%2 == 0)"Even" else "Odd"
        println("UnitType Function:- $unitTypefunction")
    }

    fun defaultArguments(count : Int = 2){//parameters//here 2 is default value
        for (i in 1..count) {
            println("Hello Default $i")
        }
    }
}