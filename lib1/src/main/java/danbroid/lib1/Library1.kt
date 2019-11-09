package danbroid.lib1

import java.util.*

class Library1 {
  val message: String
    get() = "Hello from Library1 version 0.0.11 at ${Date()}"
}

private val log = org.slf4j.LoggerFactory.getLogger(Library1::class.java)

