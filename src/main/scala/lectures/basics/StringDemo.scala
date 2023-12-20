package lectures.basics

import lectures.basics.StringDemo.aNumberString

import scala.+:

object StringDemo extends App {

  val str = "Welcome to the course"
  println(str.charAt(1))
  println(str.substring(1,7))
  println(str.split(" ").toList)
  println(str.startsWith("Welcome"))
  println(str.replace(" ","yu"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println(aNumber)
  //character concatinate
  println('a' +: aNumberString :+ 'b')
  println(str.reverse)
  println(str.take(3))
  println(str.take(3))





}
