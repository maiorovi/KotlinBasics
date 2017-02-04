package algo_arena_tasks

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class FibNumbersSpec : Spek({
    describe("fib numbers task") {
        it("compute the first member of fib sequence") {
            fib(0) shouldEqual 0.toLong()
        }

        it("computes the second member of fib sequence") {
            fib(1) shouldEqual 1.toLong()
        }

        it("computes any number of fib sequence") {
            fib(6) shouldEqual 8.toLong()
        }
    }
})