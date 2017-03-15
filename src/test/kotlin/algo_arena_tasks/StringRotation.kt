package algo_arena_tasks

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class StringRotation : Spek({
  describe("String rotation task") {
      it("test 1") {
          isRotation("watterbottle", "erbotllewatt") shouldEqual true
      }

      it("test 2") {

      }
  }
})
