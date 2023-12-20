package lectures.oop

object AnontmouseClasses extends App{

  abstract class Animal{
    def eat:Unit
  }

  //anonymousClasses
  val funnyAnimal =new Animal {
    override def eat: Unit = println("jajajajaja")
  }
  /*
  internally compiler does this
  equivalent with

   class AnontmouseClasses$$anon$1 extends Animal{
    override def eat: Unit = println("jajajajaja")

  }
  */


  println(funnyAnimal.getClass)

  class Person(name:String){
    def sayHi:Unit = println(s"hi my name is $name")
  }

  val people= new Person("jim"){
    override def sayHi:Unit = println(s"Hi ,my name is jj")
  }
}
