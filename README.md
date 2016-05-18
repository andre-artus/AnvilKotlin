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
	compile 'com.github.graknol.AnvilKotlin:anvil:0.4.0:sdk15Release@aar'
	compile 'com.github.graknol.AnvilKotlin:anvil:0.4.0:sdk19Release@aar'
	compile 'com.github.graknol.AnvilKotlin:anvil:0.4.0:sdk21Release@aar'
	
	// Support libraries
	compile 'com.github.graknol.AnvilKotlin:cardview:0.4.0@aar'
	compile 'com.github.graknol.AnvilKotlin:gridlayout:0.4.0@aar'
	compile 'com.github.graknol.AnvilKotlin:recyclerview:0.4.0@aar'
	compile 'com.github.graknol.AnvilKotlin:support:0.4.0@aar'
	compile 'com.github.graknol.AnvilKotlin:design:0.4.0@aar'
	compile 'com.github.graknol.AnvilKotlin:appcompat:0.4.0@aar'
}
```

## How to use it
Use the functions from each library (these are found in `graknol.anvil.kotlin`) to create views and then use the functions on `this`, for instance:
```kotlin
val fooContent: Anvil.Renderable.() -> Unit = {
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
val styleNavDrawer: AppCompatDSLListViewCompat.() -> Unit = {
	choiceMode(ListView.CHOICE_MODE_SINGLE)
	divider(resources.getDrawable(android.R.color.transparent))
	dividerHeight(0)
	backgroundColor(hex("#111111"))
}

class ExampleView(c: Context) : RenderableView(c) {
	fun view() {
		linearLayout {
			backgroundColor(someIntColorValue)
			appCompatButton {
				text("click me!")
				onClick(View.OnClickListener {
					doSomethingCool()
				})
			}
			
			drawerLayout {
				// Look at the top of this snippet
				fooContent()
				
				listViewCompat {
					size(dip(240), MATCH)
					// Look at the top of this snippet
					styleNavDrawer() 
				}.lparams {
					gravity = START
					weight = 1f
				}
			}
			
			// If there are functions missing in the DSL, do this little trick:
			with(Anvil.currentView<LinearLayout>()) {
				// Magic!
				whicheverFunctionIsMissing()
				andAllOthers()
			}
		}
	}
}
```

The reason for the "seemingly redundant" typing of `OnClickListener` above, is simply that Kotlin does not automatically convert Kotlin parameters to SAMs (Single abstract method), and there are too many functions in the different library for me to patch every single one of them. **PS: Some listeners have multiple functions, so you'll end up writing those like this anyway ;)**

### Splitting the code is ~~ugly *not that ugly anymore, YAY :)*
Most issues are not present anymore. If there's something bothering you on this area, DO NOT hesitate to open an issue (we really need all the input we can get).

## License
Code is distributed under the MIT license, feel free to use it in your proprietary projects as well. 
