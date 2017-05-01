package cn.ryancui.class9

/**
  * Created by Ryan on 2017/5/1.
  */
object Closure extends App {

  var votingAge = 18
  val isOfVotingAge = (age: Int) => age >= votingAge

  def printResult(f:Int => Boolean, x: Int): Unit = {
    println(f(x))
  }

  printResult(isOfVotingAge, 20) // true

  // change votingAge in one scope
  votingAge = 21

  // the change to votingAge affects the result
  printResult(isOfVotingAge, 20) // now false
}
