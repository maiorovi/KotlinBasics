package algo_arena_tasks

import data_structures.TreeNode
import org.amshove.kluent.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class isBinarySearchTreeSpec : Spek({
    describe("describe is bst task") {
        it("test case 1") {
            val tree = TreeNode(10, TreeNode(0, TreeNode(-1), TreeNode(21)), TreeNode(25, TreeNode(16), TreeNode(32)))
            isBst(tree) shouldBe false
        }

        it("test case 2") {
            val tree = TreeNode(10, TreeNode(-10, TreeNode(-20), TreeNode(0)), TreeNode(19, TreeNode(17), null))
            isBst(tree) shouldBe true
        }
    }
})