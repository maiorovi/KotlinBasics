package algo_arena_tasks

fun reverseInt(x: Int):Int {
    val divider = 10
    var result = 0
    var tmp = Math.abs(x)

    while (tmp >= 1) {
        result = result * divider + tmp % divider
        tmp = tmp / divider
    }

    return if (x > 0) result else -result
}
