@file:Suppress("unused")

package graknol.anvil.kotlin.support

import android.graphics.drawable.Drawable
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v4.widget.NestedScrollView
import android.support.v4.widget.SlidingPaneLayout
import android.support.v4.widget.SwipeRefreshLayout
import android.view.ViewGroup
import android.widget.FrameLayout
import graknol.anvil.kotlin.*
import trikita.anvil.Anvil
import trikita.anvil.support.v4.Supportv4DSL

inline fun Anvil.Renderable.fragmentTabHost(crossinline r: SupportDSLFragmentTabHost.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.fragmentTabHost {
		SupportDSLFragmentTabHost.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.contentLoadingProgressBar(crossinline r: SupportDSLContentLoadingProgressBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.contentLoadingProgressBar {
		SupportDSLContentLoadingProgressBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.slidingPaneLayout(crossinline r: SupportDSLSlidingPaneLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.slidingPaneLayout {
		SupportDSLSlidingPaneLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewPager(crossinline r: SupportDSLViewPager.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.viewPager {
		SupportDSLViewPager.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.space(crossinline r: SupportDSLSpace.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.space {
		SupportDSLSpace.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.nestedScrollView(crossinline r: SupportDSLNestedScrollView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.nestedScrollView {
		SupportDSLNestedScrollView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.drawerLayout(crossinline r: SupportDSLDrawerLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.drawerLayout {
		SupportDSLDrawerLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.swipeRefreshLayout(crossinline r: SupportDSLSwipeRefreshLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.swipeRefreshLayout {
		SupportDSLSwipeRefreshLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.pagerTabStrip(crossinline r: SupportDSLPagerTabStrip.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.pagerTabStrip {
		SupportDSLPagerTabStrip.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.pagerTitleStrip(crossinline r: SupportDSLPagerTitleStrip.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	Supportv4DSL.pagerTitleStrip {
		SupportDSLPagerTitleStrip.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

object SupportDSLContentLoadingProgressBar : SupportDSLContentLoadingProgressBarBase()
object SupportDSLSpace : SupportDSLSpaceBase()
object SupportDSLDrawerLayout : SupportDSLDrawerLayoutBase() {
	fun DSLResultStub.lparams(arg: DrawerLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLNestedScrollView : SupportDSLNestedScrollViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLFragmentTabHost : SupportDSLFragmentTabHostBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLPagerTitleStrip : SupportDSLPagerTitleStripBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLPagerTabStrip : SupportDSLPagerTabStripBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLSlidingPaneLayout : SupportDSLSlidingPaneLayoutBase() {
	fun DSLResultStub.lparams(arg: SlidingPaneLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLSwipeRefreshLayout : SupportDSLSwipeRefreshLayoutBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object SupportDSLViewPager : SupportDSLViewPagerBase() {
	fun DSLResultStub.lparams(arg: ViewPager.LayoutParams.() -> Unit) = layoutParams(arg)
}

abstract class SupportDSLContentLoadingProgressBarBase : DSLProgressBarBase() {
}

abstract class SupportDSLSpaceBase : DSLViewBase() {
}

abstract class SupportDSLDrawerLayoutBase : DSLViewGroupBase() {
	open fun drawerElevation(arg: Float) = Supportv4DSL.drawerElevation(arg)
	open fun drawerLockMode(arg: Int) = Supportv4DSL.drawerLockMode(arg)
	open fun scrimColor(arg: Int) = Supportv4DSL.scrimColor(arg)
	open fun statusBarBackground(arg: Drawable) = Supportv4DSL.statusBarBackground(arg)
	open fun statusBarBackground(arg: Int) = Supportv4DSL.statusBarBackground(arg)
	open fun statusBarBackgroundColor(arg: Int) = Supportv4DSL.statusBarBackgroundColor(arg)
}

abstract class SupportDSLNestedScrollViewBase : DSLFrameLayoutBase() {
	open fun fillViewport(arg: Boolean) = Supportv4DSL.fillViewport(arg)
	open fun nestedScrollingEnabled(arg: Boolean) = Supportv4DSL.nestedScrollingEnabled(arg)
	open fun onScrollChange(arg: NestedScrollView.OnScrollChangeListener) = Supportv4DSL.onScrollChange(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = Supportv4DSL.smoothScrollingEnabled(arg)
}

abstract class SupportDSLFragmentTabHostBase : DSLTabHostBase() {
}

abstract class SupportDSLPagerTitleStripBase : DSLViewGroupBase() {
	open fun gravity(arg: Int) = Supportv4DSL.gravity(arg)
	open fun nonPrimaryAlpha(arg: Float) = Supportv4DSL.nonPrimaryAlpha(arg)
	open fun textColor(arg: Int) = Supportv4DSL.textColor(arg)
	open fun textSpacing(arg: Int) = Supportv4DSL.textSpacing(arg)
}

abstract class SupportDSLPagerTabStripBase : SupportDSLPagerTitleStripBase() {
	open fun drawFullUnderline(arg: Boolean) = Supportv4DSL.drawFullUnderline(arg)
	open fun tabIndicatorColor(arg: Int) = Supportv4DSL.tabIndicatorColor(arg)
	open fun tabIndicatorColorResource(arg: Int) = Supportv4DSL.tabIndicatorColorResource(arg)
}

abstract class SupportDSLSlidingPaneLayoutBase : DSLViewGroupBase() {
	open fun coveredFadeColor(arg: Int) = Supportv4DSL.coveredFadeColor(arg)
	open fun panelSlideListener(arg: SlidingPaneLayout.PanelSlideListener) = Supportv4DSL.panelSlideListener(arg)
	open fun parallaxDistance(arg: Int) = Supportv4DSL.parallaxDistance(arg)
	open fun shadowDrawableLeft(arg: Drawable) = Supportv4DSL.shadowDrawableLeft(arg)
	open fun shadowDrawableRight(arg: Drawable) = Supportv4DSL.shadowDrawableRight(arg)
	open fun shadowResourceLeft(arg: Int) = Supportv4DSL.shadowResourceLeft(arg)
	open fun shadowResourceRight(arg: Int) = Supportv4DSL.shadowResourceRight(arg)
	open fun sliderFadeColor(arg: Int) = Supportv4DSL.sliderFadeColor(arg)
}

abstract class SupportDSLSwipeRefreshLayoutBase : DSLViewGroupBase() {
	open fun colorSchemeColors(arg: IntArray) = Supportv4DSL.colorSchemeColors(arg)
	open fun colorSchemeResources(arg: IntArray) = Supportv4DSL.colorSchemeResources(arg)
	open fun distanceToTriggerSync(arg: Int) = Supportv4DSL.distanceToTriggerSync(arg)
	open fun nestedScrollingEnabled(arg: Boolean) = Supportv4DSL.nestedScrollingEnabled(arg)
	open fun onRefresh(arg: SwipeRefreshLayout.OnRefreshListener) = Supportv4DSL.onRefresh(arg)
	open fun progressBackgroundColorSchemeColor(arg: Int) = Supportv4DSL.progressBackgroundColorSchemeColor(arg)
	open fun progressBackgroundColorSchemeResource(arg: Int) = Supportv4DSL.progressBackgroundColorSchemeResource(arg)
	open fun refreshing(arg: Boolean) = Supportv4DSL.refreshing(arg)
	open fun size(arg: Int) = Supportv4DSL.size(arg)
}

abstract class SupportDSLViewPagerBase : DSLViewGroupBase() {
	open fun adapter(arg: PagerAdapter) = Supportv4DSL.adapter(arg)
	open fun currentItem(arg: Int) = Supportv4DSL.currentItem(arg)
	open fun offscreenPageLimit(arg: Int) = Supportv4DSL.offscreenPageLimit(arg)
	open fun pageMargin(arg: Int) = Supportv4DSL.pageMargin(arg)
	open fun pageMarginDrawable(arg: Drawable) = Supportv4DSL.pageMarginDrawable(arg)
	open fun pageMarginDrawable(arg: Int) = Supportv4DSL.pageMarginDrawable(arg)
}