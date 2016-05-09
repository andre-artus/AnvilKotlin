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
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.RecyclerView
import android.widget.FrameLayout
import android.widget.LinearLayout
import graknol.anvil.kotlin.*
import graknol.anvil.kotlin.appcompat.AppCompatDSLAppCompatEditTextBase
import graknol.anvil.kotlin.appcompat.AppCompatDSLLinearLayoutCompatBase
import graknol.anvil.kotlin.recyclerview.RecyclerViewDSLRecyclerViewBase
import trikita.anvil.Anvil
import trikita.anvil.design.DesignDSL

inline fun Anvil.Renderable.collapsingToolbarLayout( crossinline r: DesignDSLCollapsingToolbarLayout.() -> Unit) = DesignDSL.collapsingToolbarLayout({ DesignDSLCollapsingToolbarLayout.r() })
inline fun Anvil.Renderable.navigationView( crossinline r: DesignDSLNavigationView.() -> Unit) = DesignDSL.navigationView({ DesignDSLNavigationView.r() })
inline fun Anvil.Renderable.textInputEditText( crossinline r: DesignDSLTextInputEditText.() -> Unit) = DesignDSL.textInputEditText({ DesignDSLTextInputEditText.r() })
inline fun Anvil.Renderable.floatingActionButton( crossinline r: DesignDSLFloatingActionButton.() -> Unit) = DesignDSL.floatingActionButton({ DesignDSLFloatingActionButton.r() })
inline fun Anvil.Renderable.tabItem( crossinline r: DesignDSLTabItem.() -> Unit) = DesignDSL.tabItem({ DesignDSLTabItem.r() })
inline fun Anvil.Renderable.textInputLayout(crossinline r: DesignDSLTextInputLayout.() -> Unit) = DesignDSL.textInputLayout({ DesignDSLTextInputLayout.r() })
inline fun Anvil.Renderable.tabLayout( crossinline r: DesignDSLTabLayout.() -> Unit) = DesignDSL.tabLayout({ DesignDSLTabLayout.r() })
inline fun Anvil.Renderable.scrimInsetsFrameLayout( crossinline r: DesignDSLScrimInsetsFrameLayout.() -> Unit) = DesignDSL.scrimInsetsFrameLayout({ DesignDSLScrimInsetsFrameLayout.r() })
inline fun Anvil.Renderable.navigationMenuItemView( crossinline r: DesignDSLNavigationMenuItemView.() -> Unit) = DesignDSL.navigationMenuItemView({ DesignDSLNavigationMenuItemView.r() })
inline fun Anvil.Renderable.coordinatorLayout( crossinline r: DesignDSLCoordinatorLayout.() -> Unit) = DesignDSL.coordinatorLayout({ DesignDSLCoordinatorLayout.r() })
inline fun Anvil.Renderable.navigationMenuView( crossinline r: DesignDSLNavigationMenuView.() -> Unit) = DesignDSL.navigationMenuView({ DesignDSLNavigationMenuView.r() })
inline fun Anvil.Renderable.appBarLayout( crossinline r: DesignDSLAppBarLayout.() -> Unit) = DesignDSL.appBarLayout({ DesignDSLAppBarLayout.r() })
inline fun Anvil.Renderable.foregroundLinearLayout( crossinline r: DesignDSLForegroundLinearLayout.() -> Unit) = DesignDSL.foregroundLinearLayout({ DesignDSLForegroundLinearLayout.r() })

object DesignDSLVisibilityAwareImageButton : DesignDSLVisibilityAwareImageButtonBase()
object DesignDSLFloatingActionButton : DesignDSLFloatingActionButtonBase()
object DesignDSLTabItem : DesignDSLTabItemBase()
object DesignDSLTextInputEditText : DesignDSLTextInputEditTextBase()
object DesignDSLCoordinatorLayout : DesignDSLCoordinatorLayoutBase<CoordinatorLayout.LayoutParams>()
object DesignDSLCollapsingToolbarLayout : DesignDSLCollapsingToolbarLayoutBase<CollapsingToolbarLayout.LayoutParams>()
object DesignDSLTabLayout : DesignDSLTabLayoutBase<FrameLayout.LayoutParams>()
object DesignDSLScrimInsetsFrameLayout : DesignDSLScrimInsetsFrameLayoutBase<FrameLayout.LayoutParams>()
object DesignDSLNavigationView : DesignDSLNavigationViewBase<FrameLayout.LayoutParams>()
object DesignDSLAppBarLayout : DesignDSLAppBarLayoutBase<AppBarLayout.LayoutParams>()
object DesignDSLTextInputLayout : DesignDSLTextInputLayoutBase<LinearLayout.LayoutParams>()
object DesignDSLForegroundLinearLayout : DesignDSLForegroundLinearLayoutBase<LinearLayoutCompat.LayoutParams>()
object DesignDSLNavigationMenuItemView : DesignDSLNavigationMenuItemViewBase<LinearLayoutCompat.LayoutParams>()
object DesignDSLNavigationMenuView : DesignDSLNavigationMenuViewBase<RecyclerView.LayoutParams>()

abstract class DesignDSLVisibilityAwareImageButtonBase : DSLImageButtonBase() {
}
abstract class DesignDSLFloatingActionButtonBase : DesignDSLVisibilityAwareImageButtonBase() {
	open fun backgroundTintList(arg: ColorStateList) = DesignDSL.backgroundTintList(arg)
	open fun backgroundTintMode(arg: PorterDuff.Mode) = DesignDSL.backgroundTintMode(arg)
	open fun compatElevation(arg: Float) = DesignDSL.compatElevation(arg)
	open fun rippleColor(arg: Int) = DesignDSL.rippleColor(arg)
	open fun useCompatPadding(arg: Boolean) = DesignDSL.useCompatPadding(arg)
}
abstract class DesignDSLTabItemBase : DSLViewBase() {
}
abstract class DesignDSLTextInputEditTextBase : AppCompatDSLAppCompatEditTextBase() {
}
abstract class DesignDSLCoordinatorLayoutBase<T : CoordinatorLayout.LayoutParams> : DSLViewGroupBase<T>() {
	open fun statusBarBackground(arg: Drawable) = DesignDSL.statusBarBackground(arg)
	open fun statusBarBackgroundColor(arg: Int) = DesignDSL.statusBarBackgroundColor(arg)
	open fun statusBarBackgroundResource(arg: Int) = DesignDSL.statusBarBackgroundResource(arg)
}
abstract class DesignDSLCollapsingToolbarLayoutBase<T : CollapsingToolbarLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
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
abstract class DesignDSLTabLayoutBase<T : FrameLayout.LayoutParams> : DSLHorizontalScrollViewBase<T>() {
	open fun onTabSelected(arg: android.support.design.widget.TabLayout.OnTabSelectedListener) = DesignDSL.onTabSelected(arg)
	open fun selectedTabIndicatorColor(arg: Int) = DesignDSL.selectedTabIndicatorColor(arg)
	open fun selectedTabIndicatorHeight(arg: Int) = DesignDSL.selectedTabIndicatorHeight(arg)
	open fun tabGravity(arg: Int) = DesignDSL.tabGravity(arg)
	open fun tabMode(arg: Int) = DesignDSL.tabMode(arg)
	open fun tabTextColors(arg: ColorStateList) = DesignDSL.tabTextColors(arg)
	open fun upWithViewPager(arg: ViewPager) = DesignDSL.upWithViewPager(arg)
}
abstract class DesignDSLScrimInsetsFrameLayoutBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
}
abstract class DesignDSLNavigationViewBase<T : FrameLayout.LayoutParams> : DesignDSLScrimInsetsFrameLayoutBase<T>() {
	open fun checkedItem(arg: Int) = DesignDSL.checkedItem(arg)
	open fun itemBackground(arg: Drawable) = DesignDSL.itemBackground(arg)
	open fun itemBackgroundResource(arg: Int) = DesignDSL.itemBackgroundResource(arg)
	open fun itemIconTintList(arg: ColorStateList) = DesignDSL.itemIconTintList(arg)
	open fun itemTextAppearance(arg: Int) = DesignDSL.itemTextAppearance(arg)
	open fun itemTextColor(arg: ColorStateList) = DesignDSL.itemTextColor(arg)
	open fun navigationItemSelectedListener(arg: android.support.design.widget.NavigationView.OnNavigationItemSelectedListener) = DesignDSL.navigationItemSelectedListener(arg)
}
abstract class DesignDSLAppBarLayoutBase<T : AppBarLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun expanded(arg: Boolean) = DesignDSL.expanded(arg)
	open fun targetElevation(arg: Float) = DesignDSL.targetElevation(arg)
}
abstract class DesignDSLTextInputLayoutBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
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
abstract class DesignDSLForegroundLinearLayoutBase<T : LinearLayoutCompat.LayoutParams> : AppCompatDSLLinearLayoutCompatBase<T>() {
	open fun foreground(arg: Drawable) = DesignDSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = DesignDSL.foregroundGravity(arg)
}
abstract class DesignDSLNavigationMenuItemViewBase<T : LinearLayoutCompat.LayoutParams> : DesignDSLForegroundLinearLayoutBase<T>() {
	open fun checkable(arg: Boolean) = DesignDSL.checkable(arg)
	open fun checked(arg: Boolean) = DesignDSL.checked(arg)
	open fun icon(arg: Drawable) = DesignDSL.icon(arg)
	open fun textColor(arg: ColorStateList) = DesignDSL.textColor(arg)
	open fun title(arg: CharSequence) = DesignDSL.title(arg)
}
abstract class DesignDSLNavigationMenuViewBase<T : RecyclerView.LayoutParams> : RecyclerViewDSLRecyclerViewBase<T>() {
}