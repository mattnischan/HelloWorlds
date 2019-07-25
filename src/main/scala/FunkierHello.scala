class FunkierHello(message: String) {
  def sayHello(): Unit = {
    println(message)
  }
}

object FunkierHello {
  def apply(message: String): FunkierHello = new FunkierHello(FunkyHello(message))
}
