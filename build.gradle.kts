buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.3.14")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.jetbrains.kotlin.plugin.parcelize") version "1.7.10" apply false
    id("androidx.navigation.safeargs") version "2.5.1" apply false
}