name := "test-java-junit-from-sbt"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-java-junit-from-sbt"))

startYear := Some(2014)

description := "Use JUnit from Scala through SBT"

version := "1.0.0"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test
)
