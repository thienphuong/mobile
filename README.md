# Mobile Andoird Automation

This is Appium for Android native app (POC) sample project for demotration. 

Design pattern is applied in the framework: Serenity Screenplay

---


### 1. Installation

```
1. JDK 1.8.x
2. Maven 3.5.x
3. Appium Desktop v1.9.1 or Appium Services V1.10.0
```

### 2. Environment settings

Have an android emulator or real device connected


```
# Define the default driver
webdriver.driver = appium
webdriver.timeouts.implicitlywait = 30000
webdriver.wait.for.timeout = 60000

# Appears at the top of the reports
serenity.project.name = LINE Hybrid Android App

# Android CAPS
appium.platformName=ANDROID
appium.platformVersion=8.0.0
appium.hub=http://localhost:4723/wd/hub

appium.automationName=UiAutomator2
appium.sessionOverride=true
appium.locationServicesEnabled=true
appium.nativeWebScreenshot=true
appium.recreateChromeDriverSessions=true

appium.app = src/test/resources/app/line_beta910.apk
appium.appPackage = jp.naver.line.android
appium.appActivity = jp.naver.line.android.activity.SplashActivity
appium.noReset=false
appium.deviceName = emulator-5554
```

### Screenplay implementation

These tests use tasks, actions, questions and page elements defined in `src/test/java/com/linecorp`.

The overall project structure is shown below:

```
+ model:
    Domain model classes
+ tasks:
    Business-level tasks
+ interactions:
    UI interactions
+ ui:
    Page Objects and Page Elements
+ questions:
    Objects used to query the application
```

### Screenplay and Junit

The demo shows the integration of Serenity BDD, Screenplay and Junit.
To run it, execute:

```
mvn clean verify
```

### Reporting

The Serenity reports will be generated in the `target/site/serenity` directory.

---
