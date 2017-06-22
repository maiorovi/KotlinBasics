package dynamic_programming

fun countSum(arr: Array<Int>): Array<Int> {
    fun loop(i: Int): Array<Int> {
        return if (i == arr.size) {
            arr
        } else {
            arr[i] = arr[i - 1] + arr[i]
            loop(i + 1)
        }
    }

    return loop(1)
}

fun computerPower(x: Int, n: Int): Int {
    return if (n == 1) {
        x
    } else {
        x * computerPower(x, n - 1)
    }
}

fun main(args: Array<String>) {
    println(countSum(intArrayOf(1, 2, 3, 4, 5, 6).toTypedArray()).joinToString(", "))
    println("Compute power: ${computerPower(2, 3)}")
}



