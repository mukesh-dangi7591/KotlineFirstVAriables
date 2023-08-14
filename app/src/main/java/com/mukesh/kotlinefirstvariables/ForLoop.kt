package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ForLoop : AppCompatActivity() {
    var number  = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_loop)
        forloop1()
        forloop2()
        forloop3()
        forloop4()
    }


    fun forloop1(){
        for(i in 1..5){
            println("Indexing1:- $i")
        }
    }
    fun forloop2(){
        for(i in 1..5 step 2){
            println("Indexing2:- $i")
        }
    }
    fun forloop3(){
        for(i in 1 until 5){
            println("Indexing3:- $i")
        }
    }

    fun forloop4(){
        for(i in 1..10){
            println("$number * $i = ${(number*i)}")
        }
    }
}