package kyu8

/**
Given a number n, return the number of positive odd numbers below n, EASY!

oddCount(7) //=> 3, i.e [1, 3, 5]
oddCount(15) //=> 7, i.e [1, 3, 5, 7, 9, 11, 13]
Expect large Inputs!
 */

fun main() {
    println(oddCount(15))
    println(oddCount(15023))
}

fun oddCount(n: Int): Int = n / 2