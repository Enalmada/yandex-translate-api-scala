name := """yandex-translate-api-scala"""

version := "1.0.0"

lazy val module = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalaj" % "scalaj-http_2.11" % "0.3.16",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0" % "test",
"junit" % "junit" % "4.12" % "test",
  ws,
  specs2 % Test
)

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// These tests depend on the order.  Should fix that so they are independant.
parallelExecution in Test := false


//*******************************
// Maven settings
//*******************************

publishMavenStyle := true

organization := "com.github.enalmada"

description := "Provides a simple, unofficial, Scala client API for using Yandex Translate."

startYear := Some(2016)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra in Global := {
  <url>https://github.com/Enalmada/yandex-translate-api-scala</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:git@github.com:enalmada/yandex-translate-api-scala.git</connection>
      <developerConnection>scm:git:git@github.com:enalmada/yandex-translate-api-scala.git</developerConnection>
      <url>https://github.com/enalmada/yandex-translate-api-scala</url>
    </scm>
    <developers>
      <developer>
        <id>enalmada</id>
        <name>Adam Lane</name>
        <url>https://github.com/enalmada</url>
      </developer>
    </developers>
}

credentials += Credentials(Path.userHome / ".sbt" / "sonatype.credentials")
