package kyu7

/**
Task
Given a string str, reverse it omitting all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str

A string consists of lowercase latin letters, digits and symbols.

[output] a string
 */

fun main() {
    println(reverseLetter("krishan"))
    println(reverseLetter("ultr53o?n"))
    println(reverseLetter("ab23c"))
    println(reverseLetter("krish21an"))
}

fun reverseLetter(str: String) = str.replace("[^A-Za-z]".toRegex(), "").reversed()

/* Better Solution
fun reverseLetter(str: String) = str.filter(Char::isLetter).reversed()
*/