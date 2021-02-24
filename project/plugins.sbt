addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
//addSbtPlugin("org.scalameta"  % "sbt-scalafmt"          % "2.7.5")

libraryDependencies += { "org.scalatest" %% "scalatest"       % "3.0.5"  % Test }
libraryDependencies += { "org.mockito"   %  "mockito-core"    % "2.21.0" % Test }

scalacOptions ++= Seq("-encoding", "UTF-8")
