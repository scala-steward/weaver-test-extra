name := "weaver-test-playground"

version := "0.1"

scalaVersion := "2.13.3"
libraryDependencies +=  "com.disneystreaming" %% "weaver-scalacheck" % "0.4.2-RC1"
libraryDependencies +=  "com.disneystreaming" %% "weaver-framework" % "0.4.2-RC1"

testFrameworks += new TestFramework("weaver.framework.TestFramework")

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)

