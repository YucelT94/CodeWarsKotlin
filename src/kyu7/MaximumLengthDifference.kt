package kyu7

/**
You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.

Find max(abs(length(x) − length(y)))

If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

#Example:

a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(a1, a2) --> 13
Bash note:
input : 2 strings with substrings separated by ,
output: number as a string
 */

fun main() {
    var s1 = arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    var s2 = arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    println(mxdiflg(s1, s2))
    s1 = arrayOf<String>("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    s2 = arrayOf<String>("bbbaaayddqbbrrrv")
    println(mxdiflg(s1, s2))
}

fun mxdiflg(a1: Array<String>, a2: Array<String>) = if (a1.isEmpty() || a2.isEmpty()) -1 else {
    val a1Max = a1.reduce { maxLenght, element -> if (element.length > maxLenght.length) element else maxLenght }.length
    val a1Min = a1.reduce { minLenght, element -> if (element.length < minLenght.length) element else minLenght }.length
    val a2Max = a2.reduce { maxLenght, element -> if (element.length > maxLenght.length) element else maxLenght }.length
    val a2Min = a2.reduce { minLenght, element -> if (element.length < minLenght.length) element else minLenght }.length
    if (Math.abs(a1Max - a2Min) > Math.abs(a2Max - a1Min)) Math.abs(a1Max - a2Min) else Math.abs(a2Max - a1Min)
}