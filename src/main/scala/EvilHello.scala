object EvilHello {

  implicit class EvilStringExtensions(message: String) {
    def say(): Unit = {
      println(message
        .replaceAll("World", "Darkness, my old friend!"))
    }
  }

}
