package kyu8

/**
Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.
 */

fun main() {
    println(include(intArrayOf(1, 2, 3, 4), 2))
    println(include(intArrayOf(1, 2, 4, 5), 3))
}

fun include(arr: IntArray, item: Int): Boolean = arr.contains(item)