package kyu7

/**
In this kata you will be given a random string of letters and tasked with returning them as a string of comma-separated sequences sorted alphabetcally, with each sequence starting with an uppercase character followed by n-1 lowercase characters, where n is the letter's alphabet position 1-26.

Example
alphaSeq("ZpglnRxqenU") -> "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"
Technical Details
The string will include only letters.
The first letter of each sequence is uppercase followed by n-1 lowercase.
Each sequence is seperated with a comma.
Return value needs to be a string.
 */

fun main() {
    println(alphaSeq("ZpglnRxqenU"))
    println(alphaSeq("NyffsGeyylB"))
    println(alphaSeq("MjtkuBovqrU"))
    println(alphaSeq("EvidjUnokmM"))
    println(alphaSeq("HbideVbxncC"))
}

fun alphaSeq(str: String) = str.toLowerCase().toCharArray().toList().sorted().map { it.toString().repeat(it.toLowerCase().toInt() - 96).capitalize() }.joinToString(",")

/* Other Solution
fun alphaSeq(str: String) = str.toLowerCase().toCharArray().sorted().joinToString(",") { it.toString().repeat(it.toInt() - 96).capitalize() }
*/