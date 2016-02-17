val scalatestVersion = "2.2.1"

lazy val commonSettings = Seq(
  scalaVersion := "2.11.7",
  version := "0.0.1",
  logBuffered := false,
  resolvers ++= Seq(
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
  ),
  libraryDependencies ++= Seq(
    "org.eclipse.emf" % "org.eclipse.emf.common" % "2.10.1",
    "org.eclipse.emf" % "org.eclipse.emf.ecore" % "2.10.1",
    "org.eclipse.uml2" % "org.eclipse.uml2.uml" % "3.1.0.v201006071150"
  ),
  javacOptions in Compile ++= Seq("-source", "1.8", "-target", "1.8"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:dynamics",
    "-language:reflectiveCalls",
    "-language:postfixOps",
    "-language:implicitConversions",
    "-Xfatal-warnings",
    "-Xlint",
    "-Xlint:-missing-interpolator",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture",
    "-Ywarn-unused-import",
    "-unchecked",
    "-target:jvm-1.8")
)

lazy val root = (project in file(".")).settings(
  name := "SCROLLRoot"
).aggregate(core, tests)

lazy val core = (project in file("core")).
  settings(commonSettings: _*).
  settings(
    name := "SCROLLGen",
    organization := "com.github.max-leuthaeuser",
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false },
    pomExtra :=
      <url>https://github.com/max-leuthaeuser/SCROLLGen</url>
        <licenses>
          <license>
            <name>LGPL 3.0 license</name>
            <url>http://www.opensource.org/licenses/lgpl-3.0.html</url>
            <distribution>repo</distribution>
          </license>
        </licenses>
        <scm>
          <connection>scm:git:github.com/max-leuthaeuser/SCROLLGen.git</connection>
          <developerConnection>scm:git:git@github.com:max-leuthaeuser/SCROLLGen.git</developerConnection>
          <url>github.com/max-leuthaeuser/SCROLLGen</url>
        </scm>
        <developers>
          <developer>
            <id>max-leuthaeuser</id>
            <name>Max Leuthaeuser</name>
            <url>https://wwwdb.inf.tu-dresden.de/rosi/investigators/doctoral-students/</url>
          </developer>
        </developers>
  )

lazy val tests = (project in file("tests")).
  settings(commonSettings: _*).
  settings(
    parallelExecution in Test := false,
    javaOptions += "-Xms4g",
    javaOptions += "-Xmx4g",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % scalatestVersion % "test")
  ).dependsOn(core)