import twirl.sbt.TwirlPlugin._

lazy val commonSettings = Seq(
  scalaVersion := "2.11.7",
  version := "0.0.1",
  logBuffered := false,
  libraryDependencies ++= Seq(
    "org.scalariform" %% "scalariform" % "0.1.8",
    "org.eclipse.emf" % "org.eclipse.emf.common" % "2.10.1",
    "org.eclipse.emf" % "org.eclipse.emf.ecore" % "2.10.1",
    "org.eclipse.uml2" % "org.eclipse.uml2.uml" % "3.1.0.v201006071150"
  ),
  javacOptions in Compile ++= Seq("-source", "1.8", "-target", "1.8"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:reflectiveCalls",
    "-language:postfixOps",
    "-language:implicitConversions",
    "-Xfatal-warnings",
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
  settings(commonSettings: _*).
  settings(Twirl.settings: _*).
  settings(
    name := "SCROLLGen"
  )

lazy val tests = (project in file("tests")).
  settings(commonSettings: _*).
  settings(
    parallelExecution in Test := false,
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.1" % "test")
  ).dependsOn(core)