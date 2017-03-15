package algo_arena_tasks

fun insertPairStar(str:String?): String? {
    if (str == null) {
        return null
    }

    if (str.isEmpty()) {
        return str
    }

    var i = 1
    val buffer = StringBuffer()
    buffer.append(str[0])

    while(i < str.length) {
        if (str[i-1] == str[i]) {
            buffer.append("*")
        }
        buffer.append(str[i])
        i++
    }

    return buffer.toString()
}