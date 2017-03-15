package algo_arena_tasks

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class IsomorphicStringTest : Spek({
    describe("describe this task") {
        it("return true for isomorphic strings") {
             isIsomorphic("css", "dll") shouldEqual true
        }

        it("return false for not isomorphic strings") {
            isIsomorphic("css", "dle") shouldEqual false
        }

        it("two empty strings considered isomorphic") {
            isIsomorphic("", "") shouldEqual true
        }

        it("abcdef uvwxyz") {
            isIsomorphic("abcdef", "uvwxyz") shouldEqual true
        }

        it("order tricks") {
            isIsomorphic("cssc", "dlld") shouldEqual true
        }

        it("value tricks") {
            isIsomorphic("egg", "aaa") shouldBe false
        }
    }
})
