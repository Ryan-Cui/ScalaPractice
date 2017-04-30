package cn.ryancui.class7

/**
  * Created by Ryan on 2017/4/30.
  */
object Driver extends App {

  def printAll(strings: String*): Unit ={
    strings.foreach(println)
    println("class: " + strings.getClass)
  }

  val fruits = List("apple", "banana", "cherry")


  printAll()
  printAll("1","2","3")
  printAll(fruits: _*)


}