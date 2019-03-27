package kyu7

/**
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.

#Output

The middle character(s) of the word represented as a string.
 */

fun main() {
    println(getMiddle("test"))
    println(getMiddle("middle"))
    println(getMiddle("testing"))
    println(getMiddle("A"))
}

fun getMiddle(word: String) = if (word.length % 2 == 0) word[word.length / 2 - 1].toString() + word[word.length / 2].toString() else word[word.length / 2].toString()

/* Better Solution
fun getMiddle(w : String) : String {
    val len = w.length
    return w.substring (len / 2 - (len + 1) % 2, len / 2 + 1)
}
*/