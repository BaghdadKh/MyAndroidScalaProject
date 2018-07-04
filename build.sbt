import android.Keys._

lazy val root = (project in file(".")).settings(android.Plugin.androidBuild)
  .settings(
    name := "MyApplication_Jul",
    scalaVersion := "2.12.4",
    versionCode := Some(0),
    versionName := Some("0.1")
  )
