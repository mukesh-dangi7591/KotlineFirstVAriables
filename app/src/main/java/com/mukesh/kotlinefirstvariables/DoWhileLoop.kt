package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DoWhileLoop : AppCompatActivity() {

    var count  = 5
    var number = 2
    var index = 1

    var indexDo = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_do_while_loop)
        whileloop()
        multiplication()
        doWhile()
    }

    fun multiplication(){
        while (index<=10){
            Log.e("intoTable",(number*index).toString())
            index++
        }
        Log.e("IndexValue",index.toString())
    }
    fun whileloop(){
        while (count>=1){
            Log.e("HelloWhileLoop",count.toString())
            count--
        }
    }
    fun doWhile(){
        do {
            Log.e("Hello","DoWhile")
        }while (indexDo>5)
    }
}