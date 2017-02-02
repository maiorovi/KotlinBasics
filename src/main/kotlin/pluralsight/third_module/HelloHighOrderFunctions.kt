package pluralsight.third_module

fun map(inp: List<Int>, fn: (Int) -> Int):List<Int> {
    return inp.map(fn)
}

fun main(args: Array<String>) {
    map(mutableListOf(1,2,3,4,5,6)) { z -> z * 5 }.forEach { x -> print("$x, ") }

    mutableListOf(1,2,3,4,5).map {
        it * 10
    }.forEach {
        print("$it")
    }
}