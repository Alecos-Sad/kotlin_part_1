package by.sadovnick.nuetack.rooms

import by.sadovnick.nuetack.narrate

open class Room(val name: String) {
    protected open val status = "Calm"

    fun description() = "$name (Currently: $status"

    open fun enterRoom(){
        narrate("There is nothing to do here")
    }
}