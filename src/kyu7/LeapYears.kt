package kyu7

/**
In this kata you should simply determine, whether a given year is a leap year or not. In case you don't know the rules, here they are:

years divisible by 4 are leap years
but years divisible by 100 are no leap years
but years divisible by 400 are leap years
Additional Notes:

Only valid years (positive integers) will be tested, so you don't have to validate them
 */

fun main() {
    println(isLeapYear(1234))
    println(isLeapYear(1984))
    println(isLeapYear(2000))
    println(isLeapYear(2010))
    println(isLeapYear(2013))
}

fun isLeapYear(year: Int): Boolean = if (year % 4 == 0 && year % 100 != 0) true else year % 400 == 0