package algo_arena_tasks

fun maxContSequence(arr: IntArray): Int {
    var maxEndingHere = arr[0]
    var maxSoFar = arr[0]

    var i = 1

    while( i < arr.size) {

        maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i])
        maxSoFar = Math.max(maxEndingHere, maxSoFar)

        i++
    }


    return maxSoFar
}
