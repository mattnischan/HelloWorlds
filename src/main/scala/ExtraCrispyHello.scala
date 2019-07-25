class ExtraCrispyHello(helloFunction: String => String) {
  def sayHello(message: String): Unit = {
    println(helloFunction(message))
  }
}

object ExtraCrispyHello {
  def apply(helloFunction: String => String): ExtraCrispyHello = new ExtraCrispyHello(helloFunction)
}