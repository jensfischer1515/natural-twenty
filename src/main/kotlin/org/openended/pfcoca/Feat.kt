package org.openended.pfcoca

data class Feat(
        val name: String
) {
    val id get() = name.toLowerCase().replace(' ', '-')
}
