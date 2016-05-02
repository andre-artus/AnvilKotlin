@file:Suppress("unused")

package graknol.anvil.kotlin.support

import android.graphics.drawable.Drawable
import android.support.v4.view.PagerAdapter
import android.support.v4.widget.NestedScrollView
import android.support.v4.widget.SlidingPaneLayout
import android.support.v4.widget.SwipeRefreshLayout
import graknol.anvil.kotlin.DSLFrameLayout
import graknol.anvil.kotlin.DSLProgressBar
import graknol.anvil.kotlin.DSLTabHost
import graknol.anvil.kotlin.DSLViewGroup
import trikita.anvil.Anvil
import trikita.anvil.BaseDSL
import trikita.anvil.support.v4.Supportv4DSL

fun Anvil.Renderable.pagerTabStrip(r: SupportDSLPagerTabStrip.() -> Unit) = Supportv4DSL.pagerTabStrip({ SupportDSLPagerTabStrip().r() })
fun Anvil.Renderable.pagerTitleStrip(r: SupportDSLPagerTitleStrip.() -> Unit) = Supportv4DSL.pagerTitleStrip({ SupportDSLPagerTitleStrip().r() })
fun Anvil.Renderable.contentLoadingProgressBar(r: SupportDSLContentLoadingProgressBar.() -> Unit) = Supportv4DSL.contentLoadingProgressBar({ SupportDSLContentLoadingProgressBar().r() })
fun Anvil.Renderable.nestedScrollView(r: SupportDSLNestedScrollView.() -> Unit) = Supportv4DSL.nestedScrollView({ SupportDSLNestedScrollView().r() })
fun Anvil.Renderable.slidingPaneLayout(r: SupportDSLSlidingPaneLayout.() -> Unit) = Supportv4DSL.slidingPaneLayout({ SupportDSLSlidingPaneLayout().r() })
fun Anvil.Renderable.swipeRefreshLayout(r: SupportDSLSwipeRefreshLayout.() -> Unit) = Supportv4DSL.swipeRefreshLayout({ SupportDSLSwipeRefreshLayout().r() })
fun Anvil.Renderable.space(r: SupportDSLSpace.() -> Unit) = Supportv4DSL.space({ SupportDSLSpace().r() })
fun Anvil.Renderable.drawerLayout(r: SupportDSLDrawerLayout.() -> Unit) = Supportv4DSL.drawerLayout({ SupportDSLDrawerLayout().r() })
fun Anvil.Renderable.viewPager(r: SupportDSLViewPager.() -> Unit) = Supportv4DSL.viewPager({ SupportDSLViewPager().r() })
fun Anvil.Renderable.fragmentTabHost(r: SupportDSLFragmentTabHost.() -> Unit) = Supportv4DSL.fragmentTabHost({ SupportDSLFragmentTabHost().r() })

open class SupportDSLContentLoadingProgressBar : DSLProgressBar() {
}
open class SupportDSLSpace : BaseDSL() {
}
open class SupportDSLDrawerLayout : DSLViewGroup() {
	open fun drawerElevation(arg: Float) = Supportv4DSL.drawerElevation(arg)
	open fun drawerLockMode(arg: Int) = Supportv4DSL.drawerLockMode(arg)
	open fun scrimColor(arg: Int) = Supportv4DSL.scrimColor(arg)
	open fun statusBarBackground(arg: Drawable) = Supportv4DSL.statusBarBackground(arg)
	open fun statusBarBackground(arg: Int) = Supportv4DSL.statusBarBackground(arg)
	open fun statusBarBackgroundColor(arg: Int) = Supportv4DSL.statusBarBackgroundColor(arg)
}
open class SupportDSLNestedScrollView : DSLFrameLayout() {
	open fun fillViewport(arg: Boolean) = Supportv4DSL.fillViewport(arg)
	open fun nestedScrollingEnabled(arg: Boolean) = Supportv4DSL.nestedScrollingEnabled(arg)
	open fun onScrollChange(arg: NestedScrollView.OnScrollChangeListener) = Supportv4DSL.onScrollChange(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = Supportv4DSL.smoothScrollingEnabled(arg)
}
open class SupportDSLFragmentTabHost : DSLTabHost() {
}
open class SupportDSLPagerTitleStrip : DSLViewGroup() {
	open fun gravity(arg: Int) = Supportv4DSL.gravity(arg)
	open fun nonPrimaryAlpha(arg: Float) = Supportv4DSL.nonPrimaryAlpha(arg)
	open fun textColor(arg: Int) = Supportv4DSL.textColor(arg)
	open fun textSpacing(arg: Int) = Supportv4DSL.textSpacing(arg)
}
open class SupportDSLPagerTabStrip : SupportDSLPagerTitleStrip() {
	open fun drawFullUnderline(arg: Boolean) = Supportv4DSL.drawFullUnderline(arg)
	open fun tabIndicatorColor(arg: Int) = Supportv4DSL.tabIndicatorColor(arg)
	open fun tabIndicatorColorResource(arg: Int) = Supportv4DSL.tabIndicatorColorResource(arg)
}
open class SupportDSLSlidingPaneLayout : DSLViewGroup() {
	open fun coveredFadeColor(arg: Int) = Supportv4DSL.coveredFadeColor(arg)
	open fun panelSlideListener(arg: SlidingPaneLayout.PanelSlideListener) = Supportv4DSL.panelSlideListener(arg)
	open fun parallaxDistance(arg: Int) = Supportv4DSL.parallaxDistance(arg)
	open fun shadowDrawableLeft(arg: Drawable) = Supportv4DSL.shadowDrawableLeft(arg)
	open fun shadowDrawableRight(arg: Drawable) = Supportv4DSL.shadowDrawableRight(arg)
	open fun shadowResourceLeft(arg: Int) = Supportv4DSL.shadowResourceLeft(arg)
	open fun shadowResourceRight(arg: Int) = Supportv4DSL.shadowResourceRight(arg)
	open fun sliderFadeColor(arg: Int) = Supportv4DSL.sliderFadeColor(arg)
}
open class SupportDSLSwipeRefreshLayout : DSLViewGroup() {
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
open class SupportDSLViewPager : DSLViewGroup() {
	open fun adapter(arg: PagerAdapter) = Supportv4DSL.adapter(arg)
	open fun currentItem(arg: Int) = Supportv4DSL.currentItem(arg)
	open fun offscreenPageLimit(arg: Int) = Supportv4DSL.offscreenPageLimit(arg)
	open fun pageMargin(arg: Int) = Supportv4DSL.pageMargin(arg)
	open fun pageMarginDrawable(arg: Drawable) = Supportv4DSL.pageMarginDrawable(arg)
	open fun pageMarginDrawable(arg: Int) = Supportv4DSL.pageMarginDrawable(arg)
}
