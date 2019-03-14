package kyu8

fun main() {
    println(seatsInTheater(16, 11, 5, 3))
    println(seatsInTheater(1, 1, 1, 1))
    println(seatsInTheater(13, 6, 8, 3))
    println(seatsInTheater(60, 100, 60, 1))
    println(seatsInTheater(1000, 1000, 1000, 1000))
}

fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int = (nCols-(col-1)) * (nRows-row)