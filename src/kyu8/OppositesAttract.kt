package kyu8

/**
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */

fun main() {
    println(loveFun(1, 4))
    println(loveFun(2, 2))
    println(loveFun(0, 1))
    println(loveFun(0, 0))
}

fun loveFun(flowerA: Int, flowerB: Int): Boolean = (flowerA + flowerB) % 2 != 0