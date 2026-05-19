ThisBuild / scalaVersion := "3.8.3"

val emfcommon = "2.45.0"
val emfcore   = "2.42.0"
val uml2      = "3.1.0.v201006071150"
val scalatest = "3.2.20"

lazy val commonSettings = Seq(
  version := "0.1.0",
  organization := "com.github.max-leuthaeuser",
  logBuffered := false,
  libraryDependencies ++= Seq(
    "org.eclipse.emf" % "org.eclipse.emf.common" % emfcommon,
    "org.eclipse.emf" % "org.eclipse.emf.ecore" % emfcore,
    "org.eclipse.uml2" % "org.eclipse.uml2.uml" % uml2
  ),
  Compile / javacOptions ++= Seq("--release", "17"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:reflectiveCalls",
    "-language:postfixOps",
    "-language:implicitConversions",
    "-unchecked"
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "SCROLLGenRoot"
  )
  .aggregate(core, tests)

lazy val core = (project in file("core"))
  .enablePlugins(SbtTwirl)
  .settings(commonSettings*)
  .settings(
    name := "SCROLLGen",
    assembly / assemblyMergeStrategy := {
      case "plugin.properties" => MergeStrategy.last
      case "plugin.xml"        => MergeStrategy.last
      case PathList(ps @ _*) if ps.last.contains("dynamic_package.exsd")   => MergeStrategy.last
      case PathList(ps @ _*) if ps.last.contains("generated_package.exsd") => MergeStrategy.last
      case x => (assembly / assemblyMergeStrategy).value(x)
    },
    Compile / mainClass := Some("SCROLLGen"),
    assembly / mainClass := Some("SCROLLGen"),
    assembly / assemblyJarName := "SCROLLGen.jar"
  )

lazy val tests = (project in file("tests"))
  .settings(commonSettings*)
  .settings(
    Test / parallelExecution := false,
    libraryDependencies += "org.scalatest" %% "scalatest" % scalatest % Test
  )
  .dependsOn(core)
