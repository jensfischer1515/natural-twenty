package org.openended.pfcoca

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class CacheManifestController {

    @ResponseBody
    @GetMapping("/cache.manifest", produces = arrayOf("text/cache-manifest"))
    fun cacheManifest(): String = """
        CACHE MANIFEST
        # Cache manifest version 0.0.1

        CACHE:
        /webjars/bootstrap/css/bootstrap.min.css
        /webjars/bootstrap/css/bootstrap.min.css.map
        /webjars/bootstrap/css/bootstrap-theme.min.css
        /webjars/bootstrap/css/bootstrap-theme.min.css.map
        /webjars/bootstrap/js/bootstrap.min.js
        /webjars/jquery/jquery.min.js
        /webjars/jquery/jquery.min.map
        /css/style.css
        /favicon.ico

        NETWORK:
        /api/*
        """.trimIndent()
}
