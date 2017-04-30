package cn.ryancui.class8

/**
  * Created by Ryan on 2017/5/1.
  */
class Person(val name: String) {
  override def toString: String = s"Person: $name"
}

object Person {
  def apply(name: String): Person = new Person(name)
}

object PersonTest extends App {
  val p = Person("Tom")
  println(p.name)
  println(p.toString)
}