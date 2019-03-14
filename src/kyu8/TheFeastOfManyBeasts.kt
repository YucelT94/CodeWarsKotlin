package kyu8

/**
All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.

Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
 */

fun main() {
    println(feast("great blue heron", "garlic naan"))
    println(feast("chickadee", "chocolate cake"))
    println(feast("brown bear", "bear claw"))
    println(feast("marmot", "mulberry tart"))
    println(feast("porcupine", "pie"))
    println(feast("electric eel", "lasagna"))
    println(feast("slow loris", "salsas"))
    println(feast("ox", "orange lox"))
    println(feast("blue-footed booby", "blueberry"))
}

fun feast(beast: String, dish: String): Boolean = beast.first() == dish.first() && beast.last() == dish.last()