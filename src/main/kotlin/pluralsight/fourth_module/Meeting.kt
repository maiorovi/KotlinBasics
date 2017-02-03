package pluralsight.fourth_module

class Meeting(val title: String) {
    var location: String = "Unknown"
    @JvmField
    var description = ""

    companion object {
        @JvmField
        val APP_VERSION = 1
    }
}