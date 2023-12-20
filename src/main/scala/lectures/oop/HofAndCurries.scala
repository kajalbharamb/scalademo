package lectures.oop

object HofAndCurries extends App
{
  // function which take function as a parameter or return a function
  // high Order function (HOF)

  // map, flatmap, filter in MyList

  // function tht applies a function n times over a value x
  // nTimes(f , n, x)
  // ntimes(f, 3, x) = f(f(f(x)))

  def nTimes (f:Int => Int, n : Int , x:Int):Int =
    if(n<=0) x
    else
      nTimes(f,n-1,f(x))

    val plusOne = (x: Int) => x+1
    println(nTimes(plusOne,3,8))

  //ntb(f,n) = x => f(f(f...(x)))
  //increment10 = ntb(plusOne,10) = x => plusOne(plusOne....(x))
  // val y = increment10(1)
  def nTimesBetter(f:Int => Int,n:Int):(Int =>Int) =
    if (n <= 0) (x:Int) => x
    else (x : Int) => nTimesBetter(f,n-1)(f(x))
    val plus10 = nTimesBetter(plusOne,10)
    println(plus10(1))


//curried functions
  val superAdder : Int =>(Int => Int)  = (x:Int) =>(y:Int) => x+y
  val adder = superAdder(7)
  println(adder(5))
  println(superAdder(4)(6))

  //function with multiple parameter list
  def curriedFormatter(c:String)(x:Double) :String = c.format(x)




}
