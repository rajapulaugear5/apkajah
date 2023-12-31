plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("kotlin-parcelize")

}

android {
    namespace = "com.example.press"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.press"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //API SplashScreen
    implementation("androidx.core:core-splashscreen:1.0.1")

    //navigation
    //noinspection GradleDependency
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.2")
    //noinspection GradleDependency
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.2")



    //material design
    //implementation ("com.google.android.material:material:1.3.0-alpha03")

    //bg lingkaran
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //Scanner
    implementation ("com.github.yuriy-budiyev:code-scanner:2.3.2")

    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    ksp("androidx.room:room-compiler:2.5.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.7.1")



    //location
    implementation ("com.google.android.gms:play-services-location:21.0.1")
    implementation ("com.google.android.gms:play-services-maps:18.2.0")

// Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:okhttp:4.9.1")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("com.squareup.picasso:picasso:2.8")



// DataStore
    implementation ("androidx.datastore:datastore-preferences:1.0.0")
    implementation ("androidx.datastore:datastore-core:1.0.0")


    // ViewModel and LiveData


    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    //photoView
    implementation ("com.github.chrisbanes:PhotoView:2.3.0")

    //QR Post
    implementation ("com.android.volley:volley:1.2.0")




}