package cn.ryancui.class3

/**
  * Similar to interfaces in Java, traits are used to define object types by specifying the signature of the supported methods.
  * Like in Java 8, Scala allows traits to be partially implemented;
  * i.e. it is possible to define default implementations for some methods.
  * In contrast to classes, traits may not have constructor parameters
  * Created by Ryan on 2017/4/14.
  */
trait Ord {
  def < (that: Any): Boolean
  def <=(that: Any): Boolean = (this < that) || (this == that)
  def > (that: Any): Boolean = !(this <= that)
  def >=(that: Any): Boolean = !(this < that)
}

class Date(y: Int, m: Int, d: Int) extends Ord{
  def year = y
  def month = m
  def day = d

  /**
    * This completes the definition of the Date class.
    * Instances of this class can be seen either as dates or as comparable objects.
    * Moreover, they all define the six comparison predicates mentioned above:
    * equals and < because they appear directly in the definition of the Date class,
    * and the others because they are inherited from the Ord trait.
    */
  override def <(that: Any): Boolean = {
    if(!this.isInstanceOf[Date]) {
      sys.error(s"Cannot compare $that and a Date")
    }

    val obj = that.asInstanceOf[Date]

    (year > obj.year) || (year == obj.year && (month > obj.month || (month == obj.month && day > obj.day)))
  }

  override def toString: String = s"year: $y, mouth: $m, day: $d"

  /**
    * isInstanceOf
    *   |-- corresponds to Java’s instanceOf operator, and returns true if and only if the object on which it is applied is an instance of the given type.
    *
    * asInstanceOf
    *   |-- corresponds to Java’s cast operator: if the object is an instance of the given type, it is viewed as such, otherwise a ClassCastException is thrown.
    */
  override def equals(that: Any): Boolean = {
    that.isInstanceOf[Date] && {
      val o = that.asInstanceOf[Date]
      o.day == day && o.month == month && o.year == year
    }
  }

}

object Date {
  def main(args: Array[String]): Unit = {
    val ryanDate = new Date(1992, 2, 28)
    val fionaDate = new Date(1992, 5, 25)

    println("Who's older?")
    println(if(ryanDate > fionaDate) "Ryan" else "Fiona")
  }
}