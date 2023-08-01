package by.sadovnick.bountybound.nyetack

val narrationModifier: (String) -> String =  {
    val numExclamationPoint = 3
    it.uppercase() + "!".repeat(numExclamationPoint)
}

fun narrate(message: String) {
    println(narrationModifier(message))
}