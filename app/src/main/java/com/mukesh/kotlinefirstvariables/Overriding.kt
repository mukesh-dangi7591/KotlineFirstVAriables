package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Overriding : AppCompatActivity() {
    lateinit var onePlus: OnePlus
    lateinit var mobile: Mobile
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overriding)
        onePlus = OnePlus("SmartPhone")
        println("${onePlus.name} , ${onePlus.display()}")
        mobile = Mobile("Geberal")
        println("${mobile.name} , ${mobile.display()}")
    }
}

open class Mobile(val type:String){//if we inherit this class by another class than need to write 'open' keyword before class
    open val name : String = ""//if we need override any property Or functions by another class property and functions  than need to write keyword befor property and functions name
    open val size:Int = 5
    fun makeCall()= println("Calling From Mobile")
    fun powerOff()= println("Shutting Down")
    open fun display()= println("Simple Mobile Display")
}

class OnePlus (typeParam:String): Mobile(typeParam) {
    override val name:String = "One Plus"
    override val size = 6
  //  override fun display() = println("One Plus Display")
  override fun display(){
      super.display()//when we have to call first parent class function and after that call override child class function than we use super keyword
      println("one Plus Display")
  }
    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }

}