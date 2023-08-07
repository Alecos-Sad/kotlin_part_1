package by.sadovnick.nuetack

import by.sadovnick.nuetack.models.Player
import by.sadovnick.nuetack.rooms.TownSquare

var heroName = ""
lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
    //changeNarratorMood()
    player.prophesize()
//    var currentRoom = Room("The Foyer")
    val currentRoom = Tavern()
    val mortality = if (player.isImmortal) "an immortal" else "mortal"
    narrate("${player.name} of ${player.hometown}, ${player.title} is in ${currentRoom.description()}")
    narrate("${player.name}, ${mortality}, has ${player.healthPoints} health points")
    currentRoom.enterRoom()
    player.castFireBall()
    player.prophesize()
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