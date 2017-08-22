lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )
publishTo := Some("Artifactory Realm" at "http://localhost:8081/artifactory/sbt-deploy")
credentials += Credentials("Artifactory Realm", "localhost", "admin", "s@ntoshj@ju")


resolvers += 

"Artifactory" at "http://localhost:8081/artifactory/sbt-deploy/"
  

  

 

  
