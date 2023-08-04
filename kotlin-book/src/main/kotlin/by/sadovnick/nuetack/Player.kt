package by.sadovnick.nuetack

class Player {
    var name = "Madrigal"
        get() = field.replaceFirstChar { it.uppercaseChar() }
        private set(value) {
            field = value.trim()
        }

    val title: String
        get() = when {
            name.all { it.isDigit() } -> "The Identifiable"
            name.none { it.isLetter() } -> "The Witness Protection Member"
            name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowels"
            else -> "The Renowned Hero"
        }

    fun castFireBall(numFireballs: Int = 2) {
        narrate("A glass of FireBall springs into existence (x$numFireballs)")
    }

    fun changeName(newName: String){
        narrate("$name legally changes their name to $newName")
        name = newName
    }
}