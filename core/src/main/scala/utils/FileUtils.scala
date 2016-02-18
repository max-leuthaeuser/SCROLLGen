package utils

import java.io.FileWriter

object FileUtils {
  def using[A <: {def close() : Unit}, B](resource: A)(f: A => B): B =
    try f(resource) finally resource.close()

  def writeToFile(path: String, data: String): Unit =
    using(new FileWriter(path))(_.write(data))
}
