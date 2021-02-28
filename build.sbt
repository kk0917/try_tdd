// give the user a nice default project!
ThisBuild / organization := "try.tdd"
ThisBuild / scalaVersion := "2.13.1"

//scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

lazy val root = (project in file(".")).
  settings(
    name := "try_tdd_with_scala",
    libraryDependencies ++= Seq(
      "org.scalactic"       %% "scalactic"                % "3.2.2",
      "org.scalatest"       %% "scalatest"                % "3.2.2"  % Test,
      "org.scalatest"       %% "scalatest-flatspec"       % "3.2.2"  % Test,
      "org.scoverage"       %% "scalac-scoverage-runtime" % "1.4.0" % Test,
      "org.scoverage"       %% "scalac-scoverage-plugin"  % "1.4.0" % "provided",
      "org.mockito"         %  "mockito-core"             % "2.21.0" % Test,
      "com.beautiful-scala" %% "scalastyle"               % "1.5.0"))
