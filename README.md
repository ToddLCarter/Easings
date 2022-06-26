# Easings [![](https://jitpack.io/v/ToddLCarter/Easings.svg)](https://jitpack.io/#ToddLCarter/Easings)
Lightweight time-based animation library

# Usage

## Creating a new Animation
```java
Animation animation = new Animation(Easing.SINE_IN_OUT, 1000);
```

## Using an Animation
```java
Animation animation = new Animation(Easing.SINE_IN_OUT, 1000);
animation.getProgress(); //progress of the animation from 0 to 1
```

## Built in Easings
```java
Easing.LINEAR,

Easing.SINE_IN,
Easing.SINE_OUT,
Easing.SINE_IN_OUT,

Easing.QUAD_IN,
Easing.QUAD_OUT,
Easing.QUAD_IN_OUT,

Easing.CUBIC_IN,
Easing.CUBIC_OUT,
Easing.CUBIC_IN_OUT,

Easing.EXP_IN,
Easing.EXP_OUT,
Easing.EXP_IN_OUT,

Easing.BACK_IN,
Easing.BACK_OUT,
Easing.BACK_IN_OUT,

Easing.ELASTIC_IN,
Easing.ELASTIC_OUT,
Easing.ELASTIC_IN_OUT,

Easing.BOUNCE_OUT,
Easing.BOUNCE_IN,
Easing.BOUNCE_IN_OUT
```

## Built in Animation Types
```java
AnimationType.ONCE,
AnimationType.LOOP,
AnimationType.LOOP_REVERSE,
AnimationType.REVERSED
```



## Installation
Maven:
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.ToddLCarter</groupId>
    <artifactId>Easings</artifactId>
    <version>1.0</version>
</dependency>
```
Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.ToddLCarter:Easings:1.0'
}
```

## Building
You can build the project by running `./gradlew build`
