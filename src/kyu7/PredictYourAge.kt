package kyu7

/**
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

In honor of my grandfather's memory we will write a function using his formula!

Take a list of ages when each of your great-grandparent died.
Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.
Example
predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
Note: the result should be rounded down to the nearest integer.

Some random tests might fail due to a bug in the JavaScript implementation. Simply resubmit if that happens to you.
 */

fun main() {
    println(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
    println(predictAge(32, 54, 76, 65, 34, 63, 64, 45))
}

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int {
    val array = intArrayOf(age1 * age1, age2 * age2, age3 * age3, age4 * age4, age5 * age5, age6 * age6, age7 * age7, age8 * age8).sum().toDouble()
    return ((Math.sqrt(array)) / 2).toInt()
}
/* Better Solution
fun predictAge(vararg age:Int) = (Math.sqrt((age.map{it*it}.sum().toDouble()))/2).toInt()
 */