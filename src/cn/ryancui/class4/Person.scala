package cn.ryancui.class4

/**
  * The Class in Scala
  * Created by Ryan on 2017/4/29.
  */
class Person(var firstName: String, val lastName: String, private var job: String) {

  // the constructor begins

  // some class fields
  // "private val" like "private final" in Java
  private val HOME = System.getProperty("user.home")
  // Scala will generate access and modify methods for var
  var age = 25

  // some method
  override def toString: String = s"$firstName $lastName is $age years old, job is $job"
  def printHome { println(s"HOME = $HOME") }
  def printFullName { println(this) } // user toString
  def getJob { println(job) }

  printHome
  printFullName
  println("still in the constructor")

}

object ClassTest extends App{
    val ryan = new Person("Ryan", "Cui", "Cooker")

    println(ryan.firstName)
    println(ryan.lastName)
    ryan.getJob

    // the "normal" mutator approach
    ryan.age = 26
    println(ryan)

    // the "hidden" mutator approach
    ryan.age_$eq(27)
    println(ryan)
}


