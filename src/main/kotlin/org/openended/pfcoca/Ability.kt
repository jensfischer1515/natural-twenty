package org.openended.pfcoca

data class Ability(
        val name: Abilities,
        val score: Int
) {
    fun getModifier(): Int = score / 2 - 5
}
