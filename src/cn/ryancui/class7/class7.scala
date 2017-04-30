package cn.ryancui

/**
  * Created by Ryan on 2017/5/1.
  */
package object class7 {

  // field
  val   MAGIC_NUM = 42
  // method
  def echo(a: Any) { println(a) }

  // enumeration
  object Margin extends Enumeration {
    type Margin = Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
  }

  // type definition
  type MutableMap[K, V] = scala.collection.mutable.Map[K, V]
  val MutableMap = scala.collection.mutable.Map
}
