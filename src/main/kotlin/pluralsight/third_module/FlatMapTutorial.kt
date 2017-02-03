package pluralsight.third_module


fun main(args: Array<String>) {
    flatMapExplained().forEach(::println)
}

fun flatMapExplained(): List<String> {
    val list1 = mutableListOf(1,2,3,4)
    val list2 = mutableListOf('a','b','c')

    return list1.flatMap {
            n1 -> list2.filter { it -> it != 'a' }.map { it -> "$it$n1" }
        }
}