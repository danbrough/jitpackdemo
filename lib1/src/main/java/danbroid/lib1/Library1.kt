package danbroid.lib1

class Library1 {
  val message: String
    get() = "Hello from Library1"
}

private val log = org.slf4j.LoggerFactory.getLogger(Library1::class.java)

