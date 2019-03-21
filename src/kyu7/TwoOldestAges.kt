package kyu7

/**
The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age, oldest age].

The order of the numbers passed in could be any order. The array will always include at least 2 items.

For example:

twoOldestAges(listOf(1, 5, 87, 45, 8, 8)) // should return listOf(45, 87)
 */

fun main() {
    println(twoOldestAges(listOf(1, 5, 87, 45, 8, 8)))
    println(twoOldestAges(listOf(6, 5, 83, 5, 3, 18)))
}

fun twoOldestAges(ages: List<Int>) = listOf(ages.sorted()[ages.size - 2], ages.sorted()[ages.size - 1])

/* Better Solution
fun twoOldestAges(ages: List<Int>) = ages.sorted().takeLast(2)
 */