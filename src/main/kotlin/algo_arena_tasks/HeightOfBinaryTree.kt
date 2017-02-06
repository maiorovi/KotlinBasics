package algo_arena_tasks

import data_structures.TreeNode

fun findHeight(root: TreeNode?):Int {
    if (root == null) {
        return 0
    }

    return Math.max(findHeight(root.left) + 1,  findHeight(root.right) + 1)
}