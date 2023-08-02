package by.sadovnick.bountybound.nyetack

private const val TAVERN_MASTER = "Taernyl"
private const val TAVERN_NAME = "$TAVERN_MASTER's Folly"

fun visitTavern() {
    narrate("$heroName enters $TAVERN_NAME")
    val patrons = listOf("Eli", "Mordoc", "Sophie")
    println(patrons[0])
    println(patrons.first())
    println(patrons.last())
    println(patrons.getOrElse(4) { "Unknown Patron" })
}