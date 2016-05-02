@file:Suppress("unused")

package graknol.anvil.kotlin.design

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.support.v4.view.ViewPager
import graknol.anvil.kotlin.BaseDSL
import graknol.anvil.kotlin.DSLImageButton
import graknol.anvil.kotlin.appcompat.AppCompatDSLEditText
import graknol.anvil.kotlin.appcompat.AppCompatDSLLinearLayoutCompat
import graknol.anvil.kotlin.recyclerview.RecyclerViewDSLRecyclerView
import trikita.anvil.Anvil

fun Anvil.Renderable.appBarLayout(r: DesignDSLAppBarLayout.() -> Unit) = trikita.anvil.design.DesignDSL.appBarLayout({ DesignDSLAppBarLayout().r() })
fun Anvil.Renderable.scrimInsetsFrameLayout(r: DesignDSLScrimInsetsFrameLayout.() -> Unit) = trikita.anvil.design.DesignDSL.scrimInsetsFrameLayout({ DesignDSLScrimInsetsFrameLayout().r() })
fun Anvil.Renderable.textInputLayout(r: DesignDSLTextInputLayout.() -> Unit) = trikita.anvil.design.DesignDSL.textInputLayout({ DesignDSLTextInputLayout().r() })
fun Anvil.Renderable.tabLayout(r: DesignDSLTabLayout.() -> Unit) = trikita.anvil.design.DesignDSL.tabLayout({ DesignDSLTabLayout().r() })
fun Anvil.Renderable.foregroundLinearLayout(r: DesignDSLForegroundLinearLayout.() -> Unit) = trikita.anvil.design.DesignDSL.foregroundLinearLayout({ DesignDSLForegroundLinearLayout().r() })
fun Anvil.Renderable.navigationMenuItemView(r: DesignDSLNavigationMenuItemView.() -> Unit) = trikita.anvil.design.DesignDSL.navigationMenuItemView({ DesignDSLNavigationMenuItemView().r() })
fun Anvil.Renderable.textInputEditText(r: DesignDSLTextInputEditText.() -> Unit) = trikita.anvil.design.DesignDSL.textInputEditText({ DesignDSLTextInputEditText().r() })
fun Anvil.Renderable.floatingActionButton(r: DesignDSLFloatingActionButton.() -> Unit) = trikita.anvil.design.DesignDSL.floatingActionButton({ DesignDSLFloatingActionButton().r() })
fun Anvil.Renderable.navigationView(r: DesignDSLNavigationView.() -> Unit) = trikita.anvil.design.DesignDSL.navigationView({ DesignDSLNavigationView().r() })
fun Anvil.Renderable.collapsingToolbarLayout(r: DesignDSLCollapsingToolbarLayout.() -> Unit) = trikita.anvil.design.DesignDSL.collapsingToolbarLayout({ DesignDSLCollapsingToolbarLayout().r() })
fun Anvil.Renderable.tabItem(r: DesignDSLTabItem.() -> Unit) = trikita.anvil.design.DesignDSL.tabItem({ DesignDSLTabItem().r() })
fun Anvil.Renderable.navigationMenuView(r: DesignDSLNavigationMenuView.() -> Unit) = trikita.anvil.design.DesignDSL.navigationMenuView({ DesignDSLNavigationMenuView().r() })
fun Anvil.Renderable.coordinatorLayout(r: DesignDSLCoordinatorLayout.() -> Unit) = trikita.anvil.design.DesignDSL.coordinatorLayout({ DesignDSLCoordinatorLayout().r() })

open class DesignDSLVisibilityAwareImageButton : DSLImageButton() {
}
open class DesignDSLFloatingActionButton : DesignDSLVisibilityAwareImageButton() {
	open fun backgroundTintList(arg: ColorStateList) = trikita.anvil.design.DesignDSL.backgroundTintList(arg)
	open fun backgroundTintMode(arg: PorterDuff.Mode) = trikita.anvil.design.DesignDSL.backgroundTintMode(arg)
	open fun compatElevation(arg: Float) = trikita.anvil.design.DesignDSL.compatElevation(arg)
	open fun rippleColor(arg: Int) = trikita.anvil.design.DesignDSL.rippleColor(arg)
	open fun useCompatPadding(arg: Boolean) = trikita.anvil.design.DesignDSL.useCompatPadding(arg)
}
open class DesignDSLTabItem : BaseDSL() {
}
open class DesignDSLTextInputEditText : AppCompatDSLEditText() {
}
open class DesignDSLCoordinatorLayout : graknol.anvil.kotlin.DSLViewGroup() {
	open fun statusBarBackground(arg: Drawable) = trikita.anvil.design.DesignDSL.statusBarBackground(arg)
	open fun statusBarBackgroundColor(arg: Int) = trikita.anvil.design.DesignDSL.statusBarBackgroundColor(arg)
	open fun statusBarBackgroundResource(arg: Int) = trikita.anvil.design.DesignDSL.statusBarBackgroundResource(arg)
}
open class DesignDSLCollapsingToolbarLayout : graknol.anvil.kotlin.DSLFrameLayout() {
	open fun collapsedTitleGravity(arg: Int) = trikita.anvil.design.DesignDSL.collapsedTitleGravity(arg)
	open fun collapsedTitleTextAppearance(arg: Int) = trikita.anvil.design.DesignDSL.collapsedTitleTextAppearance(arg)
	open fun collapsedTitleTextColor(arg: Int) = trikita.anvil.design.DesignDSL.collapsedTitleTextColor(arg)
	open fun collapsedTitleTypeface(arg: Typeface) = trikita.anvil.design.DesignDSL.collapsedTitleTypeface(arg)
	open fun contentScrim(arg: Drawable) = trikita.anvil.design.DesignDSL.contentScrim(arg)
	open fun contentScrimColor(arg: Int) = trikita.anvil.design.DesignDSL.contentScrimColor(arg)
	open fun contentScrimResource(arg: Int) = trikita.anvil.design.DesignDSL.contentScrimResource(arg)
	open fun expandedTitleColor(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleColor(arg)
	open fun expandedTitleGravity(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleGravity(arg)
	open fun expandedTitleMarginBottom(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleMarginBottom(arg)
	open fun expandedTitleMarginEnd(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleMarginEnd(arg)
	open fun expandedTitleMarginStart(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleMarginStart(arg)
	open fun expandedTitleMarginTop(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleMarginTop(arg)
	open fun expandedTitleTextAppearance(arg: Int) = trikita.anvil.design.DesignDSL.expandedTitleTextAppearance(arg)
	open fun expandedTitleTypeface(arg: Typeface) = trikita.anvil.design.DesignDSL.expandedTitleTypeface(arg)
	open fun scrimsShown(arg: Boolean) = trikita.anvil.design.DesignDSL.scrimsShown(arg)
	open fun statusBarScrim(arg: Drawable) = trikita.anvil.design.DesignDSL.statusBarScrim(arg)
	open fun statusBarScrimColor(arg: Int) = trikita.anvil.design.DesignDSL.statusBarScrimColor(arg)
	open fun statusBarScrimResource(arg: Int) = trikita.anvil.design.DesignDSL.statusBarScrimResource(arg)
	open fun title(arg: CharSequence) = trikita.anvil.design.DesignDSL.title(arg)
	open fun titleEnabled(arg: Boolean) = trikita.anvil.design.DesignDSL.titleEnabled(arg)
}
open class DesignDSLTabLayout : graknol.anvil.kotlin.DSLHorizontalScrollView() {
	open fun onTabSelected(arg: android.support.design.widget.TabLayout.OnTabSelectedListener) = trikita.anvil.design.DesignDSL.onTabSelected(arg)
	open fun selectedTabIndicatorColor(arg: Int) = trikita.anvil.design.DesignDSL.selectedTabIndicatorColor(arg)
	open fun selectedTabIndicatorHeight(arg: Int) = trikita.anvil.design.DesignDSL.selectedTabIndicatorHeight(arg)
	open fun tabGravity(arg: Int) = trikita.anvil.design.DesignDSL.tabGravity(arg)
	open fun tabMode(arg: Int) = trikita.anvil.design.DesignDSL.tabMode(arg)
	open fun tabTextColors(arg: ColorStateList) = trikita.anvil.design.DesignDSL.tabTextColors(arg)
	open fun upWithViewPager(arg: ViewPager) = trikita.anvil.design.DesignDSL.upWithViewPager(arg)
}
open class DesignDSLScrimInsetsFrameLayout : graknol.anvil.kotlin.DSLFrameLayout() {
}
open class DesignDSLNavigationView : DesignDSLScrimInsetsFrameLayout() {
	open fun checkedItem(arg: Int) = trikita.anvil.design.DesignDSL.checkedItem(arg)
	open fun itemBackground(arg: Drawable) = trikita.anvil.design.DesignDSL.itemBackground(arg)
	open fun itemBackgroundResource(arg: Int) = trikita.anvil.design.DesignDSL.itemBackgroundResource(arg)
	open fun itemIconTintList(arg: ColorStateList) = trikita.anvil.design.DesignDSL.itemIconTintList(arg)
	open fun itemTextAppearance(arg: Int) = trikita.anvil.design.DesignDSL.itemTextAppearance(arg)
	open fun itemTextColor(arg: ColorStateList) = trikita.anvil.design.DesignDSL.itemTextColor(arg)
	open fun navigationItemSelectedListener(arg: android.support.design.widget.NavigationView.OnNavigationItemSelectedListener) = trikita.anvil.design.DesignDSL.navigationItemSelectedListener(arg)
}
open class DesignDSLAppBarLayout : graknol.anvil.kotlin.DSLLinearLayout() {
	open fun expanded(arg: Boolean) = trikita.anvil.design.DesignDSL.expanded(arg)
	open fun targetElevation(arg: Float) = trikita.anvil.design.DesignDSL.targetElevation(arg)
}
open class DesignDSLTextInputLayout : graknol.anvil.kotlin.DSLLinearLayout() {
	open fun counterEnabled(arg: Boolean) = trikita.anvil.design.DesignDSL.counterEnabled(arg)
	open fun counterMaxLength(arg: Int) = trikita.anvil.design.DesignDSL.counterMaxLength(arg)
	open fun error(arg: CharSequence) = trikita.anvil.design.DesignDSL.error(arg)
	open fun errorEnabled(arg: Boolean) = trikita.anvil.design.DesignDSL.errorEnabled(arg)
	open fun hint(arg: CharSequence) = trikita.anvil.design.DesignDSL.hint(arg)
	open fun hintAnimationEnabled(arg: Boolean) = trikita.anvil.design.DesignDSL.hintAnimationEnabled(arg)
	open fun hintEnabled(arg: Boolean) = trikita.anvil.design.DesignDSL.hintEnabled(arg)
	open fun hintTextAppearance(arg: Int) = trikita.anvil.design.DesignDSL.hintTextAppearance(arg)
	open fun typeface(arg: Typeface) = trikita.anvil.design.DesignDSL.typeface(arg)
}
open class DesignDSLForegroundLinearLayout : AppCompatDSLLinearLayoutCompat() {
	open fun foreground(arg: Drawable) = trikita.anvil.design.DesignDSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = trikita.anvil.design.DesignDSL.foregroundGravity(arg)
}
open class DesignDSLNavigationMenuItemView : DesignDSLForegroundLinearLayout() {
	open fun checkable(arg: Boolean) = trikita.anvil.design.DesignDSL.checkable(arg)
	open fun checked(arg: Boolean) = trikita.anvil.design.DesignDSL.checked(arg)
	open fun icon(arg: Drawable) = trikita.anvil.design.DesignDSL.icon(arg)
	open fun textColor(arg: ColorStateList) = trikita.anvil.design.DesignDSL.textColor(arg)
	open fun title(arg: CharSequence) = trikita.anvil.design.DesignDSL.title(arg)
}
open class DesignDSLNavigationMenuView : RecyclerViewDSLRecyclerView() {
}
