const val HERO_NAME = "Madrigal"
var playerLevel = 0

fun main() {
    println("$HERO_NAME announces her presence to the world.")
    println("What level is $HERO_NAME?")
    val playerLevelInput = readln()!!
    println("$HERO_NAME's level is $playerLevelInput")
    playerLevel = if (playerLevelInput.matches(
            """\d+""".toRegex()
        )
    ) {
        playerLevelInput.toInt()
    } else {
        1
    }

    readBountyBoard()

    println("Time passes...")
    println("$HERO_NAME returns from her quest")

    playerLevel += 1
    println(playerLevel)

    readBountyBoard()
}

private fun readBountyBoard() {
    val quest = obtainQuest(playerLevel)
    val message = quest?.replace("Nogartse", "xxxxxxxxx")
        ?.let { censoredQuest ->
            """
            |$HERO_NAME approaches the bounty board. It reads: 
            |   "$censoredQuest"
        """.trimMargin()
        } ?: "$HERO_NAME approaches the bounty board, but it is blank."
    println(message)
}

private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasAngeredBarbarians: Boolean = false,
    hasBeFriendedBarbarians: Boolean = true,
): String? = when (playerLevel) {
    1 -> "Meet Mr. Bubbles in the land of soft things."
    in 2..5 -> {
        val canTalkToBarbarians = !hasAngeredBarbarians
                && (hasBeFriendedBarbarians
                || playerClass == "barbarian")
        if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion."
        } else {
            "Save the town from the barbarian invasions."
        }
    }

    6 -> "Locate the enchanted sword."
    7 -> "Recover the long-lost artifact of creation."
    8 -> "Defeat Nogartse, bringer of death and eater of worlds."
    else -> null
}
