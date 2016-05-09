@file:Suppress("unused")

package graknol.anvil.kotlin.gridlayout

import android.support.v7.widget.GridLayout
import android.util.Printer
import graknol.anvil.kotlin.DSLSpaceBase
import graknol.anvil.kotlin.DSLViewGroupBase
import trikita.anvil.Anvil
import trikita.anvil.gridlayout.v7.GridLayoutv7DSL

inline fun Anvil.Renderable.gridLayout(crossinline r: GridLayoutDSLGridLayout.() -> Unit) = GridLayoutv7DSL.gridLayout({ GridLayoutDSLGridLayout.r() })
inline fun Anvil.Renderable.space(crossinline r: GridLayoutDSLSpace.() -> Unit) = GridLayoutv7DSL.space({ GridLayoutDSLSpace.r() })

object GridLayoutDSLSpace : GridLayoutDSLSpaceBase()
object GridLayoutDSLGridLayout : GridLayoutDSLGridLayoutBase<GridLayout.LayoutParams>()

abstract class GridLayoutDSLSpaceBase : DSLSpaceBase() {
}
abstract class GridLayoutDSLGridLayoutBase<T : GridLayout.LayoutParams> : DSLViewGroupBase<T>() {
	open fun alignmentMode(arg: Int) = GridLayoutv7DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = GridLayoutv7DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = GridLayoutv7DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = GridLayoutv7DSL.orientation(arg)
	open fun printer(arg: Printer) = GridLayoutv7DSL.printer(arg)
	open fun rowCount(arg: Int) = GridLayoutv7DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = GridLayoutv7DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = GridLayoutv7DSL.useDefaultMargins(arg)
}