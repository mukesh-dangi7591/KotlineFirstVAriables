package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Pollytmorphism : AppCompatActivity() {

   /* val circle:Circle = Circle(4.0)
    val square:Square = Square(4.0)*/

    //polymorphism
    //Parent can hold a reference to its child
    //Parent can call methods of child classes(which are common)
    val circle:Shape = Circle(4.0)
    val square:Shape = Square(4.0)


    //val shapes = arrayOf(Circle(3.0),Circle(4.0),Square(4.0),)
    val shapes = arrayOf(Circle(3.0),Square(4.0),Triangle(3.0,4.0),)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pollytmorphism)
        /*println(circle.area())
        println(square.area())*/

        calculateareas(shapes)
    }

   fun calculateareas(shapes:Array<Shape>){
       for (shape:Shape in shapes){
           println(shape.area())
       }
   }

}

open class Shape{
   open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}
class Triangle(val base:Double,val height:Double):Shape(){
    override fun area(): Double {
        return 0.5*base*height
    }
}