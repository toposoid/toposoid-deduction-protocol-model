import Dependencies._

ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / version          := "0.5-SNAPSHOT"
ThisBuild / organization     := "com.ideal.linked"

lazy val root = (project in file("."))
  .settings(
    name := "toposoid-deduction-protocol-model",
    libraryDependencies += "com.typesafe.play" %% "play" % "2.8.8",
    libraryDependencies += "com.ideal.linked" %% "toposoid-knowledgebase-model" % "0.5-SNAPSHOT",
    libraryDependencies += scalaTest % Test
  )
  .enablePlugins(AutomateHeaderPlugin)

organizationName := "Linked Ideal LLC.[https://linked-ideal.com/]"
startYear := Some(2021)
licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt"))
