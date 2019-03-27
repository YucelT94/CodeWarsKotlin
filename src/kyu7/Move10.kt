package kyu7

/**
Move every letter in the provided string forward 10 letters through the alphabet.

If it goes past 'z', start again at 'a'.

Input will be a string with length > 0.
 */

fun main() {
    println(moveTen("testcase"))
    println(moveTen("codewars"))
    println(moveTen("exampletesthere"))
}

fun moveTen(s: String): String {
    val charArray = s.toCharArray()
    val alphabet = arrayListOf<Char>()

    for (c in 'a'..'z') alphabet.add(c)

    val newIndex = charArray.map {
        if (alphabet.indexOf(it) + 10 < alphabet.size) alphabet.indexOf(it) + 10 else (alphabet.indexOf(it) + 10) - alphabet.size
    }

    return charArray.mapIndexed { index, c -> alphabet[newIndex[index]] }.joinToString("")
}

/* Better Solution
fun moveTen(s: String) = s.map { if (it < 'q') it + 10 else it - 16 }.joinToString("")
*/