package kyu8

/**
Write a function called repeatStr which repeats the given string string exactly n times.

repeatstr(6, "I") # "IIIIII"
repeatstr(5, "Hello") # "HelloHelloHelloHelloHello"
 */

fun main() {
    println(repeatStr(4, "a"))
    println(repeatStr(3, "Hello"))
    println(repeatStr(5, ""))
    println(repeatStr(0, "kata"))
}

fun repeatStr(r: Int, str: String): String = str.repeat(r)