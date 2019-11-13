package danbroid.lib2


class Library2 {
  val message: String
    get() = "Hello again from Library2"
}

private val log = org.slf4j.LoggerFactory.getLogger(Library2::class.java)

