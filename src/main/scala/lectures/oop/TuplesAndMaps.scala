package lectures.oop

object TuplesAndMaps extends App{

  // tuples  = finite order of list and use to group the elements
  val aTuple= new Tuple2(2,"hello")
  val tuple = (2,"hello scala")

  println(tuple._1)
  println(tuple.copy(_2 = "good bye"))
  println(tuple.swap)

  // maps -keys-values * immutable
  //empty map
  val amap:Map[String,Int] = Map()

  val phoneBook = Map(("Jim",555),("kal",576)).withDefaultValue(-9)
  val phoneBook1 = Map("Jim"->555,"Kal"->576).withDefaultValue(-7)
  println(phoneBook)
  println(phoneBook1)

  // map operations
  println(phoneBook.contains("Jim"))
  println(phoneBook("Jim"))
  println(phoneBook("jim"))
  println(phoneBook.get("lim"))

  //add a pairing
  val newPair = ("ikj",676)
  val newPairing = phoneBook+newPair
  println(newPairing)

  //funcitons on map

  println(phoneBook.map(pair => pair._1.toLowerCase() -> pair._2 ))

  //filterkeys
  println(phoneBook.view.filterKeys(x => x.startsWith("J")).toMap)

  // map values
  println(phoneBook.view.mapValues(number =>"2345_" + number).toMap)

  //conversion to collections
  println(phoneBook.toList)
  println(List(("daniel",898)).toMap)

  val names = List("JARDAN","KAJAL","JIM")
  println(names.groupBy(name => name.charAt(0)))
}
