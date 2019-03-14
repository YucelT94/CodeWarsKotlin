package kyu8

/**
Simple, remove the spaces from the string, then return the resultant string.
 */

fun main() {
    println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))
    println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"))
    println(noSpace("8aaaaa dddd r     "))
}

fun noSpace(x: String): String = x.replace(" ", "")