package dynamic_programming

fun factorialRecursive(n: Int): Int {
    if (n < 0) throw IllegalArgumentException()

    return if (n == 0) {
        1
    } else {
        n * factorialRecursive(n - 1)
    }
}

fun factorialIterative(n: Int): Int {
    if (n < 0) throw IllegalArgumentException()

    var factorial = 1

    for (i in (1..n)) {
        factorial *= i
    }

    return factorial
}


fun main(args:Array<String>) {
    println("Recursive factorial: ${factorialRecursive(5)}")
    println("Iterative factorial: ${factorialIterative(5)}")
}
