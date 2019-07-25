trait Sayance extends App {
    def say(implicit message: String): Unit = {
        println(message)
    }
}