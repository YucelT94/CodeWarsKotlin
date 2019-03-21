package kyu7

/**
Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

each taken only once - coming from s1 or s2.
Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */

fun main() {
    println(longest("aretheyhere", "yestheyarehere"))
    println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"))
    println(longest("inmanylanguages", "theresapairoffunctions"))
}

fun longest(s1: String, s2: String) = String((s1 + s2).toCharArray().distinct().sorted().toCharArray())