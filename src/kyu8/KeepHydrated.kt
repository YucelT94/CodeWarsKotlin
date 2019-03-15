package kyu8

/**
Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

For example:

time = 3 ----> litres = 1

time = 6.7---> litres = 3

time = 11.8--> litres = 5
 */

fun main() {
    println(litres(2.0))
    println(litres(1.4))
    println(litres(12.3))
    println(litres(0.82))
    println(litres(11.8))
    println(litres(1787.0))
    println(litres(0.0))
}

fun litres(time: Double): Int = (time.toInt() / 2)
