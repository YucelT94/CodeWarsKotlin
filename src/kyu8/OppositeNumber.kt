package kyu8

/**
Very simple, given a number, find its opposite.

Examples:

1: -1
14: -14
-34: 34
 */

fun main() {
    println(opposite(1))
    println(opposite(0))
    println(opposite(-25))
}

fun opposite(number: Int): Int = -number