package kyu8


fun main() {
    println(elevator(0, 1, 0))
    println(elevator(0, 1, 1))
    println(elevator(0, 1, 2))
    println(elevator(0, 0, 0))
    println(elevator(0, 2, 1))
}

fun elevator(left: Int, right: Int, call: Int): String = if (Math.abs(call - left) < Math.abs(call - right)) "left" else "right"