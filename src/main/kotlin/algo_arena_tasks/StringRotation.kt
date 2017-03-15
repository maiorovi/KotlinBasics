package algo_arena_tasks

fun isRotation(s1: String?, s2: String?): Boolean {
    if (s1 == null || s2 == null) {
        return false
    }

    if (s1.length != s2.length) {
        return false
    }

    return s1.reversed() == s2
}