package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Inheitance : AppCompatActivity() {

    lateinit var  objChild:Child
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inheitance)
        objChild= Child()
        objChild.myMethod()
    }

}

open class Parent{
    init {
        println("I am Parent ")
    }
    val name:String = ""
    fun myMethod(){
        println("I am in Parent")
    }
}
class Child : Parent(){
    init {
        println("I am Child ")
    }
    val name2 : String = ""
    fun myMethod2(){
        println("I am in child")
    }
}