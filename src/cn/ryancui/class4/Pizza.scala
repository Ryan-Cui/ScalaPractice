package cn.ryancui.class4

/**
  * Created by Ryan on 2017/4/29.
  */
// primary constructor
class Pizza(var crustSize: Int, var crustType: String) {

  // one-arg auxiliary constructor
  def this(crustSize: Int){
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }

  // one-arg auxiliary constructor
  def this(crustType: String){
    this(Pizza.DEFAULT_CRUST_SIZE)
    this.crustType = crustType
  }

  // zero-arg auxiliary constructor
  def this(){
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }

  override def toString: String = s"A $crustSize inch pizza with a $crustType crust"

  println(toString)

}

object Pizza{
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"
}

object ConstructorTest extends App{
    val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    val p2 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
    val p3 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
    val p4 = new Pizza
}
