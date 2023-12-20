package lectures.oop

object Optional extends App{

//unsafe api
  def unSafeApi(): String = null

  val result = Option(unSafeApi())
  println(result)

  //chained method
  def backup() :String = "valid"
  val result1= Option(unSafeApi()).orElse(Option(backup()))
  println(result1)

}
