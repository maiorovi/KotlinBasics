package algo_arena_tasks

fun transponseMatrix(matrix: Array<IntArray>?) {
    if (matrix == null) {
        return
    }

    for(i in 0..matrix.size - 1) {
        for(j in i..matrix[0].size-1) {
            swap(i,j, j,i, matrix)
        }
    }
}

fun swap(x:Int,y:Int,x1:Int,y1:Int, matrix: Array<IntArray>) {
    val tmp = matrix[x][y]
    matrix[x][y] = matrix[x1][y1]
    matrix[x1][y1] = tmp
}
