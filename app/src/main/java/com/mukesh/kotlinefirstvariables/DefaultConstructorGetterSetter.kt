package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DefaultConstructorGetterSetter : AppCompatActivity() {
    val p1 = PersonDefault("cheezy",21)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default_constructor_getter_setter)
        println(p1.age)
        p1.age = 23
        p1.age = -12
        println(p1.name)
    }
}

class PersonDefault(nameParam:String,ageParam:Int){
    var name:String  =  nameParam
    get(){
        println("Name gettter is called")
        return field.toUpperCase()
    }
    var age:Int = ageParam
    set(value){
        if (value>0){
            field = value
        }
        else{
            println("Age can't be naagtive")
        }
    }
}