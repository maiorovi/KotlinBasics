package algo_arena_tasks

import data_structures.TreeNode
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class CountTheLeavesSpec : Spek({
    describe("count leaves task") {
        it("count the leaves of balanced binary tree") {
            countLeaves(
                    TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(5, TreeNode(6), TreeNode(7)))
            ) shouldEqual 4
        }

        it("tree with only one node has one leaf") {
            countLeaves(TreeNode(5)) shouldEqual 1
        }

        it("empty tree has zero leafs") {
            countLeaves(null) shouldEqual 0
        }

        it("computes number of leafs in not balanced binary tree") {
            countLeaves(
                    TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), null)
            ) shouldEqual 2
        }
    }


})