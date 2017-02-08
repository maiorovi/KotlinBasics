package algo_arena_tasks

import data_structures.TreeNode

fun inorderTraversal(root: TreeNode?):IntArray {
    val list = mutableListOf<Int>()
    doJob(root, list)

    return list.toIntArray()
}


fun doJob(root:TreeNode?, list: MutableList<Int>) {
    if (root == null) {
        return
    }

    doJob(root.left, list)
    list.add(root.data)
    doJob(root.right, list)
}
