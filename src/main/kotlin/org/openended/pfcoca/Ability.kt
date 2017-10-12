package org.openended.pfcoca

data class Ability(
        val name: Abilities,
        val score: Int
) {
    val modifier get() = score / 2 - 5
}
