package pluralsight.testing

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class CalculatorSpec : Spek({
    val calculator = Calculator(NullResult())

    describe("the calculator") {

        it("should add two numbers") {
            val result = calculator.add(8, 10)

        }

    }
})