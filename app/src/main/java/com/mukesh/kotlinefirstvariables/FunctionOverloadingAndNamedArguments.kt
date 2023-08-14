package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.pow

class FunctionOverloadingAndNamedArguments : AppCompatActivity() {
    var fn = ::additionTwo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function_overloading_and_named_arguments)

        println(addition(5,5))//method overloading
        println(addition(5.0,5.0))//method oveloading//same name but defferent parameters

        println(addition(a=2,b=7))//named arguments
        println(addition(b=5.0,a=2.0))//named arguments

        println( fn(1.0,3.0))
        fn = ::power
        println(fn(2.0,3.0))

    }



    fun addition(a:Int,b:Int):Int{
        return a+b
    }

    fun addition(a: Double ,b: Double):Double{
        return a+b
    }


    fun additionTwo(a: Double ,b: Double):Double{
        return a+b
    }

fun power(a:Double,b:Double):Double{
    return a.pow(b)
}

}