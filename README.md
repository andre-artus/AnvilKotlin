# AnvilKotlin
[![](https://jitpack.io/v/graknol/AnvilKotlin.svg)](https://jitpack.io/#graknol/AnvilKotlin)

A simple Kotlin wrapper around [Anvil](https://github.com/zserge/anvil).

The only purpose of this library is to provide type safety to Anvil through Kotlin. Nothing more, nothing less. Enjoy! :) 

# Get it

Add the JitPack repo to your root build.gradle file:
```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

The possible library strings are:
```gradle
dependencies {
  // Remember, you still need to add the equivalent Anvil and Android ones!
  
  // SDK libraries (choose one)
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.0:sdk15Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.0:sdk19Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.0:sdk21Release@aar'
  
  // Support libraries
  // Remember to also add their dependencies!
  compile 'com.github.graknol.AnvilKotlin:cardview:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:gridlayout:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:recyclerview:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:support:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:design:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:appcompat:0.1.0@aar'
}

# How to use it

Use the DSL classes for each library to create views and then use the functions on `this`, for instance:

```kotlin
DSL.linearLayout {
  backgroundColor(someIntValue)
  AppCompatDSL.someOtherView {
    // These are equivalent
    someOtherAttr(foo)
    this.someOtherAttr(foo)
  }
}
```
