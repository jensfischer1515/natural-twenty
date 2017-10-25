package org.openended.naturaltwenty

data class PlayerCharacter(
        val id: String,
        val name: String,
        val abilities: List<Ability>,
        val feats: List<Feat>
)
