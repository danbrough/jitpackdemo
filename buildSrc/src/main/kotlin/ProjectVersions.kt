import org.gradle.api.JavaVersion

object ProjectVersions {


    const val SDK_VERSION = 29
    const val MIN_SDK_VERSION = 15
    const val VERSION_CODE = 1
    val JAVA_VERSION = JavaVersion.VERSION_1_8
    val VERSION_NAME = getVersionName()

    fun getVersionName(code: Int = VERSION_CODE) = "1.0.${code-1}"

}
