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
  compile 'com.github.graknol.AnvilKotlin:anvil:0.2.0:sdk15Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.2.0:sdk19Release@aar'
  compile 'com.github.graknol.AnvilKotlin:anvil:0.2.0:sdk21Release@aar'
  
  // Support libraries
  compile 'com.github.graknol.AnvilKotlin:cardview:0.2.0@aar'
  compile 'com.github.graknol.AnvilKotlin:gridlayout:0.2.0@aar'
  compile 'com.github.graknol.AnvilKotlin:recyclerview:0.@aar'
  compile 'com.github.graknol.AnvilKotlin:support:0.2.0@aar'
  compile 'com.github.graknol.AnvilKotlin:design:0.2.0@aar'
  compile 'com.github.graknol.AnvilKotlin:appcompat:0.2.0@aar'
}
```

## How to use it

Use the functions from each library (these are found in `graknol.anvil.kotlin`) to create views and then use the functions on `this`, for instance:

```kotlin
// LinearLayout.LayoutParams is the only way layoutParams() can work. (It needs to know the parent's LayoutParams type)
val fooContent: SupportDSLDrawerLayout<LinearLayout.LayoutParams>.() -> Unit = {
  coordinatorLayout {
    appBarLayout {
      size(MATCH, WRAP)
      toolbar {
        size(MATCH, dip(48))
      }
    }
  }
}

// Just to demonstrate that you can indeed style views by a lambda (think, theme classes with functions like this in it).
val styleNavDrawer: AppCompatDSLListViewCompat<DrawerLayout.LayoutParams>.() -> Unit = {
  choiceMode(ListView.CHOICE_MODE_SINGLE)
  divider(resources.getDrawable(android.R.color.transparent))
  dividerHeight(0)
  backgroundColor(hex("#111111"))
}

class ExampleView(c: Context) : RenderableView(c) {
  fun view() {
    // This is important!
    root {
      linearLayout {
        backgroundColor(someIntColorValue)
        
        appCompatButton {
          text("click me!")
          
          onClick(View.OnClickListener {
            doSomethingCool()
          })
        }
        
        drawerLayout {
          fooContent() // Look at the top of this snippet
          
          listViewCompat {
            size(dip(240), MATCH)
            layoutParams {
              gravity = START
            }
            
            styleNavDrawer() // Look at the top of this snippet
          }
        }
      }
    }
  }
}
```

The reason for the "seemingly redundant" typing of `OnClickListener` above, is simply that Kotlin does not automatically convert Kotlin parameters to SAM functions, and there are too many functions in the different library for me to patch every single one of them. Also, some listeners have multiple functions, so you'll end up writing those this way anyways. ;)

**NOTE:** _You may or may not need to write View.OnClickListener instead of just OnClickListener. I don't know if it's a bug with Kotlin or with Android Studio, but nonetheless nice to know about._

### Splitting the code is ugly, I know

We're working hard on solving this problem and will probably have to restructure big parts of Anvil and AnvilKotlin, but in the meantime, this is how it works. Yes, it's ugly! But, it was the only way it could be done with the current architecture :(

## License

Code is distributed under MIT license, feel free to use it in your proprietary projects as well. 
