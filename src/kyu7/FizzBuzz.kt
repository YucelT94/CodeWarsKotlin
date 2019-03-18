package kyu7

/**
Return an array containing the numbers from 1 to N, where N is the parametered value. N will never be less than 1 (in C#, N might be less then 1).

C# ONLY: If N is smaller then or equal to 0, throw an ArgumentOutOfRangeException!
Replace certain values however if any of the following conditions are met:

If the value is a multiple of 3: use the value 'Fizz' instead
If the value is a multiple of 5: use the value 'Buzz' instead
If the value is a multiple of 3 & 5: use the value 'FizzBuzz' instead
C# method calling example:

string[] result = FizzBuzz.GetFizzBuzzArray(3); // => [ "1", "2", "Fizz" ]
 */

fun main() {
    var expected = arrayOf("1")
    println(fizzBuzz(1).toList())
    expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
    println(fizzBuzz(30).toList())
}


fun fizzBuzz(n: Int): Array<String> {
    val fizzBuzzArray = Array(n) { "n = $it" }
    for (i in 1..n) {
        if (i % 15 == 0) fizzBuzzArray[(i - 1)] = "FizzBuzz" else if (i % 5 == 0) fizzBuzzArray[(i - 1)] = "Buzz" else if (i % 3 == 0) fizzBuzzArray[(i - 1)] = "Fizz" else fizzBuzzArray[(i - 1)] = i.toString()
    }
    return fizzBuzzArray
}