package kyu6

fun main() {
    println(bouncingBall(3.0, 0.66, 1.5))
    println(bouncingBall(30.0, 0.66, 1.5))

}

fun bouncingBall(h: Double, bounce: Double, window: Double): Int = if (bounce > 0 && bounce < 1 && window < h) (1 + 2 * Math.floor(Math.log(window / h) / Math.log(bounce))).toInt() else -1