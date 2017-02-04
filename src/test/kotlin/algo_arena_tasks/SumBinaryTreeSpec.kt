package algo_arena_tasks

import data_structures.TreeNode
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class SumBinaryTreeSpec : Spek({
  describe("binary tree sum task") {
      it("computes sum of binary tree") {
          algo_arena_tasks.sum(TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(5, TreeNode(6), TreeNode(7)))) shouldEqual 28
      }

      it("sum of empty tree is zero") {
          algo_arena_tasks.sum(null) shouldEqual 0
      }

      it("sum of tree with one node equal to value of single node") {
          algo_arena_tasks.sum(TreeNode(5)) shouldEqual 5
      }
  }
})