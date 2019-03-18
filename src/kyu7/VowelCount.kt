package kyu7

/**
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */

fun main() {
    println(getCount("abracadabra"))
    println(getCount("test"))
    println(getCount("example"))
}

fun getCount(str: String): Int  = "[aeiou]".toRegex().findAll(str).count()