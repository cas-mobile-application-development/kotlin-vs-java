package ch.bfh.cas.mad.functions

class ArrayHelpersKotlin {
    fun printAndReturnFirstArgument(args: Array<String>): String? {
        val firstArgument = args.firstOrNull()
        println("Hello World! $firstArgument")
        return firstArgument
    }
}


