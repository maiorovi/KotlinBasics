package algo_arena_tasks

fun countPath(m:Int, n:Int):Int {
    return countPath(0, 0, m-1, n-1)
}

fun countPath(down:Int, left: Int, width: Int, height: Int): Int {
    if (height == down && width == left) {
        return 1
    }

    if (height == down) {
        return countPath(down, left + 1, width, height)
    }

    if (width == left) {
        return countPath(down + 1, left, width, height)
    }


    return countPath(down + 1, left, width, height) + countPath(down, left+1, width, height)
}


fun main(args:Array<String>) {
    println(countPath(2,3))
}