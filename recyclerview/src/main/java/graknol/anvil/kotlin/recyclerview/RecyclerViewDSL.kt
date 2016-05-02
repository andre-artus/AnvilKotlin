@file:Suppress("unused")

package graknol.anvil.kotlin.recyclerview

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerViewAccessibilityDelegate
import graknol.anvil.kotlin.DSLViewGroup
import trikita.anvil.Anvil
import trikita.anvil.recyclerview.v7.RecyclerViewv7DSL

fun Anvil.Renderable.recyclerView(r: RecyclerViewDSLRecyclerView.() -> Unit) = RecyclerViewv7DSL.recyclerView({ RecyclerViewDSLRecyclerView().r() })

open class RecyclerViewDSLRecyclerView : DSLViewGroup() {
	open fun accessibilityDelegateCompat(arg: RecyclerViewAccessibilityDelegate) = RecyclerViewv7DSL.accessibilityDelegateCompat(arg)
	open fun adapter(arg: RecyclerView.Adapter<*>) = RecyclerViewv7DSL.adapter(arg)
	open fun childDrawingOrderCallback(arg: android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback) = RecyclerViewv7DSL.childDrawingOrderCallback(arg)
	open fun hasFixedSize(arg: Boolean) = RecyclerViewv7DSL.hasFixedSize(arg)
	open fun itemAnimator(arg: android.support.v7.widget.RecyclerView.ItemAnimator) = RecyclerViewv7DSL.itemAnimator(arg)
	open fun itemViewCacheSize(arg: Int) = RecyclerViewv7DSL.itemViewCacheSize(arg)
	open fun layoutFrozen(arg: Boolean) = RecyclerViewv7DSL.layoutFrozen(arg)
	open fun layoutManager(arg: android.support.v7.widget.RecyclerView.LayoutManager) = RecyclerViewv7DSL.layoutManager(arg)
	open fun nestedScrollingEnabled(arg: Boolean) = RecyclerViewv7DSL.nestedScrollingEnabled(arg)
	open fun recycledViewPool(arg: android.support.v7.widget.RecyclerView.RecycledViewPool) = RecyclerViewv7DSL.recycledViewPool(arg)
	open fun recyclerListener(arg: android.support.v7.widget.RecyclerView.RecyclerListener) = RecyclerViewv7DSL.recyclerListener(arg)
	open fun scrollingTouchSlop(arg: Int) = RecyclerViewv7DSL.scrollingTouchSlop(arg)
	open fun viewCacheExtension(arg: android.support.v7.widget.RecyclerView.ViewCacheExtension) = RecyclerViewv7DSL.viewCacheExtension(arg)
}