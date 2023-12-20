package lectures.oop

object MapFlatmapFilterFor extends App{
  // list
   val list = List(1,2,3,7,5)

  println(list)
  println(list.head)
  println(list.tail)

  // map
  println(list.map(_+1))
  println(list.map(_+" this is  number"))
  println(list)

  //filter
  println(list.filter(_%2==0))

  //flatMap
  val toPair = (x:Int) => List(x,x+1)
  println(list.flatMap(toPair))

  //print all combinations of two list
  val number = List(1,2,3,4)
  val chars = List("a","b","c","d")
  val colors = List("black","white")

  // this is how we dp iterations
  //for two loop
  val combinations = number.flatMap(n => chars.map(c =>c+" "+n))

  //for three loop
  val combination = number.filter(_%2==0).flatMap(n => chars.flatMap(c => colors.map(color => c+" "+n+" "+color)))
  println(combinations)
  println(combination)

  //for each
  list.foreach(println)

  //for-comprehensions
  //this will rewritten by compiler to chains of map and flatmap
  val forCombinations = for{
    n <- number if n%2==0
    c <- chars
    color <- colors
  } yield c+" "+n+" "+color
  println(forCombinations)

  //syntax overload
  list.map{
    x => x*2
  }


}
