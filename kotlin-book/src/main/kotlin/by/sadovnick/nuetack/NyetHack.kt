package by.sadovnick.nuetack

import by.sadovnick.nuetack.models.Player

lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
    Game.play()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Выводит message желтым цветом
        "\u001b[33;1m$message\u001b[0m"
    }
    val input = readLine()
    require(!input.isNullOrEmpty()){
        "The hero must have a name"
    }
    return input
}