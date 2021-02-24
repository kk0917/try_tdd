// give the user a nice default project!
ThisBuild / organization := "try.tdd"
ThisBuild / scalaVersion := "2.13.1"

//scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

lazy val root = (project in file(".")).
  settings(
    name := "try_tdd",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic"          % "3.2.2",
      "org.scalatest" %% "scalatest"          % "3.2.2"  % Test,
      "org.scalatest" %% "scalatest-flatspec" % "3.2.2"  % Test,
      "org.mockito"   %  "mockito-core"       % "2.21.0" % Test))
