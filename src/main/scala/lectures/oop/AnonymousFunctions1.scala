package lectures.oop

object AnonymousFunctions1 extends App{
  val doubler = new Function[Int,Int] {
    override def apply(v1: Int): Int = v1 * 3
  }
  // in scala we can do like this
  // it instance new function1 with override apply method which take int and return x of int
  //anonymous funciton [LAMBDA]
  val doubly = (x:Int) => x * 2
  val double: Int => Int = x => x * 2

  // multiple params in lambda
  val adder:(Int,Int)=> Int = (a,b)=> a+b

  // no params
  val nothing:()=>Int = () => 0

  //another way of writing lambda with curly braces
  val stringToInt = { (str:String) =>
    str.toInt
  }

  //Moar syntatic sugar
  val niceIncrement :Int => Int = _+2
  val nicedecrement: (Int,Int) => Int = _-_

  val superAdd = (x : Int) => (y:Int) => x+y

  println(doubler(5))
  println(double(5))
  println(doubly(5))
  println(adder(5,0))
  // in lamba must call with parenthesis
  println(nothing())
  println(niceIncrement(8))
  println(nicedecrement(4,6))
  println(superAdd(4)(6))




}