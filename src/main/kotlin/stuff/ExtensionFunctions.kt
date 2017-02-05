package stuff

fun <T> MutableList<T>.swap(index1:Int, index2:Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

open class C

class D : C()

fun C.foo() = "C"

fun D.foo() = "D"

fun formatOutput(c: C):String {
    return c.foo()
}


class E {
    fun foo():String {
        return "member function"
    }
}

fun E.foo():String {
    return "extension function";
}