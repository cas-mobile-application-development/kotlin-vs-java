package ch.bfh.cas.mad.inheritance

class CopyCommandKotlin: DefaultCommand(), Executable {
    override fun execute() {
        val input = this.getInput()
    }
}
