package lectures.oop

object FunctionDemo extends App {

  val demoObect = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(demoObect("3") + 4)

  val sum: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
  println(sum(4, 4))

  val concatinate = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  println(concatinate("gh", "gh"))

  // Function[Int, Function[Int,Int]
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

    val adder2 = superAdder(3)
    println(adder2(6))
    println(superAdder(2)(6))


  }
