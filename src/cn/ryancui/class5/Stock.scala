package cn.ryancui.class5

/**
  * Prevent generation of getter and setter methods
  * Created by Ryan on 2017/4/30.
  */
class Stock {

  // getter and setter methods are generated
  var delayedPrice: Double = _

  // keep this field hidden from other classes
  private var currentPrice: Double = _

  // a private field can be seen by any Stock instance
  private var price: Double = _
  def setPrice(p: Double) { price = p }
  def isHigher(that: Stock): Boolean = this.price > that.price

  // a private[this] var is object-private, and can only be seen by the current instance
  private[this] var name: String = _

  def setName(name: String) { this.name = name}

}

object Driver extends App {

  val s1 = new Stock
  s1.setPrice(20)

  val s2 = new Stock
  s2.setPrice(50)

  println(s2.isHigher(s1))

}
