package kyu8

fun main(){
    calculateYears(1).forEach { print(it.toString() + " ") }
    println()
    calculateYears(2).forEach { print(it.toString() + " ") }
    println()
    calculateYears(10).forEach { print(it.toString() + " ") }
}

fun calculateYears(years: Int): Array<Int> {
    val catYear = if(years > 1) ((years-2) * 4 + 24) else 15
    val dogYear = if(years > 1) ((years-2) * 5 + 24) else 15

    return arrayOf(years, catYear, dogYear)
}