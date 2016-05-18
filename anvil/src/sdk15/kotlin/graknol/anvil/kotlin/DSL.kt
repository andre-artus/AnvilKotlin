@file:Suppress("unused", "DEPRECATION")

package graknol.anvil.kotlin

import android.animation.LayoutTransition
import android.animation.ObjectAnimator
import android.app.Activity
import android.app.LocalActivityManager
import android.app.SearchableInfo
import android.content.Intent
import android.content.res.ColorStateList
import android.gesture.Gesture
import android.graphics.Bitmap
import android.graphics.ColorFilter
import android.graphics.Matrix
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.inputmethodservice.Keyboard
import android.media.MediaPlayer
import android.net.Uri
import android.net.http.SslCertificate
import android.text.*
import android.text.method.KeyListener
import android.text.method.MovementMethod
import android.text.method.TransformationMethod
import android.view.ActionMode
import android.view.TouchDelegate
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Interpolator
import android.view.animation.LayoutAnimationController
import android.view.inputmethod.ExtractedText
import android.webkit.DownloadListener
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.*
import trikita.anvil.Anvil
import trikita.anvil.DSL

inline fun Anvil.Renderable.numberPicker(crossinline r: DSLNumberPicker.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.numberPicker {
		DSLNumberPicker.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.ratingBar(crossinline r: DSLRatingBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.ratingBar {
		DSLRatingBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.switchView(crossinline r: DSLSwitchView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.switchView {
		DSLSwitchView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.absoluteLayout(crossinline r: DSLAbsoluteLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.absoluteLayout {
		DSLAbsoluteLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.timePicker(crossinline r: DSLTimePicker.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.timePicker {
		DSLTimePicker.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewAnimator(crossinline r: DSLViewAnimator.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.viewAnimator {
		DSLViewAnimator.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.radioGroup(crossinline r: DSLRadioGroup.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.radioGroup {
		DSLRadioGroup.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.dialerFilter(crossinline r: DSLDialerFilter.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.dialerFilter {
		DSLDialerFilter.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.searchView(crossinline r: DSLSearchView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.searchView {
		DSLSearchView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.tabWidget(crossinline r: DSLTabWidget.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.tabWidget {
		DSLTabWidget.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.extractEditText(crossinline r: DSLExtractEditText.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.extractEditText {
		DSLExtractEditText.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.absSeekBar(crossinline r: DSLAbsSeekBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.absSeekBar {
		DSLAbsSeekBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.chronometer(crossinline r: DSLChronometer.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.chronometer {
		DSLChronometer.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.zoomControls(crossinline r: DSLZoomControls.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.zoomControls {
		DSLZoomControls.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.tabHost(crossinline r: DSLTabHost.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.tabHost {
		DSLTabHost.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.expandableListView(crossinline r: DSLExpandableListView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.expandableListView {
		DSLExpandableListView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.adapterViewFlipper(crossinline r: DSLAdapterViewFlipper.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.adapterViewFlipper {
		DSLAdapterViewFlipper.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.imageButton(crossinline r: DSLImageButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.imageButton {
		DSLImageButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.radioButton(crossinline r: DSLRadioButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.radioButton {
		DSLRadioButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.view(crossinline r: DSLView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.view {
		DSLView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.videoView(crossinline r: DSLVideoView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.videoView {
		DSLVideoView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.digitalClock(crossinline r: DSLDigitalClock.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.digitalClock {
		DSLDigitalClock.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.calendarView(crossinline r: DSLCalendarView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.calendarView {
		DSLCalendarView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.tableLayout(crossinline r: DSLTableLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.tableLayout {
		DSLTableLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.textView(crossinline r: DSLTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.textView {
		DSLTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.adapterView(crossinline r: DSLAdapterView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.adapterView {
		DSLAdapterView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.imageSwitcher(crossinline r: DSLImageSwitcher.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.imageSwitcher {
		DSLImageSwitcher.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.autoCompleteTextView(crossinline r: DSLAutoCompleteTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.autoCompleteTextView {
		DSLAutoCompleteTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.fragmentBreadCrumbs(crossinline r: DSLFragmentBreadCrumbs.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.fragmentBreadCrumbs {
		DSLFragmentBreadCrumbs.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.frameLayout(crossinline r: DSLFrameLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.frameLayout {
		DSLFrameLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.gestureOverlayView(crossinline r: DSLGestureOverlayView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.gestureOverlayView {
		DSLGestureOverlayView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.webView(crossinline r: DSLWebView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.webView {
		DSLWebView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.tableRow(crossinline r: DSLTableRow.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.tableRow {
		DSLTableRow.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.scrollView(crossinline r: DSLScrollView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.scrollView {
		DSLScrollView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.stackView(crossinline r: DSLStackView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.stackView {
		DSLStackView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewStub(crossinline r: DSLViewStub.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.viewStub {
		DSLViewStub.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.checkBox(crossinline r: DSLCheckBox.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.checkBox {
		DSLCheckBox.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.twoLineListItem(crossinline r: DSLTwoLineListItem.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.twoLineListItem {
		DSLTwoLineListItem.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewSwitcher(crossinline r: DSLViewSwitcher.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.viewSwitcher {
		DSLViewSwitcher.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.spinner(crossinline r: DSLSpinner.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.spinner {
		DSLSpinner.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.textureView(crossinline r: DSLTextureView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.textureView {
		DSLTextureView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.editText(crossinline r: DSLEditText.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.editText {
		DSLEditText.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.surfaceView(crossinline r: DSLSurfaceView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.surfaceView {
		DSLSurfaceView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.space(crossinline r: DSLSpace.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.space {
		DSLSpace.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.checkedTextView(crossinline r: DSLCheckedTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.checkedTextView {
		DSLCheckedTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.multiAutoCompleteTextView(crossinline r: DSLMultiAutoCompleteTextView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.multiAutoCompleteTextView {
		DSLMultiAutoCompleteTextView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.gLSurfaceView(crossinline r: DSLGLSurfaceView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.gLSurfaceView {
		DSLGLSurfaceView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.listView(crossinline r: DSLListView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.listView {
		DSLListView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.appWidgetHostView(crossinline r: DSLAppWidgetHostView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.appWidgetHostView {
		DSLAppWidgetHostView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.analogClock(crossinline r: DSLAnalogClock.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.analogClock {
		DSLAnalogClock.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.button(crossinline r: DSLButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.button {
		DSLButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.slidingDrawer(crossinline r: DSLSlidingDrawer.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.slidingDrawer {
		DSLSlidingDrawer.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.keyboardView(crossinline r: DSLKeyboardView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.keyboardView {
		DSLKeyboardView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.linearLayout(crossinline r: DSLLinearLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.linearLayout {
		DSLLinearLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.seekBar(crossinline r: DSLSeekBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.seekBar {
		DSLSeekBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.datePicker(crossinline r: DSLDatePicker.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.datePicker {
		DSLDatePicker.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.zoomButton(crossinline r: DSLZoomButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.zoomButton {
		DSLZoomButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.relativeLayout(crossinline r: DSLRelativeLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.relativeLayout {
		DSLRelativeLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.gallery(crossinline r: DSLGallery.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.gallery {
		DSLGallery.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.gridView(crossinline r: DSLGridView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.gridView {
		DSLGridView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.toggleButton(crossinline r: DSLToggleButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.toggleButton {
		DSLToggleButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.mediaController(crossinline r: DSLMediaController.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.mediaController {
		DSLMediaController.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewGroup(crossinline r: DSLViewGroup.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.viewGroup {
		DSLViewGroup.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.viewFlipper(crossinline r: DSLViewFlipper.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.viewFlipper {
		DSLViewFlipper.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.quickContactBadge(crossinline r: DSLQuickContactBadge.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.quickContactBadge {
		DSLQuickContactBadge.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.horizontalScrollView(crossinline r: DSLHorizontalScrollView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.horizontalScrollView {
		DSLHorizontalScrollView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.gridLayout(crossinline r: DSLGridLayout.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.gridLayout {
		DSLGridLayout.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.adapterViewAnimator(crossinline r: DSLAdapterViewAnimator.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.adapterViewAnimator {
		DSLAdapterViewAnimator.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.textSwitcher(crossinline r: DSLTextSwitcher.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.textSwitcher {
		DSLTextSwitcher.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.absSpinner(crossinline r: DSLAbsSpinner.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.absSpinner {
		DSLAbsSpinner.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.absListView(crossinline r: DSLAbsListView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.absListView {
		DSLAbsListView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.progressBar(crossinline r: DSLProgressBar.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.progressBar {
		DSLProgressBar.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.compoundButton(crossinline r: DSLCompoundButton.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.compoundButton {
		DSLCompoundButton.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

inline fun Anvil.Renderable.imageView(crossinline r: DSLImageView.() -> Unit): DSLResultStub {
	var result: DSLResultStub? = null
	DSL.imageView {
		DSLImageView.r()
		result = DSLResultStub.fromCurrentView()
	}
	return result!!
}

object DSLView : DSLViewBase()
object DSLAnalogClock : DSLAnalogClockBase()
object DSLImageView : DSLImageViewBase()
object DSLImageButton : DSLImageButtonBase()
object DSLZoomButton : DSLZoomButtonBase()
object DSLQuickContactBadge : DSLQuickContactBadgeBase()
object DSLKeyboardView : DSLKeyboardViewBase()
object DSLProgressBar : DSLProgressBarBase()
object DSLAbsSeekBar : DSLAbsSeekBarBase()
object DSLRatingBar : DSLRatingBarBase()
object DSLSeekBar : DSLSeekBarBase()
object DSLSpace : DSLSpaceBase()
object DSLSurfaceView : DSLSurfaceViewBase()
object DSLGLSurfaceView : DSLGLSurfaceViewBase()
object DSLVideoView : DSLVideoViewBase()
object DSLTextureView : DSLTextureViewBase()
object DSLTextView : DSLTextViewBase()
object DSLButton : DSLButtonBase()
object DSLCompoundButton : DSLCompoundButtonBase()
object DSLCheckBox : DSLCheckBoxBase()
object DSLRadioButton : DSLRadioButtonBase()
object DSLSwitchView : DSLSwitchViewBase()
object DSLToggleButton : DSLToggleButtonBase()
object DSLCheckedTextView : DSLCheckedTextViewBase()
object DSLChronometer : DSLChronometerBase()
object DSLDigitalClock : DSLDigitalClockBase()
object DSLEditText : DSLEditTextBase()
object DSLAutoCompleteTextView : DSLAutoCompleteTextViewBase()
object DSLMultiAutoCompleteTextView : DSLMultiAutoCompleteTextViewBase()
object DSLExtractEditText : DSLExtractEditTextBase()
object DSLViewGroup : DSLViewGroupBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAbsoluteLayout : DSLAbsoluteLayoutBase() {
	fun DSLResultStub.lparams(arg: AbsoluteLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLWebView : DSLWebViewBase() {
	fun DSLResultStub.lparams(arg: AbsoluteLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAdapterView : DSLAdapterViewBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAbsListView : DSLAbsListViewBase() {
	fun DSLResultStub.lparams(arg: AbsListView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLGridView : DSLGridViewBase() {
	fun DSLResultStub.lparams(arg: AbsListView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLListView : DSLListViewBase() {
	fun DSLResultStub.lparams(arg: AbsListView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLExpandableListView : DSLExpandableListViewBase() {
	fun DSLResultStub.lparams(arg: AbsListView.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAbsSpinner : DSLAbsSpinnerBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLGallery : DSLGalleryBase() {
	fun DSLResultStub.lparams(arg: Gallery.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLSpinner : DSLSpinnerBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAdapterViewAnimator : DSLAdapterViewAnimatorBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAdapterViewFlipper : DSLAdapterViewFlipperBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLStackView : DSLStackViewBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLFragmentBreadCrumbs : DSLFragmentBreadCrumbsBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLFrameLayout : DSLFrameLayoutBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLAppWidgetHostView : DSLAppWidgetHostViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLCalendarView : DSLCalendarViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLDatePicker : DSLDatePickerBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLGestureOverlayView : DSLGestureOverlayViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLHorizontalScrollView : DSLHorizontalScrollViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLMediaController : DSLMediaControllerBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLScrollView : DSLScrollViewBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTabHost : DSLTabHostBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTimePicker : DSLTimePickerBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLViewAnimator : DSLViewAnimatorBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLViewFlipper : DSLViewFlipperBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLViewSwitcher : DSLViewSwitcherBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLImageSwitcher : DSLImageSwitcherBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTextSwitcher : DSLTextSwitcherBase() {
	fun DSLResultStub.lparams(arg: FrameLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLGridLayout : DSLGridLayoutBase() {
	fun DSLResultStub.lparams(arg: GridLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLLinearLayout : DSLLinearLayoutBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLNumberPicker : DSLNumberPickerBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLRadioGroup : DSLRadioGroupBase() {
	fun DSLResultStub.lparams(arg: RadioGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLSearchView : DSLSearchViewBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTableLayout : DSLTableLayoutBase() {
	fun DSLResultStub.lparams(arg: TableLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTableRow : DSLTableRowBase() {
	fun DSLResultStub.lparams(arg: TableRow.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTabWidget : DSLTabWidgetBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLZoomControls : DSLZoomControlsBase() {
	fun DSLResultStub.lparams(arg: LinearLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLRelativeLayout : DSLRelativeLayoutBase() {
	fun DSLResultStub.lparams(arg: RelativeLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLDialerFilter : DSLDialerFilterBase() {
	fun DSLResultStub.lparams(arg: RelativeLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLTwoLineListItem : DSLTwoLineListItemBase() {
	fun DSLResultStub.lparams(arg: RelativeLayout.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLSlidingDrawer : DSLSlidingDrawerBase() {
	fun DSLResultStub.lparams(arg: ViewGroup.LayoutParams.() -> Unit) = layoutParams(arg)
}

object DSLViewStub : DSLViewStubBase()

abstract class DSLViewBase : BaseDSL() {
	open fun accessibilityDelegate(arg: android.view.View.AccessibilityDelegate) = DSL.accessibilityDelegate(arg)
	open fun activated(arg: Boolean) = DSL.activated(arg)
	open fun alpha(arg: Float) = DSL.alpha(arg)
	open fun animation(arg: Animation) = DSL.animation(arg)
	open fun backgroundColor(arg: Int) = DSL.backgroundColor(arg)
	open fun backgroundDrawable(arg: Drawable) = DSL.backgroundDrawable(arg)
	open fun backgroundResource(arg: Int) = DSL.backgroundResource(arg)
	open fun bottom(arg: Int) = DSL.bottom(arg)
	open fun cameraDistance(arg: Float) = DSL.cameraDistance(arg)
	open fun clickable(arg: Boolean) = DSL.clickable(arg)
	open fun contentDescription(arg: CharSequence) = DSL.contentDescription(arg)
	open fun drawingCacheBackgroundColor(arg: Int) = DSL.drawingCacheBackgroundColor(arg)
	open fun drawingCacheEnabled(arg: Boolean) = DSL.drawingCacheEnabled(arg)
	open fun drawingCacheQuality(arg: Int) = DSL.drawingCacheQuality(arg)
	open fun duplicateParentStateEnabled(arg: Boolean) = DSL.duplicateParentStateEnabled(arg)
	open fun enabled(arg: Boolean) = DSL.enabled(arg)
	open fun fadingEdgeLength(arg: Int) = DSL.fadingEdgeLength(arg)
	open fun filterTouchesWhenObscured(arg: Boolean) = DSL.filterTouchesWhenObscured(arg)
	open fun fitsSystemWindows(arg: Boolean) = DSL.fitsSystemWindows(arg)
	open fun focusable(arg: Boolean) = DSL.focusable(arg)
	open fun focusableInTouchMode(arg: Boolean) = DSL.focusableInTouchMode(arg)
	open fun hapticFeedbackEnabled(arg: Boolean) = DSL.hapticFeedbackEnabled(arg)
	open fun horizontalFadingEdgeEnabled(arg: Boolean) = DSL.horizontalFadingEdgeEnabled(arg)
	open fun horizontalScrollBarEnabled(arg: Boolean) = DSL.horizontalScrollBarEnabled(arg)
	open fun hovered(arg: Boolean) = DSL.hovered(arg)
	open fun id(arg: Int) = DSL.id(arg)
	open fun keepScreenOn(arg: Boolean) = DSL.keepScreenOn(arg)
	open fun layoutParams(arg: ViewGroup.LayoutParams) = DSL.layoutParams(arg)
	open fun left(arg: Int) = DSL.left(arg)
	open fun longClickable(arg: Boolean) = DSL.longClickable(arg)
	open fun minimumHeight(arg: Int) = DSL.minimumHeight(arg)
	open fun minimumWidth(arg: Int) = DSL.minimumWidth(arg)
	open fun nextFocusDownId(arg: Int) = DSL.nextFocusDownId(arg)
	open fun nextFocusForwardId(arg: Int) = DSL.nextFocusForwardId(arg)
	open fun nextFocusLeftId(arg: Int) = DSL.nextFocusLeftId(arg)
	open fun nextFocusRightId(arg: Int) = DSL.nextFocusRightId(arg)
	open fun nextFocusUpId(arg: Int) = DSL.nextFocusUpId(arg)
	open fun onClick(arg: android.view.View.OnClickListener) = DSL.onClick(arg)
	open fun onCreateContextMenu(arg: android.view.View.OnCreateContextMenuListener) = DSL.onCreateContextMenu(arg)
	open fun onDrag(arg: android.view.View.OnDragListener) = DSL.onDrag(arg)
	open fun onFocusChange(arg: android.view.View.OnFocusChangeListener) = DSL.onFocusChange(arg)
	open fun onGenericMotion(arg: android.view.View.OnGenericMotionListener) = DSL.onGenericMotion(arg)
	open fun onHover(arg: android.view.View.OnHoverListener) = DSL.onHover(arg)
	open fun onKey(arg: android.view.View.OnKeyListener) = DSL.onKey(arg)
	open fun onLongClick(arg: android.view.View.OnLongClickListener) = DSL.onLongClick(arg)
	open fun onSystemUiVisibilityChange(arg: android.view.View.OnSystemUiVisibilityChangeListener) = DSL.onSystemUiVisibilityChange(arg)
	open fun onTouch(arg: android.view.View.OnTouchListener) = DSL.onTouch(arg)
	open fun overScrollMode(arg: Int) = DSL.overScrollMode(arg)
	open fun pivotX(arg: Float) = DSL.pivotX(arg)
	open fun pivotY(arg: Float) = DSL.pivotY(arg)
	open fun pressed(arg: Boolean) = DSL.pressed(arg)
	open fun right(arg: Int) = DSL.right(arg)
	open fun rotation(arg: Float) = DSL.rotation(arg)
	open fun rotationX(arg: Float) = DSL.rotationX(arg)
	open fun rotationY(arg: Float) = DSL.rotationY(arg)
	open fun saveEnabled(arg: Boolean) = DSL.saveEnabled(arg)
	open fun saveFromParentEnabled(arg: Boolean) = DSL.saveFromParentEnabled(arg)
	open fun scaleX(arg: Float) = DSL.scaleX(arg)
	open fun scaleY(arg: Float) = DSL.scaleY(arg)
	open fun scrollBarStyle(arg: Int) = DSL.scrollBarStyle(arg)
	open fun scrollContainer(arg: Boolean) = DSL.scrollContainer(arg)
	open fun scrollX(arg: Int) = DSL.scrollX(arg)
	open fun scrollY(arg: Int) = DSL.scrollY(arg)
	open fun scrollbarFadingEnabled(arg: Boolean) = DSL.scrollbarFadingEnabled(arg)
	open fun selected(arg: Boolean) = DSL.selected(arg)
	open fun soundEffectsEnabled(arg: Boolean) = DSL.soundEffectsEnabled(arg)
	open fun systemUiVisibility(arg: Int) = DSL.systemUiVisibility(arg)
	open fun tag(arg: Any) = DSL.tag(arg)
	open fun top(arg: Int) = DSL.top(arg)
	open fun touchDelegate(arg: TouchDelegate) = DSL.touchDelegate(arg)
	open fun translationX(arg: Float) = DSL.translationX(arg)
	open fun translationY(arg: Float) = DSL.translationY(arg)
	open fun verticalFadingEdgeEnabled(arg: Boolean) = DSL.verticalFadingEdgeEnabled(arg)
	open fun verticalScrollBarEnabled(arg: Boolean) = DSL.verticalScrollBarEnabled(arg)
	open fun verticalScrollbarPosition(arg: Int) = DSL.verticalScrollbarPosition(arg)
	open fun visibility(arg: Int) = DSL.visibility(arg)
	open fun willNotCacheDrawing(arg: Boolean) = DSL.willNotCacheDrawing(arg)
	open fun willNotDraw(arg: Boolean) = DSL.willNotDraw(arg)
	open fun x(arg: Float) = DSL.x(arg)
	open fun y(arg: Float) = DSL.y(arg)
}

abstract class DSLAnalogClockBase : DSLViewBase() {
}

abstract class DSLImageViewBase : DSLViewBase() {
	open fun adjustViewBounds(arg: Boolean) = DSL.adjustViewBounds(arg)
	open fun alpha(arg: Int) = DSL.alpha(arg)
	open fun baseline(arg: Int) = DSL.baseline(arg)
	open fun baselineAlignBottom(arg: Boolean) = DSL.baselineAlignBottom(arg)
	open fun colorFilter(arg: ColorFilter) = DSL.colorFilter(arg)
	open fun colorFilter(arg: Int) = DSL.colorFilter(arg)
	open fun imageBitmap(arg: Bitmap) = DSL.imageBitmap(arg)
	open fun imageDrawable(arg: Drawable) = DSL.imageDrawable(arg)
	open fun imageLevel(arg: Int) = DSL.imageLevel(arg)
	open fun imageMatrix(arg: Matrix) = DSL.imageMatrix(arg)
	open fun imageResource(arg: Int) = DSL.imageResource(arg)
	open fun imageURI(arg: Uri) = DSL.imageURI(arg)
	open fun maxHeight(arg: Int) = DSL.maxHeight(arg)
	open fun maxWidth(arg: Int) = DSL.maxWidth(arg)
	open fun scaleType(arg: android.widget.ImageView.ScaleType) = DSL.scaleType(arg)
}

abstract class DSLImageButtonBase : DSLImageViewBase() {
}

abstract class DSLZoomButtonBase : DSLImageButtonBase() {
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}

abstract class DSLQuickContactBadgeBase : DSLImageViewBase() {
	open fun excludeMimes(arg: Array<String>) = DSL.excludeMimes(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}

abstract class DSLKeyboardViewBase : DSLViewBase() {
	open fun keyboard(arg: Keyboard) = DSL.keyboard(arg)
	open fun onKeyboardAction(arg: android.inputmethodservice.KeyboardView.OnKeyboardActionListener) = DSL.onKeyboardAction(arg)
	open fun popupParent(arg: View) = DSL.popupParent(arg)
	open fun previewEnabled(arg: Boolean) = DSL.previewEnabled(arg)
	open fun proximityCorrectionEnabled(arg: Boolean) = DSL.proximityCorrectionEnabled(arg)
	open fun shifted(arg: Boolean) = DSL.shifted(arg)
	open fun verticalCorrection(arg: Int) = DSL.verticalCorrection(arg)
}

abstract class DSLProgressBarBase : DSLViewBase() {
	open fun indeterminate(arg: Boolean) = DSL.indeterminate(arg)
	open fun indeterminateDrawable(arg: Drawable) = DSL.indeterminateDrawable(arg)
	open fun interpolator(arg: Interpolator) = DSL.interpolator(arg)
	open fun max(arg: Int) = DSL.max(arg)
	open fun progress(arg: Int) = DSL.progress(arg)
	open fun progressDrawable(arg: Drawable) = DSL.progressDrawable(arg)
	open fun secondaryProgress(arg: Int) = DSL.secondaryProgress(arg)
}

abstract class DSLAbsSeekBarBase : DSLProgressBarBase() {
	open fun keyProgressIncrement(arg: Int) = DSL.keyProgressIncrement(arg)
	open fun thumb(arg: Drawable) = DSL.thumb(arg)
	open fun thumbOffset(arg: Int) = DSL.thumbOffset(arg)
}

abstract class DSLRatingBarBase : DSLAbsSeekBarBase() {
	open fun isIndicator(arg: Boolean) = DSL.isIndicator(arg)
	open fun numStars(arg: Int) = DSL.numStars(arg)
	open fun onRatingBarChange(arg: android.widget.RatingBar.OnRatingBarChangeListener) = DSL.onRatingBarChange(arg)
	open fun rating(arg: Float) = DSL.rating(arg)
	open fun stepSize(arg: Float) = DSL.stepSize(arg)
}

abstract class DSLSeekBarBase : DSLAbsSeekBarBase() {
	open fun onSeekBarChange(arg: android.widget.SeekBar.OnSeekBarChangeListener) = DSL.onSeekBarChange(arg)
}

abstract class DSLSpaceBase : DSLViewBase() {
}

abstract class DSLSurfaceViewBase : DSLViewBase() {
	open fun zOrderMediaOverlay(arg: Boolean) = DSL.zOrderMediaOverlay(arg)
	open fun zOrderOnTop(arg: Boolean) = DSL.zOrderOnTop(arg)
}

abstract class DSLGLSurfaceViewBase : DSLSurfaceViewBase() {
	open fun debugFlags(arg: Int) = DSL.debugFlags(arg)
	open fun eGLConfigChooser(arg: android.opengl.GLSurfaceView.EGLConfigChooser) = DSL.eGLConfigChooser(arg)
	open fun eGLConfigChooser(arg: Boolean) = DSL.eGLConfigChooser(arg)
	open fun eGLContextClientVersion(arg: Int) = DSL.eGLContextClientVersion(arg)
	open fun eGLContextFactory(arg: android.opengl.GLSurfaceView.EGLContextFactory) = DSL.eGLContextFactory(arg)
	open fun eGLWindowSurfaceFactory(arg: android.opengl.GLSurfaceView.EGLWindowSurfaceFactory) = DSL.eGLWindowSurfaceFactory(arg)
	open fun gLWrapper(arg: android.opengl.GLSurfaceView.GLWrapper) = DSL.gLWrapper(arg)
	open fun preserveEGLContextOnPause(arg: Boolean) = DSL.preserveEGLContextOnPause(arg)
	open fun renderMode(arg: Int) = DSL.renderMode(arg)
	open fun renderer(arg: android.opengl.GLSurfaceView.Renderer) = DSL.renderer(arg)
}

abstract class DSLVideoViewBase : DSLSurfaceViewBase() {
	open fun mediaController(arg: MediaController) = DSL.mediaController(arg)
	open fun onCompletion(arg: MediaPlayer.OnCompletionListener) = DSL.onCompletion(arg)
	open fun onError(arg: MediaPlayer.OnErrorListener) = DSL.onError(arg)
	open fun onPrepared(arg: MediaPlayer.OnPreparedListener) = DSL.onPrepared(arg)
	open fun videoPath(arg: String) = DSL.videoPath(arg)
	open fun videoURI(arg: Uri) = DSL.videoURI(arg)
}

abstract class DSLTextureViewBase : DSLViewBase() {
	open fun opaque(arg: Boolean) = DSL.opaque(arg)
	open fun surfaceTextureListener(arg: android.view.TextureView.SurfaceTextureListener) = DSL.surfaceTextureListener(arg)
	open fun transform(arg: Matrix) = DSL.transform(arg)
}

abstract class DSLTextViewBase : DSLViewBase() {
	open fun allCaps(arg: Boolean) = DSL.allCaps(arg)
	open fun autoLinkMask(arg: Int) = DSL.autoLinkMask(arg)
	open fun compoundDrawablePadding(arg: Int) = DSL.compoundDrawablePadding(arg)
	open fun cursorVisible(arg: Boolean) = DSL.cursorVisible(arg)
	open fun customSelectionActionModeCallback(arg: ActionMode.Callback) = DSL.customSelectionActionModeCallback(arg)
	open fun editableFactory(arg: Editable.Factory) = DSL.editableFactory(arg)
	open fun ellipsize(arg: TextUtils.TruncateAt) = DSL.ellipsize(arg)
	open fun ems(arg: Int) = DSL.ems(arg)
	open fun error(arg: CharSequence) = DSL.error(arg)
	open fun extractedText(arg: ExtractedText) = DSL.extractedText(arg)
	open fun filters(arg: Array<InputFilter>) = DSL.filters(arg)
	open fun freezesText(arg: Boolean) = DSL.freezesText(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun height(arg: Int) = DSL.height(arg)
	open fun highlightColor(arg: Int) = DSL.highlightColor(arg)
	open fun hint(arg: Int) = DSL.hint(arg)
	open fun hint(arg: CharSequence) = DSL.hint(arg)
	open fun hintTextColor(arg: ColorStateList) = DSL.hintTextColor(arg)
	open fun hintTextColor(arg: Int) = DSL.hintTextColor(arg)
	open fun horizontallyScrolling(arg: Boolean) = DSL.horizontallyScrolling(arg)
	open fun imeOptions(arg: Int) = DSL.imeOptions(arg)
	open fun includeFontPadding(arg: Boolean) = DSL.includeFontPadding(arg)
	open fun inputExtras(arg: Int) = DSL.inputExtras(arg)
	open fun inputType(arg: Int) = DSL.inputType(arg)
	open fun keyListener(arg: KeyListener) = DSL.keyListener(arg)
	open fun lines(arg: Int) = DSL.lines(arg)
	open fun linkTextColor(arg: ColorStateList) = DSL.linkTextColor(arg)
	open fun linkTextColor(arg: Int) = DSL.linkTextColor(arg)
	open fun linksClickable(arg: Boolean) = DSL.linksClickable(arg)
	open fun marqueeRepeatLimit(arg: Int) = DSL.marqueeRepeatLimit(arg)
	open fun maxEms(arg: Int) = DSL.maxEms(arg)
	open fun maxHeight(arg: Int) = DSL.maxHeight(arg)
	open fun maxLines(arg: Int) = DSL.maxLines(arg)
	open fun maxWidth(arg: Int) = DSL.maxWidth(arg)
	open fun minEms(arg: Int) = DSL.minEms(arg)
	open fun minHeight(arg: Int) = DSL.minHeight(arg)
	open fun minLines(arg: Int) = DSL.minLines(arg)
	open fun minWidth(arg: Int) = DSL.minWidth(arg)
	open fun movementMethod(arg: MovementMethod) = DSL.movementMethod(arg)
	open fun onEditorAction(arg: android.widget.TextView.OnEditorActionListener) = DSL.onEditorAction(arg)
	open fun paintFlags(arg: Int) = DSL.paintFlags(arg)
	open fun privateImeOptions(arg: String) = DSL.privateImeOptions(arg)
	open fun rawInputType(arg: Int) = DSL.rawInputType(arg)
	open fun scroller(arg: Scroller) = DSL.scroller(arg)
	open fun selectAllOnFocus(arg: Boolean) = DSL.selectAllOnFocus(arg)
	open fun singleLine(arg: Boolean) = DSL.singleLine(arg)
	open fun spannableFactory(arg: Spannable.Factory) = DSL.spannableFactory(arg)
	open fun text(arg: Int) = DSL.text(arg)
	open fun textColor(arg: ColorStateList) = DSL.textColor(arg)
	open fun textColor(arg: Int) = DSL.textColor(arg)
	open fun textIsSelectable(arg: Boolean) = DSL.textIsSelectable(arg)
	open fun textKeepState(arg: CharSequence) = DSL.textKeepState(arg)
	open fun textScaleX(arg: Float) = DSL.textScaleX(arg)
	open fun transformationMethod(arg: TransformationMethod) = DSL.transformationMethod(arg)
	open fun typeface(arg: Typeface) = DSL.typeface(arg)
	open fun width(arg: Int) = DSL.width(arg)
}

abstract class DSLButtonBase : DSLTextViewBase() {
}

abstract class DSLCompoundButtonBase : DSLButtonBase() {
	open fun buttonDrawable(arg: Drawable) = DSL.buttonDrawable(arg)
	open fun buttonDrawable(arg: Int) = DSL.buttonDrawable(arg)
	open fun checked(arg: Boolean) = DSL.checked(arg)
	open fun onCheckedChange(arg: android.widget.CompoundButton.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}

abstract class DSLCheckBoxBase : DSLCompoundButtonBase() {
}

abstract class DSLRadioButtonBase : DSLCompoundButtonBase() {
}

abstract class DSLSwitchViewBase : DSLCompoundButtonBase() {
	open fun switchTypeface(arg: Typeface) = DSL.switchTypeface(arg)
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
}

abstract class DSLToggleButtonBase : DSLCompoundButtonBase() {
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
}

abstract class DSLCheckedTextViewBase : DSLTextViewBase() {
	open fun checkMarkDrawable(arg: Drawable) = DSL.checkMarkDrawable(arg)
	open fun checkMarkDrawable(arg: Int) = DSL.checkMarkDrawable(arg)
	open fun checked(arg: Boolean) = DSL.checked(arg)
}

abstract class DSLChronometerBase : DSLTextViewBase() {
	open fun base(arg: Long) = DSL.base(arg)
	open fun format(arg: String) = DSL.format(arg)
	open fun onChronometerTick(arg: android.widget.Chronometer.OnChronometerTickListener) = DSL.onChronometerTick(arg)
}

abstract class DSLDigitalClockBase : DSLTextViewBase() {
}

abstract class DSLEditTextBase : DSLTextViewBase() {
	open fun selection(arg: Int) = DSL.selection(arg)
}

abstract class DSLAutoCompleteTextViewBase : DSLEditTextBase() {
	open fun completionHint(arg: CharSequence) = DSL.completionHint(arg)
	open fun dropDownAnchor(arg: Int) = DSL.dropDownAnchor(arg)
	open fun dropDownBackgroundDrawable(arg: Drawable) = DSL.dropDownBackgroundDrawable(arg)
	open fun dropDownBackgroundResource(arg: Int) = DSL.dropDownBackgroundResource(arg)
	open fun dropDownHeight(arg: Int) = DSL.dropDownHeight(arg)
	open fun dropDownHorizontalOffset(arg: Int) = DSL.dropDownHorizontalOffset(arg)
	open fun dropDownVerticalOffset(arg: Int) = DSL.dropDownVerticalOffset(arg)
	open fun dropDownWidth(arg: Int) = DSL.dropDownWidth(arg)
	open fun listSelection(arg: Int) = DSL.listSelection(arg)
	open fun onItemClick(arg: AdapterView.OnItemClickListener) = DSL.onItemClick(arg)
	open fun onItemSelected(arg: AdapterView.OnItemSelectedListener) = DSL.onItemSelected(arg)
	open fun threshold(arg: Int) = DSL.threshold(arg)
	open fun validator(arg: android.widget.AutoCompleteTextView.Validator) = DSL.validator(arg)
}

abstract class DSLMultiAutoCompleteTextViewBase : DSLAutoCompleteTextViewBase() {
	open fun tokenizer(arg: android.widget.MultiAutoCompleteTextView.Tokenizer) = DSL.tokenizer(arg)
}

abstract class DSLExtractEditTextBase : DSLEditTextBase() {
}

abstract class DSLViewGroupBase : DSLViewBase() {
	open fun addStatesFromChildren(arg: Boolean) = DSL.addStatesFromChildren(arg)
	open fun alwaysDrawnWithCacheEnabled(arg: Boolean) = DSL.alwaysDrawnWithCacheEnabled(arg)
	open fun animationCacheEnabled(arg: Boolean) = DSL.animationCacheEnabled(arg)
	open fun clipChildren(arg: Boolean) = DSL.clipChildren(arg)
	open fun clipToPadding(arg: Boolean) = DSL.clipToPadding(arg)
	open fun descendantFocusability(arg: Int) = DSL.descendantFocusability(arg)
	open fun layoutAnimation(arg: LayoutAnimationController) = DSL.layoutAnimation(arg)
	open fun layoutAnimationListener(arg: Animation.AnimationListener) = DSL.layoutAnimationListener(arg)
	open fun layoutTransition(arg: LayoutTransition) = DSL.layoutTransition(arg)
	open fun motionEventSplittingEnabled(arg: Boolean) = DSL.motionEventSplittingEnabled(arg)
	open fun onHierarchyChange(arg: android.view.ViewGroup.OnHierarchyChangeListener) = DSL.onHierarchyChange(arg)
	open fun persistentDrawingCache(arg: Int) = DSL.persistentDrawingCache(arg)
}

abstract class DSLAbsoluteLayoutBase : DSLViewGroupBase() {
}

abstract class DSLWebViewBase : DSLAbsoluteLayoutBase() {
	open fun certificate(arg: SslCertificate) = DSL.certificate(arg)
	open fun downloadListener(arg: DownloadListener) = DSL.downloadListener(arg)
	open fun horizontalScrollbarOverlay(arg: Boolean) = DSL.horizontalScrollbarOverlay(arg)
	open fun initialScale(arg: Int) = DSL.initialScale(arg)
	open fun mapTrackballToArrowKeys(arg: Boolean) = DSL.mapTrackballToArrowKeys(arg)
	open fun networkAvailable(arg: Boolean) = DSL.networkAvailable(arg)
	open fun verticalScrollbarOverlay(arg: Boolean) = DSL.verticalScrollbarOverlay(arg)
	open fun webChromeClient(arg: WebChromeClient) = DSL.webChromeClient(arg)
	open fun webViewClient(arg: WebViewClient) = DSL.webViewClient(arg)
}

abstract class DSLAdapterViewBase : DSLViewGroupBase() {
	open fun adapter(arg: Adapter) = DSL.adapter(arg)
	open fun emptyView(arg: View) = DSL.emptyView(arg)
	open fun onItemClick(arg: android.widget.AdapterView.OnItemClickListener) = DSL.onItemClick(arg)
	open fun onItemLongClick(arg: android.widget.AdapterView.OnItemLongClickListener) = DSL.onItemLongClick(arg)
	open fun onItemSelected(arg: android.widget.AdapterView.OnItemSelectedListener) = DSL.onItemSelected(arg)
	open fun selection(arg: Int) = DSL.selection(arg)
}

abstract class DSLAbsListViewBase : DSLAdapterViewBase() {
	open fun cacheColorHint(arg: Int) = DSL.cacheColorHint(arg)
	open fun choiceMode(arg: Int) = DSL.choiceMode(arg)
	open fun drawSelectorOnTop(arg: Boolean) = DSL.drawSelectorOnTop(arg)
	open fun fastScrollAlwaysVisible(arg: Boolean) = DSL.fastScrollAlwaysVisible(arg)
	open fun fastScrollEnabled(arg: Boolean) = DSL.fastScrollEnabled(arg)
	open fun filterText(arg: String) = DSL.filterText(arg)
	open fun friction(arg: Float) = DSL.friction(arg)
	open fun multiChoiceModeListener(arg: android.widget.AbsListView.MultiChoiceModeListener) = DSL.multiChoiceModeListener(arg)
	open fun onScroll(arg: android.widget.AbsListView.OnScrollListener) = DSL.onScroll(arg)
	open fun recyclerListener(arg: android.widget.AbsListView.RecyclerListener) = DSL.recyclerListener(arg)
	open fun remoteViewsAdapter(arg: Intent) = DSL.remoteViewsAdapter(arg)
	open fun scrollingCacheEnabled(arg: Boolean) = DSL.scrollingCacheEnabled(arg)
	open fun selector(arg: Drawable) = DSL.selector(arg)
	open fun selector(arg: Int) = DSL.selector(arg)
	open fun smoothScrollbarEnabled(arg: Boolean) = DSL.smoothScrollbarEnabled(arg)
	open fun stackFromBottom(arg: Boolean) = DSL.stackFromBottom(arg)
	open fun textFilterEnabled(arg: Boolean) = DSL.textFilterEnabled(arg)
	open fun transcriptMode(arg: Int) = DSL.transcriptMode(arg)
	open fun velocityScale(arg: Float) = DSL.velocityScale(arg)
}

abstract class DSLGridViewBase : DSLAbsListViewBase() {
	open fun columnWidth(arg: Int) = DSL.columnWidth(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalSpacing(arg: Int) = DSL.horizontalSpacing(arg)
	open fun numColumns(arg: Int) = DSL.numColumns(arg)
	open fun stretchMode(arg: Int) = DSL.stretchMode(arg)
	open fun verticalSpacing(arg: Int) = DSL.verticalSpacing(arg)
}

abstract class DSLListViewBase : DSLAbsListViewBase() {
	open fun divider(arg: Drawable) = DSL.divider(arg)
	open fun dividerHeight(arg: Int) = DSL.dividerHeight(arg)
	open fun footerDividersEnabled(arg: Boolean) = DSL.footerDividersEnabled(arg)
	open fun headerDividersEnabled(arg: Boolean) = DSL.headerDividersEnabled(arg)
	open fun itemsCanFocus(arg: Boolean) = DSL.itemsCanFocus(arg)
	open fun overscrollFooter(arg: Drawable) = DSL.overscrollFooter(arg)
	open fun overscrollHeader(arg: Drawable) = DSL.overscrollHeader(arg)
}

abstract class DSLExpandableListViewBase : DSLListViewBase() {
	open fun adapter(arg: ExpandableListAdapter) = DSL.adapter(arg)
	open fun childDivider(arg: Drawable) = DSL.childDivider(arg)
	open fun childIndicator(arg: Drawable) = DSL.childIndicator(arg)
	open fun groupIndicator(arg: Drawable) = DSL.groupIndicator(arg)
	open fun onChildClick(arg: android.widget.ExpandableListView.OnChildClickListener) = DSL.onChildClick(arg)
	open fun onGroupClick(arg: android.widget.ExpandableListView.OnGroupClickListener) = DSL.onGroupClick(arg)
	open fun onGroupCollapse(arg: android.widget.ExpandableListView.OnGroupCollapseListener) = DSL.onGroupCollapse(arg)
	open fun onGroupExpand(arg: android.widget.ExpandableListView.OnGroupExpandListener) = DSL.onGroupExpand(arg)
	open fun selectedGroup(arg: Int) = DSL.selectedGroup(arg)
}

abstract class DSLAbsSpinnerBase : DSLAdapterViewBase() {
}

abstract class DSLGalleryBase : DSLAbsSpinnerBase() {
	open fun animationDuration(arg: Int) = DSL.animationDuration(arg)
	open fun callbackDuringFling(arg: Boolean) = DSL.callbackDuringFling(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun spacing(arg: Int) = DSL.spacing(arg)
	open fun unselectedAlpha(arg: Float) = DSL.unselectedAlpha(arg)
}

abstract class DSLSpinnerBase : DSLAbsSpinnerBase() {
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun prompt(arg: CharSequence) = DSL.prompt(arg)
	open fun promptId(arg: Int) = DSL.promptId(arg)
}

abstract class DSLAdapterViewAnimatorBase : DSLAdapterViewBase() {
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: ObjectAnimator) = DSL.inAnimation(arg)
	open fun outAnimation(arg: ObjectAnimator) = DSL.outAnimation(arg)
	open fun remoteViewsAdapter(arg: Intent) = DSL.remoteViewsAdapter(arg)
}

abstract class DSLAdapterViewFlipperBase : DSLAdapterViewAnimatorBase() {
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}

abstract class DSLStackViewBase : DSLAdapterViewAnimatorBase() {
}

abstract class DSLFragmentBreadCrumbsBase : DSLViewGroupBase() {
	open fun activity(arg: Activity) = DSL.activity(arg)
	open fun maxVisible(arg: Int) = DSL.maxVisible(arg)
	open fun onBreadCrumbClick(arg: android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) = DSL.onBreadCrumbClick(arg)
}

abstract class DSLFrameLayoutBase : DSLViewGroupBase() {
	open fun foreground(arg: Drawable) = DSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = DSL.foregroundGravity(arg)
	open fun measureAllChildren(arg: Boolean) = DSL.measureAllChildren(arg)
}

abstract class DSLAppWidgetHostViewBase : DSLFrameLayoutBase() {
}

abstract class DSLCalendarViewBase : DSLFrameLayoutBase() {
	open fun date(arg: Long) = DSL.date(arg)
	open fun firstDayOfWeek(arg: Int) = DSL.firstDayOfWeek(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun onDateChange(arg: android.widget.CalendarView.OnDateChangeListener) = DSL.onDateChange(arg)
	open fun showWeekNumber(arg: Boolean) = DSL.showWeekNumber(arg)
}

abstract class DSLDatePickerBase : DSLFrameLayoutBase() {
	open fun calendarViewShown(arg: Boolean) = DSL.calendarViewShown(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun spinnersShown(arg: Boolean) = DSL.spinnersShown(arg)
}

abstract class DSLGestureOverlayViewBase : DSLFrameLayoutBase() {
	open fun eventsInterceptionEnabled(arg: Boolean) = DSL.eventsInterceptionEnabled(arg)
	open fun fadeEnabled(arg: Boolean) = DSL.fadeEnabled(arg)
	open fun fadeOffset(arg: Long) = DSL.fadeOffset(arg)
	open fun gesture(arg: Gesture) = DSL.gesture(arg)
	open fun gestureColor(arg: Int) = DSL.gestureColor(arg)
	open fun gestureStrokeAngleThreshold(arg: Float) = DSL.gestureStrokeAngleThreshold(arg)
	open fun gestureStrokeLengthThreshold(arg: Float) = DSL.gestureStrokeLengthThreshold(arg)
	open fun gestureStrokeSquarenessTreshold(arg: Float) = DSL.gestureStrokeSquarenessTreshold(arg)
	open fun gestureStrokeType(arg: Int) = DSL.gestureStrokeType(arg)
	open fun gestureStrokeWidth(arg: Float) = DSL.gestureStrokeWidth(arg)
	open fun gestureVisible(arg: Boolean) = DSL.gestureVisible(arg)
	open fun orientation(arg: Int) = DSL.orientation(arg)
	open fun uncertainGestureColor(arg: Int) = DSL.uncertainGestureColor(arg)
}

abstract class DSLHorizontalScrollViewBase : DSLFrameLayoutBase() {
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}

abstract class DSLMediaControllerBase : DSLFrameLayoutBase() {
	open fun anchorView(arg: View) = DSL.anchorView(arg)
	open fun mediaPlayer(arg: android.widget.MediaController.MediaPlayerControl) = DSL.mediaPlayer(arg)
}

abstract class DSLScrollViewBase : DSLFrameLayoutBase() {
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}

abstract class DSLTabHostBase : DSLFrameLayoutBase() {
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun currentTabByTag(arg: String) = DSL.currentTabByTag(arg)
	open fun onTabChanged(arg: android.widget.TabHost.OnTabChangeListener) = DSL.onTabChanged(arg)
	open fun up(arg: LocalActivityManager) = DSL.up(arg)
}

abstract class DSLTimePickerBase : DSLFrameLayoutBase() {
	open fun currentHour(arg: Int) = DSL.currentHour(arg)
	open fun currentMinute(arg: Int) = DSL.currentMinute(arg)
	open fun is24HourView(arg: Boolean) = DSL.is24HourView(arg)
	open fun onTimeChanged(arg: android.widget.TimePicker.OnTimeChangedListener) = DSL.onTimeChanged(arg)
}

abstract class DSLViewAnimatorBase : DSLFrameLayoutBase() {
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: Animation) = DSL.inAnimation(arg)
	open fun outAnimation(arg: Animation) = DSL.outAnimation(arg)
}

abstract class DSLViewFlipperBase : DSLViewAnimatorBase() {
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}

abstract class DSLViewSwitcherBase : DSLViewAnimatorBase() {
	open fun factory(arg: android.widget.ViewSwitcher.ViewFactory) = DSL.factory(arg)
}

abstract class DSLImageSwitcherBase : DSLViewSwitcherBase() {
	open fun imageDrawable(arg: Drawable) = DSL.imageDrawable(arg)
	open fun imageResource(arg: Int) = DSL.imageResource(arg)
	open fun imageURI(arg: Uri) = DSL.imageURI(arg)
}

abstract class DSLTextSwitcherBase : DSLViewSwitcherBase() {
	open fun currentText(arg: CharSequence) = DSL.currentText(arg)
}

abstract class DSLGridLayoutBase : DSLViewGroupBase() {
	open fun alignmentMode(arg: Int) = DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = DSL.orientation(arg)
	open fun rowCount(arg: Int) = DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = DSL.useDefaultMargins(arg)
}

abstract class DSLLinearLayoutBase : DSLViewGroupBase() {
	open fun baselineAligned(arg: Boolean) = DSL.baselineAligned(arg)
	open fun baselineAlignedChildIndex(arg: Int) = DSL.baselineAlignedChildIndex(arg)
	open fun dividerDrawable(arg: Drawable) = DSL.dividerDrawable(arg)
	open fun dividerPadding(arg: Int) = DSL.dividerPadding(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = DSL.horizontalGravity(arg)
	open fun measureWithLargestChildEnabled(arg: Boolean) = DSL.measureWithLargestChildEnabled(arg)
	open fun orientation(arg: Int) = DSL.orientation(arg)
	open fun showDividers(arg: Int) = DSL.showDividers(arg)
	open fun verticalGravity(arg: Int) = DSL.verticalGravity(arg)
	open fun weightSum(arg: Float) = DSL.weightSum(arg)
}

abstract class DSLNumberPickerBase : DSLLinearLayoutBase() {
	open fun displayedValues(arg: Array<String>) = DSL.displayedValues(arg)
	open fun formatter(arg: android.widget.NumberPicker.Formatter) = DSL.formatter(arg)
	open fun maxValue(arg: Int) = DSL.maxValue(arg)
	open fun minValue(arg: Int) = DSL.minValue(arg)
	open fun onLongPressUpdateInterval(arg: Long) = DSL.onLongPressUpdateInterval(arg)
	open fun onScroll(arg: android.widget.NumberPicker.OnScrollListener) = DSL.onScroll(arg)
	open fun onValueChanged(arg: android.widget.NumberPicker.OnValueChangeListener) = DSL.onValueChanged(arg)
	open fun value(arg: Int) = DSL.value(arg)
	open fun wrapSelectorWheel(arg: Boolean) = DSL.wrapSelectorWheel(arg)
}

abstract class DSLRadioGroupBase : DSLLinearLayoutBase() {
	open fun onCheckedChange(arg: android.widget.RadioGroup.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}

abstract class DSLSearchViewBase : DSLLinearLayoutBase() {
	open fun iconified(arg: Boolean) = DSL.iconified(arg)
	open fun iconifiedByDefault(arg: Boolean) = DSL.iconifiedByDefault(arg)
	open fun imeOptions(arg: Int) = DSL.imeOptions(arg)
	open fun inputType(arg: Int) = DSL.inputType(arg)
	open fun maxWidth(arg: Int) = DSL.maxWidth(arg)
	open fun onClose(arg: android.widget.SearchView.OnCloseListener) = DSL.onClose(arg)
	open fun onQueryText(arg: android.widget.SearchView.OnQueryTextListener) = DSL.onQueryText(arg)
	open fun onQueryTextFocusChange(arg: View.OnFocusChangeListener) = DSL.onQueryTextFocusChange(arg)
	open fun onSearchClick(arg: View.OnClickListener) = DSL.onSearchClick(arg)
	open fun onSuggestion(arg: android.widget.SearchView.OnSuggestionListener) = DSL.onSuggestion(arg)
	open fun queryHint(arg: CharSequence) = DSL.queryHint(arg)
	open fun queryRefinementEnabled(arg: Boolean) = DSL.queryRefinementEnabled(arg)
	open fun searchableInfo(arg: SearchableInfo) = DSL.searchableInfo(arg)
	open fun submitButtonEnabled(arg: Boolean) = DSL.submitButtonEnabled(arg)
	open fun suggestionsAdapter(arg: CursorAdapter) = DSL.suggestionsAdapter(arg)
}

abstract class DSLTableLayoutBase : DSLLinearLayoutBase() {
	open fun shrinkAllColumns(arg: Boolean) = DSL.shrinkAllColumns(arg)
	open fun stretchAllColumns(arg: Boolean) = DSL.stretchAllColumns(arg)
}

abstract class DSLTableRowBase : DSLLinearLayoutBase() {
}

abstract class DSLTabWidgetBase : DSLLinearLayoutBase() {
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun dividerDrawable(arg: Int) = DSL.dividerDrawable(arg)
	open fun leftStripDrawable(arg: Drawable) = DSL.leftStripDrawable(arg)
	open fun leftStripDrawable(arg: Int) = DSL.leftStripDrawable(arg)
	open fun rightStripDrawable(arg: Drawable) = DSL.rightStripDrawable(arg)
	open fun rightStripDrawable(arg: Int) = DSL.rightStripDrawable(arg)
	open fun stripEnabled(arg: Boolean) = DSL.stripEnabled(arg)
}

abstract class DSLZoomControlsBase : DSLLinearLayoutBase() {
	open fun isZoomInEnabled(arg: Boolean) = DSL.isZoomInEnabled(arg)
	open fun isZoomOutEnabled(arg: Boolean) = DSL.isZoomOutEnabled(arg)
	open fun onZoomInClick(arg: View.OnClickListener) = DSL.onZoomInClick(arg)
	open fun onZoomOutClick(arg: View.OnClickListener) = DSL.onZoomOutClick(arg)
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}

abstract class DSLRelativeLayoutBase : DSLViewGroupBase() {
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = DSL.horizontalGravity(arg)
	open fun ignoreGravity(arg: Int) = DSL.ignoreGravity(arg)
	open fun verticalGravity(arg: Int) = DSL.verticalGravity(arg)
}

abstract class DSLDialerFilterBase : DSLRelativeLayoutBase() {
	open fun digitsWatcher(arg: TextWatcher) = DSL.digitsWatcher(arg)
	open fun filterWatcher(arg: TextWatcher) = DSL.filterWatcher(arg)
	open fun lettersWatcher(arg: TextWatcher) = DSL.lettersWatcher(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}

abstract class DSLTwoLineListItemBase : DSLRelativeLayoutBase() {
}

abstract class DSLSlidingDrawerBase : DSLViewGroupBase() {
	open fun onDrawerClose(arg: android.widget.SlidingDrawer.OnDrawerCloseListener) = DSL.onDrawerClose(arg)
	open fun onDrawerOpen(arg: android.widget.SlidingDrawer.OnDrawerOpenListener) = DSL.onDrawerOpen(arg)
	open fun onDrawerScroll(arg: android.widget.SlidingDrawer.OnDrawerScrollListener) = DSL.onDrawerScroll(arg)
}

abstract class DSLViewStubBase : DSLViewBase() {
	open fun inflatedId(arg: Int) = DSL.inflatedId(arg)
	open fun layoutResource(arg: Int) = DSL.layoutResource(arg)
	open fun onInflate(arg: android.view.ViewStub.OnInflateListener) = DSL.onInflate(arg)
}
