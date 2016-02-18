import java.io.File

import generator.CROMGenerator
import importer.CROMImporter
import utils.FileUtils._
import utils.TimeUtils._

object SCROLLGen extends App {

  def printHelp(): Unit = {
    println(
      """
        | SCROLLGen
        | Usage: java -jar SCROLLGen.jar --in <file> --out <file>
        |
        | --in <file>
        |   The .ecore model that should be used for code generation
        |
        | --out <folder-path>
        |   The path to the folder where the generated .scala file should be located at
      """.stripMargin)
  }

  if (args.isEmpty || args.head.contains("help") || args.length != 4) {
    printHelp()
    System.exit(0)
  }

  var modelFilePath = ""
  var outFilePath = ""

  args.sliding(2, 1).toList.collect {
    case Array("--in", in: String) => modelFilePath = in
    case Array("--out", out: String) => outFilePath = new File(out).exists() match {
      case true if out.endsWith("/") => out + "CROMApplication.scala"
      case true => out + "/CROMApplication.scala"
      case _ => println("This out path does not exist: " + out); System.exit(1); ""
    }
  }

  println(s"Generating from ecore model '$modelFilePath' to SCROLL code '$outFilePath' ...")
  println(" => that took " + writeToFile(outFilePath, new CROMGenerator().generate(new CROMImporter(modelFilePath).loadModel())).elapsed() + "ms")
  println("... finished.")
}
