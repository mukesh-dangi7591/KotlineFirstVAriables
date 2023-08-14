package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Constructors : AppCompatActivity() {
    var car = AutoMobiles("car",4,6,true)
    var person1 = Person("rohan",21)
    var person2 = Person("Sohan",25)



    var autoMobileAudi = AutoMobile2("audi","Petrol")
    var autoMobileHonda = AutoMobile2("Honda","Petrol")
    var autoMobileHundai = AutoMobile2("namePAram")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constructors)



        println(person1.age)
        println(person1.name)

        println(person2.name)
        println(person2.age)

    }
}

class AutoMobiles(val name:String,val tyres:Int,val maxSeating:Int,hasAirBags:Boolean){


    //initializer block is called when object is created (it will call jus after object is created)
    init {
        println("$name iscreated")
    }
    var airBags  = hasAirBags

    init {
        println("2nd initializer Block")
    }
    fun drive(){}
    fun appBreakes(){}
}
class Person(namePAram:String,ageParam:Int){
    val name:String = namePAram
    val age:Int = ageParam
}


//for create secondary constructor
class AutoMobile2(val name:String,val tyres:Int,val maxSeating:Int,val engineTypes:String){//this is primary constructor

    //initializer block is called when object is created (it will call jus after object is created)
    init {
        println("$name iscreated")
    }
    init {
        println("2nd initializer Block")
    }
    fun drive(){}
    fun appBreakes(){}

    //create secondary constructor
    constructor(nameParam:String,enginParam:String)://secondary constructor
            this(nameParam,4,5,enginParam)//primary constructor

    constructor(nameParam:String):
            this(nameParam,4,6,"petrol")


}
