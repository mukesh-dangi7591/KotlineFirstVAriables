package com.mukesh.kotlinefirstvariables

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ClassesObjects : AppCompatActivity() {
    val musting = Car("mustang", "petrol", 150)
    val beets = Car("beetle", "diesel", 200)

    val person1 = Persons("Ram",20)
    val person2 = Persons("Shyam",18)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classes_objects)

        println(musting.name)
        println(musting.type)
        println(beets.name)
        println(musting.driverCar())
        println(beets.driverCar())


        //morclasses and Objects

        println(person1.canVote())
        println(person2.canVote())

        person2.age = 22

    }
}

class Car(var name: String, var type: String, var kmRan: Int) {
    fun driverCar() {
        println(" $name Car is Driving")
    }

    fun applyBreakes() {
        println("Applied Breakes")
    }
}

class Persons(val name: String, var age: Int) {

    fun canVote(): Boolean {
       return age>18
    }
}