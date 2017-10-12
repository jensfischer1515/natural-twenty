package org.openended.pfcoca

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
data class CacheBuster(@Value("\${random.uuid}") val id: String) {
    override fun toString() = id
}
