val scalariform = "0.2.8"
val emfcommon = "2.15.0"
val emfcore = "2.15.0"
val uml2 = "3.1.0.v201006071150"
val scalatest = "3.0.7"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.8",
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
      case PathList(ps @ _*) if ps.last contains "dynamic_package.exsd" => MergeStrategy.last
      case PathList(ps @ _*) if ps.last contains "generated_package.exsd" => MergeStrategy.last
      case x => (assemblyMergeStrategy in assembly).value(x)
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
