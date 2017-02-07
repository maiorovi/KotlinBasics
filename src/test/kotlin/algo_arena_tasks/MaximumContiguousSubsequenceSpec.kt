package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeIn
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldContain
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import stuff.array

@RunWith(JUnitPlatform::class)
class MaximumContiguousSubsequenceSpec : Spek({
    describe("maximum contiguous subsequence spec") {
        it("find maximum subsequence in simple sequence") {
            maxContSequence(intArrayOf(-1,-2,3,4,5)) shouldEqual  arrayOf(12, 2, 4)

            maxContSequence(intArrayOf(1,2,3,-10, 5)) shouldEqual  arrayOf(6, 0, 2)
            maxContSequence(intArrayOf(-1,-2,-3,-4,-5)) shouldEqual  arrayOf(-1, 0, 0)
        }

        it("test case 2") {
            maxContSequence(intArrayOf(1,2,3,-2,5)) shouldEqual arrayOf(9, 0, 4)
        }

        it("test case 3") {
            maxContSequence(intArrayOf(-2, -3, 4, -1, -2, 1, 5, -3)) shouldEqual arrayOf(7, 2, 6)
        }

        it("test cas 4") {
//            maxContSequence(intArrayOf()) shouldEqual null
        }
    }
})