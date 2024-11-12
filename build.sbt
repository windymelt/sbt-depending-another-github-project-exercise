val scala3Version = "3.5.2"

// should not collide with the other project's name (metals confused)
lazy val p = project
  .in(file("."))
  .dependsOn(anotherProject)
  .settings(
    name := "Depending another sbt project on GitHub example",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
  )

lazy val anotherProject = RootProject(uri("https://github.com/windymelt/scalatest-playjson-equality.git"))
