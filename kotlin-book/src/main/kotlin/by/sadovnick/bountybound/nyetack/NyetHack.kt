package by.sadovnick.bountybound.nyetack

fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?") {
        //Выводит сообщение желтым цветом
            message ->
        "\u001b[33;1m$message\u001b[0m"
    }
    val heroName = readLine() ?: ""
    changeNarratorMood()
    narrate("$heroName heads to the town square")
}