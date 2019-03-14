package kyu8

fun main(){
    println(GrassHopper.summation(1))
    println(GrassHopper.summation(8))
}

object GrassHopper {
    fun summation(n:Int):Int = if(n > 1) n + summation(n-1) else 1
}