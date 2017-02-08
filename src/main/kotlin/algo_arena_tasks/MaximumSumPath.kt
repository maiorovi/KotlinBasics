package algo_arena_tasks

import data_structures.TreeNode

fun maxSumPath(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    val leftTreeSum = maxSumPath(root.left)
    val rightTreeSum = maxSumPath(root.right)

    return Math.max(maxSumPath(root.left), maxSumPath(root.right)) + root.data
}