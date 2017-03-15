package algo_arena_tasks

import data_structures.TreeNode

fun preorderTraversal(root:TreeNode?):IntArray {
    val list = mutableListOf<Int>()

    doJob2(root, list)

    return list.toIntArray()
}

fun doJob2(root: TreeNode?, list:MutableList<Int>) {
    if (root == null) {
        return
    }

    list.add(root.data)
    doJob2(root.left, list)
    doJob2(root.right, list)
}
