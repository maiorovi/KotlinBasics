package algo_arena_tasks

fun fib(n: Int): Long {
    var prev = 0
    var current = 1

    if (n == 0) {
        return prev.toLong()
    }

    if (n == 1) {
        return prev.toLong()
    }

    for(i in 2..n) {
       val tmp = current + prev
        prev = current
       current = tmp
    }


    return current.toLong()
}