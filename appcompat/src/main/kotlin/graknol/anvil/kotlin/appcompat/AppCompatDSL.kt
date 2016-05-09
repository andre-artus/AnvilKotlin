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
import android.widget.AbsListView
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.PopupWindow
import graknol.anvil.kotlin.*
import trikita.anvil.Anvil
import trikita.anvil.appcompat.v7.AppCompatv7DSL

inline fun Anvil.Renderable.appCompatRadioButton(crossinline r: AppCompatDSLAppCompatRadioButton.() -> Unit) = AppCompatv7DSL.appCompatRadioButton({ AppCompatDSLAppCompatRadioButton.r() })
inline fun Anvil.Renderable.expandedMenuView(crossinline r: AppCompatDSLExpandedMenuView.() -> Unit) = AppCompatv7DSL.expandedMenuView({ AppCompatDSLExpandedMenuView.r() })
inline fun Anvil.Renderable.actionBarContextView(crossinline r: AppCompatDSLActionBarContextView.() -> Unit) = AppCompatv7DSL.actionBarContextView({ AppCompatDSLActionBarContextView.r() })
inline fun Anvil.Renderable.scrollingTabContainerView(crossinline r: AppCompatDSLScrollingTabContainerView.() -> Unit) = AppCompatv7DSL.scrollingTabContainerView({ AppCompatDSLScrollingTabContainerView.r() })
inline fun Anvil.Renderable.appCompatAutoCompleteTextView(crossinline r: AppCompatDSLAppCompatAutoCompleteTextView.() -> Unit) = AppCompatv7DSL.appCompatAutoCompleteTextView({ AppCompatDSLAppCompatAutoCompleteTextView.r() })
inline fun Anvil.Renderable.dialogTitle(crossinline r: AppCompatDSLDialogTitle.() -> Unit) = AppCompatv7DSL.dialogTitle({ AppCompatDSLDialogTitle.r() })
inline fun Anvil.Renderable.searchView(crossinline r: AppCompatDSLSearchView.() -> Unit) = AppCompatv7DSL.searchView({ AppCompatDSLSearchView.r() })
inline fun Anvil.Renderable.appCompatCheckBox(crossinline r: AppCompatDSLAppCompatCheckBox.() -> Unit) = AppCompatv7DSL.appCompatCheckBox({ AppCompatDSLAppCompatCheckBox.r() })
inline fun Anvil.Renderable.fitWindowsFrameLayout(crossinline r: AppCompatDSLFitWindowsFrameLayout.() -> Unit) = AppCompatv7DSL.fitWindowsFrameLayout({ AppCompatDSLFitWindowsFrameLayout.r() })
inline fun Anvil.Renderable.switchCompat(crossinline r: AppCompatDSLSwitchCompat.() -> Unit) = AppCompatv7DSL.switchCompat({ AppCompatDSLSwitchCompat.r() })
inline fun Anvil.Renderable.appCompatButton(crossinline r: AppCompatDSLAppCompatButton.() -> Unit) = AppCompatv7DSL.appCompatButton({ AppCompatDSLAppCompatButton.r() })
inline fun Anvil.Renderable.actionMenuItemView(crossinline r: AppCompatDSLActionMenuItemView.() -> Unit) = AppCompatv7DSL.actionMenuItemView({ AppCompatDSLActionMenuItemView.r() })
inline fun Anvil.Renderable.appCompatMultiAutoCompleteTextView(crossinline r: AppCompatDSLAppCompatMultiAutoCompleteTextView.() -> Unit) = AppCompatv7DSL.appCompatMultiAutoCompleteTextView({ AppCompatDSLAppCompatMultiAutoCompleteTextView.r() })
inline fun Anvil.Renderable.actionBarOverlayLayout(crossinline r: AppCompatDSLActionBarOverlayLayout.() -> Unit) = AppCompatv7DSL.actionBarOverlayLayout({ AppCompatDSLActionBarOverlayLayout.r() })
inline fun Anvil.Renderable.appCompatSpinner(crossinline r: AppCompatDSLAppCompatSpinner.() -> Unit) = AppCompatv7DSL.appCompatSpinner({ AppCompatDSLAppCompatSpinner.r() })
inline fun Anvil.Renderable.toolbar(crossinline r: AppCompatDSLToolbar.() -> Unit) = AppCompatv7DSL.toolbar({ AppCompatDSLToolbar.r() })
inline fun Anvil.Renderable.linearLayoutCompat(crossinline r: AppCompatDSLLinearLayoutCompat.() -> Unit) = AppCompatv7DSL.linearLayoutCompat({ AppCompatDSLLinearLayoutCompat.r() })
inline fun Anvil.Renderable.appCompatImageButton(crossinline r: AppCompatDSLAppCompatImageButton.() -> Unit) = AppCompatv7DSL.appCompatImageButton({ AppCompatDSLAppCompatImageButton.r() })
inline fun Anvil.Renderable.appCompatSeekBar(crossinline r: AppCompatDSLAppCompatSeekBar.() -> Unit) = AppCompatv7DSL.appCompatSeekBar({ AppCompatDSLAppCompatSeekBar.r() })
inline fun Anvil.Renderable.appCompatRatingBar(crossinline r: AppCompatDSLAppCompatRatingBar.() -> Unit) = AppCompatv7DSL.appCompatRatingBar({ AppCompatDSLAppCompatRatingBar.r() })
inline fun Anvil.Renderable.actionBarContainer(crossinline r: AppCompatDSLActionBarContainer.() -> Unit) = AppCompatv7DSL.actionBarContainer({ AppCompatDSLActionBarContainer.r() })
inline fun Anvil.Renderable.buttonBarLayout(crossinline r: AppCompatDSLButtonBarLayout.() -> Unit) = AppCompatv7DSL.buttonBarLayout({ AppCompatDSLButtonBarLayout.r() })
inline fun Anvil.Renderable.appCompatEditText(crossinline r: AppCompatDSLAppCompatEditText.() -> Unit) = AppCompatv7DSL.appCompatEditText({ AppCompatDSLAppCompatEditText.r() })
inline fun Anvil.Renderable.fitWindowsLinearLayout(crossinline r: AppCompatDSLFitWindowsLinearLayout.() -> Unit) = AppCompatv7DSL.fitWindowsLinearLayout({ AppCompatDSLFitWindowsLinearLayout.r() })
inline fun Anvil.Renderable.listViewCompat(crossinline r: AppCompatDSLListViewCompat.() -> Unit) = AppCompatv7DSL.listViewCompat({ AppCompatDSLListViewCompat.r() })
inline fun Anvil.Renderable.viewStubCompat(crossinline r: AppCompatDSLViewStubCompat.() -> Unit) = AppCompatv7DSL.viewStubCompat({ AppCompatDSLViewStubCompat.r() })
inline fun Anvil.Renderable.listMenuItemView(crossinline r: AppCompatDSLListMenuItemView.() -> Unit) = AppCompatv7DSL.listMenuItemView({ AppCompatDSLListMenuItemView.r() })
inline fun Anvil.Renderable.contentFrameLayout(crossinline r: AppCompatDSLContentFrameLayout.() -> Unit) = AppCompatv7DSL.contentFrameLayout({ AppCompatDSLContentFrameLayout.r() })
inline fun Anvil.Renderable.appCompatTextView(crossinline r: AppCompatDSLAppCompatTextView.() -> Unit) = AppCompatv7DSL.appCompatTextView({ AppCompatDSLAppCompatTextView.r() })
inline fun Anvil.Renderable.actionMenuView(crossinline r: AppCompatDSLActionMenuView.() -> Unit) = AppCompatv7DSL.actionMenuView({ AppCompatDSLActionMenuView.r() })
inline fun Anvil.Renderable.appCompatImageView(crossinline r: AppCompatDSLAppCompatImageView.() -> Unit) = AppCompatv7DSL.appCompatImageView({ AppCompatDSLAppCompatImageView.r() })
inline fun Anvil.Renderable.activityChooserView(crossinline r: AppCompatDSLActivityChooserView.() -> Unit) = AppCompatv7DSL.activityChooserView({ AppCompatDSLActivityChooserView.r() })
inline fun Anvil.Renderable.appCompatCheckedTextView(crossinline r: AppCompatDSLAppCompatCheckedTextView.() -> Unit) = AppCompatv7DSL.appCompatCheckedTextView({ AppCompatDSLAppCompatCheckedTextView.r() })

object AppCompatDSLAppCompatImageView : graknol.anvil.kotlin.appcompat.AppCompatDSLAppCompatRatingBarBase()
object AppCompatDSLAppCompatImageButton : AppCompatDSLAppCompatImageButtonBase()
object AppCompatDSLAppCompatRatingBar : AppCompatDSLAppCompatRatingBarBase()
object AppCompatDSLAppCompatSeekBar : AppCompatDSLAppCompatSeekBarBase()
object AppCompatDSLAppCompatTextView : AppCompatDSLAppCompatTextViewBase()
object AppCompatDSLActionMenuItemView : AppCompatDSLActionMenuItemViewBase()
object AppCompatDSLAppCompatButton : AppCompatDSLAppCompatButtonBase()
object AppCompatDSLAppCompatCheckBox : AppCompatDSLAppCompatCheckBoxBase()
object AppCompatDSLAppCompatRadioButton : AppCompatDSLAppCompatRadioButtonBase()
object AppCompatDSLSwitchCompat : AppCompatDSLSwitchCompatBase()
object AppCompatDSLAppCompatCheckedTextView : AppCompatDSLAppCompatCheckedTextViewBase()
object AppCompatDSLDialogTitle : AppCompatDSLDialogTitleBase()
object AppCompatDSLAppCompatEditText : AppCompatDSLAppCompatEditTextBase()
object AppCompatDSLAppCompatAutoCompleteTextView : AppCompatDSLAppCompatAutoCompleteTextViewBase()
object AppCompatDSLAppCompatMultiAutoCompleteTextView : AppCompatDSLAppCompatMultiAutoCompleteTextViewBase()
object AppCompatDSLAbsActionBarView : AppCompatDSLAbsActionBarViewBase<ViewGroup.LayoutParams>()
object AppCompatDSLActionBarContextView : AppCompatDSLActionBarContextViewBase<ViewGroup.LayoutParams>()
object AppCompatDSLActionBarOverlayLayout : AppCompatDSLActionBarOverlayLayoutBase<ActionBarOverlayLayout.LayoutParams>()
object AppCompatDSLActivityChooserView : AppCompatDSLActivityChooserViewBase<ViewGroup.LayoutParams>()
object AppCompatDSLExpandedMenuView : AppCompatDSLExpandedMenuViewBase<AbsListView.LayoutParams>()
object AppCompatDSLListViewCompat : AppCompatDSLListViewCompatBase<AbsListView.LayoutParams>()
object AppCompatDSLAppCompatSpinner : AppCompatDSLAppCompatSpinnerBase<ViewGroup.LayoutParams>()
object AppCompatDSLActionBarContainer : AppCompatDSLActionBarContainerBase<FrameLayout.LayoutParams>()
object AppCompatDSLContentFrameLayout : AppCompatDSLContentFrameLayoutBase<FrameLayout.LayoutParams>()
object AppCompatDSLFitWindowsFrameLayout : AppCompatDSLFitWindowsFrameLayoutBase<FrameLayout.LayoutParams>()
object AppCompatDSLScrollingTabContainerView : AppCompatDSLScrollingTabContainerViewBase<FrameLayout.LayoutParams>()
object AppCompatDSLButtonBarLayout : AppCompatDSLButtonBarLayoutBase<LinearLayout.LayoutParams>()
object AppCompatDSLFitWindowsLinearLayout : AppCompatDSLFitWindowsLinearLayoutBase<LinearLayout.LayoutParams>()
object AppCompatDSLListMenuItemView : AppCompatDSLListMenuItemViewBase<LinearLayout.LayoutParams>()
object AppCompatDSLLinearLayoutCompat : AppCompatDSLLinearLayoutCompatBase<LinearLayoutCompat.LayoutParams>()
object AppCompatDSLActionMenuView : AppCompatDSLActionMenuViewBase<ActionMenuView.LayoutParams>()
object AppCompatDSLSearchView : AppCompatDSLSearchViewBase<LinearLayoutCompat.LayoutParams>()
object AppCompatDSLToolbar : AppCompatDSLToolbarBase<Toolbar.LayoutParams>()
object AppCompatDSLViewStubCompat : AppCompatDSLViewStubCompatBase()

abstract class AppCompatDSLAppCompatImageViewBase : DSLImageViewBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLAppCompatImageButtonBase : DSLImageButtonBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLAppCompatRatingBarBase : DSLRatingBarBase() {
}
abstract class AppCompatDSLAppCompatSeekBarBase : DSLSeekBarBase() {
}
abstract class AppCompatDSLAppCompatTextViewBase : DSLTextViewBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLActionMenuItemViewBase : AppCompatDSLAppCompatTextViewBase() {
	open fun checkable(arg: Boolean) = AppCompatv7DSL.checkable(arg)
	open fun checked(arg: Boolean) = AppCompatv7DSL.checked(arg)
	open fun expandedFormat(arg: Boolean) = AppCompatv7DSL.expandedFormat(arg)
	open fun icon(arg: Drawable) = AppCompatv7DSL.icon(arg)
	open fun itemInvoker(arg: MenuBuilder.ItemInvoker) = AppCompatv7DSL.itemInvoker(arg)
	open fun popupCallback(arg: android.support.v7.view.menu.ActionMenuItemView.PopupCallback) = AppCompatv7DSL.popupCallback(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
}
abstract class AppCompatDSLAppCompatButtonBase : DSLButtonBase() {
	open fun supportAllCaps(arg: Boolean) = AppCompatv7DSL.supportAllCaps(arg)
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLAppCompatCheckBoxBase : DSLCheckBoxBase() {
	open fun supportButtonTintList(arg: ColorStateList) = AppCompatv7DSL.supportButtonTintList(arg)
	open fun supportButtonTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportButtonTintMode(arg)
}
abstract class AppCompatDSLAppCompatRadioButtonBase : DSLRadioButtonBase() {
	open fun supportButtonTintList(arg: ColorStateList) = AppCompatv7DSL.supportButtonTintList(arg)
	open fun supportButtonTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportButtonTintMode(arg)
}
abstract class AppCompatDSLSwitchCompatBase : DSLCompoundButtonBase() {
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
abstract class AppCompatDSLAppCompatCheckedTextViewBase : DSLCheckedTextViewBase() {
}
abstract class AppCompatDSLDialogTitleBase : DSLTextViewBase() {
}
abstract class AppCompatDSLAppCompatEditTextBase : DSLEditTextBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLAppCompatAutoCompleteTextViewBase : DSLAutoCompleteTextViewBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLAppCompatMultiAutoCompleteTextViewBase : DSLMultiAutoCompleteTextViewBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLAbsActionBarViewBase<T : ViewGroup.LayoutParams> : DSLViewGroupBase<T>() {
}
abstract class AppCompatDSLActionBarContextViewBase<T : ViewGroup.LayoutParams> : AppCompatDSLAbsActionBarViewBase<T>() {
	open fun customView(arg: View) = AppCompatv7DSL.customView(arg)
	open fun subtitle(arg: CharSequence) = AppCompatv7DSL.subtitle(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
	open fun titleOptional(arg: Boolean) = AppCompatv7DSL.titleOptional(arg)
}
abstract class AppCompatDSLActionBarOverlayLayoutBase<T : ActionBarOverlayLayout.LayoutParams> : DSLViewGroupBase<T>() {
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
abstract class AppCompatDSLActivityChooserViewBase<T : ViewGroup.LayoutParams> : DSLViewGroupBase<T>() {
	open fun defaultActionButtonContentDescription(arg: Int) = AppCompatv7DSL.defaultActionButtonContentDescription(arg)
	open fun expandActivityOverflowButtonContentDescription(arg: Int) = AppCompatv7DSL.expandActivityOverflowButtonContentDescription(arg)
	open fun expandActivityOverflowButtonDrawable(arg: Drawable) = AppCompatv7DSL.expandActivityOverflowButtonDrawable(arg)
	open fun initialActivityCount(arg: Int) = AppCompatv7DSL.initialActivityCount(arg)
	open fun onDismiss(arg: PopupWindow.OnDismissListener) = AppCompatv7DSL.onDismiss(arg)
	open fun provider(arg: ActionProvider) = AppCompatv7DSL.provider(arg)
}
abstract class AppCompatDSLExpandedMenuViewBase<T : AbsListView.LayoutParams> : DSLListViewBase<T>() {
}
abstract class AppCompatDSLListViewCompatBase<T : AbsListView.LayoutParams> : DSLListViewBase<T>() {
}
abstract class AppCompatDSLAppCompatSpinnerBase<T : ViewGroup.LayoutParams> : DSLSpinnerBase<T>() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}
abstract class AppCompatDSLActionBarContainerBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun primaryBackground(arg: Drawable) = AppCompatv7DSL.primaryBackground(arg)
	open fun splitBackground(arg: Drawable) = AppCompatv7DSL.splitBackground(arg)
	open fun stackedBackground(arg: Drawable) = AppCompatv7DSL.stackedBackground(arg)
	open fun tabContainer(arg: ScrollingTabContainerView) = AppCompatv7DSL.tabContainer(arg)
	open fun transitioning(arg: Boolean) = AppCompatv7DSL.transitioning(arg)
}
abstract class AppCompatDSLContentFrameLayoutBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun attachListener(arg: android.support.v7.widget.ContentFrameLayout.OnAttachListener) = AppCompatv7DSL.attachListener(arg)
}
abstract class AppCompatDSLFitWindowsFrameLayoutBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun onFitSystemWindows(arg: FitWindowsViewGroup.OnFitSystemWindowsListener) = AppCompatv7DSL.onFitSystemWindows(arg)
}
abstract class AppCompatDSLScrollingTabContainerViewBase<T : FrameLayout.LayoutParams> : DSLHorizontalScrollViewBase<T>() {
	open fun allowCollapse(arg: Boolean) = AppCompatv7DSL.allowCollapse(arg)
	open fun contentHeight(arg: Int) = AppCompatv7DSL.contentHeight(arg)
	open fun tabSelected(arg: Int) = AppCompatv7DSL.tabSelected(arg)
}
abstract class AppCompatDSLButtonBarLayoutBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun allowStacking(arg: Boolean) = AppCompatv7DSL.allowStacking(arg)
}
abstract class AppCompatDSLFitWindowsLinearLayoutBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun onFitSystemWindows(arg: FitWindowsViewGroup.OnFitSystemWindowsListener) = AppCompatv7DSL.onFitSystemWindows(arg)
}
abstract class AppCompatDSLListMenuItemViewBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun checkable(arg: Boolean) = AppCompatv7DSL.checkable(arg)
	open fun checked(arg: Boolean) = AppCompatv7DSL.checked(arg)
	open fun forceShowIcon(arg: Boolean) = AppCompatv7DSL.forceShowIcon(arg)
	open fun icon(arg: Drawable) = AppCompatv7DSL.icon(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
}
abstract class AppCompatDSLLinearLayoutCompatBase<T : LinearLayoutCompat.LayoutParams> : DSLViewGroupBase<T>() {
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
abstract class AppCompatDSLActionMenuViewBase<T : ActionMenuView.LayoutParams> : AppCompatDSLLinearLayoutCompatBase<T>() {
	open fun expandedActionViewsExclusive(arg: Boolean) = AppCompatv7DSL.expandedActionViewsExclusive(arg)
	open fun onMenuItemClick(arg: android.support.v7.widget.ActionMenuView.OnMenuItemClickListener) = AppCompatv7DSL.onMenuItemClick(arg)
	open fun overflowIcon(arg: Drawable) = AppCompatv7DSL.overflowIcon(arg)
	open fun overflowReserved(arg: Boolean) = AppCompatv7DSL.overflowReserved(arg)
	open fun popupTheme(arg: Int) = AppCompatv7DSL.popupTheme(arg)
}
abstract class AppCompatDSLSearchViewBase<T : LinearLayoutCompat.LayoutParams> : AppCompatDSLLinearLayoutCompatBase<T>() {
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
abstract class AppCompatDSLToolbarBase<T : Toolbar.LayoutParams> : DSLViewGroupBase<T>() {
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
abstract class AppCompatDSLViewStubCompatBase : DSLViewBase() {
	open fun inflatedId(arg: Int) = AppCompatv7DSL.inflatedId(arg)
	open fun layoutInflater(arg: LayoutInflater) = AppCompatv7DSL.layoutInflater(arg)
	open fun layoutResource(arg: Int) = AppCompatv7DSL.layoutResource(arg)
	open fun onInflate(arg: android.support.v7.widget.ViewStubCompat.OnInflateListener) = AppCompatv7DSL.onInflate(arg)
}
