package cn.ryancui.class7

/**
  * Created by Ryan on 2017/5/1.
  */
class Foo {
  private val secret = 2

  // access the private object field 'obj'
  def printObj { println(s"I can see ${Foo.obj}") }
}

object Foo {

  private val obj = "Foo's object"

  // access the private class field 'secret'
  def double(foo: Foo) = foo.secret * 2
}

object Test extends App {
  val f = new Foo
  println(Foo.double(f))
  f.printObj
}