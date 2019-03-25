package kyu7

/**
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

fun main() {
    println(accum("ZpglnRxqenU"))
    println(accum("NyffsGeyylB"))
}

fun accum(s: String): String {
    var accumString = ""
    s.toCharArray().forEachIndexed { index, c -> accumString += "${c.toLowerCase().toString().repeat(index + 1).capitalize()}-" }
    return accumString.substringBeforeLast("-")
}

/* Better Solution
fun accum(s:String):String = s.mapIndexed { index, char -> char.toUpperCase() + char.toString().toLowerCase().repeat(index) }.joinToString("-")
 */