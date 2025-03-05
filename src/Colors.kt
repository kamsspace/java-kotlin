

enum class ErrorCodes(val error: Int) {
    None(0),
    Unknown(1),
    ConnectionLost(300),
    HttpError(404)
}

fun main() {
    val errorCode = ErrorCodes.ConnectionLost

    when(errorCode) {
        ErrorCodes.None -> {
            println("No Error")
        }
        ErrorCodes.Unknown -> {
            println()
        }
        ErrorCodes.ConnectionLost -> {}
        ErrorCodes.HttpError -> {}
    }

    println("errorCode has name ${errorCode.name} and it has ordinal ${errorCode.ordinal} and has value ${errorCode.error}")

    val error  = ErrorCodes.valueOf("Unknown")
    println("errorCode has name ${error.name} and it has ordinal ${error.ordinal} and has value ${error.error}")
    ErrorCodes.values()
}