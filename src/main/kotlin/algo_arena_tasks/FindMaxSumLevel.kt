package algo_arena_tasks

import data_structures.TreeNode
import java.util.*


fun findMaxSumLevel(root: TreeNode?):Int {
    if (root == null) {
        return 0
    }

     val queue = LinkedList<TreeNode>()
        queue.add(root)

    var maxLevel = 0
    var maxValue = 0
    var currentLevel = 0

    while(!queue.isEmpty()) {
        val currentNodes = ArrayList<TreeNode>()

        while(!queue.isEmpty()) {
            var node = queue.poll()
            if (node != null) {
                currentNodes.add(node)
            }
        }

        val currentResult = currentNodes.fold(0) { acc, node -> node.data + acc}

        if (currentResult > maxValue) {
            maxValue = currentResult
            maxLevel = currentLevel
        }

        currentLevel++

        currentNodes.forEach {
                queue.add(it.left)
                queue.add(it.right)
        }
    }

    return maxLevel
}

fun main(args:Array<String>) {
    println(findMaxSumLevel(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)) , TreeNode(3, TreeNode(6), TreeNode(7)))))
}


/*


      1
     / \
    2   3 ==> 2
   / \  /\
   4 5 6  7
 */