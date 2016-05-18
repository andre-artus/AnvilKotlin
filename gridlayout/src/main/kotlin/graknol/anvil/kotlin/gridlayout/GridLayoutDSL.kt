@file:Suppress("unused")

package graknol.anvil.kotlin.gridlayout

import android.support.v7.widget.GridLayout
import android.util.Printer
import graknol.anvil.kotlin.DSLResultStub
import graknol.anvil.kotlin.DSLSpaceBase
import graknol.anvil.kotlin.DSLViewGroupBase
import trikita.anvil.Anvil
import trikita.anvil.gridlayout.v7.GridLayoutv7DSL

inline fun Anvil.Renderable.gridLayout(crossinline r: GridLayoutDSLGridLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	GridLayoutv7DSL.gridLayout {
		GridLayoutDSLGridLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.space(crossinline r: GridLayoutDSLSpace.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	GridLayoutv7DSL.space {
		GridLayoutDSLSpace.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

object GridLayoutDSLSpace : GridLayoutDSLSpaceBase()
object GridLayoutDSLGridLayout : GridLayoutDSLGridLayoutBase() {
	fun DSLResultStub.lparams(arg: GridLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

abstract class GridLayoutDSLSpaceBase : DSLSpaceBase() {
}

abstract class GridLayoutDSLGridLayoutBase : DSLViewGroupBase() {
	open fun alignmentMode(arg: Int) = GridLayoutv7DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = GridLayoutv7DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = GridLayoutv7DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = GridLayoutv7DSL.orientation(arg)
	open fun printer(arg: Printer) = GridLayoutv7DSL.printer(arg)
	open fun rowCount(arg: Int) = GridLayoutv7DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = GridLayoutv7DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = GridLayoutv7DSL.useDefaultMargins(arg)
}