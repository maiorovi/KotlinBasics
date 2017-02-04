package algo_arena_tasks

fun fib(n: Int): Long {
    var prev = 0
    var current = 1

    if (n == 0) {
        return 0
    }

    if (n == 1) {
        return 1
    }

    for(i in 2..n) {
       val tmp = current + prev
        prev = current
       current = tmp
    }


    return current.toLong()
}