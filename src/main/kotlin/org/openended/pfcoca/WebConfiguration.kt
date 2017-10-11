package org.openended.pfcoca

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.util.*

@Configuration
class WebConfiguration : WebMvcConfigurer {

    @Bean
    fun cacheBuster(): CacheBuster = CacheBuster(id = UUID.randomUUID().toString())

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/").setViewName("index")
    }
}
