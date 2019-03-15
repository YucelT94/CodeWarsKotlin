package kyu8

/**
A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

Return True if yes, False otherwise :)
 */

fun main() {
    println(hero(10, 5))
    println(hero(7, 4))
    println(hero(4, 5))
    println(hero(100, 40))
    println(hero(1500, 751))
    println(hero(0, 1))
}

fun hero(bullets: Int, dragons: Int): Boolean = bullets >= dragons * 2