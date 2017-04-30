package cn.ryancui.class4

/**
  * The case class constructor's parameter defaults to val
  * Created by Ryan on 2017/4/29.
  */
// the case class
case class Student(name: String, var age: Int) {


}

// the companion object
object Student{

  def apply(): Student = new Student("<no name>", 0)
  def apply(name: String): Student = new Student(name, 16)

}

object CaseClassTest extends App{
  val student1 = Student()
  val student2 = Student("Rose")
  val student3 = Student("Tom", 16)
  println(student1)
  println(student2)
  println(student3)

  // verify the setter methods work
  student1.age = 17
  println(student1)
}

