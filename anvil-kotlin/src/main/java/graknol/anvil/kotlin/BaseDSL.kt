@file:Suppress("unused")

package graknol.anvil.kotlin

import android.animation.Animator
import android.content.res.Resources
import android.text.TextWatcher
import trikita.anvil.Anvil
import trikita.anvil.BaseDSL

/**
 * Copyright 2016 Sindre Tellevik
 *
 * @author Sindre Tellvik <graknol@gmail.com>
 * @since 12.30 - 26.04.2016
 */
open class BaseDSL() {
	open val BOTTOM = BaseDSL.BOTTOM
	open val CENTER = BaseDSL.CENTER
	open val CENTER_HORIZONTAL = BaseDSL.CENTER_HORIZONTAL
	open val CENTER_VERTICAL = BaseDSL.CENTER_VERTICAL
	open val CLIP_HORIZONTAL = BaseDSL.CLIP_HORIZONTAL
	open val CLIP_VERTICAL = BaseDSL.CLIP_VERTICAL
	open val END = BaseDSL.END
	open val FILL = BaseDSL.FILL
	open val GROW = BaseDSL.GROW
	open val GROW_HORIZONTAL = BaseDSL.GROW_HORIZONTAL
	open val GROW_VERTICAL = BaseDSL.GROW_VERTICAL
	open val LEFT = BaseDSL.LEFT
	open val MATCH = BaseDSL.MATCH
	open val RIGHT = BaseDSL.RIGHT
	open val START = BaseDSL.START
	open val TOP = BaseDSL.TOP
	open val WRAP = BaseDSL.WRAP

	open fun above(anchor: Int) = BaseDSL.above(anchor)
	open fun align(verb: Int) = BaseDSL.align(verb)
	open fun align(verb: Int, anchor: Int) = BaseDSL.align(verb, anchor)
	open fun alignBaseline(anchor: Int) = BaseDSL.alignBaseline(anchor)
	open fun alignBottom(anchor: Int) = BaseDSL.alignBottom(anchor)
	open fun alignEnd(anchor: Int) = BaseDSL.alignEnd(anchor)
	open fun alignLeft(anchor: Int) = BaseDSL.alignLeft(anchor)
	open fun alignParentBottom() = BaseDSL.alignParentBottom()
	open fun alignParentEnd() = BaseDSL.alignParentEnd()
	open fun alignParentLeft() = BaseDSL.alignParentLeft()
	open fun alignParentRight() = BaseDSL.alignParentRight()
	open fun alignParentStart() = BaseDSL.alignParentStart()
	open fun alignParentTop() = BaseDSL.alignParentTop()
	open fun alignRight(anchor: Int) = BaseDSL.alignRight(anchor)
	open fun alignStart(anchor: Int) = BaseDSL.alignStart(anchor)
	open fun alignTop(anchor: Int) = BaseDSL.alignTop(anchor)
	open fun anim(trigger: Boolean, a: Animator) = BaseDSL.anim(trigger, a)
	open fun <T> attr(f: Anvil.AttrFunc<T>, value: T) = BaseDSL.attr(f, value)
	open fun below(anchor: Int) = BaseDSL.below(anchor)
	open fun centerHorizontal() = BaseDSL.centerHorizontal()
	open fun centerInParent() = BaseDSL.centerInParent()
	open fun centerVertical() = BaseDSL.centerVertical()
	open fun check(id: Int) = BaseDSL.check(id)
	open fun dip(value: Float): Float = BaseDSL.dip(value)
	open fun dip(value: Int): Int = BaseDSL.dip(value)
	open fun init(r: Runnable) = BaseDSL.init(r)
	open fun isPortrait(): Boolean = BaseDSL.isPortrait()
	open fun layoutGravity(g: Int) = BaseDSL.layoutGravity(g)
	open fun margin(w: Int) = BaseDSL.margin(w)
	open fun margin(h: Int, v: Int) = BaseDSL.margin(h, v)
	open fun margin(l: Int, t: Int, r: Int, b: Int) = BaseDSL.margin(l, t, r, b)
	open fun onItemSelected(l: BaseDSL.SimpleItemSelectedListener) = BaseDSL.onItemSelected(l)
	open fun onSeekBarChange(l: BaseDSL.SimpleSeekBarChangeListener) = BaseDSL.onSeekBarChange(l)
	open fun onTextChanged(w: BaseDSL.SimpleTextWatcher) = BaseDSL.onTextChanged(w)
	open fun onTextChanged(w: TextWatcher) = BaseDSL.onTextChanged(w)
	open fun padding(p: Int) = BaseDSL.padding(p)
	open fun padding(h: Int, v: Int) = BaseDSL.padding(h, v)
	open fun padding(l: Int, t: Int, r: Int, b: Int) = BaseDSL.padding(l, t, r, b)
	open fun R(): Resources = BaseDSL.R()
	open fun shadowLayer(radius: Float, dx: Float, dy: Float, color: Int) = BaseDSL.shadowLayer(radius, dx, dy, color)
	open fun sip(value: Float): Float = BaseDSL.sip(value)
	open fun sip(value: Int): Int = BaseDSL.sip(value)
	open fun size(w: Int, h: Int) = BaseDSL.size(w, h)
	open fun tag(id: Int, value: Any) = BaseDSL.tag(id, value)
	open fun text(arg: CharSequence) = BaseDSL.text(arg)
	open fun textSize(size: Float) = BaseDSL.textSize(size)
	open fun toEndOf(anchor: Int) = BaseDSL.toEndOf(anchor)
	open fun toLeftOf(anchor: Int) = BaseDSL.toLeftOf(anchor)
	open fun toRightOf(anchor: Int) = BaseDSL.toRightOf(anchor)
	open fun toStartOf(anchor: Int) = BaseDSL.toStartOf(anchor)
	open fun typeface(font: String) = BaseDSL.typeface(font)
	open fun typeface(font: String, style: Int) = BaseDSL.typeface(font, style)
	open fun visibility(visible: Boolean) = BaseDSL.visibility(visible)
	open fun weight(w: Float) = BaseDSL.weight(w)
}