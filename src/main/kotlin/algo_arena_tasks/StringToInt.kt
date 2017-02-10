package algo_arena_tasks

fun stoi(str: String): Int {
    var isNegative : Boolean = false
    var workingString = str
    var result = 0

    if (str.startsWith("-")) {
        isNegative = true
        workingString = workingString.substring(1..str.length-1)
    }

    if (str.startsWith("+-")) {
        return 0
    }

    if(str.startsWith("+")) {
        workingString = workingString.substring(1..str.length - 1)
    }

    for(s in workingString) {
        if(!isDigit(s)) {
            return 0
        }

        result = result * 10 + Integer.valueOf(s.toString())
    }

    return if (isNegative) -result else result
}

fun isDigit(c:Char):Boolean {
    return c >= '0' && c <= '9'
}

