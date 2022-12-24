ThisBuild / scalaVersion := "3.2.0"
ThisBuild / version := "1.0.0"
ThisBuild / organization := "com.mkozi"

lazy val core = (project in file("projects/playlists/sbt/core"))
  .settings(
    name := "Core",
    assembly / mainClass := Option("com.mkozi.playlists.sbt.core.CoreApp")
  )
lazy val server = (project in file("projects/playlists/sbt/server"))
  .dependsOn(core)
  .settings(  
    name := "Server",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.13" % Test
    )
  )

lazy val root = (project in file("."))aggregate(
  core,
  server
)

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "fansi" % "0.4.0",
  "org.scalatest" %% "scalatest" % "3.2.13" % Test
)