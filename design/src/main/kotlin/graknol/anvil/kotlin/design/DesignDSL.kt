@file:Suppress("unused")

package graknol.anvil.kotlin.design

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.v4.view.ViewPager
import android.view.ViewGroup
import graknol.anvil.kotlin.*
import graknol.anvil.kotlin.appcompat.AppCompatDSLAppCompatEditText
import graknol.anvil.kotlin.appcompat.AppCompatDSLLinearLayoutCompat
import graknol.anvil.kotlin.recyclerview.RecyclerViewDSLRecyclerView
import trikita.anvil.design.DesignDSL

inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.collapsingToolbarLayout(crossinline r: DesignDSLCollapsingToolbarLayout<U>.() -> Unit) = DesignDSL.collapsingToolbarLayout({ DesignDSLCollapsingToolbarLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.navigationView(crossinline r: DesignDSLNavigationView<U>.() -> Unit) = DesignDSL.navigationView({ DesignDSLNavigationView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.textInputEditText(crossinline r: DesignDSLTextInputEditText<U>.() -> Unit) = DesignDSL.textInputEditText({ DesignDSLTextInputEditText<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.floatingActionButton(crossinline r: DesignDSLFloatingActionButton<U>.() -> Unit) = DesignDSL.floatingActionButton({ DesignDSLFloatingActionButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.tabItem(crossinline r: DesignDSLTabItem<U>.() -> Unit) = DesignDSL.tabItem({ DesignDSLTabItem<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.textInputLayout(crossinline r: DesignDSLTextInputLayout<U>.() -> Unit) = DesignDSL.textInputLayout({ DesignDSLTextInputLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.tabLayout(crossinline r: DesignDSLTabLayout<U>.() -> Unit) = DesignDSL.tabLayout({ DesignDSLTabLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.scrimInsetsFrameLayout(crossinline r: DesignDSLScrimInsetsFrameLayout<U>.() -> Unit) = DesignDSL.scrimInsetsFrameLayout({ DesignDSLScrimInsetsFrameLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.navigationMenuItemView(crossinline r: DesignDSLNavigationMenuItemView<U>.() -> Unit) = DesignDSL.navigationMenuItemView({ DesignDSLNavigationMenuItemView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.coordinatorLayout(crossinline r: DesignDSLCoordinatorLayout<U>.() -> Unit) = DesignDSL.coordinatorLayout({ DesignDSLCoordinatorLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.navigationMenuView(crossinline r: DesignDSLNavigationMenuView<U>.() -> Unit) = DesignDSL.navigationMenuView({ DesignDSLNavigationMenuView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appBarLayout(crossinline r: DesignDSLAppBarLayout<U>.() -> Unit) = DesignDSL.appBarLayout({ DesignDSLAppBarLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.foregroundLinearLayout(crossinline r: DesignDSLForegroundLinearLayout<U>.() -> Unit) = DesignDSL.foregroundLinearLayout({ DesignDSLForegroundLinearLayout<U>().r() })

open class DesignDSLVisibilityAwareImageButton<T : ViewGroup.LayoutParams>() : DSLImageButton<T>() {
}
open class DesignDSLFloatingActionButton<T : ViewGroup.LayoutParams>() : DesignDSLVisibilityAwareImageButton<T>() {
	open fun backgroundTintList(arg: ColorStateList) = DesignDSL.backgroundTintList(arg)
	open fun backgroundTintMode(arg: PorterDuff.Mode) = DesignDSL.backgroundTintMode(arg)
	open fun compatElevation(arg: Float) = DesignDSL.compatElevation(arg)
	open fun rippleColor(arg: Int) = DesignDSL.rippleColor(arg)
	open fun useCompatPadding(arg: Boolean) = DesignDSL.useCompatPadding(arg)
}
open class DesignDSLTabItem<T : ViewGroup.LayoutParams>() : DSLView<T>() {
}
open class DesignDSLTextInputEditText<T : ViewGroup.LayoutParams>() : AppCompatDSLAppCompatEditText<T>() {
}
open class DesignDSLCoordinatorLayoutBase<T : ViewGroup.LayoutParams, U : CoordinatorLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun statusBarBackground(arg: Drawable) = DesignDSL.statusBarBackground(arg)
	open fun statusBarBackgroundColor(arg: Int) = DesignDSL.statusBarBackgroundColor(arg)
	open fun statusBarBackgroundResource(arg: Int) = DesignDSL.statusBarBackgroundResource(arg)
}
open class DesignDSLCoordinatorLayout<T : ViewGroup.LayoutParams> : DesignDSLCoordinatorLayoutBase<T, CoordinatorLayout.LayoutParams>() {
}
open class DesignDSLCollapsingToolbarLayoutBase<T : ViewGroup.LayoutParams, U : CollapsingToolbarLayout.LayoutParams>() : DSLFrameLayoutBase<T, U>() {
	open fun collapsedTitleGravity(arg: Int) = DesignDSL.collapsedTitleGravity(arg)
	open fun collapsedTitleTextAppearance(arg: Int) = DesignDSL.collapsedTitleTextAppearance(arg)
	open fun collapsedTitleTextColor(arg: Int) = DesignDSL.collapsedTitleTextColor(arg)
	open fun collapsedTitleTypeface(arg: Typeface) = DesignDSL.collapsedTitleTypeface(arg)
	open fun contentScrim(arg: Drawable) = DesignDSL.contentScrim(arg)
	open fun contentScrimColor(arg: Int) = DesignDSL.contentScrimColor(arg)
	open fun contentScrimResource(arg: Int) = DesignDSL.contentScrimResource(arg)
	open fun expandedTitleColor(arg: Int) = DesignDSL.expandedTitleColor(arg)
	open fun expandedTitleGravity(arg: Int) = DesignDSL.expandedTitleGravity(arg)
	open fun expandedTitleMarginBottom(arg: Int) = DesignDSL.expandedTitleMarginBottom(arg)
	open fun expandedTitleMarginEnd(arg: Int) = DesignDSL.expandedTitleMarginEnd(arg)
	open fun expandedTitleMarginStart(arg: Int) = DesignDSL.expandedTitleMarginStart(arg)
	open fun expandedTitleMarginTop(arg: Int) = DesignDSL.expandedTitleMarginTop(arg)
	open fun expandedTitleTextAppearance(arg: Int) = DesignDSL.expandedTitleTextAppearance(arg)
	open fun expandedTitleTypeface(arg: Typeface) = DesignDSL.expandedTitleTypeface(arg)
	open fun scrimsShown(arg: Boolean) = DesignDSL.scrimsShown(arg)
	open fun statusBarScrim(arg: Drawable) = DesignDSL.statusBarScrim(arg)
	open fun statusBarScrimColor(arg: Int) = DesignDSL.statusBarScrimColor(arg)
	open fun statusBarScrimResource(arg: Int) = DesignDSL.statusBarScrimResource(arg)
	open fun title(arg: CharSequence) = DesignDSL.title(arg)
	open fun titleEnabled(arg: Boolean) = DesignDSL.titleEnabled(arg)
}
open class DesignDSLCollapsingToolbarLayout<T : ViewGroup.LayoutParams>() : DSLFrameLayoutBase<T, CollapsingToolbarLayout.LayoutParams>() {
}
open class DesignDSLTabLayout<T : ViewGroup.LayoutParams>() : DSLHorizontalScrollView<T>() {
	open fun onTabSelected(arg: android.support.design.widget.TabLayout.OnTabSelectedListener) = DesignDSL.onTabSelected(arg)
	open fun selectedTabIndicatorColor(arg: Int) = DesignDSL.selectedTabIndicatorColor(arg)
	open fun selectedTabIndicatorHeight(arg: Int) = DesignDSL.selectedTabIndicatorHeight(arg)
	open fun tabGravity(arg: Int) = DesignDSL.tabGravity(arg)
	open fun tabMode(arg: Int) = DesignDSL.tabMode(arg)
	open fun tabTextColors(arg: ColorStateList) = DesignDSL.tabTextColors(arg)
	open fun upWithViewPager(arg: ViewPager) = DesignDSL.upWithViewPager(arg)
}
open class DesignDSLScrimInsetsFrameLayout<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
}
open class DesignDSLNavigationView<T : ViewGroup.LayoutParams>() : DesignDSLScrimInsetsFrameLayout<T>() {
	open fun checkedItem(arg: Int) = DesignDSL.checkedItem(arg)
	open fun itemBackground(arg: Drawable) = DesignDSL.itemBackground(arg)
	open fun itemBackgroundResource(arg: Int) = DesignDSL.itemBackgroundResource(arg)
	open fun itemIconTintList(arg: ColorStateList) = DesignDSL.itemIconTintList(arg)
	open fun itemTextAppearance(arg: Int) = DesignDSL.itemTextAppearance(arg)
	open fun itemTextColor(arg: ColorStateList) = DesignDSL.itemTextColor(arg)
	open fun navigationItemSelectedListener(arg: android.support.design.widget.NavigationView.OnNavigationItemSelectedListener) = DesignDSL.navigationItemSelectedListener(arg)
}
open class DesignDSLAppBarLayoutBase<T : ViewGroup.LayoutParams, U : AppBarLayout.LayoutParams>() : DSLLinearLayoutBase<T, U>() {
	open fun expanded(arg: Boolean) = DesignDSL.expanded(arg)
	open fun targetElevation(arg: Float) = DesignDSL.targetElevation(arg)
}
open class DesignDSLAppBarLayout<T : ViewGroup.LayoutParams>() : DesignDSLAppBarLayoutBase<T, AppBarLayout.LayoutParams>() {
}
open class DesignDSLTextInputLayout<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	open fun counterEnabled(arg: Boolean) = DesignDSL.counterEnabled(arg)
	open fun counterMaxLength(arg: Int) = DesignDSL.counterMaxLength(arg)
	open fun error(arg: CharSequence) = DesignDSL.error(arg)
	open fun errorEnabled(arg: Boolean) = DesignDSL.errorEnabled(arg)
	open fun hint(arg: CharSequence) = DesignDSL.hint(arg)
	open fun hintAnimationEnabled(arg: Boolean) = DesignDSL.hintAnimationEnabled(arg)
	open fun hintEnabled(arg: Boolean) = DesignDSL.hintEnabled(arg)
	open fun hintTextAppearance(arg: Int) = DesignDSL.hintTextAppearance(arg)
	open fun typeface(arg: Typeface) = DesignDSL.typeface(arg)
}
open class DesignDSLForegroundLinearLayout<T : ViewGroup.LayoutParams>() : AppCompatDSLLinearLayoutCompat<T>() {
	open fun foreground(arg: Drawable) = DesignDSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = DesignDSL.foregroundGravity(arg)
}
open class DesignDSLNavigationMenuItemView<T : ViewGroup.LayoutParams>() : DesignDSLForegroundLinearLayout<T>() {
	open fun checkable(arg: Boolean) = DesignDSL.checkable(arg)
	open fun checked(arg: Boolean) = DesignDSL.checked(arg)
	open fun icon(arg: Drawable) = DesignDSL.icon(arg)
	open fun textColor(arg: ColorStateList) = DesignDSL.textColor(arg)
	open fun title(arg: CharSequence) = DesignDSL.title(arg)
}
open class DesignDSLNavigationMenuView<T : ViewGroup.LayoutParams>() : RecyclerViewDSLRecyclerView<T>() {
}