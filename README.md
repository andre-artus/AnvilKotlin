# AnvilKotlin
[![](https://jitpack.io/v/graknol/AnvilKotlin.svg)](https://jitpack.io/#graknol/AnvilKotlin)

A simple Kotlin wrapper around [Anvil](https://github.com/zserge/anvil).

The only purpose of this library is to provide type safety to Anvil through Kotlin. Nothing more, nothing less. Enjoy! :) 

## Get it

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
  // Remember, you still need to set up the equivalent Anvil ones!
  
  // SDK libraries
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.2:sdk15Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.2:sdk19Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.1.2:sdk21Release@aar'
  
  // Support libraries
  compile 'com.github.graknol.AnvilKotlin:cardview:0.1.2@aar'
  compile 'com.github.graknol.AnvilKotlin:gridlayout:0.1.2@aar'
  compile 'com.github.graknol.AnvilKotlin:recyclerview:0.1.2@aar'
  compile 'com.github.graknol.AnvilKotlin:support:0.1.2@aar'
  compile 'com.github.graknol.AnvilKotlin:design:0.1.2@aar'
  compile 'com.github.graknol.AnvilKotlin:appcompat:0.1.2@aar'
}
```

## How to use it

Use the functions from each library (these are found in `graknol.anvil.kotlin`) to create views and then use the functions on `this`, for instance:

```kotlin
class ExampleView(c: Context) : RenderableView(c) {
  fun view() {
    linearLayout {
      backgroundColor(someIntColorValue)
      appCompatButton {
        text("click me!")

        onClick(OnClickListener {
          doSomethingCool()
        })
      }
    }
  }
}
```

The reason for the "seemingly redundant" typing of `OnClickListener` above, is simply that Kotlin does not automatically convert Kotlin parameters to SAM functions, and there are too many functions in the different library for me to patch every single one of them. Also, some listeners have multiple functions, so you'll end up writing those this way anyways. ;)

### Styling

You can create lambdas which act like styling functions, simply create a lambda and have it extend the given element you want to style.

```kotlin
// appCompatButton() is in the AppCompatDSL, thus the class becomes AppCompatDSLAppCompatButton, easy!
val foo: AppCompatDSLAppCompatButton.() -> Unit = {
  supportAllCaps(true)
}

// The base SDK functions are in the DSL file, thus DSLView.
val bar: DSLView.() -> Unit = {
  size(dip(50), dip(40))
}

// To create new views, you have to extend the Anvil.Renderable class instead.
val awesomeViews: Anvil.Renderable.() -> Unit = {
  appCompatButton {
    foo()
  }
  textView {
    bar()
  }
}

class ExampleView(c: Context) : RenderableView(c) {
  fun view() {
    linearLayout {
      backgroundColor(someIntColorValue)

      bar() // VALID

      appCompatButton {
        text("click me!")

        foo() // VALID
        bar() // VALID

        onClick(View.OnClickListener {
          foo() // VALID
          bar() // VALID
        })
      }

      awesomeViews() // VALID
    }
  }
}
```

**NOTE:** _You may or may not need to write View.OnClickListener instead of just OnClickListener. I don't know if it's a bug with Kotlin or with Android Studio, but nonetheless nice to know about._

With this simple system you can create intuitive ways of styling and theming your UI.

## License

Code is distributed under MIT license, feel free to use it in your proprietary projects as well. 
