package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class InsertPairStarSpec : Spek({
    describe("insert pair spec") {
        it("test case 1") {
            insertPairStar("aabcdef") shouldEqual "a*abcdef"
        }

        it("test case 2") {
            insertPairStar("aabcdeff") shouldEqual "a*abcdef*f"
        }

        it("test case 3") {
            insertPairStar("aa") shouldEqual "a*a"
        }

        it("test case 4") {
            insertPairStar("a") shouldEqual "a"
        }
    }
})