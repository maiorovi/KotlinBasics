package pluralsight.snd_module

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int) : Signatory {

    init {
        if (name == "Kevin" && age > 125) throw Exception("Invalid age")
    }

    var isMarried: Boolean = false

    constructor(name: String, age:Int, isMarried: Boolean) : this(name, age)
    { this.isMarried = isMarried }

    override fun sign() = println("$name who is $age years old can sign a documents (and their marital status is $isMarried)")
}

class Student(name: String, age: Int) : Person(name, age) {

}


fun main(args : Array<String>) {
    val p = Person("Kevin", 27, true)
    p.sign()
}