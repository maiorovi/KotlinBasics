package algo_arena_tasks

import data_structures.TreeNode
import pluralsight.fst_module.max

fun isBst(root:TreeNode?):Boolean {
    return doJob(root, Integer.MIN_VALUE, Integer.MAX_VALUE)
}


fun doJob(root:TreeNode?, minRange:Int, maxRange:Int):Boolean {
    if (root == null) {
        return true
    }

    if(root.data > maxRange || root.data < minRange) {
        return false
    }
    return doJob(root.left, minRange, root.data) && doJob(root.right, root.data, maxRange)
}
