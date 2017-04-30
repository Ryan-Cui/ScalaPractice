package cn.ryancui.class7

/**
  * Created by Ryan on 2017/5/1.
  */
object Main extends App{

  val hello = <p>Hello, <br/>World</p>

  hello.child.foreach(e => println(e.getClass))

}
