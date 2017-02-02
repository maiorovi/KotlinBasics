package pluralsight.snd_module

interface Signatory {
    fun sign()
}

class Person : Signatory {
    override fun sign() = println("I can sign a documents")
}

fun main(args : Array<String>) {
    val p = Person()
    p.sign()
}