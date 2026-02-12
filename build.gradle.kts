plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

tasks.register("spotApply") {
    group = "formatting"
    description = "No-op formatting task for this minimal scaffold."
}
