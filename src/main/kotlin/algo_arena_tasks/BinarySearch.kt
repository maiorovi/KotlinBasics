package algo_arena_tasks

fun binarySearch(arr: IntArray?, n:Int):Int {
    if (arr == null) {
        return -1
    }
    var lo = 0
    var high = arr.size-1


    while(lo <= high) {
        var mid = (lo + high) / 2

        if (arr[mid] == n) {
            return mid
        } else if (arr[mid] < n) {
            lo = mid + 1
        } else if (arr[mid] > n) {
            high = mid - 1
        }
    }

    return -1
}
