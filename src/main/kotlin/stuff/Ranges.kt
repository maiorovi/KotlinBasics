package stuff

val aToZ = "a".."z"

val oneToNine = 1..0

val isTrue = "c" in aToZ




fun forLoops() {
    val list = listOf(1, 2, 3, 4)

    for (z in list) {
        print("${z}, ")
    }
}


fun whileLoop() {
    val set = setOf(1,2,3,4)
    val it = set.iterator()

    while(it.hasNext()) {
        print("${it.next()}, ")
    }
}

val a = 1000
val b = 1000

fun main(args:Array<String>) {
    forLoops()
    println()
    whileLoop()
    println()

    println("${a} === ${b} ${a === b}" )
}

//referencial equality in kotlin determined with help of operator ====
// while structural equality determined with help of == operator