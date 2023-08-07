package by.sadovnick.nuetack

import by.sadovnick.nuetack.models.Player

lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
    val lootBoxOne = LootBox(Fedora("a generic-looking fedora", 15))
    val lootBoxTwo = LootBox(GemStones(150))
    Game.play()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Выводит message желтым цветом
        "\u001b[33;1m$message\u001b[0m"
    }
    println("Madrigal")
    return "Madrigal"
}