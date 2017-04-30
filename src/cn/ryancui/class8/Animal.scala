package cn.ryancui.class8

/**
  * Created by Ryan on 2017/5/1.
  */
trait Animal {

  def speak
}

object Animal {
  private class Dog extends Animal {
    override def speak { println("woof") }
  }

  private class Cat extends Animal {
    override def speak { println("meow") }
  }

  // the factory method
  def apply(s: String): Animal = {
    if (s == "dog")
      new Dog
    else
      new Cat
  }
}
