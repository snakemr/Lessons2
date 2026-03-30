plugins {
    kotlin("jvm")
    kotlin("plugin.compose")
    id("org.jetbrains.compose")
    id("app.cash.sqldelight")
}

group = "ru.lrmk"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

val composeVersion = project.property("compose.version")
val material3: String by project
val icons: String by project
val sqldelight: String by project
val ktor: String by project

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.compose.material3:material3:$material3")
    implementation("org.jetbrains.compose.material:material-icons-extended:$icons")
    implementation("org.jetbrains.compose.components:components-resources:$composeVersion")
    implementation(files("lib/ComposeLessons2-1.0.jar"))
    implementation("org.slf4j:slf4j-simple:2.0.17")
    // база данных
    implementation("app.cash.sqldelight:sqlite-driver:$sqldelight")
    implementation("app.cash.sqldelight:coroutines-extensions:$sqldelight")
    // клиент
    implementation("io.ktor:ktor-client-cio:$ktor")
    implementation("io.ktor:ktor-client-content-negotiation:$ktor")
    implementation("io.ktor:ktor-serialization-gson:$ktor")
    // сервер
    implementation("io.ktor:ktor-server-core-jvm:$ktor")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor")
    implementation("io.ktor:ktor-serialization-gson-jvm:$ktor")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor")
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}

sqldelight {
    databases {
        create("Base") {
            packageName = "lessons"
        }
    }
}
