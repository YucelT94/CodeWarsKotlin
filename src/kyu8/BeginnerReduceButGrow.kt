package kyu8

/**
Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */

fun main() {
    println(grow(intArrayOf(1, 2, 3)))
    println(grow(intArrayOf(4, 1, 1, 1, 4)))
    println(grow(intArrayOf(2, 2, 2, 2, 2, 2)))
}

fun grow(arr: IntArray): Int = arr.reduce { a, b -> a * b }