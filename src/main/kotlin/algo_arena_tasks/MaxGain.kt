package algo_arena_tasks

import java.util.*

fun maxGain(arr: IntArray?) : Int {
    if (arr == null) {
        return 0
    }

    var minCur = Integer.MAX_VALUE
    var maxCur = Integer.MIN_VALUE
    var maxGain = 0

    var i = 0

    while(i < arr.size) {
        if (arr[i] < minCur) {
            minCur = arr[i]
            maxCur = Integer.MIN_VALUE
            i++
            continue
        } else {
            maxCur = Math.max(maxCur, arr[i])
        }

        maxGain = Math.max(maxGain, maxCur - minCur)
        i++
    }

    return maxGain
}
