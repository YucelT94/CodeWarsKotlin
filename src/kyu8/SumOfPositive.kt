package kyu8

fun main() {
    println(sum(intArrayOf(1, 2, 3, 4, 5)))
    println(sum(intArrayOf(1, -2, 3, 4, 5)))
    println(sum(intArrayOf()))
    println(sum(intArrayOf(-1, -2, -3, -4, -5)))
    println(sum(intArrayOf(-1, 2, 3, 4, -5)))
}

fun sum(numbers: IntArray): Int = numbers.filter { it > 0 }.sum()