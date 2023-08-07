package by.sadovnick.nuetack.rooms

interface Fightable{
    val name: String
    var healthPoints: Int
    val diceCount: Int
    val diceSides: Int

    fun takeDamage(damage: Int)
    fun attack(opponent: Fightable)
}