package kyu7

fun main (){
    println(highAndLow("1 2 3 4 5"))
    println(highAndLow("1 2 -3 4 5"))
    println(highAndLow("1 9 3 4 -5"))
}

fun highAndLow(numbers: String): String {
    val nums: MutableList<String> = numbers.split(" ") as MutableList<String>
    val ints = nums.map { it.toInt() }.toTypedArray()

    return ints.max().toString() + " " + ints.min().toString()
}