package org.openended.naturaltwenty

data class Ability(
        val name: Abilities,
        val score: Int
) {
    val modifier get() = score / 2 - 5
}
