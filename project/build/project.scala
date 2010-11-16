import sbt._

class ScalaLiveProject(info: ProjectInfo) extends DefaultProject(info) {

  // Dependencies (compile)

  // Dependencies (provided)

  // Dependencies (test)
  lazy val specs = "org.scala-tools.testing" %% "specs" % "1.6.6" % "test" withSources
  lazy val mockito = "org.mockito" % "mockito-all" % "1.8.5" % "test"
}
