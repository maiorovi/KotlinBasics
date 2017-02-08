package algo_arena_tasks

import data_structures.TreeNode

fun postOrderTraversal(root: TreeNode?):IntArray {
    val list = mutableListOf<Int>()
    doJob1(root, list)

    return list.toIntArray()
}


fun doJob1(root: TreeNode?, list: MutableList<Int>) {
    if (root == null) {
        return
    }

    doJob(root.left, list)
    doJob(root.right, list)
    list.add(root.data)
}
