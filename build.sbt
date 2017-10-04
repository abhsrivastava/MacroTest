lazy val commonSettings = Seq(
   scalaVersion := "2.12.3"
)
lazy val macroProject = project

lazy val myProject = (project in file(".")).settings(
   commonSettings,
   name := "MyProject"
).aggregate(macroProject).dependsOn(macroProject)

mainClass in run := Some("com.abhi.HelloWorld")