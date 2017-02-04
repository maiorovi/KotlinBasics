package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class ComputeBinarySpec :Spek({
    describe("compute binary task") {

        it("converts number in decimal format to binary format") {
            computeBinary(5) shouldEqual  "101"
            computeBinary(255) shouldEqual "11111111"
        }

        it("should represent decimal zero in binary format correctly") {
            computeBinary(0) shouldEqual "0"
        }

        it("should remove unnecessary zeroes on right side") {
            computeBinary(1) shouldEqual  "1"
        }

        it ("should represent negative numbers correctly") {

        }
    }
})