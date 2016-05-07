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
import graknol.anvil.kotlin.*
import trikita.anvil.support.v4.Supportv4DSL

inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.fragmentTabHost(crossinline r: SupportDSLFragmentTabHost<U>.() -> Unit) = Supportv4DSL.fragmentTabHost({ SupportDSLFragmentTabHost<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.contentLoadingProgressBar(crossinline r: SupportDSLContentLoadingProgressBar<U>.() -> Unit) = Supportv4DSL.contentLoadingProgressBar({ SupportDSLContentLoadingProgressBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.slidingPaneLayout(crossinline r: SupportDSLSlidingPaneLayout<U>.() -> Unit) = Supportv4DSL.slidingPaneLayout({ SupportDSLSlidingPaneLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewPager(crossinline r: SupportDSLViewPager<U>.() -> Unit) = Supportv4DSL.viewPager({ SupportDSLViewPager<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.space(crossinline r: SupportDSLSpace<U>.() -> Unit) = Supportv4DSL.space({ SupportDSLSpace<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.nestedScrollView(crossinline r: SupportDSLNestedScrollView<U>.() -> Unit) = Supportv4DSL.nestedScrollView({ SupportDSLNestedScrollView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.drawerLayout(crossinline r: SupportDSLDrawerLayout<U>.() -> Unit) = Supportv4DSL.drawerLayout({ SupportDSLDrawerLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.swipeRefreshLayout(crossinline r: SupportDSLSwipeRefreshLayout<U>.() -> Unit) = Supportv4DSL.swipeRefreshLayout({ SupportDSLSwipeRefreshLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.pagerTabStrip(crossinline r: SupportDSLPagerTabStrip<U>.() -> Unit) = Supportv4DSL.pagerTabStrip({ SupportDSLPagerTabStrip<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.pagerTitleStrip(crossinline r: SupportDSLPagerTitleStrip<U>.() -> Unit) = Supportv4DSL.pagerTitleStrip({ SupportDSLPagerTitleStrip<U>().r() })

open class SupportDSLContentLoadingProgressBar<T : ViewGroup.LayoutParams>() : DSLProgressBar<T>() {
}
open class SupportDSLSpace<T : ViewGroup.LayoutParams>() : DSLView<T>() {
}
open class SupportDSLDrawerLayoutBase<T : ViewGroup.LayoutParams, U : DrawerLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun drawerElevation(arg: Float) = Supportv4DSL.drawerElevation(arg)
	open fun drawerLockMode(arg: Int) = Supportv4DSL.drawerLockMode(arg)
	open fun scrimColor(arg: Int) = Supportv4DSL.scrimColor(arg)
	open fun statusBarBackground(arg: Drawable) = Supportv4DSL.statusBarBackground(arg)
	open fun statusBarBackground(arg: Int) = Supportv4DSL.statusBarBackground(arg)
	open fun statusBarBackgroundColor(arg: Int) = Supportv4DSL.statusBarBackgroundColor(arg)
}
open class SupportDSLDrawerLayout<T : ViewGroup.LayoutParams>() : SupportDSLDrawerLayoutBase<T, DrawerLayout.LayoutParams>() {
}
open class SupportDSLNestedScrollView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun fillViewport(arg: Boolean) = Supportv4DSL.fillViewport(arg)
	open fun nestedScrollingEnabled(arg: Boolean) = Supportv4DSL.nestedScrollingEnabled(arg)
	open fun onScrollChange(arg: NestedScrollView.OnScrollChangeListener) = Supportv4DSL.onScrollChange(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = Supportv4DSL.smoothScrollingEnabled(arg)
}
open class SupportDSLFragmentTabHost<T : ViewGroup.LayoutParams>() : DSLTabHost<T>() {
}
open class SupportDSLPagerTitleStrip<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	open fun gravity(arg: Int) = Supportv4DSL.gravity(arg)
	open fun nonPrimaryAlpha(arg: Float) = Supportv4DSL.nonPrimaryAlpha(arg)
	open fun textColor(arg: Int) = Supportv4DSL.textColor(arg)
	open fun textSpacing(arg: Int) = Supportv4DSL.textSpacing(arg)
}
open class SupportDSLPagerTabStrip<T : ViewGroup.LayoutParams>() : SupportDSLPagerTitleStrip<T>() {
	open fun drawFullUnderline(arg: Boolean) = Supportv4DSL.drawFullUnderline(arg)
	open fun tabIndicatorColor(arg: Int) = Supportv4DSL.tabIndicatorColor(arg)
	open fun tabIndicatorColorResource(arg: Int) = Supportv4DSL.tabIndicatorColorResource(arg)
}
open class SupportDSLSlidingPaneLayoutBase<T : ViewGroup.LayoutParams, U : SlidingPaneLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun coveredFadeColor(arg: Int) = Supportv4DSL.coveredFadeColor(arg)
	open fun panelSlideListener(arg: SlidingPaneLayout.PanelSlideListener) = Supportv4DSL.panelSlideListener(arg)
	open fun parallaxDistance(arg: Int) = Supportv4DSL.parallaxDistance(arg)
	open fun shadowDrawableLeft(arg: Drawable) = Supportv4DSL.shadowDrawableLeft(arg)
	open fun shadowDrawableRight(arg: Drawable) = Supportv4DSL.shadowDrawableRight(arg)
	open fun shadowResourceLeft(arg: Int) = Supportv4DSL.shadowResourceLeft(arg)
	open fun shadowResourceRight(arg: Int) = Supportv4DSL.shadowResourceRight(arg)
	open fun sliderFadeColor(arg: Int) = Supportv4DSL.sliderFadeColor(arg)
}
open class SupportDSLSlidingPaneLayout<T : ViewGroup.LayoutParams>() : SupportDSLSlidingPaneLayoutBase<T, SlidingPaneLayout.LayoutParams>() {
}
open class SupportDSLSwipeRefreshLayout<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
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
open class SupportDSLViewPagerBase<T : ViewGroup.LayoutParams, U : ViewPager.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun adapter(arg: PagerAdapter) = Supportv4DSL.adapter(arg)
	open fun currentItem(arg: Int) = Supportv4DSL.currentItem(arg)
	open fun offscreenPageLimit(arg: Int) = Supportv4DSL.offscreenPageLimit(arg)
	open fun pageMargin(arg: Int) = Supportv4DSL.pageMargin(arg)
	open fun pageMarginDrawable(arg: Drawable) = Supportv4DSL.pageMarginDrawable(arg)
	open fun pageMarginDrawable(arg: Int) = Supportv4DSL.pageMarginDrawable(arg)
}
open class SupportDSLViewPager<T : ViewGroup.LayoutParams>() : SupportDSLViewPagerBase<T, ViewPager.LayoutParams>() {
}