val paradiseVersion = "2.1.1"

lazy val macroProject = (project in file(".")).settings(
   name := "MacroProject",
   scalaVersion := "2.12.3",
   libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-compiler" % "2.12.3",
      "org.scalameta" % "scalameta_2.12" % "2.0.1"
   )
)


