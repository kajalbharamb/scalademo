package lectures.basics

import java.util.UUID

object CallByValueAndCallByName extends App{

  def callByValue(a: Int, b: String) = {
    println("a :", a)
    println("b :", b)
    println("b :", b)
  }

  def callByName(a:Int ,b: =>String) = {
  println("a :",a)
    println("b :",b)
    println("b :",b)
  }
  callByValue(6,UUID.randomUUID().toString)
  callByName(4,UUID.randomUUID().toString)

}
