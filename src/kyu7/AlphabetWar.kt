package kyu7

/**
Introduction
There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.

Task
Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:

w - 4
p - 3
b - 2
s - 1
The right side letters and their power:

m - 4
q - 3
d - 2
z - 1
The other letters don't have power and are only victims.

Example
AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
 */

fun main() {
    println(alphabetWar("z"))
    println(alphabetWar("zdqmwpbs"))
    println(alphabetWar("zzzzs"))
    println(alphabetWar("wwwwww"))
}

fun alphabetWar(fight: String): String {
    val a = mapOf("w" to 4, "p" to 3, "b" to 2, "s" to 1, "m" to -4, "q" to -3, "d" to -2, "z" to -1)
    val b = fight.map { a.getOrDefault(it.toString(), 0) }.sum()
    return if (b < 0) "Right side wins!" else if (b > 0) "Left side wins!" else "Let's fight again!"
}

/* Better Solution
fun alphabetWar(fight: String): String {
    val s = fight.sumBy { if (it in "zdqmsbpw") "mqdz|sbpw".indexOf(it) - 4 else 0 }
    return if (s < 0) "Right side wins!" else if (s > 0) "Left side wins!" else "Let's fight again!"
}
*/