package pluralsight.fst_module

/**
 * Created by egor on 2/2/17.
 */
fun main(args: Array<String>) {
    println("Hello world!!!")
    println(name)
    println(max(5,7))

    //templating in strings
    println("My name is not $name")
}

fun max(a: Int, b:Int):Int  {
    return if (a > b) a else b
}

val name = "Andrew" //constants
var password: String = "password";