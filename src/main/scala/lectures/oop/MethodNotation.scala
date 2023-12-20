package lectures.oop

import scala.language.postfixOps

object MethodNotation extends App{

  class Person(val name:String , favoriateMovie:String) {
    def likes(movieName: String): Boolean = movieName == favoriateMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def -(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_!(): String = s"${this.name} is hanging out with "
    def isAlive:Boolean = true
    def apply():String = s"${this.name} is hanging out with "
  }




  val mary = new Person("Kajal", "inception")

  println(mary.likes("inception"))
  //method with a single parameter can be call like this infix notation style
  println(mary likes "inception") // this is also known as syntatic sugar or infix notation

  val rahul = new Person("rahul", "hsgdgaeption")

  println(mary.hangOutWith(rahul))
  // All operator are method in scala we have freedom to make any name or as a operator name in scala

  println(1.+(5))
  println(1.*(5))

  //prefix notation
  //below two are same
  val x = -(1)
  val y = -1.unary_-

  println(!mary)
  println(mary.unary_!)

//work with -,+,~,! operator

  println(x)

  //postfix notation
  //only available method without parameter
  println(mary.isAlive)
  println(mary isAlive)

  //Apply
  // this both are same
  println(mary.apply())
  println(mary())


}
