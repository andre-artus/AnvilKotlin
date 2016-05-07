@file:Suppress("unused")

package graknol.anvil.kotlin.appcompat

import android.app.SearchableInfo
import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.view.ActionProvider
import android.support.v4.widget.CursorAdapter
import android.support.v7.view.menu.MenuBuilder
import android.support.v7.widget.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.PopupWindow
import graknol.anvil.kotlin.*
import trikita.anvil.appcompat.v7.AppCompatv7DSL

inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatRadioButton(crossinline r: AppCompatDSLAppCompatRadioButton<U>.() -> Unit) = AppCompatv7DSL.appCompatRadioButton({ AppCompatDSLAppCompatRadioButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.expandedMenuView(crossinline r: AppCompatDSLExpandedMenuView<U>.() -> Unit) = AppCompatv7DSL.expandedMenuView({ AppCompatDSLExpandedMenuView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.actionBarContextView(crossinline r: AppCompatDSLActionBarContextView<U>.() -> Unit) = AppCompatv7DSL.actionBarContextView({ AppCompatDSLActionBarContextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.scrollingTabContainerView(crossinline r: AppCompatDSLScrollingTabContainerView<U>.() -> Unit) = AppCompatv7DSL.scrollingTabContainerView({ AppCompatDSLScrollingTabContainerView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatAutoCompleteTextView(crossinline r: AppCompatDSLAppCompatAutoCompleteTextView<U>.() -> Unit) = AppCompatv7DSL.appCompatAutoCompleteTextView({ AppCompatDSLAppCompatAutoCompleteTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.dialogTitle(crossinline r: AppCompatDSLDialogTitle<U>.() -> Unit) = AppCompatv7DSL.dialogTitle({ AppCompatDSLDialogTitle<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.searchView(crossinline r: AppCompatDSLSearchView<U>.() -> Unit) = AppCompatv7DSL.searchView({ AppCompatDSLSearchView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatCheckBox(crossinline r: AppCompatDSLAppCompatCheckBox<U>.() -> Unit) = AppCompatv7DSL.appCompatCheckBox({ AppCompatDSLAppCompatCheckBox<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.fitWindowsFrameLayout(crossinline r: AppCompatDSLFitWindowsFrameLayout<U>.() -> Unit) = AppCompatv7DSL.fitWindowsFrameLayout({ AppCompatDSLFitWindowsFrameLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.switchCompat(crossinline r: AppCompatDSLSwitchCompat<U>.() -> Unit) = AppCompatv7DSL.switchCompat({ AppCompatDSLSwitchCompat<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatButton(crossinline r: AppCompatDSLAppCompatButton<U>.() -> Unit) = AppCompatv7DSL.appCompatButton({ AppCompatDSLAppCompatButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.actionMenuItemView(crossinline r: AppCompatDSLActionMenuItemView<U>.() -> Unit) = AppCompatv7DSL.actionMenuItemView({ AppCompatDSLActionMenuItemView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatMultiAutoCompleteTextView(crossinline r: AppCompatDSLAppCompatMultiAutoCompleteTextView<U>.() -> Unit) = AppCompatv7DSL.appCompatMultiAutoCompleteTextView({ AppCompatDSLAppCompatMultiAutoCompleteTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.actionBarOverlayLayout(crossinline r: AppCompatDSLActionBarOverlayLayout<U>.() -> Unit) = AppCompatv7DSL.actionBarOverlayLayout({ AppCompatDSLActionBarOverlayLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatSpinner(crossinline r: AppCompatDSLAppCompatSpinner<U>.() -> Unit) = AppCompatv7DSL.appCompatSpinner({ AppCompatDSLAppCompatSpinner<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.toolbar(crossinline r: AppCompatDSLToolbar<U>.() -> Unit) = AppCompatv7DSL.toolbar({ AppCompatDSLToolbar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.linearLayoutCompat(crossinline r: AppCompatDSLLinearLayoutCompat<U>.() -> Unit) = AppCompatv7DSL.linearLayoutCompat({ AppCompatDSLLinearLayoutCompat<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatImageButton(crossinline r: AppCompatDSLAppCompatImageButton<U>.() -> Unit) = AppCompatv7DSL.appCompatImageButton({ AppCompatDSLAppCompatImageButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatSeekBar(crossinline r: AppCompatDSLAppCompatSeekBar<U>.() -> Unit) = AppCompatv7DSL.appCompatSeekBar({ AppCompatDSLAppCompatSeekBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatRatingBar(crossinline r: AppCompatDSLAppCompatRatingBar<U>.() -> Unit) = AppCompatv7DSL.appCompatRatingBar({ AppCompatDSLAppCompatRatingBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.actionBarContainer(crossinline r: AppCompatDSLActionBarContainer<U>.() -> Unit) = AppCompatv7DSL.actionBarContainer({ AppCompatDSLActionBarContainer<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.buttonBarLayout(crossinline r: AppCompatDSLButtonBarLayout<U>.() -> Unit) = AppCompatv7DSL.buttonBarLayout({ AppCompatDSLButtonBarLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatEditText(crossinline r: AppCompatDSLAppCompatEditText<U>.() -> Unit) = AppCompatv7DSL.appCompatEditText({ AppCompatDSLAppCompatEditText<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.fitWindowsLinearLayout(crossinline r: AppCompatDSLFitWindowsLinearLayout<U>.() -> Unit) = AppCompatv7DSL.fitWindowsLinearLayout({ AppCompatDSLFitWindowsLinearLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.listViewCompat(crossinline r: AppCompatDSLListViewCompat<U>.() -> Unit) = AppCompatv7DSL.listViewCompat({ AppCompatDSLListViewCompat<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewStubCompat(crossinline r: AppCompatDSLViewStubCompat<U>.() -> Unit) = AppCompatv7DSL.viewStubCompat({ AppCompatDSLViewStubCompat<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.listMenuItemView(crossinline r: AppCompatDSLListMenuItemView<U>.() -> Unit) = AppCompatv7DSL.listMenuItemView({ AppCompatDSLListMenuItemView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.contentFrameLayout(crossinline r: AppCompatDSLContentFrameLayout<U>.() -> Unit) = AppCompatv7DSL.contentFrameLayout({ AppCompatDSLContentFrameLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatTextView(crossinline r: AppCompatDSLAppCompatTextView<U>.() -> Unit) = AppCompatv7DSL.appCompatTextView({ AppCompatDSLAppCompatTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.actionMenuView(crossinline r: AppCompatDSLActionMenuView<U>.() -> Unit) = AppCompatv7DSL.actionMenuView({ AppCompatDSLActionMenuView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatImageView(crossinline r: AppCompatDSLAppCompatImageView<U>.() -> Unit) = AppCompatv7DSL.appCompatImageView({ AppCompatDSLAppCompatImageView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.activityChooserView(crossinline r: AppCompatDSLActivityChooserView<U>.() -> Unit) = AppCompatv7DSL.activityChooserView({ AppCompatDSLActivityChooserView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appCompatCheckedTextView(crossinline r: AppCompatDSLAppCompatCheckedTextView<U>.() -> Unit) = AppCompatv7DSL.appCompatCheckedTextView({ AppCompatDSLAppCompatCheckedTextView<U>().r() })

open class AppCompatDSLAppCompatImageView<T : ViewGroup.LayoutParams>() : DSLImageView<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLAppCompatImageButton<T : ViewGroup.LayoutParams>() : DSLImageButton<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLAppCompatRatingBar<T : ViewGroup.LayoutParams>() : DSLRatingBar<T>() {
	constructor(r: AppCompatDSLAppCompatRatingBar<T>.() -> Unit) : this() { r() }
}
open class AppCompatDSLAppCompatSeekBar<T : ViewGroup.LayoutParams>() : DSLSeekBar<T>() {
	constructor(r: AppCompatDSLAppCompatSeekBar<T>.() -> Unit) : this() { r() }
}
open class AppCompatDSLAppCompatTextView<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLActionMenuItemView<T : ViewGroup.LayoutParams>() : AppCompatDSLAppCompatTextView<T>() {
	open fun checkable(arg: Boolean) = AppCompatv7DSL.checkable(arg)
	open fun checked(arg: Boolean) = AppCompatv7DSL.checked(arg)
	open fun expandedFormat(arg: Boolean) = AppCompatv7DSL.expandedFormat(arg)
	open fun icon(arg: Drawable) = AppCompatv7DSL.icon(arg)
	open fun itemInvoker(arg: MenuBuilder.ItemInvoker) = AppCompatv7DSL.itemInvoker(arg)
	open fun popupCallback(arg: android.support.v7.view.menu.ActionMenuItemView.PopupCallback) = AppCompatv7DSL.popupCallback(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
}
open class AppCompatDSLAppCompatButton<T : ViewGroup.LayoutParams>() : DSLButton<T>() {
	open fun supportAllCaps(arg: Boolean) = AppCompatv7DSL.supportAllCaps(arg)
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLAppCompatCheckBox<T : ViewGroup.LayoutParams>() : DSLCheckBox<T>() {
	open fun supportButtonTintList(arg: ColorStateList) = AppCompatv7DSL.supportButtonTintList(arg)
	open fun supportButtonTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportButtonTintMode(arg)
}
open class AppCompatDSLAppCompatRadioButton<T : ViewGroup.LayoutParams>() : DSLRadioButton<T>() {
	open fun supportButtonTintList(arg: ColorStateList) = AppCompatv7DSL.supportButtonTintList(arg)
	open fun supportButtonTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportButtonTintMode(arg)
}
open class AppCompatDSLSwitchCompat<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	open fun showText(arg: Boolean) = AppCompatv7DSL.showText(arg)
	open fun splitTrack(arg: Boolean) = AppCompatv7DSL.splitTrack(arg)
	open fun switchMinWidth(arg: Int) = AppCompatv7DSL.switchMinWidth(arg)
	open fun switchPadding(arg: Int) = AppCompatv7DSL.switchPadding(arg)
	open fun switchTypeface(arg: Typeface) = AppCompatv7DSL.switchTypeface(arg)
	open fun textOff(arg: CharSequence) = AppCompatv7DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = AppCompatv7DSL.textOn(arg)
	open fun thumbDrawable(arg: Drawable) = AppCompatv7DSL.thumbDrawable(arg)
	open fun thumbResource(arg: Int) = AppCompatv7DSL.thumbResource(arg)
	open fun thumbTextPadding(arg: Int) = AppCompatv7DSL.thumbTextPadding(arg)
	open fun trackDrawable(arg: Drawable) = AppCompatv7DSL.trackDrawable(arg)
	open fun trackResource(arg: Int) = AppCompatv7DSL.trackResource(arg)
}
open class AppCompatDSLAppCompatCheckedTextView<T : ViewGroup.LayoutParams>() : DSLCheckedTextView<T>() {
	constructor(r: AppCompatDSLAppCompatCheckedTextView<T>.() -> Unit) : this() { r() }
}
open class AppCompatDSLDialogTitle<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	constructor(r: AppCompatDSLDialogTitle<T>.() -> Unit) : this() { r() }
}
open class AppCompatDSLAppCompatEditText<T : ViewGroup.LayoutParams>() : DSLEditText<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLAppCompatAutoCompleteTextView<T : ViewGroup.LayoutParams>() : DSLAutoCompleteTextView<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLAppCompatMultiAutoCompleteTextView<T : ViewGroup.LayoutParams>() : DSLMultiAutoCompleteTextView<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLAbsActionBarViewBase<T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> : DSLViewGroupBase<T, U>() {
}
open class AppCompatDSLAbsActionBarView<T : ViewGroup.LayoutParams>() : AppCompatDSLAbsActionBarViewBase<T, ViewGroup.LayoutParams>() {
}
open class AppCompatDSLActionBarContextViewBase<T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> : AppCompatDSLAbsActionBarViewBase<T, U>() {
	open fun customView(arg: View) = AppCompatv7DSL.customView(arg)
	open fun subtitle(arg: CharSequence) = AppCompatv7DSL.subtitle(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
	open fun titleOptional(arg: Boolean) = AppCompatv7DSL.titleOptional(arg)
}
open class AppCompatDSLActionBarContextView<T : ViewGroup.LayoutParams> : AppCompatDSLActionBarContextViewBase<T, ViewGroup.LayoutParams>() {
}
open class AppCompatDSLActionBarOverlayLayoutBase<T : ViewGroup.LayoutParams, U : ActionBarOverlayLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun actionBarHideOffset(arg: Int) = AppCompatv7DSL.actionBarHideOffset(arg)
	open fun actionBarVisibilityCallback(arg: android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback) = AppCompatv7DSL.actionBarVisibilityCallback(arg)
	open fun hasNonEmbeddedTabs(arg: Boolean) = AppCompatv7DSL.hasNonEmbeddedTabs(arg)
	open fun hideOnContentScrollEnabled(arg: Boolean) = AppCompatv7DSL.hideOnContentScrollEnabled(arg)
	open fun icon(arg: Drawable) = AppCompatv7DSL.icon(arg)
	open fun icon(arg: Int) = AppCompatv7DSL.icon(arg)
	open fun logo(arg: Int) = AppCompatv7DSL.logo(arg)
	open fun overlayMode(arg: Boolean) = AppCompatv7DSL.overlayMode(arg)
	open fun showingForActionMode(arg: Boolean) = AppCompatv7DSL.showingForActionMode(arg)
	open fun uiOptions(arg: Int) = AppCompatv7DSL.uiOptions(arg)
	open fun windowCallback(arg: Window.Callback) = AppCompatv7DSL.windowCallback(arg)
	open fun windowTitle(arg: CharSequence) = AppCompatv7DSL.windowTitle(arg)
}
open class AppCompatDSLActionBarOverlayLayout<T : ViewGroup.LayoutParams>() : AppCompatDSLActionBarOverlayLayoutBase<T, ActionBarOverlayLayout.LayoutParams>() {
}
open class AppCompatDSLActivityChooserView<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	open fun defaultActionButtonContentDescription(arg: Int) = AppCompatv7DSL.defaultActionButtonContentDescription(arg)
	open fun expandActivityOverflowButtonContentDescription(arg: Int) = AppCompatv7DSL.expandActivityOverflowButtonContentDescription(arg)
	open fun expandActivityOverflowButtonDrawable(arg: Drawable) = AppCompatv7DSL.expandActivityOverflowButtonDrawable(arg)
	open fun initialActivityCount(arg: Int) = AppCompatv7DSL.initialActivityCount(arg)
	open fun onDismiss(arg: PopupWindow.OnDismissListener) = AppCompatv7DSL.onDismiss(arg)
	open fun provider(arg: ActionProvider) = AppCompatv7DSL.provider(arg)
}
open class AppCompatDSLExpandedMenuView<T : ViewGroup.LayoutParams>() : DSLListView<T>() {
	constructor(r: AppCompatDSLExpandedMenuView<T>.() -> Unit) : this() { r() }
}
open class AppCompatDSLListViewCompat<T : ViewGroup.LayoutParams>() : DSLListView<T>() {
	constructor(r: AppCompatDSLListViewCompat<T>.() -> Unit) : this() { r() }
}
open class AppCompatDSLAppCompatSpinner<T : ViewGroup.LayoutParams>() : DSLSpinner<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
open class AppCompatDSLActionBarContainer<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun primaryBackground(arg: Drawable) = AppCompatv7DSL.primaryBackground(arg)
	open fun splitBackground(arg: Drawable) = AppCompatv7DSL.splitBackground(arg)
	open fun stackedBackground(arg: Drawable) = AppCompatv7DSL.stackedBackground(arg)
	open fun tabContainer(arg: ScrollingTabContainerView) = AppCompatv7DSL.tabContainer(arg)
	open fun transitioning(arg: Boolean) = AppCompatv7DSL.transitioning(arg)
}
open class AppCompatDSLContentFrameLayout<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun attachListener(arg: android.support.v7.widget.ContentFrameLayout.OnAttachListener) = AppCompatv7DSL.attachListener(arg)
}
open class AppCompatDSLFitWindowsFrameLayout<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun onFitSystemWindows(arg: FitWindowsViewGroup.OnFitSystemWindowsListener) = AppCompatv7DSL.onFitSystemWindows(arg)
}
open class AppCompatDSLScrollingTabContainerView<T : ViewGroup.LayoutParams>() : DSLHorizontalScrollView<T>() {
	open fun allowCollapse(arg: Boolean) = AppCompatv7DSL.allowCollapse(arg)
	open fun contentHeight(arg: Int) = AppCompatv7DSL.contentHeight(arg)
	open fun tabSelected(arg: Int) = AppCompatv7DSL.tabSelected(arg)
}
open class AppCompatDSLButtonBarLayout<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	open fun allowStacking(arg: Boolean) = AppCompatv7DSL.allowStacking(arg)
}
open class AppCompatDSLFitWindowsLinearLayout<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	open fun onFitSystemWindows(arg: FitWindowsViewGroup.OnFitSystemWindowsListener) = AppCompatv7DSL.onFitSystemWindows(arg)
}
open class AppCompatDSLListMenuItemView<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	open fun checkable(arg: Boolean) = AppCompatv7DSL.checkable(arg)
	open fun checked(arg: Boolean) = AppCompatv7DSL.checked(arg)
	open fun forceShowIcon(arg: Boolean) = AppCompatv7DSL.forceShowIcon(arg)
	open fun icon(arg: Drawable) = AppCompatv7DSL.icon(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
}
open class AppCompatDSLLinearLayoutCompatBase<T : ViewGroup.LayoutParams, U : LinearLayoutCompat.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun baselineAligned(arg: Boolean) = AppCompatv7DSL.baselineAligned(arg)
	open fun baselineAlignedChildIndex(arg: Int) = AppCompatv7DSL.baselineAlignedChildIndex(arg)
	open fun dividerDrawable(arg: Drawable) = AppCompatv7DSL.dividerDrawable(arg)
	open fun dividerPadding(arg: Int) = AppCompatv7DSL.dividerPadding(arg)
	open fun gravity(arg: Int) = AppCompatv7DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = AppCompatv7DSL.horizontalGravity(arg)
	open fun measureWithLargestChildEnabled(arg: Boolean) = AppCompatv7DSL.measureWithLargestChildEnabled(arg)
	open fun orientation(arg: Int) = AppCompatv7DSL.orientation(arg)
	open fun showDividers(arg: Int) = AppCompatv7DSL.showDividers(arg)
	open fun verticalGravity(arg: Int) = AppCompatv7DSL.verticalGravity(arg)
	open fun weightSum(arg: Float) = AppCompatv7DSL.weightSum(arg)
}
open class AppCompatDSLLinearLayoutCompat<T : ViewGroup.LayoutParams>() : AppCompatDSLLinearLayoutCompatBase<T, LinearLayoutCompat.LayoutParams>() {
}
open class AppCompatDSLActionMenuViewBase<T : ViewGroup.LayoutParams, U : ActionMenuView.LayoutParams>() : AppCompatDSLLinearLayoutCompatBase<T, U>() {
	open fun expandedActionViewsExclusive(arg: Boolean) = AppCompatv7DSL.expandedActionViewsExclusive(arg)
	open fun onMenuItemClick(arg: android.support.v7.widget.ActionMenuView.OnMenuItemClickListener) = AppCompatv7DSL.onMenuItemClick(arg)
	open fun overflowIcon(arg: Drawable) = AppCompatv7DSL.overflowIcon(arg)
	open fun overflowReserved(arg: Boolean) = AppCompatv7DSL.overflowReserved(arg)
	open fun popupTheme(arg: Int) = AppCompatv7DSL.popupTheme(arg)
}
open class AppCompatDSLActionMenuView<T : ViewGroup.LayoutParams>() : AppCompatDSLActionMenuViewBase<T, ActionMenuView.LayoutParams>() {
}
open class AppCompatDSLSearchView<T : ViewGroup.LayoutParams>() : AppCompatDSLLinearLayoutCompat<T>() {
	open fun appSearchData(arg: Bundle) = AppCompatv7DSL.appSearchData(arg)
	open fun iconified(arg: Boolean) = AppCompatv7DSL.iconified(arg)
	open fun iconifiedByDefault(arg: Boolean) = AppCompatv7DSL.iconifiedByDefault(arg)
	open fun imeOptions(arg: Int) = AppCompatv7DSL.imeOptions(arg)
	open fun inputType(arg: Int) = AppCompatv7DSL.inputType(arg)
	open fun maxWidth(arg: Int) = AppCompatv7DSL.maxWidth(arg)
	open fun onClose(arg: android.support.v7.widget.SearchView.OnCloseListener) = AppCompatv7DSL.onClose(arg)
	open fun onQueryText(arg: android.support.v7.widget.SearchView.OnQueryTextListener) = AppCompatv7DSL.onQueryText(arg)
	open fun onQueryTextFocusChange(arg: View.OnFocusChangeListener) = AppCompatv7DSL.onQueryTextFocusChange(arg)
	open fun onSearchClick(arg: View.OnClickListener) = AppCompatv7DSL.onSearchClick(arg)
	open fun onSuggestion(arg: android.support.v7.widget.SearchView.OnSuggestionListener) = AppCompatv7DSL.onSuggestion(arg)
	open fun queryHint(arg: CharSequence) = AppCompatv7DSL.queryHint(arg)
	open fun queryRefinementEnabled(arg: Boolean) = AppCompatv7DSL.queryRefinementEnabled(arg)
	open fun searchableInfo(arg: SearchableInfo) = AppCompatv7DSL.searchableInfo(arg)
	open fun submitButtonEnabled(arg: Boolean) = AppCompatv7DSL.submitButtonEnabled(arg)
	open fun suggestionsAdapter(arg: CursorAdapter) = AppCompatv7DSL.suggestionsAdapter(arg)
}
open class AppCompatDSLToolbarBase<T : ViewGroup.LayoutParams, U : Toolbar.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun collapsible(arg: Boolean) = AppCompatv7DSL.collapsible(arg)
	open fun logo(arg: Drawable) = AppCompatv7DSL.logo(arg)
	open fun logo(arg: Int) = AppCompatv7DSL.logo(arg)
	open fun logoDescription(arg: Int) = AppCompatv7DSL.logoDescription(arg)
	open fun logoDescription(arg: CharSequence) = AppCompatv7DSL.logoDescription(arg)
	open fun navigationContentDescription(arg: Int) = AppCompatv7DSL.navigationContentDescription(arg)
	open fun navigationContentDescription(arg: CharSequence) = AppCompatv7DSL.navigationContentDescription(arg)
	open fun navigationIcon(arg: Drawable) = AppCompatv7DSL.navigationIcon(arg)
	open fun navigationIcon(arg: Int) = AppCompatv7DSL.navigationIcon(arg)
	open fun navigationOnClickListener(arg: View.OnClickListener) = AppCompatv7DSL.navigationOnClickListener(arg)
	open fun onMenuItemClick(arg: android.support.v7.widget.Toolbar.OnMenuItemClickListener) = AppCompatv7DSL.onMenuItemClick(arg)
	open fun overflowIcon(arg: Drawable) = AppCompatv7DSL.overflowIcon(arg)
	open fun popupTheme(arg: Int) = AppCompatv7DSL.popupTheme(arg)
	open fun subtitle(arg: Int) = AppCompatv7DSL.subtitle(arg)
	open fun subtitle(arg: CharSequence) = AppCompatv7DSL.subtitle(arg)
	open fun subtitleTextColor(arg: Int) = AppCompatv7DSL.subtitleTextColor(arg)
	open fun title(arg: Int) = AppCompatv7DSL.title(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
	open fun titleTextColor(arg: Int) = AppCompatv7DSL.titleTextColor(arg)
}
open class AppCompatDSLToolbar<T : ViewGroup.LayoutParams> : AppCompatDSLToolbarBase<T, Toolbar.LayoutParams>() {
}
open class AppCompatDSLViewStubCompat<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	open fun inflatedId(arg: Int) = AppCompatv7DSL.inflatedId(arg)
	open fun layoutInflater(arg: LayoutInflater) = AppCompatv7DSL.layoutInflater(arg)
	open fun layoutResource(arg: Int) = AppCompatv7DSL.layoutResource(arg)
	open fun onInflate(arg: android.support.v7.widget.ViewStubCompat.OnInflateListener) = AppCompatv7DSL.onInflate(arg)
}
