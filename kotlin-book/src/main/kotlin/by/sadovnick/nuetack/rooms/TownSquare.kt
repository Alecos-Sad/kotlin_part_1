package by.sadovnick.nuetack.rooms

import by.sadovnick.nuetack.*

open class TownSquare : Room("The Town Square") {
    override val status = "Bustling"
    private var bellSound = "GWONG"
    private val hatDropOffBox = DropOffBox<Hat>()
    private val gemDropOffBox = DropOffBox<GemStones>()

    override fun enterRoom() {
        narrate("The villagers rally and cheer as the hero enters")
        ringBell()
    }

    private fun ringBell() {
        narrate("The bell tower announces the hero's presence: $bellSound")
    }

    fun <T> sellLoot(
        loot: T
    ): Int where T : Loot, T : Sellable {
        return when (loot) {
            is Hat -> hatDropOffBox.sellLoot(loot)
            is GemStones -> gemDropOffBox.sellLoot(loot)
            else -> 0
        }
    }
}