@file:Suppress("IMPLICIT_CAST_TO_ANY")

package kyu7

/**
You have stumbled across the divine pleasure that is owning a dog and a garden. Now time to pick up all the cr@p! :D

Given a 2D array to represent your garden, you must find and collect all of the dog cr@p - represented by '@'.

You will also be given the number of bags you have access to (bags), and the capactity of a bag (cap). If there are no bags then you can't pick anything up, so you can ignore cap.

You need to find out if you have enough capacity to collect all the cr@p and make your garden clean again.

If you do, return 'Clean', else return 'Cr@p'.

Watch out though - if your dog is out there ('D'), he gets very touchy about being watched. If he is there you need to return 'Dog!!'.

For example:

x=
[[_,_,_,_,_,_]
[_,_,_,_,@,_]
[@,_,_,_,_,_]]

bags = 2, cap = 2

return --> 'Clean'
 */

fun main() {
    println(crap(arrayOf(charArrayOf('_','_','_','_'), charArrayOf('_','_','_','@'), charArrayOf('_','_','@', '_')), 2, 2))
    println(crap(arrayOf(charArrayOf('_','_','_','_'), charArrayOf('_','_','_','@'), charArrayOf('_','_','@', '_')), 1, 1))
    println(crap(arrayOf(charArrayOf('_','_'), charArrayOf('_','@'), charArrayOf('D','_')), 2, 2))
}

fun crap(x: Array<CharArray>, bags: Int, cap: Int): String {
    var crap = 0
    var dog = 0

    x.map { it.map { if (it == '@') crap++ else if (it == 'D') dog++ else it } }

    return if (dog != 0) "Dog!!" else if (crap > bags * cap) "Cr@p" else "Clean"
}

/* Better Solution
fun crap(x: Array<CharArray>, bags: Int, cap: Int) =
    if (x.any { chars -> chars.any { it == 'D' } }) "Dog!!" else if (x.sumBy { chars -> chars.count { it == '@' } } <= bags * cap) "Clean" else "Cr@p"
*/