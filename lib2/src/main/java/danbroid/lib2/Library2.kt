package danbroid.lib2

import java.util.*

class Library2 {
  val message: String
    get() = "Hello from Library2 at ${Date()}"
}

private val log = org.slf4j.LoggerFactory.getLogger(Library2::class.java)

