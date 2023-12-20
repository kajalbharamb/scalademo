package lectures.oop


object Objects {
  //scala does not have class-level funtionally("static")
  //to use class level defination we use object
  //scala objects are the singleton bean
  object Person {
    val N_EYES = 2;

    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")

  }

  class Person(val name : String){
    // instance level funtionality

  }

  def main(args: Array[String]) {
    println(Person.N_EYES)
    println(Person.canFly)

    val mary=Person
    val rahul=Person
    println(mary==rahul)

    val person1 = new Person("hu")
    val person2 = new Person("rah")

    println(person1==person2)


  }

}
