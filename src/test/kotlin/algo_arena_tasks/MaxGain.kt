package algo_arena_tasks

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class MaxGain : Spek ({
    describe("describe") {
        it("test case 1") {
            val arr = intArrayOf(0, 50, 10, 100, 30)
            maxGain(arr) shouldEqual 100
        }


        it("test case 2") {
            val arr = intArrayOf(210, 50, 10, 100, 30)
            maxGain(arr) shouldEqual 90
        }

        it("test case 3") {
            val arr = intArrayOf(4,3,2,1)
            maxGain(arr) shouldEqual 0
        }

        it("test case 4") {
            val arr = intArrayOf(20, 50, 3, 10)
            maxGain(arr) shouldEqual 30
        }
    }
})

