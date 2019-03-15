package kyu8

/**
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */

fun main() {
    println(simpleMultiplication(1))
    println(simpleMultiplication(3))
    println(simpleMultiplication(2))
    println(simpleMultiplication(4))
}

fun simpleMultiplication(n: Int): Int = if (n % 2 == 0) n * 8 else n * 9