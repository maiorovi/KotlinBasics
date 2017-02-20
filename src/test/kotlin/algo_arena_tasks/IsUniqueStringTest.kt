package algo_arena_tasks

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class IsUniqueStringTest : Spek ({
    describe("description of tak isStringUnique") {
        it("works correct on simple string") {
            isUniqueString("abcdef") shouldEqual true
        }
    }
})