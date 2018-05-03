name := """src"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  "mysql" % "mysql-connector-java" % "5.1.38",
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  evolutions,
  "com.google.code.gson" % "gson" % "2.3.1",
  "com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B4-SNAPSHOT"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"