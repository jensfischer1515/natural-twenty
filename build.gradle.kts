import org.gradle.api.JavaVersion.VERSION_1_8
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    val springVersion = "5.0.1.RELEASE"
    val springBootVersion = "2.0.0.M5"
    val kotlinVersion = "1.1.51"
    extra["springVersion"] = springVersion
    extra["springBootVersion"] = springBootVersion
    extra["kotlinVersion"] = kotlinVersion

    repositories {
        jcenter()
        maven { setUrl("https://repo.spring.io/milestone") }
    }
    dependencies {
        classpath("com.github.ben-manes:gradle-versions-plugin:0.15.0")
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    }
}

apply {
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("idea")
    plugin("org.springframework.boot")
    plugin("io.spring.dependency-management")
}

version = "0.0.1-SNAPSHOT"
configure<JavaPluginConvention> {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = VERSION_1_8.toString()
    }
}

repositories {
    jcenter()
    maven { setUrl("https://repo.spring.io/milestone") }
}

val springVersion = extra["springVersion"] as String
val springBootVersion = extra["springBootVersion"] as String
val kotlinVersion = extra["kotlinVersion"] as String

dependencies {
    //"compileOnly"("org.springframework:spring-context-indexer:$springVersion")

    "compile"("org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlinVersion")
    "compile"("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    "compile"("org.springframework.boot:spring-boot-starter-actuator:$springBootVersion")
    "compile"("org.springframework.boot:spring-boot-starter-thymeleaf:$springBootVersion")
    "compile"("org.springframework.boot:spring-boot-starter-web:$springBootVersion")

    "runtime"("org.webjars:webjars-locator")
    "runtime"("org.webjars:bootstrap:3.3.7-1")
    "runtime"("org.webjars:jquery:3.2.0")
    "runtime"("org.webjars.npm:axios:0.16.1")
    "runtime"("org.webjars:vue:2.4.2")
    //"runtime"("org.webjars.npm:bootstrap-vue:0.15.0")
    "runtime"("org.webjars:bootstrap-vue:0.9.5")
    "runtime"("org.springframework.boot:spring-boot-devtools:$springBootVersion")

    "testCompile"("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
    "testCompile"("com.nhaarman:mockito-kotlin:1.5.0")
    "testCompile"("com.natpryce:hamkrest:1.4.2.0")
}

apply {
    from("$rootDir/gradle/versions.gradle.kts")
    from("$rootDir/gradle/test.gradle.kts")
}
