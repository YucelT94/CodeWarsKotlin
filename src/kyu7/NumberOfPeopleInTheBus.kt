package kyu7

/**
Number of people in the bus
There is a bus moving in the city, and it takes and drop some people in each bus stop.

You are provided with a list (or array) of integer arrays (or tuples). Each integer array has two items which represent number of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.

Your task is to return number of people who are still in the bus after the last bus station (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D

Take a look on the test cases.

Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.

The second value in the first integer array is 0, since the bus is empty in the first bus stop.
 */

fun main() {
    println(people(arrayOf(3 to 0, 9 to 1, 4 to 10, 12 to 2, 6 to 1, 7 to 10)))
    println(people(arrayOf(3 to 0, 9 to 1, 4 to 8, 12 to 2, 6 to 1, 7 to 8)))
    println(people(arrayOf(10 to 0, 3 to 5, 5 to 8)))
}

fun people(busStops: Array<Pair<Int, Int>>) = busStops.map { it.first - it.second }.sum()

/* Better Solution
fun people(busStops: Array<Pair<Int, Int>>) = busStops.sumBy { it.first - it.second }
*/