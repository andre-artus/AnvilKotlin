@file:Suppress("unused")

package graknol.anvil.kotlin.cardview

import android.view.ViewGroup
import graknol.anvil.kotlin.DSLFrameLayout
import graknol.anvil.kotlin.DSLViewGroupBase
import trikita.anvil.cardview.v7.CardViewv7DSL

inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.cardView(crossinline r: CardViewDSLCardView<U>.() -> Unit) = CardViewv7DSL.cardView({ CardViewDSLCardView<U>().r() })

open class CardViewDSLCardView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: CardViewDSLCardView<T>.() -> Unit) : this() { r() }
	open fun cardBackgroundColor(arg: Int) = CardViewv7DSL.cardBackgroundColor(arg)
	open fun cardElevation(arg: Float) = CardViewv7DSL.cardElevation(arg)
	open fun maxCardElevation(arg: Float) = CardViewv7DSL.maxCardElevation(arg)
	open fun preventCornerOverlap(arg: Boolean) = CardViewv7DSL.preventCornerOverlap(arg)
	open fun radius(arg: Float) = CardViewv7DSL.radius(arg)
	open fun useCompatPadding(arg: Boolean) = CardViewv7DSL.useCompatPadding(arg)
}
