package cn.ryancui.class4

/**
  * Sets the default value for the constructor argument
  * Created by Ryan on 2017/4/29.
  */
class Socket(val timeout: Int = 10000, val linger: Int = 20000) {

  override def toString = s"Socket(timeout: $timeout)"
}

object SocketTest extends App{
  val s1 = new Socket
  println(s"s1 = $s1")

  val s2 = new Socket(5000)
  println(s"s2 = $s2")

  val s3 = new Socket(timeout = 15000)
  println(s"s3 = $s3")

  val s4 = new Socket(5000, 10000)
  println(s"s4 = $s4")

  val s5 = new Socket(timeout = 150000, linger = 200000)
  println(s"s5 = $s5")
}
