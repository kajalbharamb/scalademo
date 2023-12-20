package lectures.basics

object ValueVariableTypeClass extends App {
  val x: Int = 42 ;
  println(x)

  //  x=2
  // we can not reassign in vals they are like constant and finals in java
  //they are immutable

  //compiler automatically infer types
  val o = 9;

  val aString: String = "Kajal"
  val aChar: Char = 'a'
  val aBoolean: Boolean = false
  val aFloat: Float = 0.9f
  val aDouble: Double = 7877
  val aLong: Long = 454365453
  val aShort: Short = 5657

  //variables
  var a: Int=54
  a=65;

  //we can reassign variables
  // var are mutable


}
