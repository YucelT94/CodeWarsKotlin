package kyu8

/**
Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */

fun main() {
    println(evenOrOdd(2))
    println(evenOrOdd(0))
    println(evenOrOdd(7))
    println(evenOrOdd(1))
}

fun evenOrOdd(number: Int): String = if (number % 2 == 0) "Even" else "Odd"