package danbroid.lib1

import java.util.*

class Library1_Dude {
  val message: String
    get() = "Hello from Library1"
}

private val log = org.slf4j.LoggerFactory.getLogger(Library1_Dude::class.java)

