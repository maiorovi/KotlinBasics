package algo_arena_tasks

fun twoSum(numbers: IntArray?, target:Int): IntArray? {
    if(numbers == null) {
        return numbers
    }

    var fstIndex = -1
    var sndIndex = -1
    val map = hashMapOf<Int,Int>()

    for (i in 0..numbers.size) {
        map.put(numbers[i], i)
    }

//    val map = numbers.toSet()

    for(i in 0..numbers.size) {
        val result = target - numbers[i]
        if (map.containsKey(result)) {
            fstIndex = i
            sndIndex = map.getOrDefault(result, 0)
            break;
        }
    }


    return if (fstIndex < sndIndex) intArrayOf(fstIndex+1, sndIndex+1) else intArrayOf(sndIndex+1, fstIndex+1)
}


fun main(args:Array<String>) {
    twoSum(intArrayOf(2,7,11,15), 9)
}