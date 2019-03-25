package kyu7

/**
Count how often sign changes in array.

result
number from 0 to ... . Empty array returns 0

example
const arr = [1, -3, -4, 0, 5]

| elem | count |
|------|-------|
|  1   |  0    |
| -3   |  1    |
| -4   |  1    |
|  0   |  2    |
|  5   |  2    |

return 2;
 */

fun main() {
    println(catchSignChange(arrayOf(1, 3, 4, 5)))
    println(catchSignChange(arrayOf<Int>()))
    println(catchSignChange(arrayOf(1, -3, -4, 0, 5)))
    println(catchSignChange(arrayOf(-47, 84, -30, -11, -5, 74, 77)))
}

fun catchSignChange(arr: Array<Int>): Int {
    var count = 0

    for (i in 1 until arr.size) {
        val a = arr[i - 1]
        val b = arr[i]
        if ((a >= 0 && b < 0) || (a < 0 && b >= 0)) count++
    }

    return count
}

/* Better Solution
fun catchSignChange(arr: Array<Int>): Int = arr.map { it < 0 }.zipWithNext { a, b -> a != b }.count { it }
 */