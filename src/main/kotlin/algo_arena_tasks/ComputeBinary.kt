package algo_arena_tasks

fun computeBinary(number: Int): String? {
    var buffer: StringBuffer = StringBuffer()
    var current = Math.abs(number)
    if (number == 0) {
        return "0"
    }

    while (current > 0) {
        buffer.append(current % 2)
        current /= 2
    }

    val computedBinaryRepresentation = buffer.toString().reversed()

    return if (number > 0) {
        computedBinaryRepresentation
    } else {
        findTwoComplement(computedBinaryRepresentation)
    }
}

fun findTwoComplement(bNumber: String): String {

    val zeroesAmount = Integer.SIZE - bNumber.length
    val compiled = (1..zeroesAmount).map { c -> "0" }.reduce { acc, s -> acc + s } + bNumber

    var shouldInvert = false;
    val buffer = StringBuffer();

    for ( i in (compiled.length - 1).downTo(0) ) {

        if (shouldInvert) {
            buffer.append(if (compiled[i] == '0') "1" else "0")
        } else {
            buffer.append(compiled[i])
        }

        if (!shouldInvert && compiled[i] == '1') {
            shouldInvert = true
        }
    }

    return buffer.toString().reversed()
}
