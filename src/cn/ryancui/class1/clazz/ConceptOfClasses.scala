package cn.ryancui.class1.clazz

/**
  * Classes in Scala can have parameters.
  *
  * Created by Ryan on 2017/4/12.
  */

/**
  * This Complex class takes two arguments, which are the real and imaginary part of the complex.
  * These arguments must be passed when creating an instance of class Complex, as follows: new Complex(1.5, 2.3).
  * The class contains two methods, called re and im, which give access to these two parts.
  */
class Complex(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
}

object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val num = new Complex(1, 2)
    println("real part: " + num.re())
  }
}


/**
  * It should be noted that the return type of these two methods is not given explicitly.
  * It will be inferred automatically by the compiler, which looks at the right-hand side of these methods and deduces
  * that both return a value of type Double.
  *
  * The compiler is not always able to infer types like it does here, and there is unfortunately no simple rule to know
  * exactly when it will be, and when not. In practice, this is usually not a problem since the compiler complains
  * when it is not able to infer a type which was not given explicitly.
  * As a simple rule, beginner Scala programmers should try to omit type declarations which seem to be easy to deduce from the context,
  * and see if the compiler agrees. After some time, the programmer should get a good feeling about when to omit types,
  * and when to specify them explicitly.
  */


/**
  * It would be nicer to be able to access the real and imaginary parts like if they were fields, without putting the empty pair of parenthesis.
  * This is perfectly doable in Scala, simply by defining them as methods without arguments.
  * Such methods differ from methods with zero arguments in that they don’t have parenthesis after their name,
  * neither in their definition nor in their use. Our Complex class can be rewritten as follows:
  */
class Fractions(numerator : Int, denominator: Int) {
  def num  = numerator
  def den = denominator


/**
  * It is possible to override methods inherited from a super-class in Scala.
  * It is however mandatory to explicitly specify that a method overrides another one using the override modifier,in order to avoid accidental overriding.
  * As an example, our Fractions class can be augmented with a redefinition of the toString method inherited from Object.
  */
  override def toString: String = s"$num/$den"
}

object Fractions{
  def main(args: Array[String]): Unit = {
    val fra = new Fractions(1, 3)
    println(fra)
  }
}
