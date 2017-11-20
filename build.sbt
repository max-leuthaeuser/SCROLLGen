val scalariform = "0.2.6"
val emfcommon = "2.10.1"
val emfcore = "2.10.1"
val uml2 = "3.1.0.v201006071150"
val scalatest = "3.0.4"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.4",
  version := "0.0.2",
  logBuffered := false,
  libraryDependencies ++= Seq(
    "org.scalariform" %% "scalariform" % scalariform,
    "org.eclipse.emf" % "org.eclipse.emf.common" % emfcommon,
    "org.eclipse.emf" % "org.eclipse.emf.ecore" % emfcore,
    "org.eclipse.uml2" % "org.eclipse.uml2.uml" % uml2
  ),
  javacOptions in Compile ++= Seq("-source", "1.8", "-target", "1.8"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:reflectiveCalls",
    "-language:postfixOps",
    "-language:implicitConversions",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture",
    "-unchecked",
    "-target:jvm-1.8")
)

lazy val root = (project in file(".")).settings(
  name := "SCROLLGenRoot"
).aggregate(core, tests)

lazy val core = (project in file("core")).
  enablePlugins(SbtTwirl).
  settings(commonSettings: _*).
  settings(
    name := "SCROLLGen",
    assemblyMergeStrategy in assembly := {
      case "plugin.properties" => MergeStrategy.last
      case "plugin.xml" => MergeStrategy.last
      case "schema/dynamic_package.exsd" => MergeStrategy.last
      case "schema/generated_package.exsd" => MergeStrategy.last
      case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
    },
    mainClass in compile := Some("SCROLLGen"),
    mainClass in assembly := Some("SCROLLGen"),
    assemblyJarName in assembly := "SCROLLGen.jar"
  )

lazy val tests = (project in file("tests")).
  settings(commonSettings: _*).
  settings(
    parallelExecution in Test := false,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % scalatest % "test")
  ).dependsOn(core)