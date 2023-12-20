package lectures.oop

object Generics extends App{
  // generic class with type A
   class MyList[A] {
    //use the type A
  }
  //More then one generic type
  class MyMap[key,value]

  //also work with traits
  val listOfInteger = new MyList[Int]
  val ListOfStrings = new MyList[String]


  //object cannnot be type parameterised
  //generic method
  object MyList{
    def empty[A] :MyList[A] = ???
  }

  //variance problem
  class Animal{

  }
  class Cat extends Animal {

  }
  class Dog extends Animal{

  }

  //1 . yes, list[cat] extends list[Animal] = covariance

  class CovarianceList[+A]
  val animal:Animal=new Cat
  val animalList:CovarianceList[Animal] = new CovarianceList[Cat]
  //animalList.add(new Dog)


  //no = invariance
  // cant replace
  class Invariance[A]
  val invariantAnimalList:Invariance[Animal] = new Invariance[Animal]

  //cantravarience
  class ContravariantList[-A]
  val contravariantList : ContravariantList[Cat] = new ContravariantList[Animal]

  //bounded types

  //use your class only for certain type that ar either a subclass or difrrent type or a super class of diffrent type
 //<: ristriction to only accept type parameter A, which are subtypes of animal
 // class cage[A > : Animal](animal: A)   -- this will say that cage only accept super type of animal
  class cage[A <: Animal](animal: A)
  val cafe=new cage(new Dog)

  class car
  val car=new cage(animal)
}
