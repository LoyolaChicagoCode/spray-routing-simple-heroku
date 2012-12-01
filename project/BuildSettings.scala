import sbt._
import Keys._


object BuildSettings {
  val VERSION = "1.0-M6"

  lazy val basicSettings = seq(
    version               := VERSION,
    homepage              := Some(new URL("http://spray.io")),
    organization          := "io.spray",
    organizationHomepage  := Some(new URL("http://spray.io")),
    description           := "Standalone version of spray-routing simple-on-spray-can example with start script",
    startYear             := Some(2011),
    licenses              := Seq("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalaVersion          := "2.9.2",
    resolvers             ++= Dependencies.resolutionRepos,
    scalacOptions         := Seq("-Ydependent-method-types", "-unchecked", "-deprecation", "-encoding", "utf8")
  )
}