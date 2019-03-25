package kyu7

/**
You will be given a string (x) featuring a cat 'C' and a mouse 'm'. The rest of the string will be made up of '.'.

You need to find out if the cat can catch the mouse from it's current position. The cat can jump over three characters. So:

C.....m returns 'Escaped!' <-- more than three characters between

C...m returns 'Caught!' <-- as there are three characters between the two, the cat can jump.
 */

fun main() {
    println(catMouse("C....m"))
    println(catMouse("C..m"))
    println(catMouse("C.....m"))
    println(catMouse("C.m"))
}

fun catMouse(s: String) = if (s.length - 2 > 3) "Escaped!" else "Caught!"

/* Other Solution
fun catMouse(s: String) = if(s.count{it == '.'} < 4) "Caught!" else "Escaped!"
*/