import sbt._

class cumsum(info: ProjectInfo) extends DefaultProject(info) {
  //val scalacheck = "org.scala-tools.testing" % "scalacheck_2.9.0-SNAPSHOT" % "1.9"
  val scalatest = "org.scalatest" % "scalatest" % "1.4-SNAPSHOT"
  
   val scalaToolsSnapshots = "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"
}