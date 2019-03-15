package kyu8

/**
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.


Return True if yes, False otherwise :)
 */

fun main() {
    println(maps(intArrayOf(1, 2, 3)).toList())
    println(maps(intArrayOf(4, 1, 1, 1, 4)).toList())
    println(maps(intArrayOf(2, 2, 2, 2, 2, 2)).toList())
}

fun maps(x: IntArray): IntArray = x.map { it * 2 }.toIntArray()