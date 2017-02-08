package algo_arena_tasks

import data_structures.TreeNode
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class MaximumSumPathSpec : Spek({

    describe("max sum path spec") {
        it("test case 1") {
            val tree = TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3, TreeNode(6), TreeNode(7)))
            maxSumPath(tree) shouldEqual  18
        }
    }


})