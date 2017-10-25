package org.openended.naturaltwenty

data class Feat(
        val name: String
) {
    val id get() = name.toLowerCase().replace(' ', '-')
}
