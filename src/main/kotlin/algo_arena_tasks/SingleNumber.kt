package algo_arena_tasks

fun singleNumber(arr: IntArray): Int {
//    return arr.reduce { acc, i -> acc.xor(i) }
    var i = 0;
    var tmp = listOf<Int>()
    while(i < arr.size) {
        if (arr.indexOf(arr[i]) == arr.lastIndexOf(arr[i])) {
            return arr[i]
        }
        i++
    }

    return tmp[0]
}