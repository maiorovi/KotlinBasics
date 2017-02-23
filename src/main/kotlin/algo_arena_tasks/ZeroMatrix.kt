package algo_arena_tasks

fun zeroMatrix(matrix: Array<IntArray>?) {
    if (matrix == null) {
        return
    }


    val rows = Array<Boolean>(matrix.size) { ind -> false }
    val columns = Array<Boolean>(matrix[0].size) {int -> false}

    for(i in 0..matrix.size - 1) {
        for (j in 0..matrix[0].size - 1) {
            if (matrix[i][j] == 0) {
                rows[i] = true
                columns[j] = true
            }
        }
    }

    for( i in 0..matrix.size-1) {
        if (rows[i]) {
            putZeroesInRow(i, matrix)
        }
    }


    for(i in 0..matrix[0].size) {
        if(columns[i]) {
            putZeroesInColumn(i, matrix)
        }
    }
}

fun putZeroesInRow(i:Int, matrix:Array<IntArray>) {
    for (j in 0..matrix[0].size) {
        matrix[i][j] = 0
    }
}


    fun putZeroesInColumn(j:Int, matrix:Array<IntArray>) {
        for (i in 0..matrix.size) {
            matrix[i][j] = 0
        }
    }
