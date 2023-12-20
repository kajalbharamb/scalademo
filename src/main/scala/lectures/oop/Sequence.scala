package lectures.oop

object Sequence extends App{

  //seq
  val aSequence = Seq(1,2,5,7)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(3))
  println(aSequence ++ Seq(5,6,7))
  println(aSequence.sorted)

  //range

  val aRange:Seq[Int] = 1 to 10
  aRange.foreach(println)

  val aRanges: Seq[Int] = 1 until  10
  aRanges.foreach(println)

  // for loop
  (1 to 10).foreach(x=> println("Welcome"))

  //lists
  val aList = List(1,2,3)
  val prepended = 56 :: aList
  val preAndAppend = 32 +: aList :+ 67
  println(prepended)
  println(preAndAppend)

// when we want same value if full list
  val apple = List.fill(3)("Apple")
  println(apple)

  //make list to string by including the given string between them
  println(aList.mkString("-|-"))

  //Arrays
  val arrays = Array(1,2,4,5,6)
  // array to declare with size
  val demoArray = Array.ofDim[Int](4)

  //mutation
  arrays(3)= 9
  //syntatic sugar of this is
  arrays.update(3,0)

  arrays.foreach(print)
  demoArray.foreach(println)

 // array and seq wrapped array into seq
  val numberSeq: Seq[Int] = arrays
  println(numberSeq)

  //vector
  val aVector:Vector[Int] = Vector(1,2,3)
  println(aVector)

  //vector vs list










}
