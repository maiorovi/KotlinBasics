package algo_arena_tasks

import data_structures.ListNode
import java.util.*

fun reverseList(head: ListNode?):ListNode? {
    if (head == null) {
        return null
    }
    val stack:Stack<ListNode> = Stack()
    var current = head

    while(current != null) {
        stack.push(current)
        current = current.next
    }

    var newHead = stack.pop()
    current = newHead

    while (stack.isNotEmpty()) {
        current?.next = stack.pop()
        current = current?.next
    }
    current?.next = null

    return newHead
}

fun main(args: Array<String>) {
    reverseList(ListNode(1, ListNode(2, ListNode(3))))
}