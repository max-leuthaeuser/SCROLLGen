package generator

import java.nio.file.Paths

import org.scalafmt.interfaces.Scalafmt

object ScalaFormatter {
  private val configPath = Paths.get(".scalafmt.conf")
  private val filePath   = Paths.get("CROMApplication.scala")
  private val formatter  = Scalafmt.create(getClass.getClassLoader)

  def format(code: String): String =
    formatter.format(configPath, filePath, code)
}
