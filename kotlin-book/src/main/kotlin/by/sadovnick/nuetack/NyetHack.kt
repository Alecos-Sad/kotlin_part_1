package by.sadovnick.nuetack

var heroName = ""
lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
    val mortality = if (player.isImmortal) "an immortal" else "mortal"
    narrate("${player.name}, ${player.title}, heads to the town square")
    narrate("${player.name}, ${mortality}, has ${player.healthPoints} health points")

    visitTavern()
    player.castFireBall()
}

private fun promptHeroName(): String {
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