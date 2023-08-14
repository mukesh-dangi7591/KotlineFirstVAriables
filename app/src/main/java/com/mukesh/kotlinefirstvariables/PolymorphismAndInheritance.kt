package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PolymorphismAndInheritance : AppCompatActivity() {
    val circle = Circle2(4.0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polymorphism_and_inheritance)
        println(circle.toString())
    }
}

open class ShapeArea{
    open fun area():Double = 0.0
  /*  override fun toString(): String {
        return "I am shape"
    }*/
}

class Circle2(val radius:Double):ShapeArea(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}