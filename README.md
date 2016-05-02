# AnvilKotlin
[![](https://jitpack.io/v/graknol/AnvilKotlin.svg)](https://jitpack.io/#graknol/AnvilKotlin)

A simple Kotlin wrapper around Anvil.

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

The possible library strings are (remember, these follow the same rules as Anvil):
```gradle
dependencies {
  // Rember, you still need to set up the equivalent Anvil ones!
  
  // SDK libraries (choose one)
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.0:sdk15Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.0:sdk19Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.0:sdk21Release@aar'
  
  // Support libraries
  compile 'com.github.graknol.AnvilKotlin:cardview:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:gridlayout:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:recyclerview:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:support:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:design:0.1.0@aar'
  compile 'com.github.graknol.AnvilKotlin:appcompat:0.1.0@aar'
}
