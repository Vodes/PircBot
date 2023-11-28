# PircBot

This is a fork of PircBot' (pronounced "PircBot prime") to improve DCC functionality.
<br>A framework for writing IRC bots in
Java. It is a fork of jibble.org's [PircBot](http://www.jibble.org/pircbot.php)
(version 1.5.0) that adds the following features:

* SSL support
* Other minor improvements

# Usage

I opted for jitpack, so you can simply use the library by adding the jitpack repo to your build.gradle.

```kt
repositories {
    mavenCentral()
    maven("https://jitpack.io")
}
```

```kt
dependencies {
    implementation("com.github.Vodes:PircBot:0.1")
    ...
}
```

For general documentation on using PircBot once it's installed, see the
[jibble.org PircBot website](http://www.jibble.org/pircbot.php). See
[ReminderBot'](https://github.com/davidlazar/ReminderBot) for an example of
how to use the new features provided by PircBot'.
