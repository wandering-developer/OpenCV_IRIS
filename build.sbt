name := "IRIS"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.apache.spark" %% "spark-sql" % "2.3.0",
  "com.typesafe" % "config" % "1.3.2",
  "org.openpnp" % "opencv" % "3.2.0-1",
//  "org.bytedeco.javacpp-presets" % "opencv" % "4.0.1-1.4.4",
  "org.apache.spark" %% "spark-mllib" % "2.3.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2" excludeAll ExclusionRule (
    organization = "com.fasterxml.jackson.core"
  )
)

resolvers += Resolver.mavenLocal