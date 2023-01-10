resolvers := Seq(
  "iGeolise releases" at "https://artifactory.igeolise.com/artifactory/libs-release",
  Resolver.url(
    "iGeolise ivy releases",
    url("https://artifactory.igeolise.com/artifactory/libs-release-ivy")
  )(Resolver.ivyStylePatterns)
)
externalResolvers := Resolver.defaultLocal +: resolvers.value
fullResolvers := projectResolver.value +: externalResolvers.value

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.10")
