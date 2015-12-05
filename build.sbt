lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "hello",
    libraryDependencies ++= Seq(
    		"org.scala-lang" % "scala-library" % "2.10.4",
	      "org.apache.spark" % "spark-core_2.10" % "1.5.2",
				"org.apache.spark" % "spark-streaming_2.10" % "1.5.2",
  			"com.github.nscala-time" % "nscala-time_2.10" % "2.0.0",
  			"org.scalatest" % "scalatest_2.10" % "2.2.4",
  			"com.holdenkarau" % "spark-testing-base_2.10" % "1.4.1_0.1.1",
  			"org.scalamock" % "scalamock-scalatest-support_2.10" % "3.2",
  			"junit" % "junit" % "4.10"
    	)
  )