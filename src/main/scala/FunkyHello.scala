object FunkyHello extends (String => String) {
  def apply(message: String): String = {
    message
      .toUpperCase()
      .map(char => s"${char} ")
      .reduceLeft((complete, part) => s"${complete}${part}")
  }
}
