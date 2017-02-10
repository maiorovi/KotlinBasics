package algo_arena_tasks


fun factorial(n: Int):Int {
    if (n <= 1) {
        return 1
    }

    return (1..n).fold(1) { acc, x -> acc * x} % 10
}