package algo_arena_tasks

import data_structures.TreeNode


fun findMax(root: TreeNode?):Int {
    if (root  == null) {
        return 0
    }

    return Math.max(Math.max(findMax(root.left), findMax(root.right)), root.data)
}
