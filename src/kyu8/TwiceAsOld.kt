package kyu8

/**
Your function takes two arguments:

current father's age (years)
current age of his son (years)
Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */

fun main() {
    println(twiceAsOld(36, 7))
    println(twiceAsOld(55, 30))
    println(twiceAsOld(42, 21))
    println(twiceAsOld(22, 1))
    println(twiceAsOld(29, 0))
}

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int = Math.abs(dadYearsOld - (sonYearsOld * 2))