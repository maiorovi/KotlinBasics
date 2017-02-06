package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class MaximumContiguousSubsequenceSpec : Spek({
    describe("maximum contiguous subsequence spec") {
        it("find maximum subsequence in simple sequence") {
            maxContSequence(intArrayOf(-1,-2,3,4,5)) shouldBe 12

            maxContSequence(intArrayOf(1,2,3,-10, 5)) shouldBe 6
            maxContSequence(intArrayOf(-1,-2,-3,-4,-5)) shouldBe -1
        }

        it("test case 2") {
            maxContSequence(intArrayOf(1,2,3,-2,5)) shouldBe 9
        }

        it("test case 3") {
            maxContSequence(intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3)) shouldBe 7
        }
    }
})