package cn.ryancui.class6


/**
  * Created by Ryan on 2017/4/30.
  */
class Person(var firstName: String) {

  var lastName: String = ""
  var address: Option[Address] = None

  override def toString: String = if (firstName == null) "None" else s"$firstName $lastName"
}

class Employee (name: String, var age: Int)
extends Person(name) {
  // rest of the class
}

case class Address(city: String, state: String, zip: String)

object Driver extends App {
  val p = new Employee("Tom", 24)
  p.address = Some(Address("Beijing", "Asian", "123456"))

  p.address.foreach { a =>
    println(a.city)
    println(a.state)
    println(a.zip)
  }

  println(p)

}

