package algo_arena_tasks

fun isIsomorphic(input1: String, input2:String): Boolean {
    val mappings = hashMapOf<Char, Char>()

    if (input1.length != input2.length) {
        return false
    }

    for (i in 0..input1.length - 1) {
        val ch = input1[i]
        if (!mappings.containsKey(ch)) {
            if(mappings.containsValue(input2[i])) {
                return false
            }
            mappings.put(ch, input2[i])
        } else {
            if (mappings[ch] != input2[i]) {
                return false
            }
        }
    }


    return true
}


