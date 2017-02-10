package algo_arena_tasks

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class StringToInt : Spek({
    describe("string to int conversion task") {
        it("converts simple number with two digits") {
            stoi("23") shouldEqual 23
        }

        it("converts negative number to int") {
            stoi("-23") shouldEqual -23
        }

        it("+- string resolves to zero") {
            stoi("+-15") shouldEqual 0
        }

        it("number with plus resolves to positive number") {
            stoi("+30") shouldEqual 30
        }
    }
})