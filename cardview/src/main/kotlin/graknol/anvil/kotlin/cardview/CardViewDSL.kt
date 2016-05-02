@file:Suppress("unused")

package graknol.anvil.kotlin.cardview

import graknol.anvil.kotlin.DSLFrameLayout
import trikita.anvil.Anvil
import trikita.anvil.cardview.v7.CardViewv7DSL

fun Anvil.Renderable.cardView(r: CardViewDSLCardView.() -> Unit) = CardViewv7DSL.cardView({ CardViewDSLCardView().r() })

open class CardViewDSLCardView : DSLFrameLayout() {
	open fun cardBackgroundColor(arg: Int) = CardViewv7DSL.cardBackgroundColor(arg)
	open fun cardElevation(arg: Float) = CardViewv7DSL.cardElevation(arg)
	open fun maxCardElevation(arg: Float) = CardViewv7DSL.maxCardElevation(arg)
	open fun preventCornerOverlap(arg: Boolean) = CardViewv7DSL.preventCornerOverlap(arg)
	open fun radius(arg: Float) = CardViewv7DSL.radius(arg)
	open fun useCompatPadding(arg: Boolean) = CardViewv7DSL.useCompatPadding(arg)
}
