package by.sadovnick.nuetack.rooms

import by.sadovnick.nuetack.LootBox
import by.sadovnick.nuetack.narrate

open class Room(private val name: String) {
    protected open val status = "Calm"
    open val lootBox = LootBox.random()

    open fun description() = "$name (Currently: $status"

    open fun enterRoom() {
        narrate("There is nothing to do here")
    }
}

open class MonsterRoom(
    name: String,
    var monster: Monster? = Goblin()
) : Room(name) {
    override fun description() = super.description() + "(Creature: ${monster?.description ?: "None"})"

    override fun enterRoom() {
        if (monster == null) {
            super.enterRoom()
        } else {
            narrate("Danger is lurking in this room")
        }
    }
}
