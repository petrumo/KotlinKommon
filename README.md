# KotlinKommon
Kotlin multiplatform (ios &amp; android) shared code experimental


# Steps for installing Intellij Idea (Mac OS)
* [Download](https://www.jetbrains.com/idea/download/#section=mac) Intellij Idea.

* [Download](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html) the JDK.

* Set ANDROID_ROOT_SDK variable on your terminal to your sdk location (example: /Users/your_user/Library/Android/sdk)

* Set JAVA_HOME variable on your terminal to your JDK location. You can use: 

	`export JAVA_HOME= $(/usr/libexec/java_home -v your_version)`
	
	example: `export JAVA_HOME=$(/usr/libexec/java_home -v 14.0.1)`

* [Download](https://developer.android.com/studio#command-tools) the latest cmdLine tools for Android command line.
	
* Now replace the folder Tools inside the sdk with the one you just downloaded. It may be needed to place this Tools folder inside a new one called "cmdline-tools".

* Navigate on Terminal to your SDK, then `cmdline-tools/tools/bin` and use `./sdkmanager —licenses
`
* Update Gradle version in gradle/wrapper/gradle-wrapper.properties to 6.3 or the latest.

* Run the command 
	
	 `gradle wrapper --gradle-version latest_version`
	 
	 example: `gradle wrapper --gradle-version 6.3`

	You can do this on Intellij's own Terminal

