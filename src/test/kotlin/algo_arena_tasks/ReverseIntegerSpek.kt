package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class ReverseIntegerSpek : Spek ({
    describe("describe task reverse integer") {
        it("reverses positive integer") {
            reverseInt(123) shouldEqual  321
        }

        it("reverses negative integer") {
            reverseInt(-123) shouldEqual  -321
        }

        it("reverses zero") {
            reverseInt(0) shouldBe  0
        }
    }
})