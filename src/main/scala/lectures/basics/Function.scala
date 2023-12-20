package lectures.basics

object Function extends App{
  // def is used to define function

  def aFunction(a:String, b:Int):String={
  a+" "+b;
  }
  println(aFunction("hello",6))

  def aParameterLessFunction():Int ={65}

  println(aParameterLessFunction)
  println(aParameterLessFunction())

  def greetingFunction(name:String, age:Int):String = {
  "hi my name is "+name+" and age "+age
  }
  println(greetingFunction("kajal",7))

  def factorial(fact:Int): Int = {
    if(fact<=0)1 else fact * factorial(fact-1)
  }

  println(factorial(5))

  def fabonici(n:Int):Int = {
    if(n<=1) 1 else
      fabonici(n-1)+fabonici(n-2)
  }
  println(fabonici(8))








}
