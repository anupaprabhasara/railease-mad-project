Repository: anupaprabhasara/railease-mad-project
Files analyzed: 71

Estimated tokens: 48.5k

Directory structure:
└── anupaprabhasara-railease-mad-project/
    ├── build.gradle.kts
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle.kts
    ├── app/
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   ├── .gitignore
    │   ├── src/
    │   │   ├── androidTest/
    │   │   │   └── java/
    │   │   │       └── com/
    │   │   │           └── anupa/
    │   │   │               └── railease/
    │   │   │                   └── ExampleInstrumentedTest.kt
    │   │   ├── main/
    │   │   │   ├── AndroidManifest.xml
    │   │   │   ├── java/
    │   │   │   │   └── com/
    │   │   │   │       └── anupa/
    │   │   │   │           └── railease/
    │   │   │   │               ├── BookingPage.kt
    │   │   │   │               ├── ETicketPrint.kt
    │   │   │   │               ├── HomePage.kt
    │   │   │   │               ├── LoginPage.kt
    │   │   │   │               ├── MyETickets.kt
    │   │   │   │               ├── MyProfile.kt
    │   │   │   │               ├── OnboardingScreenOne.kt
    │   │   │   │               ├── OnboardingScreenThree.kt
    │   │   │   │               ├── OnboardingScreenTwo.kt
    │   │   │   │               ├── PaymentApproved.kt
    │   │   │   │               ├── PaymentProcess.kt
    │   │   │   │               ├── RegisterPage.kt
    │   │   │   │               ├── SearchResult.kt
    │   │   │   │               ├── SearchScreen.kt
    │   │   │   │               └── UpdateProfile.kt
    │   │   │   └── res/
    │   │   │       ├── anim/
    │   │   │       │   ├── slide_in_left.xml
    │   │   │       │   ├── slide_in_right.xml
    │   │   │       │   ├── slide_in_up.xml
    │   │   │       │   ├── slide_out_down.xml
    │   │   │       │   ├── slide_out_left.xml
    │   │   │       │   └── slide_out_right.xml
    │   │   │       ├── color/
    │   │   │       │   ├── btn_bg_tint.xml
    │   │   │       │   └── btn_text_color.xml
    │   │   │       ├── drawable/
    │   │   │       │   ├── card_bg.xml
    │   │   │       │   ├── horizontal_line.xml
    │   │   │       │   ├── ic_launcher.xml
    │   │   │       │   ├── ic_launcher_round.xml
    │   │   │       │   ├── ripple_round.xml
    │   │   │       │   ├── ripple_rounded_rect.xml
    │   │   │       │   ├── rounded_edittext.xml
    │   │   │       │   └── search_bg.xml
    │   │   │       ├── layout/
    │   │   │       │   ├── booking_page.xml
    │   │   │       │   ├── eticket_print.xml
    │   │   │       │   ├── home_page.xml
    │   │   │       │   ├── login_page.xml
    │   │   │       │   ├── my_etickets.xml
    │   │   │       │   ├── my_profile.xml
    │   │   │       │   ├── onboarding_screen_one.xml
    │   │   │       │   ├── onboarding_screen_three.xml
    │   │   │       │   ├── onboarding_screen_two.xml
    │   │   │       │   ├── payment_approved.xml
    │   │   │       │   ├── payment_process.xml
    │   │   │       │   ├── register_page.xml
    │   │   │       │   ├── search_result.xml
    │   │   │       │   ├── search_screen.xml
    │   │   │       │   └── update_profile.xml
    │   │   │       ├── mipmap-anydpi-v26/
    │   │   │       │   ├── ic_launcher.xml
    │   │   │       │   └── ic_launcher_round.xml
    │   │   │       ├── values/
    │   │   │       │   ├── arrays.xml
    │   │   │       │   ├── colors.xml
    │   │   │       │   ├── strings.xml
    │   │   │       │   └── themes.xml
    │   │   │       └── xml/
    │   │   │           ├── backup_rules.xml
    │   │   │           └── data_extraction_rules.xml
    │   │   └── test/
    │   │       └── java/
    │   │           └── com/
    │   │               └── anupa/
    │   │                   └── railease/
    │   │                       └── ExampleUnitTest.kt
    │   └── .idea/
    │       ├── gradle.xml
    │       ├── misc.xml
    │       ├── vcs.xml
    │       └── .gitignore
    ├── gradle/
    │   ├── libs.versions.toml
    │   └── wrapper/
    │       └── gradle-wrapper.properties
    └── .kotlin/
        └── errors/


================================================
FILE: build.gradle.kts
================================================
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}


================================================
FILE: gradle.properties
================================================
# Project-wide Gradle settings.
# IDE (e.g. Android Studio) users:
# Gradle settings configured through the IDE *will override*
# any settings specified in this file.
# For more details on how to configure your build environment visit
# http://www.gradle.org/docs/current/userguide/build_environment.html
# Specifies the JVM arguments used for the daemon process.
# The setting is particularly useful for tweaking memory settings.
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
# When configured, Gradle will run in incubating parallel mode.
# This option should only be used with decoupled projects. For more details, visit
# https://developer.android.com/r/tools/gradle-multi-project-decoupled-projects
# org.gradle.parallel=true
# AndroidX package structure to make it clearer which packages are bundled with the
# Android operating system, and which are packaged with your app's APK
# https://developer.android.com/topic/libraries/support-library/androidx-rn
android.useAndroidX=true
# Kotlin code style for this project: "official" or "obsolete":
kotlin.code.style=official
# Enables namespacing of each library's R class so that its R class includes only the
# resources declared in the library itself and none from the library's dependencies,
# thereby reducing the size of the R class for that library
android.nonTransitiveRClass=true


================================================
FILE: gradlew
================================================
#!/usr/bin/env sh

#
# Copyright 2015 the original author or authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Attempt to set APP_HOME
# Resolve links: $0 may be a link
PRG="$0"
# Need this for relative symlinks.
while [ -h "$PRG" ] ; do
    ls=`ls -ld "$PRG"`
    link=`expr "$ls" : '.*-> \(.*\)$'`
    if expr "$link" : '/.*' > /dev/null; then
        PRG="$link"
    else
        PRG=`dirname "$PRG"`"/$link"
    fi
done
SAVED="`pwd`"
cd "`dirname \"$PRG\"`/" >/dev/null
APP_HOME="`pwd -P`"
cd "$SAVED" >/dev/null

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD="maximum"

warn () {
    echo "$*"
}

die () {
    echo
    echo "$*"
    echo
    exit 1
}

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "`uname`" in
  CYGWIN* )
    cygwin=true
    ;;
  Darwin* )
    darwin=true
    ;;
  MINGW* )
    msys=true
    ;;
  NONSTOP* )
    nonstop=true
    ;;
esac

CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar


# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD="$JAVA_HOME/jre/sh/java"
    else
        JAVACMD="$JAVA_HOME/bin/java"
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD="java"
    which java >/dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
fi

# Increase the maximum file descriptors if we can.
if [ "$cygwin" = "false" -a "$darwin" = "false" -a "$nonstop" = "false" ] ; then
    MAX_FD_LIMIT=`ulimit -H -n`
    if [ $? -eq 0 ] ; then
        if [ "$MAX_FD" = "maximum" -o "$MAX_FD" = "max" ] ; then
            MAX_FD="$MAX_FD_LIMIT"
        fi
        ulimit -n $MAX_FD
        if [ $? -ne 0 ] ; then
            warn "Could not set maximum file descriptor limit: $MAX_FD"
        fi
    else
        warn "Could not query maximum file descriptor limit: $MAX_FD_LIMIT"
    fi
fi

# For Darwin, add options to specify how the application appears in the dock
if $darwin; then
    GRADLE_OPTS="$GRADLE_OPTS \"-Xdock:name=$APP_NAME\" \"-Xdock:icon=$APP_HOME/media/gradle.icns\""
fi

# For Cygwin or MSYS, switch paths to Windows format before running java
if [ "$cygwin" = "true" -o "$msys" = "true" ] ; then
    APP_HOME=`cygpath --path --mixed "$APP_HOME"`
    CLASSPATH=`cygpath --path --mixed "$CLASSPATH"`

    JAVACMD=`cygpath --unix "$JAVACMD"`

    # We build the pattern for arguments to be converted via cygpath
    ROOTDIRSRAW=`find -L / -maxdepth 1 -mindepth 1 -type d 2>/dev/null`
    SEP=""
    for dir in $ROOTDIRSRAW ; do
        ROOTDIRS="$ROOTDIRS$SEP$dir"
        SEP="|"
    done
    OURCYGPATTERN="(^($ROOTDIRS))"
    # Add a user-defined pattern to the cygpath arguments
    if [ "$GRADLE_CYGPATTERN" != "" ] ; then
        OURCYGPATTERN="$OURCYGPATTERN|($GRADLE_CYGPATTERN)"
    fi
    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    i=0
    for arg in "$@" ; do
        CHECK=`echo "$arg"|egrep -c "$OURCYGPATTERN" -`
        CHECK2=`echo "$arg"|egrep -c "^-"`                                 ### Determine if an option

        if [ $CHECK -ne 0 ] && [ $CHECK2 -eq 0 ] ; then                    ### Added a condition
            eval `echo args$i`=`cygpath --path --ignore --mixed "$arg"`
        else
            eval `echo args$i`="\"$arg\""
        fi
        i=`expr $i + 1`
    done
    case $i in
        0) set -- ;;
        1) set -- "$args0" ;;
        2) set -- "$args0" "$args1" ;;
        3) set -- "$args0" "$args1" "$args2" ;;
        4) set -- "$args0" "$args1" "$args2" "$args3" ;;
        5) set -- "$args0" "$args1" "$args2" "$args3" "$args4" ;;
        6) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" ;;
        7) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" "$args6" ;;
        8) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" "$args6" "$args7" ;;
        9) set -- "$args0" "$args1" "$args2" "$args3" "$args4" "$args5" "$args6" "$args7" "$args8" ;;
    esac
fi

# Escape application args
save () {
    for i do printf %s\\n "$i" | sed "s/'/'\\\\''/g;1s/^/'/;\$s/\$/' \\\\/" ; done
    echo " "
}
APP_ARGS=`save "$@"`

# Collect all arguments for the java command, following the shell quoting and substitution rules
eval set -- $DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS "\"-Dorg.gradle.appname=$APP_BASE_NAME\"" -classpath "\"$CLASSPATH\"" org.gradle.wrapper.GradleWrapperMain "$APP_ARGS"

exec "$JAVACMD" "$@"



================================================
FILE: gradlew.bat
================================================
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar


@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%GRADLE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega



================================================
FILE: settings.gradle.kts
================================================
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RailEase"
include(":app")



================================================
FILE: app/build.gradle.kts
================================================
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.anupa.railease"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.anupa.railease"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.coil)
    implementation(libs.coil.kt.coil.gif)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}


================================================
FILE: app/proguard-rules.pro
================================================
# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile


================================================
FILE: app/.gitignore
================================================
/build


================================================
FILE: app/src/androidTest/java/com/anupa/railease/ExampleInstrumentedTest.kt
================================================
package com.anupa.railease

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.anupa.railease", appContext.packageName)
    }
}


================================================
FILE: app/src/main/AndroidManifest.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.RailEase">
        <activity
            android:name=".UpdateProfile"
            android:exported="false" />
        <activity
            android:name=".MyProfile"
            android:exported="false" />
        <activity
            android:name=".MyETickets"
            android:exported="false" />
        <activity
            android:name=".ETicketPrint"
            android:exported="false" />
        <activity
            android:name=".PaymentApproved"
            android:exported="false" />
        <activity
            android:name=".PaymentProcess"
            android:exported="false" />
        <activity
            android:name=".BookingPage"
            android:exported="false" />
        <activity
            android:name=".SearchResult"
            android:exported="false" />
        <activity
            android:name=".SearchScreen"
            android:exported="false" />
        <activity
            android:name=".HomePage"
            android:exported="false" />
        <activity
            android:name=".LoginPage"
            android:exported="false" />
        <activity
            android:name=".RegisterPage"
            android:exported="false" />
        <activity
            android:name=".OnboardingScreenThree"
            android:exported="false" />
        <activity
            android:name=".OnboardingScreenTwo"
            android:exported="false" />
        <activity
            android:name=".OnboardingScreenOne"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>


================================================
FILE: app/src/main/java/com/anupa/railease/BookingPage.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BookingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.booking_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            startActivity(Intent(this, SearchResult::class.java))
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

//        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
//        bookingPage.setOnClickListener {
//            startActivity(Intent(this, BookingPage::class.java))
//        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val placeOrder = findViewById<Button>(R.id.placeOrder)
        placeOrder.setOnClickListener {
            startActivity(Intent(this, PaymentProcess::class.java))
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/ETicketPrint.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ETicketPrint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.eticket_print)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val doneButton = findViewById<Button>(R.id.doneButton)
        doneButton.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/HomePage.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val homePage = findViewById<ImageView>(R.id.homePage)
//        homePage.setOnClickListener {
//            startActivity(Intent(this, HomePage::class.java))
//        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val searchBox = findViewById<LinearLayout>(R.id.searchBox)
        searchBox.setOnClickListener {
            val intent = Intent(this, SearchScreen::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/LoginPage.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class LoginPage : AppCompatActivity() {

    private lateinit var emailEt: EditText
    private lateinit var passwordEt: EditText
    private lateinit var loginBtn: Button
    private lateinit var linkText: TextView

    // Debounce multiple taps (optional but nice)
    private var lastClickTime = 0L
    private val clickDebounceMs = 600L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        emailEt = findViewById(R.id.email)
        passwordEt = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login)
        linkText = findViewById(R.id.linkText)

        // Start disabled until both fields valid
        loginBtn.isEnabled = false
        loginBtn.alpha = 0.6f

        // Recalculate on every change
        val watcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) { updateButtonState() }
        }
        emailEt.addTextChangedListener(watcher)
        passwordEt.addTextChangedListener(watcher)

        // IME action on password triggers attempt only if valid
        passwordEt.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                attemptLogin()
                true
            } else false
        }

        loginBtn.setOnClickListener {
            val now = System.currentTimeMillis()
            if (now - lastClickTime < clickDebounceMs) return@setOnClickListener
            lastClickTime = now
            attemptLogin()
        }

        linkText.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_up,
                R.anim.slide_out_down
            )
        }
    }

    private fun updateButtonState() {
        val email = emailEt.text?.toString()?.trim().orEmpty()
        val pass = passwordEt.text?.toString().orEmpty()

        val emailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val passEntered = pass.isNotEmpty()

        loginBtn.isEnabled = emailValid && passEntered
        loginBtn.alpha = if (loginBtn.isEnabled) 1f else 0.6f
    }

    private fun attemptLogin() {
        // Guard: only continue if button is enabled (both valid)
        if (!loginBtn.isEnabled) return

        // Proceed to next screen (replace with real auth call when ready)
        val intent = Intent(this, HomePage::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down)
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/MyETickets.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyETickets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.my_etickets)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

//        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
//        ticketsPage.setOnClickListener {
//            startActivity(Intent(this, MyETickets::class.java))
//        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/MyProfile.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.my_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val updateProfile = findViewById<Button>(R.id.updateProfile)
        updateProfile.setOnClickListener {
            startActivity(Intent(this, UpdateProfile::class.java))
        }

        val logoutBtn = findViewById<Button>(R.id.logoutBtn)
        logoutBtn.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/OnboardingScreenOne.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class OnboardingScreenOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding_screen_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val next = findViewById<ImageView>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(this, OnboardingScreenTwo::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/OnboardingScreenThree.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class OnboardingScreenThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding_screen_three)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val previous = findViewById<ImageView>(R.id.previous)
        previous.setOnClickListener {
            val intent = Intent(this, OnboardingScreenTwo::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        }

        val getStarted = findViewById<Button>(R.id.getStarted)
        getStarted.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_up,
                R.anim.slide_out_down
            )
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/OnboardingScreenTwo.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class OnboardingScreenTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding_screen_two)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val next = findViewById<ImageView>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(this, OnboardingScreenThree::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }

        val previous = findViewById<ImageView>(R.id.previous)
        previous.setOnClickListener {
            val intent = Intent(this, OnboardingScreenOne::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/PaymentApproved.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentApproved : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.payment_approved)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val viewETicket = findViewById<Button>(R.id.viewETicket)
        viewETicket.setOnClickListener {
            startActivity(Intent(this, ETicketPrint::class.java))
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/PaymentProcess.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.graphics.ImageDecoder
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.load

class PaymentProcess : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private var navigateRunnable: Runnable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.payment_process)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ---- Play the loading animation (GIF or XML) ----
        val loader = findViewById<ImageView>(R.id.imageView2)
        startLoader(loader, R.drawable.loading_anim)

        // ---- Top/back ----
        findViewById<ImageView>(R.id.ivBack).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, BookingPage::class.java))
            finish()
        }

        // ---- Bottom nav (no custom animations) ----
        findViewById<ImageView>(R.id.homePage).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }
        // bookingPage is this screen; keep disabled or no-op

        findViewById<ImageView>(R.id.ticketsPage).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, MyETickets::class.java))
            finish()
        }
        findViewById<ImageView>(R.id.profilePage).setOnClickListener {
            cancelAutoNavigate()
            startActivity(Intent(this, MyProfile::class.java))
            finish()
        }

        // ---- Auto-redirect after 1500 ms ----
        navigateRunnable = Runnable {
            startActivity(Intent(this, PaymentApproved::class.java))
            finish()
        }
        handler.postDelayed(navigateRunnable!!, 1500)
    }

    private fun startLoader(iv: ImageView, resId: Int) {
        // 1) Try ImageDecoder (real GIFs on API 28+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            try {
                val src = ImageDecoder.createSource(resources, resId)
                val d = ImageDecoder.decodeDrawable(src)
                iv.setImageDrawable(d)
                when (d) {
                    is android.graphics.drawable.AnimatedImageDrawable -> d.start()
                    is Animatable -> d.start()             // animated-vector
                }
                return
            } catch (_: Throwable) {
                // fall through to next strategies
            }
        }

        // 2) If it's an XML animation-list / animated-vector in drawable
        iv.setImageResource(resId)
        (iv.drawable as? Animatable)?.start()
        (iv.drawable as? AnimationDrawable)?.start()
        // If it started, we're done
        if ((iv.drawable as? Animatable)?.isRunning == true) return
        if ((iv.drawable as? AnimationDrawable)?.isRunning == true) return

        // 3) Final fallback: Coil with GIF support (coil-gif)
        //    Make sure you added:
        //    implementation "io.coil-kt:coil:2.6.0"
        //    implementation "io.coil-kt:coil-gif:2.6.0"
        iv.load(resId) {
            allowHardware(false) // safer for animated content
            crossfade(true)
        }
    }

    private fun cancelAutoNavigate() {
        navigateRunnable?.let { handler.removeCallbacks(it) }
        navigateRunnable = null
    }

    override fun onDestroy() {
        cancelAutoNavigate()
        super.onDestroy()
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/RegisterPage.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class RegisterPage : AppCompatActivity() {

    private lateinit var fullName: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var confirmPwd: EditText
    private lateinit var register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Grab views
        register   = findViewById(R.id.register)
        fullName   = findViewById(R.id.fullName)
        email      = findViewById(R.id.email)
        password   = findViewById(R.id.password)
        confirmPwd = findViewById(R.id.confirmpwd)

        // Start disabled (also in XML) + visual cue
        setRegisterEnabled(false)

        // Attach listeners for realtime validation
        val watcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                validateAndUpdateUI()
            }
        }
        fullName.addTextChangedListener(watcher)
        email.addTextChangedListener(watcher)
        password.addTextChangedListener(watcher)
        confirmPwd.addTextChangedListener(watcher)

        // Navigate only if valid (button remains disabled otherwise)
        register.setOnClickListener {
            // Final guard — shouldn’t trigger if disabled, but safe:
            if (validateAndUpdateUI()) {
                val intent = Intent(this, LoginPage::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
        }

        val linkText = findViewById<TextView>(R.id.linkText)
        linkText.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down)
        }
    }

    /** Central validator: sets field errors and enables/disables button. Returns overall validity. */
    private fun validateAndUpdateUI(): Boolean {
        val nameStr  = fullName.text?.toString()?.trim().orEmpty()
        val emailStr = email.text?.toString()?.trim().orEmpty()
        val pwdStr   = password.text?.toString().orEmpty()
        val cpStr    = confirmPwd.text?.toString().orEmpty()

        // Validate each field
        val nameValid  = isNameValid(nameStr)
        val emailValid = isEmailValid(emailStr)
        val pwdValid   = isPasswordStrong(pwdStr)
        val matchValid = cpStr.isNotEmpty() && pwdStr == cpStr

        // Set/clear errors (only show after user has typed something)
        fullName.error   = when {
            nameStr.isEmpty() -> null
            nameValid -> null
            else -> "Enter your full name (min 2 words)"
        }

        email.error      = when {
            emailStr.isEmpty() -> null
            emailValid -> null
            else -> "Enter a valid email address"
        }

        password.error   = when {
            pwdStr.isEmpty() -> null
            pwdValid -> null
            else -> "Min 8 chars, 1 upper, 1 lower, 1 number, 1 symbol"
        }

        confirmPwd.error = when {
            cpStr.isEmpty() -> null
            matchValid -> null
            else -> "Passwords do not match"
        }

        val allValid = nameValid && emailValid && pwdValid && matchValid
        setRegisterEnabled(allValid)
        return allValid
    }

    private fun setRegisterEnabled(enabled: Boolean) {
        register.isEnabled = enabled
        // Optional visual hint when disabled
        register.alpha = if (enabled) 1f else 0.5f
    }

    private fun isNameValid(name: String): Boolean {
        // At least two words with letters; tweak as you like
        val parts = name.split("\\s+".toRegex()).filter { it.isNotBlank() }
        return parts.size >= 2 && parts.all { it.length >= 2 }
    }

    private fun isEmailValid(email: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()

    private fun isPasswordStrong(pw: String): Boolean {
        if (pw.length < 8) return false
        val hasUpper = pw.any { it.isUpperCase() }
        val hasLower = pw.any { it.isLowerCase() }
        val hasDigit = pw.any { it.isDigit() }
        val hasSymbol = pw.any { !it.isLetterOrDigit() }
        return hasUpper && hasLower && hasDigit && hasSymbol
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/SearchResult.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.search_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bookBtn1 = findViewById<Button>(R.id.bookBtn1)
        bookBtn1.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val bookBtn2 = findViewById<Button>(R.id.bookBtn2)
        bookBtn2.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val bookBtn3 = findViewById<Button>(R.id.bookBtn3)
        bookBtn3.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        val searchBox = findViewById<LinearLayout>(R.id.searchBox)
        searchBox.setOnClickListener {
            val intent = Intent(this, SearchScreen::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slide_in_right,
                R.anim.slide_out_left
            )
        }
    }
}


================================================
FILE: app/src/main/java/com/anupa/railease/SearchScreen.kt
================================================
package com.anupa.railease

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doAfterTextChanged
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@Suppress("DEPRECATION")
class SearchScreen : AppCompatActivity() {

    private lateinit var departure: AutoCompleteTextView
    private lateinit var destination: AutoCompleteTextView
    private lateinit var travelDate: EditText
    private lateinit var numOfTickets: EditText
    private lateinit var trainClass: AutoCompleteTextView
    private lateinit var submitBtn: Button
    private lateinit var backBtn: ImageView

    private val dateFormat by lazy { SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.search_screen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homePage = findViewById<ImageView>(R.id.homePage)
        homePage.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }

        val bookingPage = findViewById<ImageView>(R.id.bookingPage)
        bookingPage.setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }

        val ticketsPage = findViewById<ImageView>(R.id.ticketsPage)
        ticketsPage.setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }

        val profilePage = findViewById<ImageView>(R.id.profilePage)
        profilePage.setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        bindViews()
        setupBackAction()
        setupDropdowns()
        setupDatePicker()
        setupLiveErrorClearing()
        setupSubmit()
    }

    private fun bindViews() {
        departure = findViewById(R.id.departure)
        destination = findViewById(R.id.destination)
        travelDate = findViewById(R.id.travelDate)
        numOfTickets = findViewById(R.id.numOfTickets)
        trainClass = findViewById(R.id.trainClass)
        submitBtn = findViewById(R.id.searchBtn)
        backBtn = findViewById(R.id.ivBack)
    }

    private fun setupBackAction() {
        backBtn.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun setupDropdowns() {
        val stations = resources.getStringArray(R.array.stations)
        val classes = resources.getStringArray(R.array.train_classes)

        val stationAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stations)
        departure.setAdapter(stationAdapter)
        destination.setAdapter(stationAdapter)

        val classAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, classes)
        trainClass.setAdapter(classAdapter)

        fun AutoCompleteTextView.wireDropdown() {
            setOnFocusChangeListener { _, hasFocus -> if (hasFocus) showDropDown() }
            setOnClickListener { showDropDown() }
        }
        departure.wireDropdown()
        destination.wireDropdown()
        trainClass.wireDropdown()
    }

    private fun setupDatePicker() {
        travelDate.setOnClickListener {
            val cal = Calendar.getInstance()
            val dpd = DatePickerDialog(
                this,
                { _, y, m, d ->
                    cal.set(Calendar.YEAR, y)
                    cal.set(Calendar.MONTH, m)
                    cal.set(Calendar.DAY_OF_MONTH, d)
                    cal.set(Calendar.HOUR_OF_DAY, 0)
                    cal.set(Calendar.MINUTE, 0)
                    cal.set(Calendar.SECOND, 0)
                    cal.set(Calendar.MILLISECOND, 0)
                    travelDate.setText(dateFormat.format(cal.time))
                    travelDate.error = null
                },
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            )
            dpd.datePicker.minDate = System.currentTimeMillis() // today onwards
            dpd.show()
        }
    }

    private fun setupLiveErrorClearing() {
        departure.doAfterTextChanged { departure.error = null }
        destination.doAfterTextChanged { destination.error = null }
        travelDate.doAfterTextChanged { travelDate.error = null }
        numOfTickets.doAfterTextChanged { numOfTickets.error = null }
        trainClass.doAfterTextChanged { trainClass.error = null }
    }

    private fun setupSubmit() {
        submitBtn.setOnClickListener {
            if (validateForm()) {
                // Optional: pass the search parameters to the next screen
                val intent = Intent(this, SearchResult::class.java).apply {
                    putExtra("departure", departure.text.toString().trim())
                    putExtra("destination", destination.text.toString().trim())
                    putExtra("travelDate", travelDate.text.toString().trim())
                    putExtra("numOfTickets", numOfTickets.text.toString().trim())
                    putExtra("trainClass", trainClass.text.toString().trim())
                }
                startActivity(intent)
                // Use your slide animation like in your example
                overridePendingTransition(
                    R.anim.slide_in_left,
                    R.anim.slide_out_right
                )
                // If you want to prevent coming back to this screen, uncomment:
                // finish()
            } else {
                Toast.makeText(this, "Please fix the errors above", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateForm(): Boolean {
        var ok = true

        val stationsSet = resources.getStringArray(R.array.stations)
            .map { it.trim().lowercase(Locale.getDefault()) }.toSet()
        val classesSet = resources.getStringArray(R.array.train_classes)
            .map { it.trim().lowercase(Locale.getDefault()) }.toSet()

        val dep = departure.text?.toString()?.trim().orEmpty()
        val des = destination.text?.toString()?.trim().orEmpty()
        val dateStr = travelDate.text?.toString()?.trim().orEmpty()
        val ticketsStr = numOfTickets.text?.toString()?.trim().orEmpty()
        val cls = trainClass.text?.toString()?.trim().orEmpty()

        // Departure
        if (dep.isEmpty()) {
            departure.error = "Choose a departure station"
            ok = false
        } else if (!stationsSet.contains(dep.lowercase(Locale.getDefault()))) {
            departure.error = "Select a station from the list"
            ok = false
        } else {
            departure.error = null
        }

        // Destination
        if (des.isEmpty()) {
            destination.error = "Choose a destination station"
            ok = false
        } else if (!stationsSet.contains(des.lowercase(Locale.getDefault()))) {
            destination.error = "Select a station from the list"
            ok = false
        } else {
            destination.error = null
        }

        // Same station check
        if (dep.isNotEmpty() && des.isNotEmpty() && dep.equals(des, ignoreCase = true)) {
            destination.error = "Departure and destination cannot be the same"
            ok = false
        }

        // Date
        if (dateStr.isEmpty()) {
            travelDate.error = "Select a travel date"
            ok = false
        } else {
            try {
                val chosen = dateFormat.parse(dateStr)!!
                val today = dateFormat.parse(dateFormat.format(Date()))!!
                if (chosen.before(today)) {
                    travelDate.error = "Date cannot be in the past"
                    ok = false
                } else {
                    travelDate.error = null
                }
            } catch (_: Exception) {
                travelDate.error = "Invalid date"
                ok = false
            }
        }

        // Tickets (1..6)
        val minT = 1
        val maxT = 6
        if (ticketsStr.isEmpty()) {
            numOfTickets.error = "Enter number of passengers"
            ok = false
        } else {
            val n = ticketsStr.toIntOrNull()
            if (n == null) {
                numOfTickets.error = "Enter a valid number"
                ok = false
            } else if (n < minT || n > maxT) {
                numOfTickets.error = "Passengers must be $minT to $maxT"
                ok = false
            } else {
                numOfTickets.error = null
            }
        }

        // Class
        if (cls.isEmpty()) {
            trainClass.error = "Select a class"
            ok = false
        } else if (!classesSet.contains(cls.lowercase(Locale.getDefault()))) {
            trainClass.error = "Select a class from the list"
            ok = false
        } else {
            trainClass.error = null
        }

        return ok
    }
}



================================================
FILE: app/src/main/java/com/anupa/railease/UpdateProfile.kt
================================================
package com.anupa.railease

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UpdateProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.update_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- Views ---
        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etOld = findViewById<EditText>(R.id.etOldPassword)
        val etNew = findViewById<EditText>(R.id.etNewPassword)
        val etConf = findViewById<EditText>(R.id.etConfirmPassword)
        val updateProfile = findViewById<Button>(R.id.updateProfile)

        // Clear error while typing
        listOf(etName, etEmail, etOld, etNew, etConf).forEach { it.clearErrorOnType() }

        // --- Nav buttons (unchanged) ---
        findViewById<ImageView>(R.id.ivBack).setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
        findViewById<ImageView>(R.id.homePage).setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
        }
        findViewById<ImageView>(R.id.bookingPage).setOnClickListener {
            startActivity(Intent(this, BookingPage::class.java))
        }
        findViewById<ImageView>(R.id.ticketsPage).setOnClickListener {
            startActivity(Intent(this, MyETickets::class.java))
        }
        findViewById<ImageView>(R.id.profilePage).setOnClickListener {
            startActivity(Intent(this, MyProfile::class.java))
        }

        // --- Validate then submit ---
        updateProfile.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val oldPw = etOld.text.toString()
            val newPw = etNew.text.toString()
            val confPw = etConf.text.toString()

            // Name required
            if (name.isEmpty()) {
                etName.error = "Name is required"
                etName.requestFocus()
                return@setOnClickListener
            }

            // Email format
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "Enter a valid email"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            // Old password required
            if (oldPw.isEmpty()) {
                etOld.error = "Old password is required"
                etOld.requestFocus()
                return@setOnClickListener
            }

            // New password rules
            validatePassword(newPw)?.let { reason ->
                etNew.error = reason
                etNew.requestFocus()
                return@setOnClickListener
            }

            // New must differ from old
            if (newPw == oldPw) {
                etNew.error = "New password must be different from old password"
                etNew.requestFocus()
                return@setOnClickListener
            }

            // Confirm match
            if (newPw != confPw) {
                etConf.error = "Passwords do not match"
                etConf.requestFocus()
                return@setOnClickListener
            }

            // All good – proceed
            Toast.makeText(this, "Profile updated", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MyProfile::class.java))
        }
    }

    /** Returns an error string if invalid, else null. */
    private fun validatePassword(pw: String): String? {
        if (pw.length < 8) return "At least 8 characters"
        if (!pw.any { it.isUpperCase() }) return "Must include an uppercase letter"
        if (!pw.any { it.isLowerCase() }) return "Must include a lowercase letter"
        if (!pw.any { it.isDigit() }) return "Must include a digit"
        val special = Regex("[^A-Za-z0-9]")
        if (!special.containsMatchIn(pw)) return "Must include a special character"
        return null
    }

    /** Clear setError as the user types */
    private fun EditText.clearErrorOnType() {
        this.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (error != null) error = null
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }
}


================================================
FILE: app/src/main/res/anim/slide_in_left.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="300"
    android:fromXDelta="-100%"
    android:toXDelta="0%"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"/>


================================================
FILE: app/src/main/res/anim/slide_in_right.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="300"
    android:fromXDelta="100%"
    android:toXDelta="0%"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"/>


================================================
FILE: app/src/main/res/anim/slide_in_up.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="300"
    android:fromYDelta="100%"
    android:toYDelta="0%"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"/>


================================================
FILE: app/src/main/res/anim/slide_out_down.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="300"
    android:fromYDelta="0%"
    android:toYDelta="100%"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"/>


================================================
FILE: app/src/main/res/anim/slide_out_left.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="300"
    android:fromXDelta="0%"
    android:toXDelta="-100%"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"/>


================================================
FILE: app/src/main/res/anim/slide_out_right.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="300"
    android:fromXDelta="0%"
    android:toXDelta="100%"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"/>


================================================
FILE: app/src/main/res/color/btn_bg_tint.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <!-- Disabled: faded background -->
    <item android:state_enabled="false" android:color="#4D4D4D" />
    <!-- Enabled: normal background -->
    <item android:color="@color/secondary" />
</selector>


================================================
FILE: app/src/main/res/color/btn_text_color.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <!-- Same text color whether enabled or disabled -->
    <item android:state_enabled="false" android:color="#ffffff" />
    <item android:color="#ffffff" />
</selector>


================================================
FILE: app/src/main/res/drawable/card_bg.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!-- Background color -->
    <solid android:color="@color/search_bg" />

    <!-- Corner radius -->
    <corners android:radius="8dp" />
</shape>


================================================
FILE: app/src/main/res/drawable/horizontal_line.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!-- line color -->
    <solid android:color="@color/input" />
    <!-- line height (thickness) -->
    <size android:height="1dp" />
</shape>


================================================
FILE: app/src/main/res/drawable/ic_launcher.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:inset="24dp"
    android:drawable="@drawable/ic_launcher_image"/>


================================================
FILE: app/src/main/res/drawable/ic_launcher_round.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:inset="12dp"
    android:drawable="@drawable/ic_launcher_image"/>


================================================
FILE: app/src/main/res/drawable/ripple_round.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="?attr/colorControlHighlight">

    <item android:id="@android:id/mask">
        <shape android:shape="oval">
            <solid android:color="@android:color/white" />
        </shape>
    </item>
</ripple>


================================================
FILE: app/src/main/res/drawable/ripple_rounded_rect.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="?attr/colorControlHighlight">

    <!-- Ripple mask with same rounded corners -->
    <item android:id="@android:id/mask">
        <shape android:shape="rectangle">
            <solid android:color="@android:color/white" />
            <corners android:radius="12dp" />
        </shape>
    </item>
</ripple>


================================================
FILE: app/src/main/res/drawable/rounded_edittext.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!-- Background color -->
    <solid android:color="@color/primary" />

    <!-- Corner radius -->
    <corners android:radius="8dp" />

    <!-- Optional border -->
    <stroke
        android:width="1dp"
        android:color="@color/input" />

    <!-- Optional inner padding -->
    <padding
        android:left="16dp"
        android:top="12dp"
        android:right="16dp"
        android:bottom="12dp" />
</shape>



================================================
FILE: app/src/main/res/drawable/search_bg.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!-- Background color -->
    <solid android:color="@color/search_bg" />

    <!-- Corner radius -->
    <corners android:radius="8dp" />

    <!-- Optional inner padding -->
    <padding
        android:left="16dp"
        android:top="12dp"
        android:right="16dp"
        android:bottom="12dp" />
</shape>


================================================
FILE: app/src/main/res/layout/booking_page.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".BookingPage">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Booking"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/topBar" />

    <!-- Scrollable content; fills between top divider and bottom bar -->
    <androidx.core.widget.NestedScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/dividerTop">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <!-- Row: DEPARTURE -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp"
                android:paddingBottom="20dp">

                <TextView
                    android:id="@+id/tvLabelDeparture"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="DEPARTURE"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/tvDepartureValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Pettah"
                    android:textSize="18sp" />

                <ImageView
                    android:id="@+id/ivDepartureArrow"
                    android:layout_width="0dp"
                    android:layout_height="24dp"
                    android:layout_weight="0.25"
                    app:srcCompat="@drawable/right_light_arrow" />

            </LinearLayout>

            <View
                android:id="@+id/bottomBarDivider2"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="@drawable/horizontal_line"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

            <!-- Row: DESTINATION -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp"
                android:paddingBottom="20dp">

                <TextView
                    android:id="@+id/tvLabelDestination"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="DESTINATION"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/tvDestinationValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Kandy"
                    android:textSize="18sp" />

                <ImageView
                    android:id="@+id/ivDestinationArrow"
                    android:layout_width="0dp"
                    android:layout_height="24dp"
                    android:layout_weight="0.25"
                    app:srcCompat="@drawable/right_light_arrow" />

            </LinearLayout>

            <View
                android:id="@+id/bottomBarDivider3"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="@drawable/horizontal_line"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

            <!-- Row: PAYMENT -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp"
                android:paddingBottom="20dp">

                <TextView
                    android:id="@+id/tvLabelPayment"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="PAYMENT"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/tvPaymentValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Visa *2990"
                    android:textSize="18sp" />

                <ImageView
                    android:id="@+id/ivPaymentArrow"
                    android:layout_width="0dp"
                    android:layout_height="24dp"
                    android:layout_weight="0.25"
                    app:srcCompat="@drawable/right_light_arrow" />

            </LinearLayout>

            <View
                android:id="@+id/bottomBarDivider4"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="@drawable/horizontal_line"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

            <!-- Row: Travel Date -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp"
                android:paddingBottom="20dp">

                <TextView
                    android:id="@+id/tvLabelTravelDate"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="Travel Date"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/tvTravelDateValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="September 12"
                    android:textSize="18sp" />

                <ImageView
                    android:id="@+id/ivTravelDateArrow"
                    android:layout_width="0dp"
                    android:layout_height="24dp"
                    android:layout_weight="0.25"
                    app:srcCompat="@drawable/right_light_arrow" />

            </LinearLayout>

            <View
                android:id="@+id/bottomBarDivider5"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="@drawable/horizontal_line"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

            <!-- Header Row -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp">

                <TextView
                    android:id="@+id/tvHeaderClass"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="CLASS"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/tvHeaderDescription"
                    android:layout_width="172dp"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="DESCRIPTION"
                    android:textSize="14sp" />

                <TextView
                    android:id="@+id/tvHeaderPrice"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:fontFamily="sans-serif-medium"
                    android:text="PRICE"
                    android:textSize="14sp" />

            </LinearLayout>

            <!-- Row: class item -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp"
                android:paddingBottom="20dp">

                <TextView
                    android:id="@+id/tvClass"
                    android:layout_width="120dp"
                    android:layout_height="wrap_content"
                    android:text="1st Class"
                    android:textSize="18sp" />

                <TextView
                    android:id="@+id/tvClassDescription"
                    android:layout_width="172dp"
                    android:layout_height="wrap_content"
                    android:text="2 Tickets\n12:30 pm - 4:10 pm"
                    android:textSize="18sp" />

                <TextView
                    android:id="@+id/tvClassPrice"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Rs.670.00"
                    android:textSize="18sp" />
            </LinearLayout>

            <View
                android:id="@+id/bottomBarDivider6"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="@drawable/horizontal_line"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

            <!-- Subtotal Row -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="128dp"
                android:gravity="bottom"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="20dp"
                android:paddingRight="16dp">

                <TextView
                    android:id="@+id/tvSubtotalLabel"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Subtotal (2)"
                    android:textSize="18sp" />

                <TextView
                    android:id="@+id/tvSubtotalValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Rs.1340.00"
                    android:textAlignment="viewEnd"
                    android:textSize="18sp" />

            </LinearLayout>

            <!-- Taxes Row -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="bottom"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="12dp"
                android:paddingRight="16dp">

                <TextView
                    android:id="@+id/tvTaxesLabel"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Taxes"
                    android:textSize="18sp" />

                <TextView
                    android:id="@+id/tvTaxesValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:text="Rs.45.00"
                    android:textAlignment="viewEnd"
                    android:textSize="18sp" />

            </LinearLayout>

            <!-- Total Row -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="bottom"
                android:orientation="horizontal"
                android:paddingLeft="16dp"
                android:paddingTop="12dp"
                android:paddingRight="16dp"
                android:paddingBottom="32dp">

                <TextView
                    android:id="@+id/tvTotalLabel"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:fontFamily="sans-serif-medium"
                    android:text="Total"
                    android:textSize="18sp" />

                <TextView
                    android:id="@+id/tvTotalValue"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="2"
                    android:fontFamily="sans-serif-medium"
                    android:text="Rs.1385.00"
                    android:textAlignment="viewEnd"
                    android:textSize="18sp" />

            </LinearLayout>

            <View
                android:id="@+id/bottomBarDivider7"
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="@drawable/horizontal_line"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent" />

            <Button
                android:id="@+id/placeOrder"
                android:layout_width="match_parent"
                android:layout_height="64dp"
                android:layout_marginLeft="16dp"
                android:layout_marginTop="24dp"
                android:layout_marginRight="16dp"
                android:backgroundTint="@color/secondary"
                android:text="Place Order"
                android:textSize="16sp"
                app:cornerRadius="12dp"
                tools:ignore="HardcodedText,VisualLintButtonSize" />
        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom bar divider (kept as a view for your drawable) -->
    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <ImageView
            android:id="@+id/homePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/home_empty" />

        <ImageView
            android:id="@+id/bookingPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/cart_selected" />

        <ImageView
            android:id="@+id/ticketsPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/tickets_empty" />

        <ImageView
            android:id="@+id/profilePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>



================================================
FILE: app/src/main/res/layout/eticket_print.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".ETicketPrint">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="visible"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="E-Ticket"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/topBar" />


    <!-- Bottom bar divider (kept as a view for your drawable) -->

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="220dp"
        android:layout_height="220dp"
        app:layout_constraintBottom_toTopOf="@id/bottomBar"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintVertical_bias="0.385"
        app:srcCompat="@drawable/qr_code" />

    <TextView
            android:id="@+id/textView14"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="102dp"
            android:layout_marginTop="240dp"
            android:fontFamily="sans-serif-medium"
            android:text="@string/app_name"
            android:textSize="16sp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/textView15"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="240dp"
            android:layout_marginEnd="104dp"
            android:fontFamily="sans-serif-medium"
            android:text="Ticket No. 939"
            android:textSize="16sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView13"
        android:layout_width="210dp"
        android:layout_height="38dp"
        android:layout_marginStart="32dp"
        android:layout_marginEnd="32dp"
        android:text="This is your e-ticket. Please keep it safe for your reference."
        android:textAlignment="center"
        android:textColor="#7A7A7A"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/imageView3" />

    <Button
        android:id="@+id/doneButton"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:layout_marginStart="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="20dp"
        android:backgroundTint="@color/secondary"
        android:text="Done"
        android:textSize="16sp"
        app:cornerRadius="12dp"
        app:layout_constraintBottom_toTopOf="@+id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="HardcodedText,VisualLintButtonSize" />

    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <ImageView
                android:id="@+id/homePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/home_empty" />

        <ImageView
                android:id="@+id/bookingPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/cart_empty" />

        <ImageView
                android:id="@+id/ticketsPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/tickets_selected" />

        <ImageView
                android:id="@+id/profilePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/home_page.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".HomePage">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="@string/app_name"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- Scrollable content; fills between top divider and bottom bar -->
    <androidx.core.widget.NestedScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintTop_toBottomOf="@id/dividerTop"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingLeft="16dp"
            android:paddingRight="16dp">

            <!-- Hero -->
            <ImageView
                android:id="@+id/heroImage"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:contentDescription="@string/app_name"
                app:srcCompat="@drawable/banner_image" />

            <!-- Section title -->
            <TextView
                android:id="@+id/tvSearchTitle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:layout_marginBottom="16dp"
                android:text="Search to start your journey"
                android:textColor="@color/secondary"
                android:textSize="22sp"
                android:textStyle="bold" />

            <!-- Search box (static mock) -->
            <LinearLayout
                android:id="@+id/searchBox"
                android:layout_width="match_parent"
                android:layout_height="68dp"
                android:orientation="horizontal"
                android:gravity="center_vertical"
                android:paddingStart="12dp"
                android:paddingEnd="12dp"
                android:background="@drawable/search_bg">

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    app:srcCompat="@drawable/search_icon" />

                <TextView
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="12dp"
                    android:layout_weight="1"
                    android:text="Search for a trip..."
                    android:textColor="@color/inputText"
                    android:textSize="16sp" />

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    app:srcCompat="@drawable/pencil_icon" />
            </LinearLayout>

            <!-- Latest Tickets -->
            <TextView
                android:id="@+id/tvLatest"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:layout_marginBottom="16dp"
                android:text="Latest Tickets"
                android:textColor="@color/secondary"
                android:textSize="22sp"
                android:textStyle="bold" />

            <!-- Ticket card 1 -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <!-- Ticket card 2 -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <!-- Ticket card 3 -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom bar divider (kept as a view for your drawable) -->
    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
            android:id="@+id/homePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/home_selected" />

        <ImageView
            android:id="@+id/bookingPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/cart_empty" />

        <ImageView
            android:id="@+id/ticketsPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/tickets_empty" />

        <ImageView
            android:id="@+id/profilePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/login_page.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".LoginPage">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            tools:ignore="UselessParent">

            <ImageView
                android:id="@+id/logo"
                android:layout_width="196dp"
                android:layout_height="178dp"
                android:layout_gravity="center"
                android:layout_marginTop="156dp"
                app:srcCompat="@drawable/ic_launcher_image"
                tools:ignore="ContentDescription" />

            <TextView
                android:id="@+id/title"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:text="@string/login_page_title"
                android:textAlignment="center"
                android:textSize="20sp"
                android:textStyle="bold" />

            <TextView
                android:id="@+id/description"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="8dp"
                android:text="@string/login_page_description"
                android:textAlignment="center"
                android:textSize="16sp" />

            <!-- Email -->
            <EditText
                android:id="@+id/email"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:background="@drawable/rounded_edittext"
                android:ems="10"
                android:inputType="textEmailAddress"
                android:hint="@string/sample_email"
                android:textColor="@color/secondary"
                android:textColorHint="@color/inputText"
                tools:ignore="Autofill,LabelFor,TextContrastCheck,VisualLintTextFieldSize" />

            <!-- Password -->
            <EditText
                android:id="@+id/password"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:background="@drawable/rounded_edittext"
                android:ems="10"
                android:inputType="textPassword"
                android:hint="Password"
                android:textColor="@color/secondary"
                android:textColorHint="@color/inputText"
                tools:ignore="Autofill,LabelFor,TextContrastCheck,VisualLintTextFieldSize" />

            <Button
                android:id="@+id/login"
                android:layout_width="match_parent"
                android:layout_height="56dp"
                android:layout_marginTop="16dp"
                android:backgroundTint="@color/btn_bg_tint"
                android:textColor="@color/btn_text_color"
                android:text="Login"
                android:textSize="16sp"
                app:cornerRadius="12dp"
                tools:ignore="HardcodedText,VisualLintButtonSize" />

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginTop="16dp"
                android:orientation="horizontal">

                <TextView
                    android:id="@+id/linkDescription"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:paddingEnd="2dp"
                    android:text="Don't have an account?"
                    android:textAlignment="viewEnd"
                    android:textColor="@color/inputText"
                    tools:ignore="HardcodedText,RtlSymmetry,TextContrastCheck" />

                <TextView
                    android:id="@+id/linkText"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:clickable="true"
                    android:focusable="true"
                    android:background="@drawable/ripple_rounded_rect"
                    android:paddingStart="2dp"
                    android:text="Register here"
                    android:textAlignment="viewStart"
                    android:textColor="@color/contText"
                    tools:ignore="HardcodedText,RtlSymmetry,TouchTargetSizeCheck" />
            </LinearLayout>

        </LinearLayout>
    </FrameLayout>
</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/my_etickets.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".MyETickets">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="@string/app_name"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- Scrollable content; fills between top divider and bottom bar -->
    <androidx.core.widget.NestedScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintTop_toBottomOf="@id/dividerTop"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingLeft="16dp"
            android:paddingRight="16dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginTop="20dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-medium"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="20dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-medium"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom bar divider (kept as a view for your drawable) -->
    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
                android:id="@+id/homePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/home_empty" />

        <ImageView
                android:id="@+id/bookingPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/cart_empty" />

        <ImageView
                android:id="@+id/ticketsPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/tickets_selected" />

        <ImageView
                android:id="@+id/profilePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/my_profile.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".MyProfile">

    <!-- Top Bar -->

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="My Profile"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/topBar" />

    <!-- Scrollable content; fills between top divider and bottom bar -->

    <!-- Bottom bar divider (kept as a view for your drawable) -->

    <FrameLayout
        android:layout_width="0dp"
        android:layout_height="340dp"
        android:layout_marginLeft="16dp"
        android:layout_marginTop="80dp"
        android:layout_marginRight="16dp"
        android:background="@drawable/card_bg"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <ImageView
            android:id="@+id/imageView5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="40dp"
            app:srcCompat="@drawable/profile_pic" />

        <TextView
            android:id="@+id/textView16"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="248dp"
            android:fontFamily="sans-serif-medium"
            android:gravity="center"
            android:text="Anupa Prabhasara"
            android:textSize="24sp" />

        <TextView
            android:id="@+id/textView17"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="282dp"
            android:gravity="center"
            android:text="info@anupa.lk"
            android:textSize="18sp" />
    </FrameLayout>

    <LinearLayout
        android:layout_width="379dp"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16dp"
        android:layout_marginTop="448dp"
        android:layout_marginRight="16dp"
        android:orientation="horizontal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <Button
            android:id="@+id/updateProfile"
            android:layout_width="0dp"
            android:layout_height="56dp"
            android:layout_marginRight="4dp"
            android:layout_weight="1"
            android:backgroundTint="@color/secondary"
            android:text="Update Profile"
            android:textSize="16sp"
            app:cornerRadius="12dp"
            tools:ignore="HardcodedText,VisualLintButtonSize" />

        <Button
            android:id="@+id/logoutBtn"
            android:layout_width="0dp"
            android:layout_height="56dp"
            android:layout_marginLeft="4dp"
            android:layout_weight="1"
            android:backgroundTint="#FF0000"
            android:text="Logout"
            android:textSize="16sp"
            app:cornerRadius="12dp"
            tools:ignore="HardcodedText,VisualLintButtonSize" />
    </LinearLayout>

    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <ImageView
                android:id="@+id/homePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/home_empty" />

        <ImageView
                android:id="@+id/bookingPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/cart_empty" />

        <ImageView
                android:id="@+id/ticketsPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/tickets_empty" />

        <ImageView
                android:id="@+id/profilePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/user_selected" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/onboarding_screen_one.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".OnboardingScreenOne">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="24dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="144dp"
            android:layout_marginBottom="144dp">

            <ImageView
                android:id="@+id/image"
                android:layout_width="256dp"
                android:layout_height="256dp"
                android:layout_gravity="center_horizontal"
                app:srcCompat="@drawable/ob_image_one"
                tools:ignore="ContentDescription" />

            <TextView
                android:id="@+id/title"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="288dp"
                android:text="Book Tickets Instantly"
                android:textSize="24sp"
                android:textStyle="bold"
                tools:ignore="HardcodedText" />

            <TextView
                android:id="@+id/description"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="344dp"
                android:text="Search, select, and book your train tickets in just a few taps."
                android:textAlignment="center"
                android:textSize="20sp"
                tools:ignore="HardcodedText" />
        </FrameLayout>

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="560dp">

            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <ImageView
                    android:id="@+id/next"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:layout_gravity="bottom|right"
                    android:clickable="true"
                    android:focusable="true"
                    android:background="@drawable/ripple_round"
                    app:srcCompat="@drawable/right_solid_arrow"
                    tools:ignore="ContentDescription,RtlHardcoded,SpeakableTextPresentCheck,TouchTargetSizeCheck" />

                <ImageView
                    android:id="@+id/previous"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:layout_gravity="bottom|start"
                    android:background="@drawable/ripple_round"
                    android:clickable="true"
                    android:focusable="true"
                    app:srcCompat="@drawable/left_light_arrow"
                    tools:ignore="ContentDescription,ImageContrastCheck,SpeakableTextPresentCheck,TouchTargetSizeCheck" />
            </FrameLayout>

            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginBottom="4dp">

                <ImageView
                    android:id="@+id/dot1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginRight="16dp"
                    app:srcCompat="@drawable/dot_solid"
                    tools:ignore="ContentDescription,RtlHardcoded" />

                <ImageView
                    android:id="@+id/dot2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    app:srcCompat="@drawable/dot_light"
                    tools:ignore="ContentDescription,ImageContrastCheck" />

                <ImageView
                    android:id="@+id/dot3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginLeft="16dp"
                    app:srcCompat="@drawable/dot_light"
                    tools:ignore="ContentDescription,RtlHardcoded,ImageContrastCheck" />
            </FrameLayout>

        </FrameLayout>

    </FrameLayout>
</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/onboarding_screen_three.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".OnboardingScreenThree">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="24dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="144dp"
            android:layout_marginBottom="144dp">

            <ImageView
                android:id="@+id/image"
                android:layout_width="256dp"
                android:layout_height="256dp"
                android:layout_gravity="center_horizontal"
                app:srcCompat="@drawable/ob_image_three"
                tools:ignore="ContentDescription" />

            <TextView
                android:id="@+id/title"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="288dp"
                android:text="Manage Your E-Tickets"
                android:textSize="24sp"
                android:textStyle="bold"
                tools:ignore="HardcodedText" />

            <TextView
                android:id="@+id/description"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="344dp"
                android:text="Pay safely and travel paper-free with scannable digital tickets."
                android:textAlignment="center"
                android:textSize="20sp"
                tools:ignore="HardcodedText" />
        </FrameLayout>

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="540dp">

            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <Button
                    android:id="@+id/getStarted"
                    android:layout_width="156dp"
                    android:layout_height="60dp"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginBottom="84dp"
                    android:backgroundTint="@color/secondary"
                    android:text="Get Started"
                    android:textSize="16sp"
                    app:cornerRadius="12dp"
                    tools:ignore="HardcodedText" />

                <ImageView
                    android:id="@+id/next"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:layout_gravity="bottom|right"
                    android:background="@drawable/ripple_round"
                    android:clickable="true"
                    android:focusable="true"
                    app:srcCompat="@drawable/right_light_arrow"
                    tools:ignore="ContentDescription,RtlHardcoded,ImageContrastCheck,SpeakableTextPresentCheck,TouchTargetSizeCheck" />

                <ImageView
                    android:id="@+id/previous"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:layout_gravity="bottom|start"
                    android:background="@drawable/ripple_round"
                    android:clickable="true"
                    android:focusable="true"
                    app:srcCompat="@drawable/left_solid_arrow"
                    tools:ignore="ContentDescription,ImageContrastCheck,SpeakableTextPresentCheck,TouchTargetSizeCheck" />
            </FrameLayout>

            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginBottom="4dp">

                <ImageView
                    android:id="@+id/dot1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginRight="16dp"
                    app:srcCompat="@drawable/dot_light"
                    tools:ignore="ContentDescription,RtlHardcoded,ImageContrastCheck" />

                <ImageView
                    android:id="@+id/dot2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    app:srcCompat="@drawable/dot_light"
                    tools:ignore="ContentDescription,ImageContrastCheck" />

                <ImageView
                    android:id="@+id/dot3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginLeft="16dp"
                    app:srcCompat="@drawable/dot_solid"
                    tools:ignore="ContentDescription,RtlHardcoded,ImageContrastCheck" />
            </FrameLayout>

        </FrameLayout>

    </FrameLayout>
</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/onboarding_screen_two.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".OnboardingScreenTwo">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="24dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="144dp"
            android:layout_marginBottom="144dp">

            <ImageView
                android:id="@+id/image"
                android:layout_width="256dp"
                android:layout_height="256dp"
                android:layout_gravity="center_horizontal"
                app:srcCompat="@drawable/ob_image_two"
                tools:ignore="ContentDescription" />

            <TextView
                android:id="@+id/title"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="288dp"
                android:text="Real-Time Train Tracking"
                android:textSize="24sp"
                android:textStyle="bold"
                tools:ignore="HardcodedText" />

            <TextView
                android:id="@+id/description"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center_horizontal"
                android:layout_marginTop="344dp"
                android:text="Stay updated with live train schedules, delays, and arrival times."
                android:textAlignment="center"
                android:textSize="20sp"
                tools:ignore="HardcodedText" />
        </FrameLayout>

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="560dp">

            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <ImageView
                    android:id="@+id/next"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:layout_gravity="bottom|right"
                    android:background="@drawable/ripple_round"
                    android:clickable="true"
                    android:focusable="true"
                    app:srcCompat="@drawable/right_solid_arrow"
                    tools:ignore="ContentDescription,RtlHardcoded,SpeakableTextPresentCheck,TouchTargetSizeCheck" />

                <ImageView
                    android:id="@+id/previous"
                    android:layout_width="40dp"
                    android:layout_height="40dp"
                    android:layout_gravity="bottom|start"
                    android:background="@drawable/ripple_round"
                    android:clickable="true"
                    android:focusable="true"
                    app:srcCompat="@drawable/left_solid_arrow"
                    tools:ignore="ContentDescription,ImageContrastCheck,SpeakableTextPresentCheck,TouchTargetSizeCheck" />
            </FrameLayout>

            <FrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginBottom="4dp">

                <ImageView
                    android:id="@+id/dot1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginRight="16dp"
                    app:srcCompat="@drawable/dot_light"
                    tools:ignore="ContentDescription,RtlHardcoded,ImageContrastCheck" />

                <ImageView
                    android:id="@+id/dot2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    app:srcCompat="@drawable/dot_solid"
                    tools:ignore="ContentDescription,ImageContrastCheck" />

                <ImageView
                    android:id="@+id/dot3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|center_horizontal"
                    android:layout_marginLeft="16dp"
                    app:srcCompat="@drawable/dot_light"
                    tools:ignore="ContentDescription,RtlHardcoded,ImageContrastCheck" />
            </FrameLayout>

        </FrameLayout>

    </FrameLayout>
</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/payment_approved.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".PaymentApproved">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="visible"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Receipt"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />



    <!-- Bottom bar divider (kept as a view for your drawable) -->

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="144dp"
        android:layout_height="144dp"
        app:layout_constraintBottom_toTopOf="@id/bottomBar"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintVertical_bias="0.3"
        app:srcCompat="@drawable/done_image" />

    <TextView
        android:id="@+id/textView12"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:fontFamily="sans-serif-medium"
        android:text="Payment Approved"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView3" />

    <TextView
        android:id="@+id/textView13"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="60dp"
        android:text="Order ID #00242453939"
        android:textSize="16sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/imageView3" />

    <Button
        android:id="@+id/viewETicket"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:layout_marginStart="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="20dp"
        android:backgroundTint="@color/secondary"
        android:text="View E-Ticket"
        android:textSize="16sp"
        app:cornerRadius="12dp"
        app:layout_constraintBottom_toTopOf="@+id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="HardcodedText,VisualLintButtonSize" />

    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
                android:id="@+id/homePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/home_empty" />

        <ImageView
                android:id="@+id/bookingPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/cart_selected" />

        <ImageView
                android:id="@+id/ticketsPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/tickets_empty" />

        <ImageView
                android:id="@+id/profilePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/payment_process.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".PaymentProcess">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="visible"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Payment"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />



    <!-- Bottom bar divider (kept as a view for your drawable) -->

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="48dp"
        android:layout_height="48dp"
        app:layout_constraintBottom_toTopOf="@+id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/dividerTop"
        app:srcCompat="@drawable/loading_anim" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="sans-serif-medium"
        android:text="Waiting for Payment"
        app:layout_constraintBottom_toTopOf="@+id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView2"
        app:layout_constraintVertical_bias="0.02" />

    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
            android:id="@+id/homePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/home_empty" />

        <ImageView
            android:id="@+id/bookingPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/cart_selected" />

        <ImageView
            android:id="@+id/ticketsPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/tickets_empty" />

        <ImageView
            android:id="@+id/profilePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/register_page.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".RegisterPage">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="24dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            tools:ignore="UselessParent">

            <ImageView
                android:id="@+id/logo"
                android:layout_width="196dp"
                android:layout_height="178dp"
                android:layout_gravity="center"
                android:layout_marginTop="64dp"
                app:srcCompat="@drawable/ic_launcher_image"
                tools:ignore="ContentDescription" />

            <TextView
                android:id="@+id/title"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:text="@string/register_page_title"
                android:textAlignment="center"
                android:textSize="20sp"
                android:textStyle="bold" />

            <TextView
                android:id="@+id/description"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                android:layout_marginTop="8dp"
                android:text="@string/register_page_description"
                android:textAlignment="center"
                android:textSize="16sp" />

            <!-- Full Name -->
            <EditText
                android:id="@+id/fullName"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="32dp"
                android:background="@drawable/rounded_edittext"
                android:ems="10"
                android:inputType="text"
                android:hint="@string/sample_name"
                android:textColor="@color/secondary"
                android:textColorHint="@color/inputText"
                android:imeOptions="actionNext"
                android:autofillHints="name"
                tools:ignore="Autofill,LabelFor,TextContrastCheck,VisualLintTextFieldSize" />

            <!-- Email -->
            <EditText
                android:id="@+id/email"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:background="@drawable/rounded_edittext"
                android:ems="10"
                android:inputType="textEmailAddress"
                android:hint="@string/sample_email"
                android:textColor="@color/secondary"
                android:textColorHint="@color/inputText"
                android:imeOptions="actionNext"
                android:autofillHints="emailAddress"
                tools:ignore="Autofill,LabelFor,TextContrastCheck,VisualLintTextFieldSize" />

            <!-- Password -->
            <EditText
                android:id="@+id/password"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:background="@drawable/rounded_edittext"
                android:ems="10"
                android:inputType="textPassword"
                android:hint="Password"
                android:textColor="@color/secondary"
                android:textColorHint="@color/inputText"
                android:imeOptions="actionNext"
                android:autofillHints="password"
                tools:ignore="Autofill,LabelFor,TextContrastCheck,VisualLintTextFieldSize" />

            <!-- Confirm Password -->
            <EditText
                android:id="@+id/confirmpwd"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:background="@drawable/rounded_edittext"
                android:ems="10"
                android:inputType="textPassword"
                android:hint="Confirm Password"
                android:textColor="@color/secondary"
                android:textColorHint="@color/inputText"
                android:imeOptions="actionDone"
                android:autofillHints="password"
                tools:ignore="Autofill,LabelFor,TextContrastCheck,VisualLintTextFieldSize" />

            <Button
                android:id="@+id/register"
                android:layout_width="match_parent"
                android:layout_height="56dp"
                android:layout_marginTop="16dp"
                android:backgroundTint="@color/btn_bg_tint"
                android:textColor="@color/btn_text_color"
                android:text="Register"
                android:textSize="16sp"
                app:cornerRadius="12dp"
                tools:ignore="HardcodedText,VisualLintButtonSize" />

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginTop="16dp"
                android:orientation="horizontal">

                <TextView
                    android:id="@+id/linkDescription"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:paddingEnd="2dp"
                    android:text="Already have an account?"
                    android:textAlignment="viewEnd"
                    android:textColor="@color/inputText"
                    tools:ignore="HardcodedText,RtlSymmetry,TextContrastCheck" />

                <TextView
                    android:id="@+id/linkText"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:clickable="true"
                    android:focusable="true"
                    android:background="@drawable/ripple_rounded_rect"
                    android:paddingStart="2dp"
                    android:text="Sign in here"
                    android:textAlignment="viewStart"
                    android:textColor="@color/contText"
                    tools:ignore="HardcodedText,RtlSymmetry,TouchTargetSizeCheck" />
            </LinearLayout>

        </LinearLayout>
    </FrameLayout>
</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/search_result.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".SearchResult">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="@string/app_name"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/topBar" />

    <!-- Scrollable content; fills between top divider and bottom bar -->
    <androidx.core.widget.NestedScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/dividerTop">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingLeft="16dp"
            android:paddingRight="16dp">

            <!-- Hero -->
            <ImageView
                android:id="@+id/heroImage"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:contentDescription="@string/app_name"
                app:srcCompat="@drawable/banner_long" />

            <!-- Section title -->

            <!-- Search box (static mock) -->
            <LinearLayout
                android:id="@+id/searchBox"
                android:layout_width="match_parent"
                android:layout_height="76dp"
                android:layout_marginTop="12dp"
                android:background="@drawable/search_bg"
                android:gravity="center_vertical"
                android:orientation="horizontal"
                android:paddingStart="12dp"
                android:paddingEnd="12dp">

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    app:srcCompat="@drawable/search_icon" />

                <LinearLayout
                    android:layout_width="302dp"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="12dp"
                        android:layout_weight="1"
                        android:fontFamily="sans-serif-medium"
                        android:text="Pettah to Kandy"
                        android:textColor="@color/secondary"
                        android:textSize="18sp" />

                    <TextView
                        android:id="@+id/textView"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="12dp"
                        android:layout_weight="1"
                        android:text="Sep 12 - 15 • 2 Tickets • 1st Class"
                        android:textColor="@color/inputText"
                        android:textSize="16sp" />
                </LinearLayout>

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    app:srcCompat="@drawable/pencil_icon" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginTop="24dp"
                android:layout_marginBottom="16dp"
                android:orientation="horizontal">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Search Results"
                    android:textColor="@color/secondary"
                    android:textSize="22sp"
                    android:textStyle="bold" />

                <TextView
                    android:id="@+id/textView2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:text="3 results"
                    android:textAlignment="viewEnd"
                    android:textSize="18sp" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="80dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="8dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-medium"
                        android:text="September 12"
                        android:textColor="#000000"
                        android:textSize="18sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:00 PM"
                        android:textSize="16sp" />

                </LinearLayout>

                <Button
                    android:id="@+id/bookBtn1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:backgroundTint="#282828"
                    android:text="Book Now" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="80dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="8dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-medium"
                        android:text="September 12"
                        android:textColor="#000000"
                        android:textSize="18sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:00 PM"
                        android:textSize="16sp" />

                </LinearLayout>

                <Button
                    android:id="@+id/bookBtn2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:backgroundTint="#282828"
                    android:text="Book Now" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="80dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="8dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:fontFamily="sans-serif-medium"
                        android:text="September 12"
                        android:textColor="#000000"
                        android:textSize="18sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:00 PM"
                        android:textSize="16sp" />

                </LinearLayout>

                <Button
                    android:id="@+id/bookBtn3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:backgroundTint="#282828"
                    android:text="Book Now" />
            </LinearLayout>

            <TextView
                android:id="@+id/tvLatest"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="24dp"
                android:layout_marginBottom="16dp"
                android:text="Latest Tickets"
                android:textColor="@color/secondary"
                android:textSize="22sp"
                android:textStyle="bold" />

            <!-- Ticket card 1 -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <!-- Ticket card 2 -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

            <!-- Ticket card 3 -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="148dp"
                android:layout_marginBottom="16dp"
                android:background="@drawable/card_bg"
                android:orientation="horizontal"
                android:padding="16dp">

                <ImageView
                    android:layout_width="116dp"
                    android:layout_height="match_parent"
                    app:srcCompat="@drawable/qr_code" />

                <LinearLayout
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:orientation="vertical"
                    android:paddingStart="20dp">

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Ticket No. 939"
                        android:textColor="#000000"
                        android:textSize="18sp"
                        android:fontFamily="sans-serif-medium" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="Colombo to Matara"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="September 12"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="12:30 PM - 4:30 PM"
                        android:textSize="16sp" />

                    <TextView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="2 Seats (1st Class)"
                        android:textSize="16sp" />
                </LinearLayout>
            </LinearLayout>

        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom bar divider (kept as a view for your drawable) -->
    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <ImageView
            android:id="@+id/homePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/home_selected" />

        <ImageView
            android:id="@+id/bookingPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/cart_empty" />

        <ImageView
            android:id="@+id/ticketsPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/tickets_empty" />

        <ImageView
            android:id="@+id/profilePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/search_screen.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".SearchScreen">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="@string/search_page_title"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- Scrollable content; fills between top divider and bottom bar -->
    <androidx.core.widget.NestedScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintTop_toBottomOf="@id/dividerTop"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingLeft="16dp"
            android:paddingRight="16dp">

            <!-- FORM CARD to match your soft cards elsewhere -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:layout_marginBottom="16dp"
                android:clipToOutline="true"
                android:elevation="2dp"
                android:foreground="?attr/selectableItemBackgroundBorderless"
                android:orientation="vertical">

                <!-- Departure (Dropdown + type ahead; keeps rounded_edittext) -->
                <AutoCompleteTextView
                    android:id="@+id/departure"
                    android:layout_width="match_parent"
                    android:layout_height="52dp"
                    android:layout_marginTop="12dp"
                    android:background="@drawable/rounded_edittext"
                    android:dropDownWidth="match_parent"
                    android:dropDownHeight="wrap_content"
                    android:dropDownVerticalOffset="8dp"
                    android:hint="Enter departure station (e.g., Pettah)"
                    android:inputType="text"
                    android:paddingStart="16dp"
                    android:paddingEnd="16dp"
                    android:textColorHint="@color/inputText" />

                <!-- Destination (Dropdown + type ahead) -->
                <AutoCompleteTextView
                    android:id="@+id/destination"
                    android:layout_width="match_parent"
                    android:layout_height="52dp"
                    android:layout_marginTop="16dp"
                    android:background="@drawable/rounded_edittext"
                    android:dropDownWidth="match_parent"
                    android:dropDownHeight="wrap_content"
                    android:dropDownVerticalOffset="8dp"
                    android:hint="Enter destination station (e.g., Kandy)"
                    android:inputType="text"
                    android:paddingStart="16dp"
                    android:paddingEnd="16dp"
                    android:textColorHint="@color/inputText" />

                <!-- Travel Date (non-typing; opens date picker) -->
                <EditText
                    android:id="@+id/travelDate"
                    android:layout_width="match_parent"
                    android:layout_height="52dp"
                    android:layout_marginTop="16dp"
                    android:background="@drawable/rounded_edittext"
                    android:clickable="true"
                    android:focusable="false"
                    android:hint="Select travel date"
                    android:inputType="none"
                    android:paddingStart="16dp"
                    android:paddingEnd="16dp"
                    android:textColorHint="@color/inputText" />

                <!-- Number of passengers -->
                <EditText
                    android:id="@+id/numOfTickets"
                    android:layout_width="match_parent"
                    android:layout_height="52dp"
                    android:layout_marginTop="16dp"
                    android:background="@drawable/rounded_edittext"
                    android:hint="Enter number of passengers"
                    android:inputType="number"
                    android:paddingStart="16dp"
                    android:paddingEnd="16dp"
                    android:textColorHint="@color/inputText" />

                <!-- Train class (Dropdown) -->
                <AutoCompleteTextView
                    android:id="@+id/trainClass"
                    android:layout_width="match_parent"
                    android:layout_height="52dp"
                    android:layout_marginTop="16dp"
                    android:background="@drawable/rounded_edittext"
                    android:dropDownWidth="match_parent"
                    android:dropDownHeight="wrap_content"
                    android:dropDownVerticalOffset="8dp"
                    android:hint="Select travel class (e.g., 1st, 2nd, 3rd)"
                    android:inputType="text"
                    android:paddingStart="16dp"
                    android:paddingEnd="16dp"
                    android:textColorHint="@color/inputText" />

                <!-- Primary action button (keeps your style/colors) -->

            </LinearLayout>

        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom bar divider (kept as a view for your drawable) -->

    <Button
        android:id="@+id/searchBtn"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:layout_marginStart="16dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="20dp"
        android:backgroundTint="@color/secondary"
        android:text="Done"
        android:textAllCaps="false"
        android:textSize="16sp"
        app:cornerRadius="12dp"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="HardcodedText,VisualLintButtonSize" />

    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
            android:id="@+id/homePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/home_selected" />

        <ImageView
            android:id="@+id/bookingPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/cart_empty" />

        <ImageView
            android:id="@+id/ticketsPage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/tickets_empty" />

        <ImageView
            android:id="@+id/profilePage"
            android:layout_width="0dp"
            android:layout_height="28dp"
            android:layout_weight="1"
            app:srcCompat="@drawable/user_empty" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/layout/update_profile.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primary"
    tools:context=".UpdateProfile">

    <!-- Top Bar -->
    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/topBar"
        android:layout_width="0dp"
        android:layout_height="56dp"
        android:paddingHorizontal="16dp"
        android:paddingTop="20dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <!-- Back Button -->
        <ImageView
            android:id="@+id/ivBack"
            android:layout_width="24dp"
            android:layout_height="24dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/left_solid_arrow" />

        <!-- Title (centered) -->
        <TextView
            android:id="@+id/tvAppName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Update Profile"
            android:textColor="@color/secondary"
            android:textSize="20sp"
            android:textStyle="bold"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <!-- Plus Button -->
        <ImageView
            android:id="@+id/ivAdd"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:visibility="gone"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/plus_icon" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <!-- Divider -->
    <View
        android:id="@+id/dividerTop"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginTop="4dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintTop_toBottomOf="@id/topBar"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- Scrollable content; fills between top divider and bottom bar -->
    <androidx.core.widget.NestedScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintTop_toBottomOf="@id/dividerTop"
        app:layout_constraintBottom_toTopOf="@id/bottomBarDivider"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingLeft="16dp"
            android:paddingRight="16dp">

            <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="652dp"
                    android:orientation="vertical">

                <!-- Name -->
                <EditText
                        android:id="@+id/etName"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="20dp"
                        android:background="@drawable/rounded_edittext"
                        android:hint="John Doe"
                        android:inputType="textPersonName"
                        android:textColorHint="@color/inputText" />

                <!-- Email -->
                <EditText
                        android:id="@+id/etEmail"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="20dp"
                        android:background="@drawable/rounded_edittext"
                        android:hint="john@example.com"
                        android:inputType="textEmailAddress"
                        android:autoText="false"
                        android:textColorHint="@color/inputText" />

                <!-- Old Password -->
                <EditText
                        android:id="@+id/etOldPassword"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="20dp"
                        android:background="@drawable/rounded_edittext"
                        android:hint="Old Password"
                        android:inputType="textPassword"
                        android:textColorHint="@color/inputText" />

                <!-- New Password -->
                <EditText
                        android:id="@+id/etNewPassword"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="20dp"
                        android:background="@drawable/rounded_edittext"
                        android:hint="New Password"
                        android:inputType="textPassword"
                        android:textColorHint="@color/inputText" />

                <!-- Confirm Password -->
                <EditText
                        android:id="@+id/etConfirmPassword"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="20dp"
                        android:background="@drawable/rounded_edittext"
                        android:hint="Confirm Password"
                        android:inputType="textPassword"
                        android:textColorHint="@color/inputText" />

            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:orientation="vertical">

                <Button
                    android:id="@+id/updateProfile"
                    android:layout_width="match_parent"
                    android:layout_height="64dp"
                    android:backgroundTint="@color/secondary"
                    android:text="Update"
                    android:textSize="16sp"
                    app:cornerRadius="12dp"
                    tools:ignore="HardcodedText,VisualLintButtonSize" />
            </LinearLayout>

        </LinearLayout>
    </androidx.core.widget.NestedScrollView>

    <!-- Bottom bar divider (kept as a view for your drawable) -->

    <View
        android:id="@+id/bottomBarDivider"
        android:layout_width="0dp"
        android:layout_height="1dp"
        android:layout_marginBottom="68dp"
        android:background="@drawable/horizontal_line"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <!-- Bottom bar -->
    <LinearLayout
        android:id="@+id/bottomBar"
        android:layout_width="0dp"
        android:layout_height="68dp"
        android:background="@android:color/white"
        android:gravity="center_vertical"
        android:orientation="horizontal"
        android:paddingStart="16dp"
        android:paddingEnd="16dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
                android:id="@+id/homePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/home_empty" />

        <ImageView
                android:id="@+id/bookingPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/cart_empty" />

        <ImageView
                android:id="@+id/ticketsPage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/tickets_empty" />

        <ImageView
                android:id="@+id/profilePage"
                android:layout_width="0dp"
                android:layout_height="28dp"
                android:layout_weight="1"
                app:srcCompat="@drawable/user_selected" />
    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>


================================================
FILE: app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/primary" />
    <foreground android:drawable="@drawable/ic_launcher" />
    <monochrome android:drawable="@drawable/ic_launcher" />
</adaptive-icon>


================================================
FILE: app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/primary" />
    <foreground android:drawable="@drawable/ic_launcher_round" />
    <monochrome android:drawable="@drawable/ic_launcher_round" />
</adaptive-icon>


================================================
FILE: app/src/main/res/values/arrays.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string-array name="stations">
        <item>Pettah</item>
        <item>Colombo Fort</item>
        <item>Kandy</item>
        <item>Galle</item>
        <item>Jaffna</item>
        <item>Badulla</item>
        <item>Matara</item>
        <item>Anuradhapura</item>
    </string-array>

    <string-array name="train_classes">
        <item>1st</item>
        <item>2nd</item>
        <item>3rd</item>
    </string-array>
</resources>


================================================
FILE: app/src/main/res/values/colors.xml
================================================
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <!--60%-->
    <color name="primary">#FFFFFF</color>

    <!--30%-->
    <color name="secondary">#B8000000</color>

    <!--10%-->
    <color name="shadow">#1A000000</color>
    <color name="input">#E0E0E0</color>
    <color name="inputText">#828282</color>
    <color name="contText">#000000</color>
    <color name="search_bg">#F4F4F4</color>
</resources>


================================================
FILE: app/src/main/res/values/strings.xml
================================================
<resources>
    <string name="app_name">RailEase</string>
    <string name="sample_email">johndoe@example.com</string>
    <string name="sample_name">John Doe</string>
    <string name="register_page_description">Enter your details to sign up for this app</string>
    <string name="register_page_title">Create an account</string>
    <string name="login_page_title">Good to see you again</string>
    <string name="login_page_description">Access your travel history anywhere</string>
    <string name="search_page_title">Search</string>
</resources>


================================================
FILE: app/src/main/res/values/themes.xml
================================================
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.RailEase" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Customize your light theme here. -->
        <!-- <item name="colorPrimary">@color/my_light_primary</item> -->
    </style>

    <style name="Theme.RailEase" parent="Base.Theme.RailEase" />
</resources>


================================================
FILE: app/src/main/res/xml/backup_rules.xml
================================================
<?xml version="1.0" encoding="utf-8"?><!--
   Sample backup rules file; uncomment and customize as necessary.
   See https://developer.android.com/guide/topics/data/autobackup
   for details.
   Note: This file is ignored for devices older than API 31
   See https://developer.android.com/about/versions/12/backup-restore
-->
<full-backup-content>
    <!--
   <include domain="sharedpref" path="."/>
   <exclude domain="sharedpref" path="device.xml"/>
-->
</full-backup-content>


================================================
FILE: app/src/main/res/xml/data_extraction_rules.xml
================================================
<?xml version="1.0" encoding="utf-8"?><!--
   Sample data extraction rules file; uncomment and customize as necessary.
   See https://developer.android.com/about/versions/12/backup-restore#xml-changes
   for details.
-->
<data-extraction-rules>
    <cloud-backup>
        <!-- TODO: Use <include> and <exclude> to control what is backed up.
        <include .../>
        <exclude .../>
        -->
    </cloud-backup>
    <!--
    <device-transfer>
        <include .../>
        <exclude .../>
    </device-transfer>
    -->
</data-extraction-rules>


================================================
FILE: app/src/test/java/com/anupa/railease/ExampleUnitTest.kt
================================================
package com.anupa.railease

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}


================================================
FILE: app/.idea/gradle.xml
================================================
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="GradleMigrationSettings" migrationVersion="1" />
  <component name="GradleSettings">
    <option name="linkedExternalProjectsSettings">
      <GradleProjectSettings>
        <option name="externalProjectPath" value="$PROJECT_DIR$" />
        <option name="gradleJvm" value="jbr-21" />
      </GradleProjectSettings>
    </option>
  </component>
</project>


================================================
FILE: app/.idea/misc.xml
================================================
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ExternalStorageConfigurationManager" enabled="true" />
</project>


================================================
FILE: app/.idea/vcs.xml
================================================
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="VcsDirectoryMappings">
    <mapping directory="$PROJECT_DIR$/.." vcs="Git" />
  </component>
</project>


================================================
FILE: app/.idea/.gitignore
================================================
# Default ignored files
/shelf/
/workspace.xml
# Editor-based HTTP Client requests
/httpRequests/
# Environment-dependent path to Maven home directory
/mavenHomeManager.xml
# Datasource local storage ignored files
/dataSources/
/dataSources.local.xml



================================================
FILE: gradle/libs.versions.toml
================================================
[versions]
agp = "8.11.1"
coil = "2.6.0"
coilGif = "2.6.0"
kotlin = "2.0.21"
coreKtx = "1.17.0"
junit = "4.13.2"
junitVersion = "1.3.0"
espressoCore = "3.7.0"
appcompat = "1.7.1"
material = "1.12.0"
activity = "1.10.1"
constraintlayout = "2.2.1"

[libraries]
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
coil = { module = "io.coil-kt:coil", version.ref = "coil" }
coil-kt-coil-gif = { module = "io.coil-kt:coil-gif", version.ref = "coilGif" }
junit = { group = "junit", name = "junit", version.ref = "junit" }
androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
androidx-appcompat = { group = "androidx.appcompat", name = "appcompat", version.ref = "appcompat" }
material = { group = "com.google.android.material", name = "material", version.ref = "material" }
androidx-activity = { group = "androidx.activity", name = "activity", version.ref = "activity" }
androidx-constraintlayout = { group = "androidx.constraintlayout", name = "constraintlayout", version.ref = "constraintlayout" }

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }




================================================
FILE: gradle/wrapper/gradle-wrapper.properties
================================================
#Sat Aug 23 00:38:50 IST 2025
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-8.13-bin.zip
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists


