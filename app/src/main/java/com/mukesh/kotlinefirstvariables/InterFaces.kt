package com.mukesh.kotlinefirstvariables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class InterFaces : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inter_faces)
        dragableObject(arrayOf(CircleInFc(),SquareInFc(),TriangleInFc(),Player("Player")))
    }


  fun dragableObject(objects:Array<Dragable>){
      for (obj in objects){
          Log.e("HelloInterFace",obj.drag().toString())
      }
  }
}
interface Dragable{
     fun drag()
}

abstract  class ShapeInFc():Dragable{

}

class CircleInFc():ShapeInFc(){
    override fun drag() = println("Circle is Draged")
}
class SquareInFc():ShapeInFc(){
    override fun drag(){
        println("Square is Draged")
    }
}
class TriangleInFc():ShapeInFc(){
    override fun drag()= println("Triangle is Draged")
}
class Player(val name:String):Dragable{
    override fun drag() {
      println("$name is Draged")
    }
}
