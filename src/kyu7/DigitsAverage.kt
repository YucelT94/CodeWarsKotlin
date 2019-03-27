package kyu7

/**
Given an integer, take the (mean) average of each pair of consecutive digits. Repeat this process until you have a single integer, then return that integer. e.g.

Note: if the average of two digits is not an integer, round the result up (e.g. the average of 8 and 9 will be 9)

Examples
digitsAverage(246)  ==>  4

original: 2   4   6
\ / \ /
1st iter:   3   5
\ /
2nd iter:     4


digitsAverage(89)  ==>  9

original: 8   9
\ /
1st iter:   9
p.s. for a bigger challenge, check out the one line version of this kata by myjinxin2015!
 */

fun main() {
    println(digitsAverage(246))
    println(digitsAverage(89))
    println(digitsAverage(2))
    println(digitsAverage(245))
    println(digitsAverage(345))
    println(digitsAverage(346))
}

fun digitsAverage(input: Int): Int {
    return if (input.toString().length > 1) {
        val x = input.toString().map { it.toString().toInt() }.zipWithNext { a, b -> Math.ceil(((a + b).toDouble() / 2)).toInt() }.toList()
        digitsAverage(x.joinToString ("").toInt())
    }else{
        input
    }
}

/* Other Solution
fun digitsAverage(input: Int): Int {
    var digits = input.toString().map(Character::getNumericValue)
    while (digits.size > 1) {
        digits = digits.zipWithNext { a, b -> (a + b + 1) / 2 }
    }
    return digits.first()
}
*/