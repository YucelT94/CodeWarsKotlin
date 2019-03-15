package kyu8

/**
Introduction
The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.

Task :
Given a year, return the century it is in.

Input , Output Examples ::
centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)
 */

fun main() {
    println(century(1705));
    println(century(1900));
    println(century(1601));
    println(century(2000));
    println(century(89));
}

fun century(number: Int): Int = Math.ceil((number.toFloat() / 100).toDouble()).toInt()