@file:Suppress("unused")

package graknol.anvil.kotlin

import android.animation.LayoutTransition
import android.animation.ObjectAnimator
import android.app.Activity
import android.app.LocalActivityManager
import android.app.SearchableInfo
import android.content.Context
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
import trikita.anvil.RenderableView

inline fun Anvil.Renderable.root(crossinline r: DSLViewGroup<ViewGroup.LayoutParams>.() -> Unit) = DSLViewGroup<ViewGroup.LayoutParams>().r()
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.numberPicker(crossinline r: DSLNumberPicker<U>.() -> Unit) = DSL.numberPicker({ DSLNumberPicker<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.ratingBar(crossinline r: DSLRatingBar<U>.() -> Unit) = DSL.ratingBar({ DSLRatingBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.switchView(crossinline r: DSLSwitchView<U>.() -> Unit) = DSL.switchView({ DSLSwitchView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.absoluteLayout(crossinline r: DSLAbsoluteLayout<U>.() -> Unit) = DSL.absoluteLayout({ DSLAbsoluteLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.timePicker(crossinline r: DSLTimePicker<U>.() -> Unit) = DSL.timePicker({ DSLTimePicker<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewAnimator(crossinline r: DSLViewAnimator<U>.() -> Unit) = DSL.viewAnimator({ DSLViewAnimator<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.radioGroup(crossinline r: DSLRadioGroup<U>.() -> Unit) = DSL.radioGroup({ DSLRadioGroup<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.dialerFilter(crossinline r: DSLDialerFilter<U>.() -> Unit) = DSL.dialerFilter({ DSLDialerFilter<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.searchView(crossinline r: DSLSearchView<U>.() -> Unit) = DSL.searchView({ DSLSearchView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.tabWidget(crossinline r: DSLTabWidget<U>.() -> Unit) = DSL.tabWidget({ DSLTabWidget<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.extractEditText(crossinline r: DSLExtractEditText<U>.() -> Unit) = DSL.extractEditText({ DSLExtractEditText<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.absSeekBar(crossinline r: DSLAbsSeekBar<U>.() -> Unit) = DSL.absSeekBar({ DSLAbsSeekBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.chronometer(crossinline r: DSLChronometer<U>.() -> Unit) = DSL.chronometer({ DSLChronometer<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.zoomControls(crossinline r: DSLZoomControls<U>.() -> Unit) = DSL.zoomControls({ DSLZoomControls<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.tabHost(crossinline r: DSLTabHost<U>.() -> Unit) = DSL.tabHost({ DSLTabHost<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.expandableListView(crossinline r: DSLExpandableListView<U>.() -> Unit) = DSL.expandableListView({ DSLExpandableListView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.adapterViewFlipper(crossinline r: DSLAdapterViewFlipper<U>.() -> Unit) = DSL.adapterViewFlipper({ DSLAdapterViewFlipper<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.imageButton(crossinline r: DSLImageButton<U>.() -> Unit) = DSL.imageButton({ DSLImageButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.radioButton(crossinline r: DSLRadioButton<U>.() -> Unit) = DSL.radioButton({ DSLRadioButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.view(crossinline r: DSLView<U>.() -> Unit) = DSL.view({ DSLView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.videoView(crossinline r: DSLVideoView<U>.() -> Unit) = DSL.videoView({ DSLVideoView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.digitalClock(crossinline r: DSLDigitalClock<U>.() -> Unit) = DSL.digitalClock({ DSLDigitalClock<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.calendarView(crossinline r: DSLCalendarView<U>.() -> Unit) = DSL.calendarView({ DSLCalendarView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.tableLayout(crossinline r: DSLTableLayout<U>.() -> Unit) = DSL.tableLayout({ DSLTableLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.textView(crossinline r: DSLTextView<U>.() -> Unit) = DSL.textView({ DSLTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.adapterView(crossinline r: DSLAdapterView<U>.() -> Unit) = DSL.adapterView({ DSLAdapterView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.imageSwitcher(crossinline r: DSLImageSwitcher<U>.() -> Unit) = DSL.imageSwitcher({ DSLImageSwitcher<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.autoCompleteTextView(crossinline r: DSLAutoCompleteTextView<U>.() -> Unit) = DSL.autoCompleteTextView({ DSLAutoCompleteTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.fragmentBreadCrumbs(crossinline r: DSLFragmentBreadCrumbs<U>.() -> Unit) = DSL.fragmentBreadCrumbs({ DSLFragmentBreadCrumbs<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.frameLayout(crossinline r: DSLFrameLayout<U>.() -> Unit) = DSL.frameLayout({ DSLFrameLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.gestureOverlayView(crossinline r: DSLGestureOverlayView<U>.() -> Unit) = DSL.gestureOverlayView({ DSLGestureOverlayView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.webView(crossinline r: DSLWebView<U>.() -> Unit) = DSL.webView({ DSLWebView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.tableRow(crossinline r: DSLTableRow<U>.() -> Unit) = DSL.tableRow({ DSLTableRow<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.scrollView(crossinline r: DSLScrollView<U>.() -> Unit) = DSL.scrollView({ DSLScrollView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.stackView(crossinline r: DSLStackView<U>.() -> Unit) = DSL.stackView({ DSLStackView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewStub(crossinline r: DSLViewStub<U>.() -> Unit) = DSL.viewStub({ DSLViewStub<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.checkBox(crossinline r: DSLCheckBox<U>.() -> Unit) = DSL.checkBox({ DSLCheckBox<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.twoLineListItem(crossinline r: DSLTwoLineListItem<U>.() -> Unit) = DSL.twoLineListItem({ DSLTwoLineListItem<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewSwitcher(crossinline r: DSLViewSwitcher<U>.() -> Unit) = DSL.viewSwitcher({ DSLViewSwitcher<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.spinner(crossinline r: DSLSpinner<U>.() -> Unit) = DSL.spinner({ DSLSpinner<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.textureView(crossinline r: DSLTextureView<U>.() -> Unit) = DSL.textureView({ DSLTextureView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.editText(crossinline r: DSLEditText<U>.() -> Unit) = DSL.editText({ DSLEditText<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.surfaceView(crossinline r: DSLSurfaceView<U>.() -> Unit) = DSL.surfaceView({ DSLSurfaceView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.space(crossinline r: DSLSpace<U>.() -> Unit) = DSL.space({ DSLSpace<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.checkedTextView(crossinline r: DSLCheckedTextView<U>.() -> Unit) = DSL.checkedTextView({ DSLCheckedTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.multiAutoCompleteTextView(crossinline r: DSLMultiAutoCompleteTextView<U>.() -> Unit) = DSL.multiAutoCompleteTextView({ DSLMultiAutoCompleteTextView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.gLSurfaceView(crossinline r: DSLGLSurfaceView<U>.() -> Unit) = DSL.gLSurfaceView({ DSLGLSurfaceView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.listView(crossinline r: DSLListView<U>.() -> Unit) = DSL.listView({ DSLListView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.appWidgetHostView(crossinline r: DSLAppWidgetHostView<U>.() -> Unit) = DSL.appWidgetHostView({ DSLAppWidgetHostView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.analogClock(crossinline r: DSLAnalogClock<U>.() -> Unit) = DSL.analogClock({ DSLAnalogClock<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.button(crossinline r: DSLButton<U>.() -> Unit) = DSL.button({ DSLButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.slidingDrawer(crossinline r: DSLSlidingDrawer<U>.() -> Unit) = DSL.slidingDrawer({ DSLSlidingDrawer<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.keyboardView(crossinline r: DSLKeyboardView<U>.() -> Unit) = DSL.keyboardView({ DSLKeyboardView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.linearLayout(crossinline r: DSLLinearLayout<U>.() -> Unit) = DSL.linearLayout({ DSLLinearLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.seekBar(crossinline r: DSLSeekBar<U>.() -> Unit) = DSL.seekBar({ DSLSeekBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.datePicker(crossinline r: DSLDatePicker<U>.() -> Unit) = DSL.datePicker({ DSLDatePicker<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.zoomButton(crossinline r: DSLZoomButton<U>.() -> Unit) = DSL.zoomButton({ DSLZoomButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.relativeLayout(crossinline r: DSLRelativeLayout<U>.() -> Unit) = DSL.relativeLayout({ DSLRelativeLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.gallery(crossinline r: DSLGallery<U>.() -> Unit) = DSL.gallery({ DSLGallery<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.gridView(crossinline r: DSLGridView<U>.() -> Unit) = DSL.gridView({ DSLGridView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.toggleButton(crossinline r: DSLToggleButton<U>.() -> Unit) = DSL.toggleButton({ DSLToggleButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.mediaController(crossinline r: DSLMediaController<U>.() -> Unit) = DSL.mediaController({ DSLMediaController<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewGroup(crossinline r: DSLViewGroup<U>.() -> Unit) = DSL.viewGroup({ DSLViewGroup<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.viewFlipper(crossinline r: DSLViewFlipper<U>.() -> Unit) = DSL.viewFlipper({ DSLViewFlipper<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.quickContactBadge(crossinline r: DSLQuickContactBadge<U>.() -> Unit) = DSL.quickContactBadge({ DSLQuickContactBadge<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.horizontalScrollView(crossinline r: DSLHorizontalScrollView<U>.() -> Unit) = DSL.horizontalScrollView({ DSLHorizontalScrollView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.gridLayout(crossinline r: DSLGridLayout<U>.() -> Unit) = DSL.gridLayout({ DSLGridLayout<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.adapterViewAnimator(crossinline r: DSLAdapterViewAnimator<U>.() -> Unit) = DSL.adapterViewAnimator({ DSLAdapterViewAnimator<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.textSwitcher(crossinline r: DSLTextSwitcher<U>.() -> Unit) = DSL.textSwitcher({ DSLTextSwitcher<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.absSpinner(crossinline r: DSLAbsSpinner<U>.() -> Unit) = DSL.absSpinner({ DSLAbsSpinner<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.absListView(crossinline r: DSLAbsListView<U>.() -> Unit) = DSL.absListView({ DSLAbsListView<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.progressBar(crossinline r: DSLProgressBar<U>.() -> Unit) = DSL.progressBar({ DSLProgressBar<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.compoundButton(crossinline r: DSLCompoundButton<U>.() -> Unit) = DSL.compoundButton({ DSLCompoundButton<U>().r() })
inline fun <T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams> DSLViewGroupBase<T, U>.imageView(crossinline r: DSLImageView<U>.() -> Unit) = DSL.imageView({ DSLImageView<U>().r() })

open class DSLView<T : ViewGroup.LayoutParams>() : BaseDSL() {
	fun layoutParams(arg: T.() -> Unit) {
		@Suppress("UNCHECKED_CAST")
		var lparams = Anvil.currentView<View>().layoutParams as T
		lparams.arg()
		DSL.layoutParams(lparams)
	}
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
open class DSLAnalogClock<T : ViewGroup.LayoutParams>() : DSLView<T>() {
}
open class DSLImageView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
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
open class DSLImageButton<T : ViewGroup.LayoutParams>() : DSLImageView<T>() {
}
open class DSLZoomButton<T : ViewGroup.LayoutParams>() : DSLImageButton<T>() {
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}
open class DSLQuickContactBadge<T : ViewGroup.LayoutParams>() : DSLImageView<T>() {
	open fun excludeMimes(arg: Array<String>) = DSL.excludeMimes(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}
open class DSLKeyboardView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	open fun keyboard(arg: Keyboard) = DSL.keyboard(arg)
	open fun onKeyboardAction(arg: android.inputmethodservice.KeyboardView.OnKeyboardActionListener) = DSL.onKeyboardAction(arg)
	open fun popupParent(arg: View) = DSL.popupParent(arg)
	open fun previewEnabled(arg: Boolean) = DSL.previewEnabled(arg)
	open fun proximityCorrectionEnabled(arg: Boolean) = DSL.proximityCorrectionEnabled(arg)
	open fun shifted(arg: Boolean) = DSL.shifted(arg)
	open fun verticalCorrection(arg: Int) = DSL.verticalCorrection(arg)
}
open class DSLProgressBar<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	open fun indeterminate(arg: Boolean) = DSL.indeterminate(arg)
	open fun indeterminateDrawable(arg: Drawable) = DSL.indeterminateDrawable(arg)
	open fun interpolator(arg: Interpolator) = DSL.interpolator(arg)
	open fun max(arg: Int) = DSL.max(arg)
	open fun progress(arg: Int) = DSL.progress(arg)
	open fun progressDrawable(arg: Drawable) = DSL.progressDrawable(arg)
	open fun secondaryProgress(arg: Int) = DSL.secondaryProgress(arg)
}
open class DSLAbsSeekBar<T : ViewGroup.LayoutParams>() : DSLProgressBar<T>() {
	open fun keyProgressIncrement(arg: Int) = DSL.keyProgressIncrement(arg)
	open fun thumb(arg: Drawable) = DSL.thumb(arg)
	open fun thumbOffset(arg: Int) = DSL.thumbOffset(arg)
}
open class DSLRatingBar<T : ViewGroup.LayoutParams>() : DSLAbsSeekBar<T>() {
	open fun isIndicator(arg: Boolean) = DSL.isIndicator(arg)
	open fun numStars(arg: Int) = DSL.numStars(arg)
	open fun onRatingBarChange(arg: android.widget.RatingBar.OnRatingBarChangeListener) = DSL.onRatingBarChange(arg)
	open fun rating(arg: Float) = DSL.rating(arg)
	open fun stepSize(arg: Float) = DSL.stepSize(arg)
}
open class DSLSeekBar<T : ViewGroup.LayoutParams>() : DSLAbsSeekBar<T>() {
	open fun onSeekBarChange(arg: android.widget.SeekBar.OnSeekBarChangeListener) = DSL.onSeekBarChange(arg)
}
open class DSLSpace<T : ViewGroup.LayoutParams>() : DSLView<T>() {
}
open class DSLSurfaceView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	open fun zOrderMediaOverlay(arg: Boolean) = DSL.zOrderMediaOverlay(arg)
	open fun zOrderOnTop(arg: Boolean) = DSL.zOrderOnTop(arg)
}
open class DSLGLSurfaceView<T : ViewGroup.LayoutParams>() : DSLSurfaceView<T>() {
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
open class DSLVideoView<T : ViewGroup.LayoutParams>() : DSLSurfaceView<T>() {
	open fun mediaController(arg: MediaController) = DSL.mediaController(arg)
	open fun onCompletion(arg: MediaPlayer.OnCompletionListener) = DSL.onCompletion(arg)
	open fun onError(arg: MediaPlayer.OnErrorListener) = DSL.onError(arg)
	open fun onPrepared(arg: MediaPlayer.OnPreparedListener) = DSL.onPrepared(arg)
	open fun videoPath(arg: String) = DSL.videoPath(arg)
	open fun videoURI(arg: Uri) = DSL.videoURI(arg)
}
open class DSLTextureView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	open fun opaque(arg: Boolean) = DSL.opaque(arg)
	open fun surfaceTextureListener(arg: android.view.TextureView.SurfaceTextureListener) = DSL.surfaceTextureListener(arg)
	open fun transform(arg: Matrix) = DSL.transform(arg)
}
open class DSLTextView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
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
open class DSLButton<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
}
open class DSLCompoundButton<T : ViewGroup.LayoutParams>() : DSLButton<T>() {
	open fun buttonDrawable(arg: Drawable) = DSL.buttonDrawable(arg)
	open fun buttonDrawable(arg: Int) = DSL.buttonDrawable(arg)
	open fun checked(arg: Boolean) = DSL.checked(arg)
	open fun onCheckedChange(arg: android.widget.CompoundButton.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}
open class DSLCheckBox<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
}
open class DSLRadioButton<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
}
open class DSLSwitchView<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	open fun switchTypeface(arg: Typeface) = DSL.switchTypeface(arg)
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
}
open class DSLToggleButton<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
}
open class DSLCheckedTextView<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	open fun checkMarkDrawable(arg: Drawable) = DSL.checkMarkDrawable(arg)
	open fun checkMarkDrawable(arg: Int) = DSL.checkMarkDrawable(arg)
	open fun checked(arg: Boolean) = DSL.checked(arg)
}
open class DSLChronometer<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	open fun base(arg: Long) = DSL.base(arg)
	open fun format(arg: String) = DSL.format(arg)
	open fun onChronometerTick(arg: android.widget.Chronometer.OnChronometerTickListener) = DSL.onChronometerTick(arg)
}
open class DSLDigitalClock<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
}
open class DSLEditText<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	open fun selection(arg: Int) = DSL.selection(arg)
}
open class DSLAutoCompleteTextView<T : ViewGroup.LayoutParams>() : DSLEditText<T>() {
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
open class DSLMultiAutoCompleteTextView<T : ViewGroup.LayoutParams>() : DSLAutoCompleteTextView<T>() {
	open fun tokenizer(arg: android.widget.MultiAutoCompleteTextView.Tokenizer) = DSL.tokenizer(arg)
}
open class DSLExtractEditText<T : ViewGroup.LayoutParams>() : DSLEditText<T>() {
}
open class DSLViewGroupBase<T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams>() : DSLView<T>() {
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
open class DSLViewGroup<T : ViewGroup.LayoutParams>() : DSLViewGroupBase<T, ViewGroup.LayoutParams>() {
}
open class DSLAbsoluteLayoutBase<T : ViewGroup.LayoutParams, U : AbsoluteLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
}
open class DSLAbsoluteLayout<T : ViewGroup.LayoutParams>() : DSLAbsoluteLayoutBase<T, AbsoluteLayout.LayoutParams>() {
}
open class DSLWebView<T : ViewGroup.LayoutParams>() : DSLAbsoluteLayout<T>() {
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
open class DSLAdapterViewBase<T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun adapter(arg: Adapter) = DSL.adapter(arg)
	open fun emptyView(arg: View) = DSL.emptyView(arg)
	open fun onItemClick(arg: android.widget.AdapterView.OnItemClickListener) = DSL.onItemClick(arg)
	open fun onItemLongClick(arg: android.widget.AdapterView.OnItemLongClickListener) = DSL.onItemLongClick(arg)
	open fun onItemSelected(arg: android.widget.AdapterView.OnItemSelectedListener) = DSL.onItemSelected(arg)
	open fun selection(arg: Int) = DSL.selection(arg)
}
open class DSLAdapterView<T : ViewGroup.LayoutParams>() : DSLAdapterViewBase<T, ViewGroup.LayoutParams>() {
}
open class DSLAbsListViewBase<T : ViewGroup.LayoutParams, U : AbsListView.LayoutParams>() : DSLAdapterViewBase<T, U>() {
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
open class DSLAbsListView<T : ViewGroup.LayoutParams>() : DSLAbsListViewBase<T, AbsListView.LayoutParams>() {
}
open class DSLGridView<T : ViewGroup.LayoutParams>() : DSLAbsListView<T>() {
	open fun columnWidth(arg: Int) = DSL.columnWidth(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalSpacing(arg: Int) = DSL.horizontalSpacing(arg)
	open fun numColumns(arg: Int) = DSL.numColumns(arg)
	open fun stretchMode(arg: Int) = DSL.stretchMode(arg)
	open fun verticalSpacing(arg: Int) = DSL.verticalSpacing(arg)
}
open class DSLListView<T : ViewGroup.LayoutParams>() : DSLAbsListView<T>() {
	open fun divider(arg: Drawable) = DSL.divider(arg)
	open fun dividerHeight(arg: Int) = DSL.dividerHeight(arg)
	open fun footerDividersEnabled(arg: Boolean) = DSL.footerDividersEnabled(arg)
	open fun headerDividersEnabled(arg: Boolean) = DSL.headerDividersEnabled(arg)
	open fun itemsCanFocus(arg: Boolean) = DSL.itemsCanFocus(arg)
	open fun overscrollFooter(arg: Drawable) = DSL.overscrollFooter(arg)
	open fun overscrollHeader(arg: Drawable) = DSL.overscrollHeader(arg)
}
open class DSLExpandableListView<T : ViewGroup.LayoutParams>() : DSLListView<T>() {
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
open class DSLAbsSpinnerBase<T : ViewGroup.LayoutParams, U : ViewGroup.LayoutParams>() : DSLAdapterViewBase<T, U>() {
}
open class DSLAbsSpinner<T : ViewGroup.LayoutParams>() : DSLAbsSpinnerBase<T, ViewGroup.LayoutParams>() {
}
open class DSLGalleryBase<T : ViewGroup.LayoutParams, U : Gallery.LayoutParams>() : DSLAbsSpinnerBase<T, U>() {
	open fun animationDuration(arg: Int) = DSL.animationDuration(arg)
	open fun callbackDuringFling(arg: Boolean) = DSL.callbackDuringFling(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun spacing(arg: Int) = DSL.spacing(arg)
	open fun unselectedAlpha(arg: Float) = DSL.unselectedAlpha(arg)
}
open class DSLGallery<T : ViewGroup.LayoutParams>() : DSLGalleryBase<T, Gallery.LayoutParams>() {
}
open class DSLSpinner<T : ViewGroup.LayoutParams>() : DSLAbsSpinner<T>() {
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun prompt(arg: CharSequence) = DSL.prompt(arg)
	open fun promptId(arg: Int) = DSL.promptId(arg)
}
open class DSLAdapterViewAnimator<T : ViewGroup.LayoutParams>() : DSLAdapterView<T>() {
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: ObjectAnimator) = DSL.inAnimation(arg)
	open fun outAnimation(arg: ObjectAnimator) = DSL.outAnimation(arg)
	open fun remoteViewsAdapter(arg: Intent) = DSL.remoteViewsAdapter(arg)
}
open class DSLAdapterViewFlipper<T : ViewGroup.LayoutParams>() : DSLAdapterViewAnimator<T>() {
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}
open class DSLStackView<T : ViewGroup.LayoutParams>() : DSLAdapterViewAnimator<T>() {
}
open class DSLFragmentBreadCrumbs<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	open fun activity(arg: Activity) = DSL.activity(arg)
	open fun maxVisible(arg: Int) = DSL.maxVisible(arg)
	open fun onBreadCrumbClick(arg: android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) = DSL.onBreadCrumbClick(arg)
}
open class DSLFrameLayoutBase<T : ViewGroup.LayoutParams, U : FrameLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun foreground(arg: Drawable) = DSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = DSL.foregroundGravity(arg)
	open fun measureAllChildren(arg: Boolean) = DSL.measureAllChildren(arg)
}
open class DSLFrameLayout<T : ViewGroup.LayoutParams>() : DSLFrameLayoutBase<T, FrameLayout.LayoutParams>() {
}
open class DSLAppWidgetHostView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
}
open class DSLCalendarView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun date(arg: Long) = DSL.date(arg)
	open fun firstDayOfWeek(arg: Int) = DSL.firstDayOfWeek(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun onDateChange(arg: android.widget.CalendarView.OnDateChangeListener) = DSL.onDateChange(arg)
	open fun showWeekNumber(arg: Boolean) = DSL.showWeekNumber(arg)
}
open class DSLDatePicker<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun calendarViewShown(arg: Boolean) = DSL.calendarViewShown(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun spinnersShown(arg: Boolean) = DSL.spinnersShown(arg)
}
open class DSLGestureOverlayView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
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
open class DSLHorizontalScrollView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}
open class DSLMediaController<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun anchorView(arg: View) = DSL.anchorView(arg)
	open fun mediaPlayer(arg: android.widget.MediaController.MediaPlayerControl) = DSL.mediaPlayer(arg)
}
open class DSLScrollView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}
open class DSLTabHost<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun currentTabByTag(arg: String) = DSL.currentTabByTag(arg)
	open fun onTabChanged(arg: android.widget.TabHost.OnTabChangeListener) = DSL.onTabChanged(arg)
	open fun up(arg: LocalActivityManager) = DSL.up(arg)
}
open class DSLTimePicker<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun currentHour(arg: Int) = DSL.currentHour(arg)
	open fun currentMinute(arg: Int) = DSL.currentMinute(arg)
	open fun is24HourView(arg: Boolean) = DSL.is24HourView(arg)
	open fun onTimeChanged(arg: android.widget.TimePicker.OnTimeChangedListener) = DSL.onTimeChanged(arg)
}
open class DSLViewAnimator<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: Animation) = DSL.inAnimation(arg)
	open fun outAnimation(arg: Animation) = DSL.outAnimation(arg)
}
open class DSLViewFlipper<T : ViewGroup.LayoutParams>() : DSLViewAnimator<T>() {
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}
open class DSLViewSwitcher<T : ViewGroup.LayoutParams>() : DSLViewAnimator<T>() {
	open fun factory(arg: android.widget.ViewSwitcher.ViewFactory) = DSL.factory(arg)
}
open class DSLImageSwitcher<T : ViewGroup.LayoutParams>() : DSLViewSwitcher<T>() {
	open fun imageDrawable(arg: Drawable) = DSL.imageDrawable(arg)
	open fun imageResource(arg: Int) = DSL.imageResource(arg)
	open fun imageURI(arg: Uri) = DSL.imageURI(arg)
}
open class DSLTextSwitcher<T : ViewGroup.LayoutParams>() : DSLViewSwitcher<T>() {
	open fun currentText(arg: CharSequence) = DSL.currentText(arg)
}
open class DSLGridLayoutBase<T : ViewGroup.LayoutParams, U : GridLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun alignmentMode(arg: Int) = DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = DSL.orientation(arg)
	open fun rowCount(arg: Int) = DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = DSL.useDefaultMargins(arg)
}
open class DSLGridLayout<T : ViewGroup.LayoutParams>() : DSLGridLayoutBase<T, GridLayout.LayoutParams>() {
}
open class DSLLinearLayoutBase<T : ViewGroup.LayoutParams, U : LinearLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
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
open class DSLLinearLayout<T : ViewGroup.LayoutParams> : DSLLinearLayoutBase<T, LinearLayout.LayoutParams>() {
}
open class DSLNumberPicker<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
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
open class DSLRadioGroupBase<T : ViewGroup.LayoutParams, U : RadioGroup.LayoutParams>() : DSLLinearLayoutBase<T, U>() {
	open fun onCheckedChange(arg: android.widget.RadioGroup.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}
open class DSLRadioGroup<T : ViewGroup.LayoutParams>() : DSLRadioGroupBase<T, RadioGroup.LayoutParams>() {
}
open class DSLSearchView<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
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
open class DSLTableLayoutBase<T : ViewGroup.LayoutParams, U : TableLayout.LayoutParams>() : DSLLinearLayoutBase<T, U>() {
	open fun shrinkAllColumns(arg: Boolean) = DSL.shrinkAllColumns(arg)
	open fun stretchAllColumns(arg: Boolean) = DSL.stretchAllColumns(arg)
}
open class DSLTableLayout<T : ViewGroup.LayoutParams> : DSLTableLayoutBase<T, TableLayout.LayoutParams>() {
}
open class DSLTableRowBase<T : ViewGroup.LayoutParams, U : TableRow.LayoutParams>() : DSLLinearLayoutBase<T, U>() {
}
open class DSLTableRow<T : ViewGroup.LayoutParams> : DSLTableRowBase<T, TableRow.LayoutParams>() {
}
open class DSLTabWidget<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun dividerDrawable(arg: Int) = DSL.dividerDrawable(arg)
	open fun leftStripDrawable(arg: Drawable) = DSL.leftStripDrawable(arg)
	open fun leftStripDrawable(arg: Int) = DSL.leftStripDrawable(arg)
	open fun rightStripDrawable(arg: Drawable) = DSL.rightStripDrawable(arg)
	open fun rightStripDrawable(arg: Int) = DSL.rightStripDrawable(arg)
	open fun stripEnabled(arg: Boolean) = DSL.stripEnabled(arg)
}
open class DSLZoomControls<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	open fun isZoomInEnabled(arg: Boolean) = DSL.isZoomInEnabled(arg)
	open fun isZoomOutEnabled(arg: Boolean) = DSL.isZoomOutEnabled(arg)
	open fun onZoomInClick(arg: View.OnClickListener) = DSL.onZoomInClick(arg)
	open fun onZoomOutClick(arg: View.OnClickListener) = DSL.onZoomOutClick(arg)
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}
open class DSLRelativeLayoutBase<T : ViewGroup.LayoutParams, U : RelativeLayout.LayoutParams>() : DSLViewGroupBase<T, U>() {
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = DSL.horizontalGravity(arg)
	open fun ignoreGravity(arg: Int) = DSL.ignoreGravity(arg)
	open fun verticalGravity(arg: Int) = DSL.verticalGravity(arg)
}
open class DSLRelativeLayout<T : ViewGroup.LayoutParams>() : DSLRelativeLayoutBase<T, RelativeLayout.LayoutParams>() {
}
open class DSLDialerFilter<T : ViewGroup.LayoutParams>() : DSLRelativeLayout<T>() {
	open fun digitsWatcher(arg: TextWatcher) = DSL.digitsWatcher(arg)
	open fun filterWatcher(arg: TextWatcher) = DSL.filterWatcher(arg)
	open fun lettersWatcher(arg: TextWatcher) = DSL.lettersWatcher(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}
open class DSLTwoLineListItem<T : ViewGroup.LayoutParams>() : DSLRelativeLayout<T>() {
}
open class DSLSlidingDrawer<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	open fun onDrawerClose(arg: android.widget.SlidingDrawer.OnDrawerCloseListener) = DSL.onDrawerClose(arg)
	open fun onDrawerOpen(arg: android.widget.SlidingDrawer.OnDrawerOpenListener) = DSL.onDrawerOpen(arg)
	open fun onDrawerScroll(arg: android.widget.SlidingDrawer.OnDrawerScrollListener) = DSL.onDrawerScroll(arg)
}
open class DSLViewStub<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	open fun inflatedId(arg: Int) = DSL.inflatedId(arg)
	open fun layoutResource(arg: Int) = DSL.layoutResource(arg)
	open fun onInflate(arg: android.view.ViewStub.OnInflateListener) = DSL.onInflate(arg)
}