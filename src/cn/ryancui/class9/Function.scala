package cn.ryancui.class9

/**
  * Created by Ryan on 2017/5/1.
  */
object Function {

  def executeFunction(callback:() => Unit): Unit = {
    callback()
  }

  def executeAndPrint(f:(Int, Int) => Int, x: Int, y: Int): Unit = {
    val result = f(x, y)
    println(result)
  }
}

object FunctionDriver extends App {
  val sayHello = () => { println("Hello") }
  Function.executeFunction(sayHello)

  val sum = (x: Int, y: Int) => x + y
  val multiply = (x: Int, y: Int) => x * y

  Function.executeAndPrint(sum, 2, 3)
  Function.executeAndPrint(multiply, 2, 3)
}