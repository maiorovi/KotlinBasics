package algo_arena_tasks

fun computeBinary(number: Int):String? {
    var buffer:StringBuffer = StringBuffer()
    var current = number
    if (number == 0) {
        return "0"
    }

    while (current > 0) {
        buffer.append(current % 2)
        current /= 2
    }

    return buffer.toString().reversed()
}


fun main(args: Array<String>) {
    println("5 in decimal system equal to ${computeBinary(5)} in binary")
    println("6 in decimal system equal to ${computeBinary(6)} in binary")
    println("0 in decimal system equal to ${computeBinary(0)} in binary")
    println("1 in decimal system equal to ${computeBinary(1)} in binary")
    println("255 in decimal system equal to ${computeBinary(255)} in binary")
    println("-1 in decimal system equal to ${computeBinary(-1)} in binary")
    println(Integer.toBinaryString(-1))
}
