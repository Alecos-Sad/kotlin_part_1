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

    narrate("Eli leaves the tavern")
    patrons.remove("Eli")
    narrate("Alex enters the tavern")
    patrons.add("Alex")
    println(patrons)
    narrate("Alex (VIP) enters the tavern")
    patrons.add(0, "Alex")
    println(patrons)
    patrons[0] = "Alexis"
    println(patrons)
}