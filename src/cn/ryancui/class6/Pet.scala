package cn.ryancui.class6

/**
  * Created by Ryan on 2017/4/30.
  */
abstract class Pet(name: String) {

  val greeting: String = "Hello" // provide an initial value
  var age: Int
  val run = { println("Animal run") }

  def sayHello { println(greeting) }


  override def toString = s"I say $greeting, and I'm $age"
}

class Dog(name: String) extends Pet(name) {
  override val greeting: String = "Woof"  // override the value
  override var age: Int = 2
  override val run: Unit = { println("Dog run") }
}

class Cat(name: String) extends Pet(name) {
  override val greeting: String = "Meow"
  override var age: Int = 5
}

object AbstractFieldsDemo extends App {
  val dog = new Dog("Fido")
  val cat = new Cat("Morris")

  dog.sayHello
  cat.sayHello

  println(dog)
  println(cat)

  // verify that the age can be changed
  cat.age = 10
  println(cat)
}