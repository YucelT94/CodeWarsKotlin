package kyu7

/**
In John's car the GPS records every s seconds the distance travelled from an origin (distances are measured in an arbitrary but consistent unit). For example, below is part of a record with s = 15:

x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]
The sections are:

0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
We can calculate John's average hourly speed on every section and we get:

[45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]
Given s and x the task is to return as an integer the *floor* of the maximum average speed per hour obtained on the sections of x. If x length is less than or equal to 1 return 0 since the car didn't move.

Example:
with the above data your function gps(s, x)should return 74

Note
With floats it can happen that results depends on the operations order. To calculate hourly speed you can use:

(3600 * delta_distance) / s.
 */

fun main() {
    var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
    println(gps(20, x))
    x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
    println(gps(12, x))
    x = doubleArrayOf(0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25)
    println(gps(15, x))
}

fun gps(s: Int, x: DoubleArray): Int {
    val array = arrayListOf<Double>()

    return if (x.size > 1) {
        x.reduce { acc, d ->
            array.add(d - acc)
            d
        }

        array.forEachIndexed { index, d -> array.set(index, (3600 * d / s)) }

        Math.floor(array.max()!!).toInt()
    } else 0
}

/*
fun gps(s: Int, x: DoubleArray) = x.asSequence().zipWithNext { a, b -> (b - a) * 3600 / s }.max()?.toInt() ?: 0
*/