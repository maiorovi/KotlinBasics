package algo_arena_tasks

import data_structures.TreeNode
import org.amshove.kluent.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class HeightOfBinaryTreeSpec : Spek({

    describe("height of binary tree task") {
        it("calculates height of empty tree as 0") {
            findHeight(null) shouldBe  0
        }

        it("calculates height of tree with single node as 1") {
            findHeight(TreeNode(1)) shouldBe 1
        }

        it("calculates height of balanced tree") {
            val tree = TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3, TreeNode(6), TreeNode(7)))
            findHeight(tree) shouldBe 3
        }

        it("calculates height of linked list like binary tree") {
            val tree = TreeNode(1, TreeNode(2, TreeNode(3, TreeNode(4, TreeNode(5), null), null), null), null)
            findHeight(tree) shouldBe 5
        }
    }
})