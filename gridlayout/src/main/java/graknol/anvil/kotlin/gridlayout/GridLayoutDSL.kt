@file:Suppress("unused")

package graknol.anvil.kotlin.gridlayout

import android.util.Printer
import graknol.anvil.kotlin.DSLSpace
import graknol.anvil.kotlin.DSLViewGroup
import trikita.anvil.Anvil
import trikita.anvil.gridlayout.v7.GridLayoutv7DSL

fun Anvil.Renderable.gridLayout(r: GridLayoutDSLGridLayout.() -> Unit) = GridLayoutv7DSL.gridLayout({ GridLayoutDSLGridLayout().r() })
fun Anvil.Renderable.space(r: GridLayoutDSLSpace.() -> Unit) = GridLayoutv7DSL.space({ GridLayoutDSLSpace().r() })

open class GridLayoutDSLSpace : DSLSpace() {
}
open class GridLayoutDSLGridLayout : DSLViewGroup() {
	open fun alignmentMode(arg: Int) = GridLayoutv7DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = GridLayoutv7DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = GridLayoutv7DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = GridLayoutv7DSL.orientation(arg)
	open fun printer(arg: Printer) = GridLayoutv7DSL.printer(arg)
	open fun rowCount(arg: Int) = GridLayoutv7DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = GridLayoutv7DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = GridLayoutv7DSL.useDefaultMargins(arg)
}
