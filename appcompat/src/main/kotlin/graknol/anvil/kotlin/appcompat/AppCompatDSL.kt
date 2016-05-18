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

inline fun Anvil.Renderable.appCompatRadioButton(crossinline r: AppCompatDSLAppCompatRadioButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatRadioButton {
		AppCompatDSLAppCompatRadioButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.expandedMenuView(crossinline r: AppCompatDSLExpandedMenuView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.expandedMenuView {
		AppCompatDSLExpandedMenuView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.actionBarContextView(crossinline r: AppCompatDSLActionBarContextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.actionBarContextView {
		AppCompatDSLActionBarContextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.scrollingTabContainerView(crossinline r: AppCompatDSLScrollingTabContainerView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.scrollingTabContainerView {
		AppCompatDSLScrollingTabContainerView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatAutoCompleteTextView(crossinline r: AppCompatDSLAppCompatAutoCompleteTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatAutoCompleteTextView {
		AppCompatDSLAppCompatAutoCompleteTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.dialogTitle(crossinline r: AppCompatDSLDialogTitle.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.dialogTitle {
		AppCompatDSLDialogTitle.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.searchView(crossinline r: AppCompatDSLSearchView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.searchView {
		AppCompatDSLSearchView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatCheckBox(crossinline r: AppCompatDSLAppCompatCheckBox.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatCheckBox {
		AppCompatDSLAppCompatCheckBox.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.fitWindowsFrameLayout(crossinline r: AppCompatDSLFitWindowsFrameLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.fitWindowsFrameLayout {
		AppCompatDSLFitWindowsFrameLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.switchCompat(crossinline r: AppCompatDSLSwitchCompat.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.switchCompat {
		AppCompatDSLSwitchCompat.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatButton(crossinline r: AppCompatDSLAppCompatButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatButton {
		AppCompatDSLAppCompatButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.actionMenuItemView(crossinline r: AppCompatDSLActionMenuItemView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.actionMenuItemView {
		AppCompatDSLActionMenuItemView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatMultiAutoCompleteTextView(crossinline r: AppCompatDSLAppCompatMultiAutoCompleteTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatMultiAutoCompleteTextView {
		AppCompatDSLAppCompatMultiAutoCompleteTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.actionBarOverlayLayout(crossinline r: AppCompatDSLActionBarOverlayLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.actionBarOverlayLayout {
		AppCompatDSLActionBarOverlayLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatSpinner(crossinline r: AppCompatDSLAppCompatSpinner.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatSpinner {
		AppCompatDSLAppCompatSpinner.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.toolbar(crossinline r: AppCompatDSLToolbar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.toolbar {
		AppCompatDSLToolbar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.linearLayoutCompat(crossinline r: AppCompatDSLLinearLayoutCompat.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.linearLayoutCompat {
		AppCompatDSLLinearLayoutCompat.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatImageButton(crossinline r: AppCompatDSLAppCompatImageButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatImageButton {
		AppCompatDSLAppCompatImageButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatSeekBar(crossinline r: AppCompatDSLAppCompatSeekBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatSeekBar {
		AppCompatDSLAppCompatSeekBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatRatingBar(crossinline r: AppCompatDSLAppCompatRatingBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatRatingBar {
		AppCompatDSLAppCompatRatingBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.actionBarContainer(crossinline r: AppCompatDSLActionBarContainer.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.actionBarContainer {
		AppCompatDSLActionBarContainer.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.buttonBarLayout(crossinline r: AppCompatDSLButtonBarLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.buttonBarLayout {
		AppCompatDSLButtonBarLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatEditText(crossinline r: AppCompatDSLAppCompatEditText.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatEditText {
		AppCompatDSLAppCompatEditText.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.fitWindowsLinearLayout(crossinline r: AppCompatDSLFitWindowsLinearLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.fitWindowsLinearLayout {
		AppCompatDSLFitWindowsLinearLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.listViewCompat(crossinline r: AppCompatDSLListViewCompat.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.listViewCompat {
		AppCompatDSLListViewCompat.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewStubCompat(crossinline r: AppCompatDSLViewStubCompat.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.viewStubCompat {
		AppCompatDSLViewStubCompat.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.listMenuItemView(crossinline r: AppCompatDSLListMenuItemView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.listMenuItemView {
		AppCompatDSLListMenuItemView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.contentFrameLayout(crossinline r: AppCompatDSLContentFrameLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.contentFrameLayout {
		AppCompatDSLContentFrameLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatTextView(crossinline r: AppCompatDSLAppCompatTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatTextView {
		AppCompatDSLAppCompatTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.actionMenuView(crossinline r: AppCompatDSLActionMenuView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.actionMenuView {
		AppCompatDSLActionMenuView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatImageView(crossinline r: AppCompatDSLAppCompatImageView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatImageView {
		AppCompatDSLAppCompatImageView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.activityChooserView(crossinline r: AppCompatDSLActivityChooserView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.activityChooserView {
		AppCompatDSLActivityChooserView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appCompatCheckedTextView(crossinline r: AppCompatDSLAppCompatCheckedTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	AppCompatv7DSL.appCompatCheckedTextView {
		AppCompatDSLAppCompatCheckedTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

object AppCompatDSLAppCompatImageView : AppCompatDSLAppCompatImageViewBase()
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
object AppCompatDSLAbsActionBarView : AppCompatDSLAbsActionBarViewBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLActionBarContextView : AppCompatDSLActionBarContextViewBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLActionBarOverlayLayout : AppCompatDSLActionBarOverlayLayoutBase() {
	fun DSLResultStub.lparams(arg: ActionBarOverlayLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLActivityChooserView : AppCompatDSLActivityChooserViewBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLExpandedMenuView : AppCompatDSLExpandedMenuViewBase() {
	fun DSLResultStub.lparams(arg: AbsListView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLListViewCompat : AppCompatDSLListViewCompatBase() {
	fun DSLResultStub.lparams(arg: AbsListView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLAppCompatSpinner : AppCompatDSLAppCompatSpinnerBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLActionBarContainer : AppCompatDSLActionBarContainerBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLContentFrameLayout : AppCompatDSLContentFrameLayoutBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLFitWindowsFrameLayout : AppCompatDSLFitWindowsFrameLayoutBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLScrollingTabContainerView : AppCompatDSLScrollingTabContainerViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLButtonBarLayout : AppCompatDSLButtonBarLayoutBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLFitWindowsLinearLayout : AppCompatDSLFitWindowsLinearLayoutBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLListMenuItemView : AppCompatDSLListMenuItemViewBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLLinearLayoutCompat : AppCompatDSLLinearLayoutCompatBase() {
	fun DSLResultStub.lparams(arg: LinearLayoutCompat.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLActionMenuView : AppCompatDSLActionMenuViewBase() {
	fun DSLResultStub.lparams(arg: ActionMenuView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLSearchView : AppCompatDSLSearchViewBase() {
	fun DSLResultStub.lparams(arg: LinearLayoutCompat.LayoutParams.() -> Unit) = layoutParams(arg)
}

object AppCompatDSLToolbar : AppCompatDSLToolbarBase() {
	fun DSLResultStub.lparams(arg: Toolbar.LayoutParams.() -> Unit) = layoutParams(arg)
}

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

abstract class AppCompatDSLAbsActionBarViewBase : DSLViewGroupBase() {
}

abstract class AppCompatDSLActionBarContextViewBase : AppCompatDSLAbsActionBarViewBase() {
	open fun customView(arg: View) = AppCompatv7DSL.customView(arg)
	open fun subtitle(arg: CharSequence) = AppCompatv7DSL.subtitle(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
	open fun titleOptional(arg: Boolean) = AppCompatv7DSL.titleOptional(arg)
}

abstract class AppCompatDSLActionBarOverlayLayoutBase : DSLViewGroupBase() {
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

abstract class AppCompatDSLActivityChooserViewBase : DSLViewGroupBase() {
	open fun defaultActionButtonContentDescription(arg: Int) = AppCompatv7DSL.defaultActionButtonContentDescription(arg)
	open fun expandActivityOverflowButtonContentDescription(arg: Int) = AppCompatv7DSL.expandActivityOverflowButtonContentDescription(arg)
	open fun expandActivityOverflowButtonDrawable(arg: Drawable) = AppCompatv7DSL.expandActivityOverflowButtonDrawable(arg)
	open fun initialActivityCount(arg: Int) = AppCompatv7DSL.initialActivityCount(arg)
	open fun onDismiss(arg: PopupWindow.OnDismissListener) = AppCompatv7DSL.onDismiss(arg)
	open fun provider(arg: ActionProvider) = AppCompatv7DSL.provider(arg)
}

abstract class AppCompatDSLExpandedMenuViewBase : DSLListViewBase() {
}

abstract class AppCompatDSLListViewCompatBase : DSLListViewBase() {
}

abstract class AppCompatDSLAppCompatSpinnerBase : DSLSpinnerBase() {
	open fun supportBackgroundTintList(arg: ColorStateList) = AppCompatv7DSL.supportBackgroundTintList(arg)
	open fun supportBackgroundTintMode(arg: PorterDuff.Mode) = AppCompatv7DSL.supportBackgroundTintMode(arg)
}

abstract class AppCompatDSLActionBarContainerBase : DSLFrameLayoutBase() {
	open fun primaryBackground(arg: Drawable) = AppCompatv7DSL.primaryBackground(arg)
	open fun splitBackground(arg: Drawable) = AppCompatv7DSL.splitBackground(arg)
	open fun stackedBackground(arg: Drawable) = AppCompatv7DSL.stackedBackground(arg)
	open fun tabContainer(arg: ScrollingTabContainerView) = AppCompatv7DSL.tabContainer(arg)
	open fun transitioning(arg: Boolean) = AppCompatv7DSL.transitioning(arg)
}

abstract class AppCompatDSLContentFrameLayoutBase : DSLFrameLayoutBase() {
	open fun attachListener(arg: android.support.v7.widget.ContentFrameLayout.OnAttachListener) = AppCompatv7DSL.attachListener(arg)
}

abstract class AppCompatDSLFitWindowsFrameLayoutBase : DSLFrameLayoutBase() {
	open fun onFitSystemWindows(arg: FitWindowsViewGroup.OnFitSystemWindowsListener) = AppCompatv7DSL.onFitSystemWindows(arg)
}

abstract class AppCompatDSLScrollingTabContainerViewBase : DSLHorizontalScrollViewBase() {
	open fun allowCollapse(arg: Boolean) = AppCompatv7DSL.allowCollapse(arg)
	open fun contentHeight(arg: Int) = AppCompatv7DSL.contentHeight(arg)
	open fun tabSelected(arg: Int) = AppCompatv7DSL.tabSelected(arg)
}

abstract class AppCompatDSLButtonBarLayoutBase : DSLLinearLayoutBase() {
	open fun allowStacking(arg: Boolean) = AppCompatv7DSL.allowStacking(arg)
}

abstract class AppCompatDSLFitWindowsLinearLayoutBase : DSLLinearLayoutBase() {
	open fun onFitSystemWindows(arg: FitWindowsViewGroup.OnFitSystemWindowsListener) = AppCompatv7DSL.onFitSystemWindows(arg)
}

abstract class AppCompatDSLListMenuItemViewBase : DSLLinearLayoutBase() {
	open fun checkable(arg: Boolean) = AppCompatv7DSL.checkable(arg)
	open fun checked(arg: Boolean) = AppCompatv7DSL.checked(arg)
	open fun forceShowIcon(arg: Boolean) = AppCompatv7DSL.forceShowIcon(arg)
	open fun icon(arg: Drawable) = AppCompatv7DSL.icon(arg)
	open fun title(arg: CharSequence) = AppCompatv7DSL.title(arg)
}

abstract class AppCompatDSLLinearLayoutCompatBase : DSLViewGroupBase() {
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

abstract class AppCompatDSLActionMenuViewBase : AppCompatDSLLinearLayoutCompatBase() {
	open fun expandedActionViewsExclusive(arg: Boolean) = AppCompatv7DSL.expandedActionViewsExclusive(arg)
	open fun onMenuItemClick(arg: android.support.v7.widget.ActionMenuView.OnMenuItemClickListener) = AppCompatv7DSL.onMenuItemClick(arg)
	open fun overflowIcon(arg: Drawable) = AppCompatv7DSL.overflowIcon(arg)
	open fun overflowReserved(arg: Boolean) = AppCompatv7DSL.overflowReserved(arg)
	open fun popupTheme(arg: Int) = AppCompatv7DSL.popupTheme(arg)
}

abstract class AppCompatDSLSearchViewBase : AppCompatDSLLinearLayoutCompatBase() {
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

abstract class AppCompatDSLToolbarBase : DSLViewGroupBase() {
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
