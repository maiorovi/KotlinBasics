package stuff

import org.amshove.kluent.`should be less or equal to`
import org.amshove.kluent.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class ExtensionFunctionsSpec : Spek({
    describe("extension function in kotlin") {

        it("it can extend existent type with additional methods") {
            val l = mutableListOf(1,2,3,4)
            l.swap(0,2)

            l[0] shouldBe 3
            l[2] shouldBe 1
        }

        it("extension function resolved statically at compile time") {
            val d = D()

            formatOutput(d) shouldBe "C"
        }

        it("member function always win if name of extension function is the same as member function has") {
            val e = E()

            e.foo() shouldBe "member function"
        }


    }
})