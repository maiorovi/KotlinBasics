package algo_arena_tasks

import data_structures.TreeNode


// kotlin nullable type check what is it
fun sum(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    return sum(root.left) + sum(root.right) + root.data
}

//TODO:: solve this using iterative approach

fun main(args: Array<String>) {
    println(sum(TreeNode(5)))
}
