package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class BinarySearchTest : Spek({
    describe("binary search") {
        it("founds value in the middle of array corretly") {
            algo_arena_tasks.binarySearch(intArrayOf(2,5,7,11,15), 11) shouldEqual  3
        }

        it("returns -1 when looked up value is not present in array") {
            algo_arena_tasks.binarySearch(intArrayOf(2,5,7,11,15), 12) shouldEqual  -1
        }

        it("returns 0 when looked up the first element of array") {
            algo_arena_tasks.binarySearch(intArrayOf(2,5,7,11,15), 2) shouldEqual  0
        }

        it("returns len - 1 when looked up the last element of array") {
            algo_arena_tasks.binarySearch(intArrayOf(2,5,7,11,15), 15) shouldEqual  4
        }

        it("returns 0 when looked up element in array of size one") {
            algo_arena_tasks.binarySearch(intArrayOf(2), 2) shouldEqual  0
        }

        it("returns -1 when array is empty") {
            algo_arena_tasks.binarySearch(intArrayOf(), 2) shouldEqual  -1
        }

    }
})
