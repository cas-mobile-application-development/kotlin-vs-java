package ch.bfh.cas.mad.parameters

class ClientKotlin {
    fun run() {
        runOnCommandLine(command = "copy")
    }

    private fun runOnCommandLine(
        command: String,
        argument: String? = "myargument"
    ) {
        println("$command $argument")
    }
}