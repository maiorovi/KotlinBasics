package pluralsight.testing

import org.amshove.kluent.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.assertj.core.api.Assertions.*

@RunWith(JUnitPlatform::class)
class CalculatorSpec : Spek({
    val calculator = Calculator(NullResult())

    describe("the calculator") {

        it("should add two numbers") {
            val result = calculator.add(8, 10)
            result shouldBe 18
        }

    }
})