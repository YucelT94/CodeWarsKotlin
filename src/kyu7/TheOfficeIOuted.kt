package kyu7

/**
Your colleagues have been looking over you shoulder. When you should have been doing your boring real job, you've been using the work computers to smash in endless hours of codewars.

In a team meeting, a terrible, awful person declares to the group that you aren't working. You're in trouble. You quickly have to gauge the feeling in the room to decide whether or not you should gather your things and leave.

Given an object (meet) containing team member names as keys, and their happiness rating out of 10 as the value, you need to assess the overall happiness rating of the group. If <= 5, return 'Get Out Now!'. Else return 'Nice Work Champ!'.

Happiness rating will be total score / number of people in the room.

Note that your boss is in the room (boss), their score is worth double it's face value (but they are still just one person!).
 */

fun main() {
    println(outed(mapOf("tim" to 0, "jim" to 2, "randy" to 0, "sandy" to 7, "andy" to 0, "katie" to 5, "laura" to 1, "saajid" to 2, "alex" to 3, "john" to 2, "mr" to 0), "laura"))
    println(outed(mapOf("tim" to 1, "jim" to 3, "randy" to 9, "sandy" to 6, "andy" to 7, "katie" to 6, "laura" to 9, "saajid" to 9, "alex" to 9, "john" to 9, "mr" to 8), "katie"))
    println(outed(mapOf("tim" to 2, "jim" to 4, "randy" to 0, "sandy" to 5, "andy" to 8, "katie" to 6, "laura" to 2, "saajid" to 2, "alex" to 3, "john" to 2, "mr" to 8), "john"))
}

fun outed(meet: Map<String, Int>, boss: String) = if (((meet.values.sum() + meet.getValue(boss))/meet.size <= 5)) "Get Out Now!" else "Nice Work Champ!"

/* Other Solution
fun outed(meet: Map<String, Int>, boss: String) = if ((meet.values + meet.getValue(boss)).average() <= 5) "Get Out Now!" else "Nice Work Champ!"
*/