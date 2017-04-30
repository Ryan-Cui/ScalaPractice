package cn.ryancui.class4

/**
  * A simple way to implement a singleton model in Scala
  * Created by Ryan on 2017/4/29.
  */
class Brain private {

  override def toString = "This is the brain."
}

object Brain {
  val brain = new Brain
  def getInstance = brain
}

object SingletonTest extends App {

  // this won't compile
  // val brain = new Brain

  // this works
  val brain = Brain.getInstance
  println(brain)
}

