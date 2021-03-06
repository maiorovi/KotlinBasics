package pluralsight.fourth_module

import app.Person

class Program {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person()

            p.name = "Kevin"
            p.age = 54

            println("Person has name ${p.name} and ${p.age} years old")

            try {
                p.name = ""
            } catch (e: Exception) {
                println("${e.message}")
            }

            val partner = p.partner

            println(partner?.name)
        }
    }

}


// inheriting java class
class Student : Person() {

}