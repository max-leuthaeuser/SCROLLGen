package utils

object TimeUtils {

  implicit class RichElapsed(f: => Unit) {
    def elapsed(): Double = {
      val start = System.nanoTime()
      f
      val end = System.nanoTime()

      (end - start) / 1e6
    }
  }

}