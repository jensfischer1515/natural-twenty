package org.openended.pfcoca

import org.openended.pfcoca.Abilities.*
import org.springframework.stereotype.Repository

@Repository
class PlayerCharacterRepository {
    fun findById(id: String): PlayerCharacter {
        val abilities = arrayListOf(
                Ability(name = STR, score = 22),
                Ability(name = DEX, score = 16),
                Ability(name = CON, score = 14),
                Ability(name = INT, score = 14),
                Ability(name = WIS, score = 12),
                Ability(name = CHA, score = 7)
        )
        val feats = arrayListOf(
                Feat(name = "Weapon Focus")
        )
        return PlayerCharacter(id = id, name = "Tarkonn", abilities = abilities, feats = feats)
    }
}
