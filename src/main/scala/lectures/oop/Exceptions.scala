package lectures.oop

object Exceptions extends App{

  val x:String = null;

  //  println(x.length)    - this will throw NullPointerException

  //1. throwing exceptions

//  val aweird:String = throw new NullPointerException

  // throwing classes extend the throwable class.
  //Exception and error are the major Throwable subTypes


  //2.catch the exceptions
  def getInt(withExceptions:Boolean):Int =
    if(withExceptions) throw new RuntimeException("No int for you ")
    else
    45


  val value= try{
    //code that might throw
    getInt(true)
  }
  catch {
    case e:RuntimeException => 76
  }
  finally {
    //optional
    //does not influence the return type of this expression
    //use finally only for side effects
    println("no matter what it will run")
  }

  println(value)


  //3. how to define own exceptions

  class MyException extends Exception
  val exception = new MyException

  throw exception
}
