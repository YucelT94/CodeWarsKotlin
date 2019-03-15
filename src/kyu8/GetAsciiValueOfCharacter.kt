package kyu8

/**
get ascii value of character

write a function getASCII which inputs a character and returns the corresponding ascii value for that character. Example : getASCII('A') => 65

for ASCII table, you can refer to http://www.asciitable.com/
 */

fun main() {
    println(getAscii('A'))
    println(getAscii(' '))
    println(getAscii('!'))
}

fun getAscii(c: Char): Int = c.toInt()