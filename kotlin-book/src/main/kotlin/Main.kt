const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)
    val hasBeFriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"
    val quest = if (playerLevel == 1) {
        "Meet Mr. Bubbles in the land of soft things."
    } else if (playerLevel <= 5) {
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendedBarbarians || playerClass == "barbarian")
        if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion."
        } else {
            "Save the town from the barbarian invasions."
        }
    } else if (playerLevel == 6) {
        "Locate the enchanted sword."
    } else if (playerLevel == 7) {
        "Recover the long-lost artifact of creation."
    } else if (playerLevel == 8) {
        "Defeat Nogartse, bringer of death and eater of worlds."
    } else {
        "There are no quests right now."
    }
    println("The hero approaches the bounty board. It reads: ")
    println(quest)

    println("Time passes...")
    println("There are no quests right now.")

    playerLevel += 1
    println(playerLevel)

}