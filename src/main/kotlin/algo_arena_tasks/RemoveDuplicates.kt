package algo_arena_tasks

import data_structures.ListNode

fun removeDuplicates(node: ListNode):ListNode {
    var current = node
    var prev:ListNode = node
    val seen = mutableSetOf<Int>()

    while(current != null) {
        if (seen.contains(current.value)) {
            prev.next = current.next
            current = current.next
            continue
        }

        seen.add(current.value)
        prev = current
        current = current.next
    }

    return node
}