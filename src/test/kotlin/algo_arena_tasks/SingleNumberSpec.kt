package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class SingleNumberSpec : Spek({
    describe("single number spec") {
        it("return unique number in array") {
            singleNumber(intArrayOf(1,2,3,4,1,2,3,4,5)) shouldBe 5
        }

        it("return unique number from array  containing only one element") {
            singleNumber(intArrayOf(1)) shouldBe 1
        }

        it("works with negative numbers") {
            singleNumber(intArrayOf(1,2,-3,1,2)) shouldBe -3
        }

        it("works when two numbers unique") {
            singleNumber(intArrayOf(1,2,-3,1,2, -3, 4, 5)) shouldBe 4
        }
    }
})
