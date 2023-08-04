package by.sadovnick.nuetack

var heroName = ""
val player = Player()

fun main() {
    narrate("${player.name}, ${createTitle(player.name)}, heads to the town square")
    visitTavern()
    player.castFireBall()
}

private fun createTitle(name: String): String {
    return when {
        name.all { it.isDigit() } -> "The Identifiable"
        name.none { it.isLetter() } -> "The Witness Protection Member"
        name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowel"
        else -> "The Renowned Hero"
    }
}

private fun makeYellow(message: String) = "\u001b[33;1m$message\u001b[0m"

private fun promptHeroName():String{
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Выводит message желтым цветом
        "\u001b[33;1m$message\u001b[0m"
    }
    /*val input = readLine()
    require(input != null && input.isNotEmpty()) {
    "The hero must have a name."
    }
    return input*/
    println("Madrigal")
    return "Madrigal"
}