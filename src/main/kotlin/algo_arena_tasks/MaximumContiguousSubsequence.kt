package algo_arena_tasks

fun maxContSequence(arr: IntArray): Array<Int> {
    var maxEndingHere = arr[0]
    var maxSoFar = arr[0]
    var startIndex = 0
    var endIndex = 0
    var i = 1

    while( i < arr.size) {
        if (maxEndingHere + arr[i] > arr[i]) {
            maxEndingHere = maxEndingHere + arr[i]
        } else {
            maxEndingHere = arr[i]

            if (maxEndingHere > maxSoFar) {
                startIndex = i
            }
        }

        if (maxEndingHere > maxSoFar) {
            maxSoFar = maxEndingHere
            endIndex = i
        }


        i++
    }


    return arrayOf(maxSoFar, startIndex, endIndex)
}
