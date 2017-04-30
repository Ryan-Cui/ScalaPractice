package cn.ryancui.class7

/**
  * Created by Ryan on 2017/5/1.
  */
object MainDriver extends App {

  // access our method, constant, and enumeration
  echo("Hello, world")
  echo(MAGIC_NUM)
  echo(Margin.LEFT)

  // use our MutableMap type (scala.collection.mutable.Map)
  val mm = MutableMap("name" -> "AI")
  mm += ("password" -> "123")

  for ((k, v) <- mm) printf("key: %s, value: $s\n", k, v)
}
