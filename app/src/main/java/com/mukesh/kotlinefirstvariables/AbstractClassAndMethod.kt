package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AbstractClassAndMethod : AppCompatActivity() {

    val circle = Circle3(4.0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract_class_and_method)
        println(circle.area())
        circle.display()
    }


}
abstract  class Shape3{
    val name:String = ""
    abstract  fun area():Double
    abstract  fun display()
}

class Circle3(val radius:Double):Shape3(){


    override fun area(): Double  = Math.PI*radius*radius

    override fun display() {
        println("Circle is getting displayed")
    }
}