package pluralsight.snd_module

import java.time.LocalDate
import java.time.Month
import java.util.*

class Entity(val name:String, val traitOne:String, val date: LocalDate) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ent = Entity("name", "trait1", LocalDate.of(2017,10,10));
            println(ent)
        }
    }

    override fun toString():String {
        return "name = $name, traitOne = $traitOne, date = $date"
    }

}

