package by.sadovnick.bountybound.nyetack

val narrationModifier: (String) -> String =  {message ->
    val numExclamationPoint = 3
    message.uppercase() + "!".repeat(numExclamationPoint)
}

fun narrate(message: String) {
    println(narrationModifier(message))
}