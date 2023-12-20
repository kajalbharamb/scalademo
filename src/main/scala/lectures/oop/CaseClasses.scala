package lectures.oop


object CaseClasses extends App{
  // equals, hashcode,toString

  case class Person( name:String,age: Int)
  //class parameter are fields
  val jim= new Person("jim",34)
  println(jim.name)

  //2.sensible toString
  //println(instance) = println(instance.toString)  // syntetic sugar
  println(jim.toString)
  println(jim)

  //equals and hashcode implemented OOTB
  val jim2=new Person("jim",34)
  println(jim==jim2)

  //cc has the copy method

  val jim3=jim.copy(age=78)
  println(jim3)

  // ccs have copanion objects

  val thePerson= Person
  val mary=Person("name",34)

  //ccs are serializable

  //ccs have extractor patterns == ccs can be uused in patterm matching

  case object UnitedKingdom{
    def name:String= "demo message"
  }


//same as the class objects except they don't get the compnion objects because they are thier own companion object





}
