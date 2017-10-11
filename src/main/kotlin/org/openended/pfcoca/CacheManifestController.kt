package org.openended.pfcoca

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class CacheManifestController(val cacheBuster: CacheBuster) {

    @ResponseBody
    @GetMapping("/cache.manifest", produces = arrayOf("text/cache-manifest"))
    fun cacheManifest(): String = """
        CACHE MANIFEST
        # Cache manifest version $cacheBuster

        CACHE:
        /favicon.ico
        /img/apple-touch-icon.png
        /img/apple-touch-icon-57x57.png
        /img/apple-touch-icon-72x72.png
        /img/apple-touch-icon-76x76.png
        /img/apple-touch-icon-114x114.png
        /img/apple-touch-icon-120x120.png
        /img/apple-touch-icon-144x144.png
        /img/apple-touch-icon-152x152.png
        /img/apple-touch-icon-180x180.png
        #/img/apple-touch-icon-120x120-precomposed.png
        /webjars/bootstrap/css/bootstrap.min.css
        /webjars/bootstrap/css/bootstrap.min.css.map
        /webjars/bootstrap/css/bootstrap-theme.min.css
        /webjars/bootstrap/css/bootstrap-theme.min.css.map
        /webjars/bootstrap/js/bootstrap.min.js
        /webjars/jquery/jquery.min.js
        /webjars/jquery/jquery.min.map
        /webjars/axios/dist/axios.min.js
        /webjars/axios/dist/axios.min.map
        /webjars/vue/vue.min.js
        /css/style.css

        NETWORK:
        /api/*
        """.trimIndent()
}
