# Scala Training based on Youtube RockTheJVM Channel

* [github](https://github.com/kozigh01/scala_rtjvm_training)

## Resources
* [Scala language site](https://www.scala-lang.org/) | [Scala Install](https://www.scala-lang.org/download/)

## Videos / Playlists
### SBT  
* [SBT Playlist](https://www.youtube.com/watch?v=itiL7QT2WkI&list=PLmtsMNDRU0BwinL745E_cv1PDeR_jhlMI)
* RockTheJVM blogs:
  * [An Introduction to SBT](https://blog.rockthejvm.com/sbt-tutorial/)

* Basic Setup
  * Create file names build.sbt in folder root
  * Run: `$ sbt` in root of folder 
    * this will setup the basic stucture for the project
  * Create source file directories (relative to root):
    ```bash
    $ mkdir -p src/main/scala
    $ mkdir -p src/test/scala
    ```
  * Create basic scala module:
    * create a package in new source directory:
      ```bash
      $ cd src/main/scala
      $ mkdir -p com/mkozi
      $ cd com/mkozi
      $ touch Main.scala
      ```
    * edit Main.scala to add some functionality
    * from root directory run `$ sbt`
      * in the sbt repl run `sbt> compile`
        * this will create the compiled files in the target directory
      * run the program with fully qualified class: `sbt> runMain com.mkozi.Main`
      * can start auto compile with: `sbt> ~compile`
    * add external dependency to main project
      * add following to build.sbt:
        ```
        libraryDependencies += "com.lihaoyi" %% "fansi" % "0.4.0"

          -- or --

        libraryDependencies ++= Seq(
          "com.lihaoyi" %% "fansi" % "0.4.0"
        )
        ```
      * update Main package to use
      * in root directory run `$ sbt`
      * compile project: `sbt> compile`
      * update com.mkozi.Main to use fansi then: `sbt> runMain com.mkozi.Main'
    * write test for the project:
      * update library dependencies in built.sbt by adding:
        ```
        "org.scalatest" %% "scalatest" % "3.2.13" % Test
        ```
      * create test file in src/test/scala
      * in sbt repl compile `sbt> compile`
      * run the test: `sbt> Test / testOnly com.mkozi.SimpleTest`
      * can run tests that match a regex: `sbt> Test / testOnly *Test`
      * test all the tests: `sbt> test`
* Advanced setup (including multi-module setup)
  



