package algo_arena_tasks

import data_structures.TreeNode

fun countLeaves(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }

    if (root?.left == null && root?.right == null) {
        return 1
    }

    return countLeaves(root?.left) + countLeaves(root?.right)
}