-ignorewarnings
-dontwarn
-dontnote
-dontwarn com.xmansoft.libs.butterknife.**

-keepclasseswithmembers @interface com.xmansoft.libs.butterknife.annotation.** { 
     int value();
}

-keepclassmembers, allowobfuscation class * {
     @com.xmansoft.libs.butterknife.annotation.** <fields>;
}

-keepclassmembers, allowobfuscation class * {
    @com.xmansoft.libs.butterknife.annotation.** <methods>;
}


-dontwarn androidx.arch.**
-dontwarn androidx.lifecycle.**
-keep class androidx.arch.** { *; }
-keep class androidx.lifecycle.** { *; }
