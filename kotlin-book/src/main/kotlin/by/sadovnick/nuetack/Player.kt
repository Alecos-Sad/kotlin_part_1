package by.sadovnick.nuetack

class Player {
    var name = "Madrigal"
        get() = field.replaceFirstChar { it.uppercaseChar() }
        private set(value) {
            field = value.trim()
        }

    fun castFireBall(numFireballs: Int = 2) {
        narrate("A glass of FireBall springs into existence (x$numFireballs)")
    }
}