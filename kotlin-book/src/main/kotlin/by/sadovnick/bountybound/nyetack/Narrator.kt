package by.sadovnick.bountybound.nyetack

fun narrate(message: String) {
    val narrationModifier: () -> String = {
        val numExclamationPoint = 3
        message.uppercase() + "!".repeat(numExclamationPoint)
    }
    println(narrationModifier())
}