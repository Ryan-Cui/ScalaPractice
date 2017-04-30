package cn.ryancui.class5

/**
  * Override default access and modify methods
  * Created by Ryan on 2017/4/29.
  */
class Person(private var _name: String) {

  def name  = _name // accessor
  def name_ (aName: String) { _name = aName}  //mutator


  override def toString = s"Person($name)"
}

object PersonTest extends App {

  val p = new Person("Tom")

  // get name
  println(p.name)

  // set name
  p.name_("Jack")
  println(p.name)
}
