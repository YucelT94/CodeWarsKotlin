package kyu7

/**
We have to create a function that receives a connection string with password included and you have to mask the password i.e. change password by asterisks.

Preconditions:

non empty valid url
password always next to string section password=
assume password will not contain ampersand sign for sake of simplicity
to make it more real it has non ASCII characters
"password=" and "user" will occur only once
empty passwords are not validated but best solutions take empty passwords into account

Example:

input
jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345

output
jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****

Extra readings:

https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver
 */

fun main() {
    println(PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
    println(PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=12345&user=root"))
}

object PasswordHider {
    fun hidePasswordFromConnection(urlString: String): String {
        val base = urlString.substringAfterLast("password=")
        val password = base.substringBefore("&")
        val others = if (base.contains("&")) "&" + base.substringAfter("&") else ""

        return urlString.replaceAfterLast("password=", "*".repeat(password.length)) + others
    }
}

/* Better Solution
object PasswordHider {
    fun hidePasswordFromConnection(url: String) = Regex("(?<=password=)[^&]*").replace(url) { "*".repeat(it.value.length) }
}
 */