@file:Suppress("unused")

package graknol.anvil.kotlin.gridlayout

import android.support.v7.widget.GridLayout
import android.util.Printer
import android.view.ViewGroup
import graknol.anvil.kotlin.DSLSpace
import graknol.anvil.kotlin.DSLViewGroup
import graknol.anvil.kotlin.DSLViewGroupBase
import trikita.anvil.Anvil
import trikita.anvil.gridlayout.v7.GridLayoutv7DSL

inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.gridLayout(crossinline r: GridLayoutDSLGridLayout<U>.() -> Unit) = GridLayoutv7DSL.gridLayout({ GridLayoutDSLGridLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.space(crossinline r: GridLayoutDSLSpace<U>.() -> Unit) = GridLayoutv7DSL.space({ GridLayoutDSLSpace<U>().r() })

open class GridLayoutDSLSpace<T : ViewGroup.LayoutParams> : DSLSpace<T>() {
}
open class GridLayoutDSLGridLayoutBase<T : ViewGroup.LayoutParams, U : GridLayout.LayoutParams> : DSLViewGroupBase<T, U>() {
	open fun alignmentMode(arg: Int) = GridLayoutv7DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = GridLayoutv7DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = GridLayoutv7DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = GridLayoutv7DSL.orientation(arg)
	open fun printer(arg: Printer) = GridLayoutv7DSL.printer(arg)
	open fun rowCount(arg: Int) = GridLayoutv7DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = GridLayoutv7DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = GridLayoutv7DSL.useDefaultMargins(arg)
}
open class GridLayoutDSLGridLayout<T : ViewGroup.LayoutParams> : GridLayoutDSLGridLayoutBase<T, GridLayout.LayoutParams>() {
}
