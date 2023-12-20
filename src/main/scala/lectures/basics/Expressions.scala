package lectures.basics

// this extends app will make this obect runnable
object Expressions extends App {

  val x = 4+3 //expression
  println(x)
  println(2+5*6) // mathematical expression

  // + - * /  bitwise- &  | ^ >> << >>>(right shift with zero extension)

  println(1==x)
  // == != > >= < <=

  println (!(1==x))
  // && || !

  var variable = 5
  variable += 8 // also work with -= *= /=
  print(variable)

  // instructions (to do or perform ) vs expression (values)
  val aCondition =true
  val aConditionValue = if(aCondition)5 else 6
  println(aConditionValue)

  println(if(aCondition)5 else 6)


  var i=0
  while (i<10){
    println(i)
    i+=1
  }

  // not a good practice to use while
  // everything is scala is expression
  // unit type is used as null that used when nothing is returned.

  val aWeirdvalue = (variable=4) //unit == void
  println(aWeirdvalue)

  // side Effects : println(), whiles,reasssigning they are returning units

  // code block has the value of last expression

  val aBlock = {
    val j=9
    val s=2+j
    println(if(s>5)"right" else "wrong")
  }

  // this has the side effect as this method does not return anything
  println("Hello world")

  val someOtherValue = {
    if(2<8)"hi" else "hello"
    45
  }
  println(someOtherValue)
}
