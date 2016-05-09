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
import android.graphics.*
import android.graphics.drawable.Drawable
import android.inputmethodservice.Keyboard
import android.media.MediaPlayer
import android.net.Uri
import android.text.*
import android.text.method.KeyListener
import android.text.method.MovementMethod
import android.text.method.TransformationMethod
import android.view.*
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
import java.util.*

inline fun Anvil.Renderable.scrollView(crossinline r: DSLScrollView.() -> Unit) = DSL.scrollView({ DSLScrollView.r() })
inline fun Anvil.Renderable.absListView(crossinline r: DSLAbsListView.() -> Unit) = DSL.absListView({ DSLAbsListView.r() })
inline fun Anvil.Renderable.imageView(crossinline r: DSLImageView.() -> Unit) = DSL.imageView({ DSLImageView.r() })
inline fun Anvil.Renderable.absSeekBar(crossinline r: DSLAbsSeekBar.() -> Unit) = DSL.absSeekBar({ DSLAbsSeekBar.r() })
inline fun Anvil.Renderable.ratingBar(crossinline r: DSLRatingBar.() -> Unit) = DSL.ratingBar({ DSLRatingBar.r() })
inline fun Anvil.Renderable.twoLineListItem(crossinline r: DSLTwoLineListItem.() -> Unit) = DSL.twoLineListItem({ DSLTwoLineListItem.r() })
inline fun Anvil.Renderable.mediaRouteButton(crossinline r: DSLMediaRouteButton.() -> Unit) = DSL.mediaRouteButton({ DSLMediaRouteButton.r() })
inline fun Anvil.Renderable.viewStub(crossinline r: DSLViewStub.() -> Unit) = DSL.viewStub({ DSLViewStub.r() })
inline fun Anvil.Renderable.keyboardView(crossinline r: DSLKeyboardView.() -> Unit) = DSL.keyboardView({ DSLKeyboardView.r() })
inline fun Anvil.Renderable.absoluteLayout(crossinline r: DSLAbsoluteLayout.() -> Unit) = DSL.absoluteLayout({ DSLAbsoluteLayout.r() })
inline fun Anvil.Renderable.zoomButton(crossinline r: DSLZoomButton.() -> Unit) = DSL.zoomButton({ DSLZoomButton.r() })
inline fun Anvil.Renderable.webView(crossinline r: DSLWebView.() -> Unit) = DSL.webView({ DSLWebView.r() })
inline fun Anvil.Renderable.appWidgetHostView(crossinline r: DSLAppWidgetHostView.() -> Unit) = DSL.appWidgetHostView({ DSLAppWidgetHostView.r() })
inline fun Anvil.Renderable.view(crossinline r: DSLView.() -> Unit) = DSL.view({ DSLView.r() })
inline fun Anvil.Renderable.surfaceView(crossinline r: DSLSurfaceView.() -> Unit) = DSL.surfaceView({ DSLSurfaceView.r() })
inline fun Anvil.Renderable.gLSurfaceView(crossinline r: DSLGLSurfaceView.() -> Unit) = DSL.gLSurfaceView({ DSLGLSurfaceView.r() })
inline fun Anvil.Renderable.textClock(crossinline r: DSLTextClock.() -> Unit) = DSL.textClock({ DSLTextClock.r() })
inline fun Anvil.Renderable.expandableListView(crossinline r: DSLExpandableListView.() -> Unit) = DSL.expandableListView({ DSLExpandableListView.r() })
inline fun Anvil.Renderable.imageSwitcher(crossinline r: DSLImageSwitcher.() -> Unit) = DSL.imageSwitcher({ DSLImageSwitcher.r() })
inline fun Anvil.Renderable.textView(crossinline r: DSLTextView.() -> Unit) = DSL.textView({ DSLTextView.r() })
inline fun Anvil.Renderable.gridLayout(crossinline r: DSLGridLayout.() -> Unit) = DSL.gridLayout({ DSLGridLayout.r() })
inline fun Anvil.Renderable.quickContactBadge(crossinline r: DSLQuickContactBadge.() -> Unit) = DSL.quickContactBadge({ DSLQuickContactBadge.r() })
inline fun Anvil.Renderable.mediaController(crossinline r: DSLMediaController.() -> Unit) = DSL.mediaController({ DSLMediaController.r() })
inline fun Anvil.Renderable.videoView(crossinline r: DSLVideoView.() -> Unit) = DSL.videoView({ DSLVideoView.r() })
inline fun Anvil.Renderable.calendarView(crossinline r: DSLCalendarView.() -> Unit) = DSL.calendarView({ DSLCalendarView.r() })
inline fun Anvil.Renderable.timePicker(crossinline r: DSLTimePicker.() -> Unit) = DSL.timePicker({ DSLTimePicker.r() })
inline fun Anvil.Renderable.tableLayout(crossinline r: DSLTableLayout.() -> Unit) = DSL.tableLayout({ DSLTableLayout.r() })
inline fun Anvil.Renderable.progressBar(crossinline r: DSLProgressBar.() -> Unit) = DSL.progressBar({ DSLProgressBar.r() })
inline fun Anvil.Renderable.numberPicker(crossinline r: DSLNumberPicker.() -> Unit) = DSL.numberPicker({ DSLNumberPicker.r() })
inline fun Anvil.Renderable.tabWidget(crossinline r: DSLTabWidget.() -> Unit) = DSL.tabWidget({ DSLTabWidget.r() })
inline fun Anvil.Renderable.editText(crossinline r: DSLEditText.() -> Unit) = DSL.editText({ DSLEditText.r() })
inline fun Anvil.Renderable.fragmentBreadCrumbs(crossinline r: DSLFragmentBreadCrumbs.() -> Unit) = DSL.fragmentBreadCrumbs({ DSLFragmentBreadCrumbs.r() })
inline fun Anvil.Renderable.tableRow(crossinline r: DSLTableRow.() -> Unit) = DSL.tableRow({ DSLTableRow.r() })
inline fun Anvil.Renderable.toggleButton(crossinline r: DSLToggleButton.() -> Unit) = DSL.toggleButton({ DSLToggleButton.r() })
inline fun Anvil.Renderable.horizontalScrollView(crossinline r: DSLHorizontalScrollView.() -> Unit) = DSL.horizontalScrollView({ DSLHorizontalScrollView.r() })
inline fun Anvil.Renderable.chronometer(crossinline r: DSLChronometer.() -> Unit) = DSL.chronometer({ DSLChronometer.r() })
inline fun Anvil.Renderable.viewGroup(crossinline r: DSLViewGroup.() -> Unit) = DSL.viewGroup({ DSLViewGroup.r() })
inline fun Anvil.Renderable.listView(crossinline r: DSLListView.() -> Unit) = DSL.listView({ DSLListView.r() })
inline fun Anvil.Renderable.seekBar(crossinline r: DSLSeekBar.() -> Unit) = DSL.seekBar({ DSLSeekBar.r() })
inline fun Anvil.Renderable.radioButton(crossinline r: DSLRadioButton.() -> Unit) = DSL.radioButton({ DSLRadioButton.r() })
inline fun Anvil.Renderable.digitalClock(crossinline r: DSLDigitalClock.() -> Unit) = DSL.digitalClock({ DSLDigitalClock.r() })
inline fun Anvil.Renderable.checkedTextView(crossinline r: DSLCheckedTextView.() -> Unit) = DSL.checkedTextView({ DSLCheckedTextView.r() })
inline fun Anvil.Renderable.multiAutoCompleteTextView(crossinline r: DSLMultiAutoCompleteTextView.() -> Unit) = DSL.multiAutoCompleteTextView({ DSLMultiAutoCompleteTextView.r() })
inline fun Anvil.Renderable.compoundButton(crossinline r: DSLCompoundButton.() -> Unit) = DSL.compoundButton({ DSLCompoundButton.r() })
inline fun Anvil.Renderable.absSpinner(crossinline r: DSLAbsSpinner.() -> Unit) = DSL.absSpinner({ DSLAbsSpinner.r() })
inline fun Anvil.Renderable.adapterViewFlipper(crossinline r: DSLAdapterViewFlipper.() -> Unit) = DSL.adapterViewFlipper({ DSLAdapterViewFlipper.r() })
inline fun Anvil.Renderable.gestureOverlayView(crossinline r: DSLGestureOverlayView.() -> Unit) = DSL.gestureOverlayView({ DSLGestureOverlayView.r() })
inline fun Anvil.Renderable.analogClock(crossinline r: DSLAnalogClock.() -> Unit) = DSL.analogClock({ DSLAnalogClock.r() })
inline fun Anvil.Renderable.switchView(crossinline r: DSLSwitchView.() -> Unit) = DSL.switchView({ DSLSwitchView.r() })
inline fun Anvil.Renderable.viewSwitcher(crossinline r: DSLViewSwitcher.() -> Unit) = DSL.viewSwitcher({ DSLViewSwitcher.r() })
inline fun Anvil.Renderable.textSwitcher(crossinline r: DSLTextSwitcher.() -> Unit) = DSL.textSwitcher({ DSLTextSwitcher.r() })
inline fun Anvil.Renderable.textureView(crossinline r: DSLTextureView.() -> Unit) = DSL.textureView({ DSLTextureView.r() })
inline fun Anvil.Renderable.zoomControls(crossinline r: DSLZoomControls.() -> Unit) = DSL.zoomControls({ DSLZoomControls.r() })
inline fun Anvil.Renderable.extractEditText(crossinline r: DSLExtractEditText.() -> Unit) = DSL.extractEditText({ DSLExtractEditText.r() })
inline fun Anvil.Renderable.gallery(crossinline r: DSLGallery.() -> Unit) = DSL.gallery({ DSLGallery.r() })
inline fun Anvil.Renderable.dialerFilter(crossinline r: DSLDialerFilter.() -> Unit) = DSL.dialerFilter({ DSLDialerFilter.r() })
inline fun Anvil.Renderable.button(crossinline r: DSLButton.() -> Unit) = DSL.button({ DSLButton.r() })
inline fun Anvil.Renderable.space(crossinline r: DSLSpace.() -> Unit) = DSL.space({ DSLSpace.r() })
inline fun Anvil.Renderable.viewAnimator(crossinline r: DSLViewAnimator.() -> Unit) = DSL.viewAnimator({ DSLViewAnimator.r() })
inline fun Anvil.Renderable.datePicker(crossinline r: DSLDatePicker.() -> Unit) = DSL.datePicker({ DSLDatePicker.r() })
inline fun Anvil.Renderable.radioGroup(crossinline r: DSLRadioGroup.() -> Unit) = DSL.radioGroup({ DSLRadioGroup.r() })
inline fun Anvil.Renderable.stackView(crossinline r: DSLStackView.() -> Unit) = DSL.stackView({ DSLStackView.r() })
inline fun Anvil.Renderable.relativeLayout(crossinline r: DSLRelativeLayout.() -> Unit) = DSL.relativeLayout({ DSLRelativeLayout.r() })
inline fun Anvil.Renderable.adapterView(crossinline r: DSLAdapterView.() -> Unit) = DSL.adapterView({ DSLAdapterView.r() })
inline fun Anvil.Renderable.gridView(crossinline r: DSLGridView.() -> Unit) = DSL.gridView({ DSLGridView.r() })
inline fun Anvil.Renderable.autoCompleteTextView(crossinline r: DSLAutoCompleteTextView.() -> Unit) = DSL.autoCompleteTextView({ DSLAutoCompleteTextView.r() })
inline fun Anvil.Renderable.checkBox(crossinline r: DSLCheckBox.() -> Unit) = DSL.checkBox({ DSLCheckBox.r() })
inline fun Anvil.Renderable.tabHost(crossinline r: DSLTabHost.() -> Unit) = DSL.tabHost({ DSLTabHost.r() })
inline fun Anvil.Renderable.searchView(crossinline r: DSLSearchView.() -> Unit) = DSL.searchView({ DSLSearchView.r() })
inline fun Anvil.Renderable.imageButton(crossinline r: DSLImageButton.() -> Unit) = DSL.imageButton({ DSLImageButton.r() })
inline fun Anvil.Renderable.slidingDrawer(crossinline r: DSLSlidingDrawer.() -> Unit) = DSL.slidingDrawer({ DSLSlidingDrawer.r() })
inline fun Anvil.Renderable.spinner(crossinline r: DSLSpinner.() -> Unit) = DSL.spinner({ DSLSpinner.r() })
inline fun Anvil.Renderable.frameLayout(crossinline r: DSLFrameLayout.() -> Unit) = DSL.frameLayout({ DSLFrameLayout.r() })
inline fun Anvil.Renderable.linearLayout(crossinline r: DSLLinearLayout.() -> Unit) = DSL.linearLayout({ DSLLinearLayout.r() })
inline fun Anvil.Renderable.adapterViewAnimator(crossinline r: DSLAdapterViewAnimator.() -> Unit) = DSL.adapterViewAnimator({ DSLAdapterViewAnimator.r() })
inline fun Anvil.Renderable.viewFlipper(crossinline r: DSLViewFlipper.() -> Unit) = DSL.viewFlipper({ DSLViewFlipper.r() })

object DSLView : DSLViewBase()
object DSLAnalogClock : DSLImageButtonBase()
object DSLImageView : DSLImageViewBase()
object DSLImageButton : DSLImageButtonBase()
object DSLZoomButton : DSLZoomButtonBase()
object DSLQuickContactBadge : DSLQuickContactBadgeBase()
object DSLKeyboardView : DSLKeyboardViewBase()
object DSLMediaRouteButton : DSLMediaRouteButtonBase()
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
object DSLTextClock : DSLTextClockBase()
object DSLViewGroup : DSLViewGroupBase<ViewGroup.LayoutParams>()
object DSLAbsoluteLayout : DSLAbsoluteLayoutBase<AbsoluteLayout.LayoutParams>()
object DSLWebView : DSLWebViewBase<AbsoluteLayout.LayoutParams>()
object DSLAdapterView : DSLAdapterViewBase<ViewGroup.LayoutParams>()
object DSLAbsListView : DSLAbsListViewBase<AbsListView.LayoutParams>()
object DSLGridView : DSLGridViewBase<AbsListView.LayoutParams>()
object DSLListView : DSLListViewBase<AbsListView.LayoutParams>()
object DSLExpandableListView : DSLExpandableListViewBase<AbsListView.LayoutParams>()
object DSLAbsSpinner : DSLAbsSpinnerBase<ViewGroup.LayoutParams>()
object DSLGallery : DSLGalleryBase<Gallery.LayoutParams>()
object DSLSpinner : DSLSpinnerBase<ViewGroup.LayoutParams>()
object DSLAdapterViewAnimator : DSLAdapterViewAnimatorBase<ViewGroup.LayoutParams>()
object DSLAdapterViewFlipper : DSLAdapterViewFlipperBase<ViewGroup.LayoutParams>()
object DSLStackView : DSLStackViewBase<ViewGroup.LayoutParams>()
object DSLFragmentBreadCrumbs : DSLFragmentBreadCrumbsBase<ViewGroup.LayoutParams>()
object DSLFrameLayout : DSLFrameLayoutBase<FrameLayout.LayoutParams>()
object DSLAppWidgetHostView : DSLAppWidgetHostViewBase<FrameLayout.LayoutParams>()
object DSLCalendarView : DSLCalendarViewBase<FrameLayout.LayoutParams>()
object DSLDatePicker : DSLDatePickerBase<FrameLayout.LayoutParams>()
object DSLGestureOverlayView : DSLGestureOverlayViewBase<FrameLayout.LayoutParams>()
object DSLHorizontalScrollView : DSLHorizontalScrollViewBase<FrameLayout.LayoutParams>()
object DSLMediaController : DSLMediaControllerBase<FrameLayout.LayoutParams>()
object DSLScrollView : DSLScrollViewBase<FrameLayout.LayoutParams>()
object DSLTabHost : DSLTabHostBase<FrameLayout.LayoutParams>()
object DSLTimePicker : DSLTimePickerBase<FrameLayout.LayoutParams>()
object DSLViewAnimator : DSLViewAnimatorBase<FrameLayout.LayoutParams>()
object DSLViewFlipper : DSLViewFlipperBase<FrameLayout.LayoutParams>()
object DSLViewSwitcher : DSLViewSwitcherBase<FrameLayout.LayoutParams>()
object DSLImageSwitcher : DSLImageSwitcherBase<FrameLayout.LayoutParams>()
object DSLTextSwitcher : DSLTextSwitcherBase<FrameLayout.LayoutParams>()
object DSLGridLayout : DSLGridLayoutBase<GridLayout.LayoutParams>()
object DSLLinearLayout : DSLLinearLayoutBase<LinearLayout.LayoutParams>()
object DSLNumberPicker : DSLNumberPickerBase<LinearLayout.LayoutParams>()
object DSLRadioGroup : DSLRadioGroupBase<RadioGroup.LayoutParams>()
object DSLSearchView : DSLSearchViewBase<LinearLayout.LayoutParams>()
object DSLTableLayout : DSLTableLayoutBase<TableLayout.LayoutParams>()
object DSLTableRow : DSLTableRowBase<TableRow.LayoutParams>()
object DSLTabWidget : DSLTabWidgetBase<LinearLayout.LayoutParams>()
object DSLZoomControls : DSLZoomControlsBase<LinearLayout.LayoutParams>()
object DSLRelativeLayout : DSLRelativeLayoutBase<RelativeLayout.LayoutParams>()
object DSLDialerFilter : DSLDialerFilterBase<RelativeLayout.LayoutParams>()
object DSLTwoLineListItem : DSLTwoLineListItemBase<RelativeLayout.LayoutParams>()
object DSLSlidingDrawer : DSLSlidingDrawerBase<ViewGroup.LayoutParams>()
object DSLViewStub : DSLViewStubBase()

abstract class DSLViewBase : BaseDSL() {
	open fun accessibilityDelegate(arg: android.view.View.AccessibilityDelegate) = DSL.accessibilityDelegate(arg)
	open fun accessibilityLiveRegion(arg: Int) = DSL.accessibilityLiveRegion(arg)
	open fun activated(arg: Boolean) = DSL.activated(arg)
	open fun alpha(arg: Float) = DSL.alpha(arg)
	open fun animation(arg: Animation) = DSL.animation(arg)
	open fun background(arg: Drawable) = DSL.background(arg)
	open fun backgroundColor(arg: Int) = DSL.backgroundColor(arg)
	open fun backgroundResource(arg: Int) = DSL.backgroundResource(arg)
	open fun bottom(arg: Int) = DSL.bottom(arg)
	open fun cameraDistance(arg: Float) = DSL.cameraDistance(arg)
	open fun clickable(arg: Boolean) = DSL.clickable(arg)
	open fun clipBounds(arg: Rect) = DSL.clipBounds(arg)
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
	open fun hasTransientState(arg: Boolean) = DSL.hasTransientState(arg)
	open fun horizontalFadingEdgeEnabled(arg: Boolean) = DSL.horizontalFadingEdgeEnabled(arg)
	open fun horizontalScrollBarEnabled(arg: Boolean) = DSL.horizontalScrollBarEnabled(arg)
	open fun hovered(arg: Boolean) = DSL.hovered(arg)
	open fun id(arg: Int) = DSL.id(arg)
	open fun importantForAccessibility(arg: Int) = DSL.importantForAccessibility(arg)
	open fun keepScreenOn(arg: Boolean) = DSL.keepScreenOn(arg)
	open fun labelFor(arg: Int) = DSL.labelFor(arg)
	open fun layerPaint(arg: Paint) = DSL.layerPaint(arg)
	open fun layoutDirection(arg: Int) = DSL.layoutDirection(arg)
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
	open fun scrollBarDefaultDelayBeforeFade(arg: Int) = DSL.scrollBarDefaultDelayBeforeFade(arg)
	open fun scrollBarFadeDuration(arg: Int) = DSL.scrollBarFadeDuration(arg)
	open fun scrollBarSize(arg: Int) = DSL.scrollBarSize(arg)
	open fun scrollBarStyle(arg: Int) = DSL.scrollBarStyle(arg)
	open fun scrollContainer(arg: Boolean) = DSL.scrollContainer(arg)
	open fun scrollX(arg: Int) = DSL.scrollX(arg)
	open fun scrollY(arg: Int) = DSL.scrollY(arg)
	open fun scrollbarFadingEnabled(arg: Boolean) = DSL.scrollbarFadingEnabled(arg)
	open fun selected(arg: Boolean) = DSL.selected(arg)
	open fun soundEffectsEnabled(arg: Boolean) = DSL.soundEffectsEnabled(arg)
	open fun systemUiVisibility(arg: Int) = DSL.systemUiVisibility(arg)
	open fun tag(arg: Any) = DSL.tag(arg)
	open fun textAlignment(arg: Int) = DSL.textAlignment(arg)
	open fun textDirection(arg: Int) = DSL.textDirection(arg)
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
	open fun baseline(arg: Int) = DSL.baseline(arg)
	open fun baselineAlignBottom(arg: Boolean) = DSL.baselineAlignBottom(arg)
	open fun colorFilter(arg: ColorFilter) = DSL.colorFilter(arg)
	open fun colorFilter(arg: Int) = DSL.colorFilter(arg)
	open fun cropToPadding(arg: Boolean) = DSL.cropToPadding(arg)
	open fun imageAlpha(arg: Int) = DSL.imageAlpha(arg)
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
abstract class DSLMediaRouteButtonBase : DSLViewBase() {
	open fun extendedSettingsClickListener(arg: View.OnClickListener) = DSL.extendedSettingsClickListener(arg)
	open fun routeTypes(arg: Int) = DSL.routeTypes(arg)
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
	open fun secure(arg: Boolean) = DSL.secure(arg)
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
	open fun onInfo(arg: MediaPlayer.OnInfoListener) = DSL.onInfo(arg)
	open fun onPrepared(arg: MediaPlayer.OnPreparedListener) = DSL.onPrepared(arg)
	open fun videoPath(arg: String) = DSL.videoPath(arg)
	open fun videoURI(arg: Uri) = DSL.videoURI(arg)
}
abstract class DSLTextureViewBase : DSLViewBase() {
	open fun opaque(arg: Boolean) = DSL.opaque(arg)
	open fun surfaceTexture(arg: SurfaceTexture) = DSL.surfaceTexture(arg)
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
	open fun textLocale(arg: Locale) = DSL.textLocale(arg)
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
	open fun switchMinWidth(arg: Int) = DSL.switchMinWidth(arg)
	open fun switchPadding(arg: Int) = DSL.switchPadding(arg)
	open fun switchTypeface(arg: Typeface) = DSL.switchTypeface(arg)
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
	open fun thumbDrawable(arg: Drawable) = DSL.thumbDrawable(arg)
	open fun thumbResource(arg: Int) = DSL.thumbResource(arg)
	open fun thumbTextPadding(arg: Int) = DSL.thumbTextPadding(arg)
	open fun trackDrawable(arg: Drawable) = DSL.trackDrawable(arg)
	open fun trackResource(arg: Int) = DSL.trackResource(arg)
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
	open fun onDismiss(arg: android.widget.AutoCompleteTextView.OnDismissListener) = DSL.onDismiss(arg)
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
abstract class DSLTextClockBase : DSLTextViewBase() {
	open fun format12Hour(arg: CharSequence) = DSL.format12Hour(arg)
	open fun format24Hour(arg: CharSequence) = DSL.format24Hour(arg)
	open fun timeZone(arg: String) = DSL.timeZone(arg)
}
abstract class DSLViewGroupBase<T : ViewGroup.LayoutParams> : DSLViewBase() {
	fun layoutParams(arg: T.() -> Unit) {
		@Suppress("UNCHECKED_CAST")
		val params = Anvil.currentView<View>().layoutParams as T
		params.arg()
		DSL.layoutParams(params)
	}
	open fun addStatesFromChildren(arg: Boolean) = DSL.addStatesFromChildren(arg)
	open fun alwaysDrawnWithCacheEnabled(arg: Boolean) = DSL.alwaysDrawnWithCacheEnabled(arg)
	open fun animationCacheEnabled(arg: Boolean) = DSL.animationCacheEnabled(arg)
	open fun clipChildren(arg: Boolean) = DSL.clipChildren(arg)
	open fun clipToPadding(arg: Boolean) = DSL.clipToPadding(arg)
	open fun descendantFocusability(arg: Int) = DSL.descendantFocusability(arg)
	open fun layoutAnimation(arg: LayoutAnimationController) = DSL.layoutAnimation(arg)
	open fun layoutAnimationListener(arg: Animation.AnimationListener) = DSL.layoutAnimationListener(arg)
	open fun layoutMode(arg: Int) = DSL.layoutMode(arg)
	open fun layoutTransition(arg: LayoutTransition) = DSL.layoutTransition(arg)
	open fun motionEventSplittingEnabled(arg: Boolean) = DSL.motionEventSplittingEnabled(arg)
	open fun onHierarchyChange(arg: android.view.ViewGroup.OnHierarchyChangeListener) = DSL.onHierarchyChange(arg)
	open fun persistentDrawingCache(arg: Int) = DSL.persistentDrawingCache(arg)
}
abstract class DSLAbsoluteLayoutBase<T : AbsoluteLayout.LayoutParams> : DSLViewGroupBase<T>() {
}
abstract class DSLWebViewBase<T : AbsoluteLayout.LayoutParams> : DSLAbsoluteLayoutBase<T>() {
	open fun downloadListener(arg: DownloadListener) = DSL.downloadListener(arg)
	open fun findListener(arg: android.webkit.WebView.FindListener) = DSL.findListener(arg)
	open fun horizontalScrollbarOverlay(arg: Boolean) = DSL.horizontalScrollbarOverlay(arg)
	open fun initialScale(arg: Int) = DSL.initialScale(arg)
	open fun networkAvailable(arg: Boolean) = DSL.networkAvailable(arg)
	open fun verticalScrollbarOverlay(arg: Boolean) = DSL.verticalScrollbarOverlay(arg)
	open fun webChromeClient(arg: WebChromeClient) = DSL.webChromeClient(arg)
	open fun webContentsDebuggingEnabled(arg: Boolean) = DSL.webContentsDebuggingEnabled(arg)
	open fun webViewClient(arg: WebViewClient) = DSL.webViewClient(arg)
}
abstract class DSLAdapterViewBase<T : ViewGroup.LayoutParams> : DSLViewGroupBase<T>() {
	open fun adapter(arg: Adapter) = DSL.adapter(arg)
	open fun emptyView(arg: View) = DSL.emptyView(arg)
	open fun onItemClick(arg: android.widget.AdapterView.OnItemClickListener) = DSL.onItemClick(arg)
	open fun onItemLongClick(arg: android.widget.AdapterView.OnItemLongClickListener) = DSL.onItemLongClick(arg)
	open fun onItemSelected(arg: android.widget.AdapterView.OnItemSelectedListener) = DSL.onItemSelected(arg)
	open fun selection(arg: Int) = DSL.selection(arg)
}
abstract class DSLAbsListViewBase<T : AbsListView.LayoutParams> : DSLAdapterViewBase<T>() {
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
abstract class DSLGridViewBase<T : AbsListView.LayoutParams> : DSLAbsListViewBase<T>() {
	open fun columnWidth(arg: Int) = DSL.columnWidth(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalSpacing(arg: Int) = DSL.horizontalSpacing(arg)
	open fun numColumns(arg: Int) = DSL.numColumns(arg)
	open fun stretchMode(arg: Int) = DSL.stretchMode(arg)
	open fun verticalSpacing(arg: Int) = DSL.verticalSpacing(arg)
}
abstract class DSLListViewBase<T : AbsListView.LayoutParams> : DSLAbsListViewBase<T>() {
	open fun divider(arg: Drawable) = DSL.divider(arg)
	open fun dividerHeight(arg: Int) = DSL.dividerHeight(arg)
	open fun footerDividersEnabled(arg: Boolean) = DSL.footerDividersEnabled(arg)
	open fun headerDividersEnabled(arg: Boolean) = DSL.headerDividersEnabled(arg)
	open fun itemsCanFocus(arg: Boolean) = DSL.itemsCanFocus(arg)
	open fun overscrollFooter(arg: Drawable) = DSL.overscrollFooter(arg)
	open fun overscrollHeader(arg: Drawable) = DSL.overscrollHeader(arg)
}
abstract class DSLExpandableListViewBase<T : AbsListView.LayoutParams> : DSLListViewBase<T>() {
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
abstract class DSLAbsSpinnerBase<T : ViewGroup.LayoutParams> : DSLAdapterViewBase<T>() {
}
abstract class DSLGalleryBase<T : Gallery.LayoutParams> : DSLAbsSpinnerBase<T>() {
	open fun animationDuration(arg: Int) = DSL.animationDuration(arg)
	open fun callbackDuringFling(arg: Boolean) = DSL.callbackDuringFling(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun spacing(arg: Int) = DSL.spacing(arg)
	open fun unselectedAlpha(arg: Float) = DSL.unselectedAlpha(arg)
}
abstract class DSLSpinnerBase<T : ViewGroup.LayoutParams> : DSLAbsSpinnerBase<T>() {
	open fun dropDownHorizontalOffset(arg: Int) = DSL.dropDownHorizontalOffset(arg)
	open fun dropDownVerticalOffset(arg: Int) = DSL.dropDownVerticalOffset(arg)
	open fun dropDownWidth(arg: Int) = DSL.dropDownWidth(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun popupBackgroundDrawable(arg: Drawable) = DSL.popupBackgroundDrawable(arg)
	open fun popupBackgroundResource(arg: Int) = DSL.popupBackgroundResource(arg)
	open fun prompt(arg: CharSequence) = DSL.prompt(arg)
	open fun promptId(arg: Int) = DSL.promptId(arg)
}
abstract class DSLAdapterViewAnimatorBase<T : ViewGroup.LayoutParams> : DSLAdapterViewBase<T>() {
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: ObjectAnimator) = DSL.inAnimation(arg)
	open fun outAnimation(arg: ObjectAnimator) = DSL.outAnimation(arg)
	open fun remoteViewsAdapter(arg: Intent) = DSL.remoteViewsAdapter(arg)
}
abstract class DSLAdapterViewFlipperBase<T : ViewGroup.LayoutParams> : DSLAdapterViewAnimatorBase<T>() {
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}
abstract class DSLStackViewBase<T : ViewGroup.LayoutParams> : DSLAdapterViewAnimatorBase<T>() {
}
abstract class DSLFragmentBreadCrumbsBase<T : ViewGroup.LayoutParams> : DSLViewGroupBase<T>() {
	open fun activity(arg: Activity) = DSL.activity(arg)
	open fun maxVisible(arg: Int) = DSL.maxVisible(arg)
	open fun onBreadCrumbClick(arg: android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) = DSL.onBreadCrumbClick(arg)
}
abstract class DSLFrameLayoutBase<T : FrameLayout.LayoutParams> : DSLViewGroupBase<T>() {
	open fun foreground(arg: Drawable) = DSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = DSL.foregroundGravity(arg)
	open fun measureAllChildren(arg: Boolean) = DSL.measureAllChildren(arg)
}
abstract class DSLAppWidgetHostViewBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
}
abstract class DSLCalendarViewBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun date(arg: Long) = DSL.date(arg)
	open fun dateTextAppearance(arg: Int) = DSL.dateTextAppearance(arg)
	open fun firstDayOfWeek(arg: Int) = DSL.firstDayOfWeek(arg)
	open fun focusedMonthDateColor(arg: Int) = DSL.focusedMonthDateColor(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun onDateChange(arg: android.widget.CalendarView.OnDateChangeListener) = DSL.onDateChange(arg)
	open fun selectedDateVerticalBar(arg: Drawable) = DSL.selectedDateVerticalBar(arg)
	open fun selectedDateVerticalBar(arg: Int) = DSL.selectedDateVerticalBar(arg)
	open fun selectedWeekBackgroundColor(arg: Int) = DSL.selectedWeekBackgroundColor(arg)
	open fun showWeekNumber(arg: Boolean) = DSL.showWeekNumber(arg)
	open fun shownWeekCount(arg: Int) = DSL.shownWeekCount(arg)
	open fun unfocusedMonthDateColor(arg: Int) = DSL.unfocusedMonthDateColor(arg)
	open fun weekDayTextAppearance(arg: Int) = DSL.weekDayTextAppearance(arg)
	open fun weekNumberColor(arg: Int) = DSL.weekNumberColor(arg)
	open fun weekSeparatorLineColor(arg: Int) = DSL.weekSeparatorLineColor(arg)
}
abstract class DSLDatePickerBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun calendarViewShown(arg: Boolean) = DSL.calendarViewShown(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun spinnersShown(arg: Boolean) = DSL.spinnersShown(arg)
}
abstract class DSLGestureOverlayViewBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
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
abstract class DSLHorizontalScrollViewBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}
abstract class DSLMediaControllerBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun anchorView(arg: View) = DSL.anchorView(arg)
	open fun mediaPlayer(arg: android.widget.MediaController.MediaPlayerControl) = DSL.mediaPlayer(arg)
}
abstract class DSLScrollViewBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}
abstract class DSLTabHostBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun currentTabByTag(arg: String) = DSL.currentTabByTag(arg)
	open fun onTabChanged(arg: android.widget.TabHost.OnTabChangeListener) = DSL.onTabChanged(arg)
	open fun up(arg: LocalActivityManager) = DSL.up(arg)
}
abstract class DSLTimePickerBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun currentHour(arg: Int) = DSL.currentHour(arg)
	open fun currentMinute(arg: Int) = DSL.currentMinute(arg)
	open fun is24HourView(arg: Boolean) = DSL.is24HourView(arg)
	open fun onTimeChanged(arg: android.widget.TimePicker.OnTimeChangedListener) = DSL.onTimeChanged(arg)
}
abstract class DSLViewAnimatorBase<T : FrameLayout.LayoutParams> : DSLFrameLayoutBase<T>() {
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: Animation) = DSL.inAnimation(arg)
	open fun outAnimation(arg: Animation) = DSL.outAnimation(arg)
}
abstract class DSLViewFlipperBase<T : FrameLayout.LayoutParams> : DSLViewAnimatorBase<T>() {
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}
abstract class DSLViewSwitcherBase<T : FrameLayout.LayoutParams> : DSLViewAnimatorBase<T>() {
	open fun factory(arg: android.widget.ViewSwitcher.ViewFactory) = DSL.factory(arg)
}
abstract class DSLImageSwitcherBase<T : FrameLayout.LayoutParams> : DSLViewSwitcherBase<T>() {
	open fun imageDrawable(arg: Drawable) = DSL.imageDrawable(arg)
	open fun imageResource(arg: Int) = DSL.imageResource(arg)
	open fun imageURI(arg: Uri) = DSL.imageURI(arg)
}
abstract class DSLTextSwitcherBase<T : FrameLayout.LayoutParams> : DSLViewSwitcherBase<T>() {
	open fun currentText(arg: CharSequence) = DSL.currentText(arg)
}
abstract class DSLGridLayoutBase<T : GridLayout.LayoutParams> : DSLViewGroupBase<T>() {
	open fun alignmentMode(arg: Int) = DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = DSL.orientation(arg)
	open fun rowCount(arg: Int) = DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = DSL.useDefaultMargins(arg)
}
abstract class DSLLinearLayoutBase<T : LinearLayout.LayoutParams> : DSLViewGroupBase<T>() {
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
abstract class DSLNumberPickerBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
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
abstract class DSLRadioGroupBase<T : RadioGroup.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun onCheckedChange(arg: android.widget.RadioGroup.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}
abstract class DSLSearchViewBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
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
abstract class DSLTableLayoutBase<T : TableLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun shrinkAllColumns(arg: Boolean) = DSL.shrinkAllColumns(arg)
	open fun stretchAllColumns(arg: Boolean) = DSL.stretchAllColumns(arg)
}
abstract class DSLTableRowBase<T : TableRow.LayoutParams> : DSLLinearLayoutBase<T>() {
}
abstract class DSLTabWidgetBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun dividerDrawable(arg: Int) = DSL.dividerDrawable(arg)
	open fun leftStripDrawable(arg: Drawable) = DSL.leftStripDrawable(arg)
	open fun leftStripDrawable(arg: Int) = DSL.leftStripDrawable(arg)
	open fun rightStripDrawable(arg: Drawable) = DSL.rightStripDrawable(arg)
	open fun rightStripDrawable(arg: Int) = DSL.rightStripDrawable(arg)
	open fun stripEnabled(arg: Boolean) = DSL.stripEnabled(arg)
}
abstract class DSLZoomControlsBase<T : LinearLayout.LayoutParams> : DSLLinearLayoutBase<T>() {
	open fun isZoomInEnabled(arg: Boolean) = DSL.isZoomInEnabled(arg)
	open fun isZoomOutEnabled(arg: Boolean) = DSL.isZoomOutEnabled(arg)
	open fun onZoomInClick(arg: View.OnClickListener) = DSL.onZoomInClick(arg)
	open fun onZoomOutClick(arg: View.OnClickListener) = DSL.onZoomOutClick(arg)
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}
abstract class DSLRelativeLayoutBase<T : RelativeLayout.LayoutParams> : DSLViewGroupBase<T>() {
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = DSL.horizontalGravity(arg)
	open fun ignoreGravity(arg: Int) = DSL.ignoreGravity(arg)
	open fun verticalGravity(arg: Int) = DSL.verticalGravity(arg)
}
abstract class DSLDialerFilterBase<T : RelativeLayout.LayoutParams> : DSLRelativeLayoutBase<T>() {
	open fun digitsWatcher(arg: TextWatcher) = DSL.digitsWatcher(arg)
	open fun filterWatcher(arg: TextWatcher) = DSL.filterWatcher(arg)
	open fun lettersWatcher(arg: TextWatcher) = DSL.lettersWatcher(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}
abstract class DSLTwoLineListItemBase<T : RelativeLayout.LayoutParams> : DSLRelativeLayoutBase<T>() {
}
abstract class DSLSlidingDrawerBase<T : ViewGroup.LayoutParams> : DSLViewGroupBase<T>() {
	open fun onDrawerClose(arg: android.widget.SlidingDrawer.OnDrawerCloseListener) = DSL.onDrawerClose(arg)
	open fun onDrawerOpen(arg: android.widget.SlidingDrawer.OnDrawerOpenListener) = DSL.onDrawerOpen(arg)
	open fun onDrawerScroll(arg: android.widget.SlidingDrawer.OnDrawerScrollListener) = DSL.onDrawerScroll(arg)
}
abstract class DSLViewStubBase : DSLViewBase() {
	open fun inflatedId(arg: Int) = DSL.inflatedId(arg)
	open fun layoutInflater(arg: LayoutInflater) = DSL.layoutInflater(arg)
	open fun layoutResource(arg: Int) = DSL.layoutResource(arg)
	open fun onInflate(arg: android.view.ViewStub.OnInflateListener) = DSL.onInflate(arg)
}
