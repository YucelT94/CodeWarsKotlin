package kyu7

/**
You've had a baby.

Well done. Nice isn't it? Life destroying... but in a good way.

Part of your new routine is lying awake at night worrying that you've either lost the baby... or that you have more than 1!

Given a string of words (x), you need to calculate how many babies are in it. To count as a baby you must have all of the letters in baby ('b', 'a', 'b', 'y'). That counts as 1. They do not need to be in order in the string. Upper and lower case letters count.

Examples:

'baby' = 1
'abby' = 1
'babybaby' = 2
'Why the hell are there so many babies?!' = 1
'Anyone remember life before babies?' = 1
'Happy babies boom ba by?' = 2
"baby" = 1
"abby" = 1
"babybaby" = 2
"Why the hell are there so many babies?!" = 1
"Anyone remember life before babies?" = 1
"Happy babies boom ba by?" = 2
If there are no babies in the string - you lost the baby!! Return a different value, as shown below:

"none here" = null "" = null
 */

fun main() {
    println(babyCount("baby"))
    println(babyCount("abby"))
    println(babyCount("baby baby baby"))
    println(babyCount("Why the hell are there so many babies?!"))
    println(babyCount("Anyone remember life before babies?"))
    println(babyCount("Happy babies boom ba by?"))
    println(babyCount("b a b y"))
    println(babyCount(""))
    println(babyCount("none her"))
}

fun babyCount(x: String): Int? {
    val keyValues = x.toLowerCase().groupingBy { it }.eachCount()
    val arrayKeys = arrayListOf<Int>()

    arrayKeys.add(keyValues.getOrDefault('a', 0))
    arrayKeys.add(keyValues.getOrDefault('b', 0) / 2)
    arrayKeys.add(keyValues.getOrDefault('y', 0))

    return if (arrayKeys.min() == 0) null else arrayKeys.min()
}

/* Better Solution
fun babyCount(x: String): Int? {
    val count = x.toLowerCase().groupingBy { it }.eachCount()
    return listOf(count['a'] ?: 0, (count['b'] ?: 0) / 2, count['y'] ?: 0).min()?.takeIf { it > 0 }
}
*/