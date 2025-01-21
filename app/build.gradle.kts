plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android") version "2.47"
    id("kotlin-kapt")
}

android {
    namespace = "com.example.fullmoon"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fullmoon"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    dependencies {
        val composeBom = platform("androidx.compose:compose-bom:2023.09.00")
        implementation(composeBom)
        androidTestImplementation(composeBom)

        // ... other dependencies ...
    } dependencies {
        val composeBom = platform("androidx.compose:compose-bom:2023.09.00")
        implementation(composeBom)
        androidTestImplementation(composeBom)

        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        // ... other dependencies ...
    }    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2023.09.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    // Android Core Libraries
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.8.0")


    // Hilt
    implementation("com.google.dagger:dependencies {
        val composeBom = platform ("androidx.compose:compose-bom:2023.09.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)

    // ... other dependencies ...
}hilt-android:2.47")
    kapt("com.google.dagger:hilt-compiler:2.47")

    // Room
    implementation("androidx.room:room-runtime:2.5.2")
    kapt("androidx.room:room-compiler:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")

    // TensorFlow Lite
    implementation("org.tensorflow:tensorflow-lite:2.13.0")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
}

kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}