abstract class MyList {
  def head: Int
  def tail:MyList

  def isEmpty:Boolean
  def add(element:Int): MyList

}
//object can inherit classes
object Empty extends MyList{
  //??? this a expressio returning nothing if it called traow not implemnted error
  // if we call the head method with empty list it will throw the noSuchElementFound
  override def head: Int = throw new NoSuchElementException

  override def tail: MyList =  throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new cons(element,Empty)
}

class cons(h:Int , t:MyList) extends MyList{
  override def head: Int = ???

  override def tail: MyList = ???

  override def isEmpty: Boolean = ???

  override def add(element: Int): MyList = ???
}

