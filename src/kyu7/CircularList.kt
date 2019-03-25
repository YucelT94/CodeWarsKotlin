package kyu7

/**
Create a Circular List

A circular list is of finite size, but can infititely be asked for its previous and next elements. This is because it acts like it is joined at the ends and loops around.

For example, imagine a CircularList of [1, 2, 3, 4]. Five invocations of next() in a row should return 1, 2, 3, 4 and then 1 again. At this point, five invocations of prev() in a row should return 4, 3, 2, 1 and then 4 again.

Your CircularList is created by passing a vargargs parameter in, e.g. new CircularList(1, 2, 3). Your list constructor/init code should throw an Exception if nothing is passed in.
 */

fun main() {
    val xs = CircularList<String>("one", "two", "three")
    println(xs.next())
    println(xs.next())
    println(xs.next())
    println(xs.next())
    println(xs.prev())
    println(xs.prev())
    println(xs.prev())
    println(xs.prev())

    val ys = CircularList<Int>(1, 2, 3, 4, 5)
    println(ys.prev())
    println(ys.prev())
    println(ys.next())
    println(ys.next())
    println(ys.next())
    println(ys.next())
    println(ys.next())
    println(ys.prev())
    println(ys.prev())
    println(ys.next())
    println(ys.next())
    println(ys.next())
    println(ys.next())
    println(ys.next())
    println(ys.next())
}

class CircularList<T>(vararg val elements: T) {
    init {
        if (elements.isEmpty()) throw Exception()
    }

    var size = elements.size
    var step = -1

    fun next(): T {
        step++
        return if (size != step) elements[step] else {
            step = 0
            elements[step]
        }
    }

    fun prev(): T {
        step--
        if (step <= -1) step = size - 1
        return elements[step]
    }
}

/* Better Solution
fun catchSignChange(arr: Array<Int>): Int = arr.map { it < 0 }.zipWithNext { a, b -> a != b }.count { it }
 */