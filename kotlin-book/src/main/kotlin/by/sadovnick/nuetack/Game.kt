package by.sadovnick.nuetack

import by.sadovnick.nuetack.rooms.Room
import by.sadovnick.nuetack.rooms.TownSquare

object Game {
    private val currentRoom: Room = TownSquare()

    init {
        narrate("Welcome, adventurer")
        val mortality = if (player.isImmortal) "an immortal" else "a mortal"
        narrate("${player.name}, $mortality, has ${player.healthPoints} health points")
    }

    fun play() {
        while (true) {
            narrate("${player.name} of ${player.hometown}, ${player.title}, is in ${currentRoom.description()}")
            currentRoom.enterRoom()
            print("> Enter your command: ")
            println("Last command: ${readLine()}")
        }
    }
}