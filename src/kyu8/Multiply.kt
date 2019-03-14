package kyu8

/**
The code does not execute properly. Try to figure out why.
 */

fun main() {
    for (i in 0..99) {
        val a = Math.random()
        val b = Math.random()
        val c = Math.random()
        println(multiply(multiply(a, b), c))
        println(multiply(a, multiply(b, c)))
    }
}

fun multiply(x: Double, y: Double): Double = x * y