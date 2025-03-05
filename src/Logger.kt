

interface Logger {
    fun debug(message: String)
    fun info(message: String)
}


class StdoutLogger : Logger {
    override fun debug(message: String) {
        println(message)
    }

    override fun info(message: String) {
        println(message)
    }
}


class NullLogger : Logger {
    override fun info(message: String) {
    }

    override fun debug(message: String) {
    }
}