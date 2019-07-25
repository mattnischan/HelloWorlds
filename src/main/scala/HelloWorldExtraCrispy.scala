object HelloWorldExtraCrispy extends App {
  val helloSayer = ExtraCrispyHello(message =>
    message
      .toLowerCase()
      .replace("e", "3")
      .replace("o", "0")
  )

  helloSayer.sayHello("Hello World!")
}
