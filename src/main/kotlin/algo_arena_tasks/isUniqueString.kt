package algo_arena_tasks

fun isUniqueString(str:String):Boolean {

    for (c in str) {
        if (str.lastIndexOf(c) == str.indexOf(c)) {
            continue;
        } else {
            return false
        }
    }
    return true
}
