package algo_arena_tasks

fun maxContSequence(arr: IntArray): Int {
    var maxValue = arr[0]
    var startIndex : Int = -1
    var endIndex : Int = -1
    var i = 1

    while(i < arr.size) {
        if (arr[i] >= 0) {
            maxValue = Math.max(arr[i], maxValue + arr[i])
        } else {
            maxValue = Math.max(Math.min(maxValue, 0), maxValue + arr[i])
        }

        i++
    }


    return maxValue
}
