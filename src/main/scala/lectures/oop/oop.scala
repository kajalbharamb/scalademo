package lectures.oop

object oop extends App{
  val person= new Person()

  val author = new Writer("Kajal","Bharambe",2001)
  val novel = new Novel(name = "NewNovel", year = 2034, author = author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
}

class Person(){

}

class Writer(name:String,serName:String,val year:Int)
{
  def fullName: String = name + " " + serName
}

class Novel(name:String,year:Int,author:Writer)
{
  def authorAge = year - author.year
  def isWrittenBy(author:Writer) = author == this.author
  def copy(newYear:Int):Novel = new Novel(name,newYear,author)

}



