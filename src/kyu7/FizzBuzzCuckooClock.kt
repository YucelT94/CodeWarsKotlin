package kyu7

/**
Your story
You've always loved both Fizz Buzz katas and cuckoo clocks, and when you walked by a garage sale and saw an ornate cuckoo clock with a missing pendulum, and a "Beyond-Ultimate Raspberry Pi Starter Kit" filled with all sorts of sensors and motors and other components, it's like you were suddenly hit by a beam of light and knew that it was your mission to combine the two to create a computerized Fizz Buzz cuckoo clock!

You took them home and set up shop on the kitchen table, getting more and more excited as you got everything working together just perfectly. Soon the only task remaining was to write a function to select from the sounds you had recorded depending on what time it was:

Your plan
When a minute is evenly divisible by three, the clock will say the word "Fizz".
When a minute is evenly divisible by five, the clock will say the word "Buzz".
When a minute is evenly divisible by both, the clock will say "Fizz Buzz", with two exceptions:
On the hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo bird will come out and "Cuckoo" between one and twelve times depending on the hour.
On the half hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo will come out and "Cuckoo" just once.
With minutes that are not evenly divisible by either three or five, at first you had intended to have the clock just say the numbers ala Fizz Buzz, but then you decided at least for version 1.0 to just have the clock make a quiet, subtle "tick" sound for a little more clock nature and a little less noise.
Your input will be a string containing hour and minute values in 24-hour time, separated by a colon, and with leading zeros. For example, 1:34 pm would be "13:34".

Your return value will be a string containing the combination of Fizz, Buzz, Cuckoo, and/or tick sounds that the clock needs to make at that time, separated by spaces. Note that although the input is in 24-hour time, cuckoo clocks' cuckoos are in 12-hour time.

Some examples
"13:34"       "tick"
"21:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
"11:15"       "Fizz Buzz"
"03:03"       "Fizz"
"14:30"       "Cuckoo"
"08:55"       "Buzz"
"00:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
"12:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
 */

fun main() {
    println(fizzBuzzCuckooClock("13:34"))
    println(fizzBuzzCuckooClock("21:00"))
    println(fizzBuzzCuckooClock("11:15"))
    println(fizzBuzzCuckooClock("03:03"))
    println(fizzBuzzCuckooClock("14:30"))
    println(fizzBuzzCuckooClock("08:55"))
    println(fizzBuzzCuckooClock("00:00"))
    println(fizzBuzzCuckooClock("12:00"))
}

fun fizzBuzzCuckooClock(time: String): String {
    val timeArray = time.split(":").map { it.toInt() }
    return if (timeArray[1] == 0) if (timeArray[0] % 12 != 0) "Cuckoo ".repeat(timeArray[0] % 12)
        .trim() else "Cuckoo ".repeat(12)
        .trim() else if (timeArray[1] == 30) "Cuckoo" else if (timeArray[1] % 15 == 0) "Fizz Buzz" else if (timeArray[1] % 3 == 0) "Fizz" else if (timeArray[1] % 5 == 0) "Buzz" else "tick"
}

/* Better Solution
fun catchSignChange(arr: Array<Int>): Int = arr.map { it < 0 }.zipWithNext { a, b -> a != b }.count { it }
 */