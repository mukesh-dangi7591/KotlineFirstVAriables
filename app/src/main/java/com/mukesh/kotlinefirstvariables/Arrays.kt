package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Arrays : AppCompatActivity() {
    var arr = arrayOf("one","two","three")
    var arr1 = arrayOf(1,2,3)
    var arr2 = arrayOf<Int>(1,2,3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrays)
        getArrValue()
    }
    fun getArrValue(){
        for ( i in arr){
            println("arr Index $i")
        }

        for ((i,e) in arr.withIndex()){
            println("index with value:- $i , $e")
        }

        println(arr[0])
        println(arr.get(1))
        println(arr.set(0,"hello"))
        println(arr.size)
        println(arr[0])

    }
}