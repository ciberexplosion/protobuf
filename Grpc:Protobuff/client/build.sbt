import scalapb.compiler.Version.{
  grpcJavaVersion,
  scalapbVersion,
  protobufVersion
}

lazy val root = project
  .in(file("."))
  .settings(
    Test / fork := true,
    scalaVersion := "2.13.8",
    libraryDependencies += "io.grpc" % "grpc-netty" % grpcJavaVersion,
    libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
    libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbVersion,
    Compile / PB.targets := Seq(
      scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
    )
  )
