package cn.ryancui.timer

/**
  * A simple timer
  * Created by Cuixuan on 2017/4/11.
  */
object Timer {

  def oncePerSecond(callback: () => Unit ) {
    while (true) {
      callback()
      Thread sleep 1000
    }
  }

  def timeFlies() {
    println("time flies like an arrow....")
  }

  def main(args: Array[String]){

    // 函数是对象
//    oncePerSecond(timeFlies)

    // 匿名函数
    oncePerSecond(() =>
      println("Hello World !"))
  }
}
