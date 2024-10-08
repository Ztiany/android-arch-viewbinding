plugins {
    alias(libs.plugins.app.common.library)
    alias(libs.plugins.vanniktech.maven.publisher)
}

android {
    namespace = "com.android.base.viewbinding"

    //如果不想生成某个布局的绑定类，可以在根视图添加 tools:viewBindingIgnore="true" 属性。
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // kotlin
    api(libs.kotlin.stdlib)
    api(libs.kotlin.reflect)
    api(libs.kotlinx.coroutines)
    api(libs.kotlinx.coroutines.android)
    // log
    implementation(libs.jakewharton.timber)
}