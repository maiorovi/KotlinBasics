package algo_arena_tasks

import com.sun.org.apache.bcel.internal.classfile.Utility
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class TransponseMatrixTest : Spek({
    describe("transponse matrix task") {
        it("transponses 2x2 matrix") {
            val matrix: Array<IntArray> = arrayOf(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(5, 6, 7, 8),
                    intArrayOf(9, 0, 1, 2),
                    intArrayOf(3, 4, 5, 0)
            )

            printMatrix(matrix)
            println()
            println()
            transponseMatrix(matrix)

            printMatrix(matrix)
        }


    }


})

fun printMatrix(matrix: Array<IntArray>) {
    for(i in 0..matrix.size-1) {
        for(j in 0..matrix[0].size-1) {
            print(matrix[i][j].toString() + " ")
        }
        println()
    }
}


