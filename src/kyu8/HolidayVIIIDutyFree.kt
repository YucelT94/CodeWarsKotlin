package kyu8

/**
The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the saving over the normal high street price would effectively cover the cost of your holiday.

You will be given the high street price (normPrice), the duty free discount (discount) and the cost of the holiday.

For example, if a bottle cost £10 normally and the discount in duty free was 10%, you would save £1 per bottle. If your holiday cost £500, the answer you should return would be 500.

All inputs will be integers. Please return an integer. Round down.
 */

fun main() {
    println(dutyFree(12, 50, 1000))
    println(dutyFree(17, 10, 500))
    println(dutyFree(24, 35, 3000))
    println(dutyFree(377, 40, 9048))
    println(dutyFree(2479, 51, 13390))
}

fun dutyFree(normPrice: Int, discount: Int, hol: Int): Int =
    Math.floor(((hol.toFloat() / ((normPrice.toFloat() * discount.toFloat() / 100))).toDouble())).toInt()