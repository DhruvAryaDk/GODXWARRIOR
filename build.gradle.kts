<project>/build.gradle.kts
id("com.google.gms.google-services") version "4.4.1" apply false
id("com.android.application")
id("com.google.gms.google-services")
implementation(platform("com.google.firebase:firebase-bom:33.0.0"))
implementation("com.google.firebase:firebase-analytics")
