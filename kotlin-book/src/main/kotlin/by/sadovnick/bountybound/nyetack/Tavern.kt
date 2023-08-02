package by.sadovnick.bountybound.nyetack

private const val TAVERN_MASTER = "Taernyl"
private const val TAVERN_NAME = "$TAVERN_MASTER's Folly"

fun visitTavern() {
    narrate("$heroName enters $TAVERN_NAME")
    val patrons = mutableListOf("Eli", "Mordoc", "Sophie")
    val readOnlyPatrons = patrons.toList();
    val elliMessage = if (patrons.contains("Eli")) {
        "$TAVERN_MASTER says: Eli's  in the back playing cards"
    } else {
        "$TAVERN_MASTER says: Eli isn't here"
    }
    println(elliMessage)
    val otherMessage = if (patrons.containsAll(listOf("Mordoc", "Sophie"))) {
        "$TAVERN_MASTER says: Sophie and Mordoc are seated by the stew kettle"
    } else {
        "$TAVERN_MASTER says: Sophie and Mordoc aren't with each other right now"
    }
    println(otherMessage)

    for (patron in patrons) {
        println("Good evening $patron")
    }

    for (i in 0 until patrons.size){
        println(patrons[i])
    }

    for (i in patrons.size - 1 downTo 0 step 2){
        println(patrons[i])
    }

    patrons.forEach{
        patron -> println("Good evening $patron")
    }

    patrons.forEachIndexed{index, patron ->
        println("Good evening, $patron - you're #${index + 1} in line")
    }
}