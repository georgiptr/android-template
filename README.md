# android-template
Template with configured useful libraries and patterns for starting a new Android project

 * SDK 28, minimum SDK 21
 * Java 8 support
 * Kotlin support 1.2.70
 * Android Architecture Components 1.1.1
 * Android Support Library 28.0.0
 * Dagger 2.17
 * Reactive
   * RxJava 2.2.2
   * RxAndroid 2.1.0
   * RxKotlin 2.2.0
   * RxPermissions 0.9.5
   * RxBinding-Kotlin 2.1.1
 * MVVM pattern - Activity, ViewModel, Repository interface + implementation
 * Firebase Analytics 16.0.3, Crashlytics 2.9.5
   * Google Services Plugin (used by Crashlytics/Firebase Analytics), must be uncommented
   * Empty app/google-service.json, must be populated to use Crashlytics/Firebase Analytics
   * Logger class using internally Firebase Analytics/Crashlytics 
 * Gradle 4.4
   * org.gradle.jvmargs=-Xmx2048m
   * android.useAndroidX=true
   * android.enableJetifier=true
   * org.gradle.parallel=true
   
 