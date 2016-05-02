@file:Suppress("unused")

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
import android.view.ActionMode
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.Interpolator
import android.view.animation.LayoutAnimationController
import android.view.inputmethod.ExtractedText
import android.webkit.DownloadListener
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.*
import trikita.anvil.Anvil
import java.util.*

fun Anvil.Renderable.imageButton(r: DSLImageButton.() -> Unit) = trikita.anvil.DSL.imageButton({ DSLImageButton().r() })
fun Anvil.Renderable.absSpinner(r: DSLAbsSpinner.() -> Unit) = trikita.anvil.DSL.absSpinner({ DSLAbsSpinner().r() })
fun Anvil.Renderable.viewStub(r: DSLViewStub.() -> Unit) = trikita.anvil.DSL.viewStub({ DSLViewStub().r() })
fun Anvil.Renderable.tabWidget(r: DSLTabWidget.() -> Unit) = trikita.anvil.DSL.tabWidget({ DSLTabWidget().r() })
fun Anvil.Renderable.keyboardView(r: DSLKeyboardView.() -> Unit) = trikita.anvil.DSL.keyboardView({ DSLKeyboardView().r() })
fun Anvil.Renderable.videoView(r: DSLVideoView.() -> Unit) = trikita.anvil.DSL.videoView({ DSLVideoView().r() })
fun Anvil.Renderable.timePicker(r: DSLTimePicker.() -> Unit) = trikita.anvil.DSL.timePicker({ DSLTimePicker().r() })
fun Anvil.Renderable.textSwitcher(r: DSLTextSwitcher.() -> Unit) = trikita.anvil.DSL.textSwitcher({ DSLTextSwitcher().r() })
fun Anvil.Renderable.viewFlipper(r: DSLViewFlipper.() -> Unit) = trikita.anvil.DSL.viewFlipper({ DSLViewFlipper().r() })
fun Anvil.Renderable.autoCompleteTextView(r: DSLAutoCompleteTextView.() -> Unit) = trikita.anvil.DSL.autoCompleteTextView({ DSLAutoCompleteTextView().r() })
fun Anvil.Renderable.switchView(r: DSLSwitchView.() -> Unit) = trikita.anvil.DSL.switchView({ DSLSwitchView().r() })
fun Anvil.Renderable.tabHost(r: DSLTabHost.() -> Unit) = trikita.anvil.DSL.tabHost({ DSLTabHost().r() })
fun Anvil.Renderable.quickContactBadge(r: DSLQuickContactBadge.() -> Unit) = trikita.anvil.DSL.quickContactBadge({ DSLQuickContactBadge().r() })
fun Anvil.Renderable.mediaRouteButton(r: DSLMediaRouteButton.() -> Unit) = trikita.anvil.DSL.mediaRouteButton({ DSLMediaRouteButton().r() })
fun Anvil.Renderable.spinner(r: DSLSpinner.() -> Unit) = trikita.anvil.DSL.spinner({ DSLSpinner().r() })
fun Anvil.Renderable.calendarView(r: DSLCalendarView.() -> Unit) = trikita.anvil.DSL.calendarView({ DSLCalendarView().r() })
fun Anvil.Renderable.surfaceView(r: DSLSurfaceView.() -> Unit) = trikita.anvil.DSL.surfaceView({ DSLSurfaceView().r() })
fun Anvil.Renderable.textView(r: DSLTextView.() -> Unit) = trikita.anvil.DSL.textView({ DSLTextView().r() })
fun Anvil.Renderable.adapterViewFlipper(r: DSLAdapterViewFlipper.() -> Unit) = trikita.anvil.DSL.adapterViewFlipper({ DSLAdapterViewFlipper().r() })
fun Anvil.Renderable.adapterView(r: DSLAdapterView.() -> Unit) = trikita.anvil.DSL.adapterView({ DSLAdapterView().r() })
fun Anvil.Renderable.mediaController(r: DSLMediaController.() -> Unit) = trikita.anvil.DSL.mediaController({ DSLMediaController().r() })
fun Anvil.Renderable.viewAnimator(r: DSLViewAnimator.() -> Unit) = trikita.anvil.DSL.viewAnimator({ DSLViewAnimator().r() })
fun Anvil.Renderable.tableLayout(r: DSLTableLayout.() -> Unit) = trikita.anvil.DSL.tableLayout({ DSLTableLayout().r() })
fun Anvil.Renderable.twoLineListItem(r: DSLTwoLineListItem.() -> Unit) = trikita.anvil.DSL.twoLineListItem({ DSLTwoLineListItem().r() })
fun Anvil.Renderable.toolbar(r: DSLToolbar.() -> Unit) = trikita.anvil.DSL.toolbar({ DSLToolbar().r() })
fun Anvil.Renderable.gLSurfaceView(r: DSLGLSurfaceView.() -> Unit) = trikita.anvil.DSL.gLSurfaceView({ DSLGLSurfaceView().r() })
fun Anvil.Renderable.radioButton(r: DSLRadioButton.() -> Unit) = trikita.anvil.DSL.radioButton({ DSLRadioButton().r() })
fun Anvil.Renderable.button(r: DSLButton.() -> Unit) = trikita.anvil.DSL.button({ DSLButton().r() })
fun Anvil.Renderable.actionMenuView(r: DSLActionMenuView.() -> Unit) = trikita.anvil.DSL.actionMenuView({ DSLActionMenuView().r() })
fun Anvil.Renderable.gridView(r: DSLGridView.() -> Unit) = trikita.anvil.DSL.gridView({ DSLGridView().r() })
fun Anvil.Renderable.gestureOverlayView(r: DSLGestureOverlayView.() -> Unit) = trikita.anvil.DSL.gestureOverlayView({ DSLGestureOverlayView().r() })
fun Anvil.Renderable.webView(r: DSLWebView.() -> Unit) = trikita.anvil.DSL.webView({ DSLWebView().r() })
fun Anvil.Renderable.linearLayout(r: DSLLinearLayout.() -> Unit) = trikita.anvil.DSL.linearLayout({ DSLLinearLayout().r() })
fun Anvil.Renderable.relativeLayout(r: DSLRelativeLayout.() -> Unit) = trikita.anvil.DSL.relativeLayout({ DSLRelativeLayout().r() })
fun Anvil.Renderable.toggleButton(r: DSLToggleButton.() -> Unit) = trikita.anvil.DSL.toggleButton({ DSLToggleButton().r() })
fun Anvil.Renderable.tableRow(r: DSLTableRow.() -> Unit) = trikita.anvil.DSL.tableRow({ DSLTableRow().r() })
fun Anvil.Renderable.viewGroup(r: DSLViewGroup.() -> Unit) = trikita.anvil.DSL.viewGroup({ DSLViewGroup().r() })
fun Anvil.Renderable.fragmentBreadCrumbs(r: DSLFragmentBreadCrumbs.() -> Unit) = trikita.anvil.DSL.fragmentBreadCrumbs({ DSLFragmentBreadCrumbs().r() })
fun Anvil.Renderable.extractEditText(r: DSLExtractEditText.() -> Unit) = trikita.anvil.DSL.extractEditText({ DSLExtractEditText().r() })
fun Anvil.Renderable.scrollView(r: DSLScrollView.() -> Unit) = trikita.anvil.DSL.scrollView({ DSLScrollView().r() })
fun Anvil.Renderable.chronometer(r: DSLChronometer.() -> Unit) = trikita.anvil.DSL.chronometer({ DSLChronometer().r() })
fun Anvil.Renderable.absSeekBar(r: DSLAbsSeekBar.() -> Unit) = trikita.anvil.DSL.absSeekBar({ DSLAbsSeekBar().r() })
fun Anvil.Renderable.analogClock(r: DSLAnalogClock.() -> Unit) = trikita.anvil.DSL.analogClock({ DSLAnalogClock().r() })
fun Anvil.Renderable.frameLayout(r: DSLFrameLayout.() -> Unit) = trikita.anvil.DSL.frameLayout({ DSLFrameLayout().r() })
fun Anvil.Renderable.numberPicker(r: DSLNumberPicker.() -> Unit) = trikita.anvil.DSL.numberPicker({ DSLNumberPicker().r() })
fun Anvil.Renderable.tvView(r: DSLTvView.() -> Unit) = trikita.anvil.DSL.tvView({ DSLTvView().r() })
fun Anvil.Renderable.progressBar(r: DSLProgressBar.() -> Unit) = trikita.anvil.DSL.progressBar({ DSLProgressBar().r() })
fun Anvil.Renderable.absListView(r: DSLAbsListView.() -> Unit) = trikita.anvil.DSL.absListView({ DSLAbsListView().r() })
fun Anvil.Renderable.checkBox(r: DSLCheckBox.() -> Unit) = trikita.anvil.DSL.checkBox({ DSLCheckBox().r() })
fun Anvil.Renderable.zoomControls(r: DSLZoomControls.() -> Unit) = trikita.anvil.DSL.zoomControls({ DSLZoomControls().r() })
fun Anvil.Renderable.multiAutoCompleteTextView(r: DSLMultiAutoCompleteTextView.() -> Unit) = trikita.anvil.DSL.multiAutoCompleteTextView({ DSLMultiAutoCompleteTextView().r() })
fun Anvil.Renderable.seekBar(r: DSLSeekBar.() -> Unit) = trikita.anvil.DSL.seekBar({ DSLSeekBar().r() })
fun Anvil.Renderable.slidingDrawer(r: DSLSlidingDrawer.() -> Unit) = trikita.anvil.DSL.slidingDrawer({ DSLSlidingDrawer().r() })
fun Anvil.Renderable.expandableListView(r: DSLExpandableListView.() -> Unit) = trikita.anvil.DSL.expandableListView({ DSLExpandableListView().r() })
fun Anvil.Renderable.textClock(r: DSLTextClock.() -> Unit) = trikita.anvil.DSL.textClock({ DSLTextClock().r() })
fun Anvil.Renderable.datePicker(r: DSLDatePicker.() -> Unit) = trikita.anvil.DSL.datePicker({ DSLDatePicker().r() })
fun Anvil.Renderable.gridLayout(r: DSLGridLayout.() -> Unit) = trikita.anvil.DSL.gridLayout({ DSLGridLayout().r() })
fun Anvil.Renderable.searchView(r: DSLSearchView.() -> Unit) = trikita.anvil.DSL.searchView({ DSLSearchView().r() })
fun Anvil.Renderable.space(r: DSLSpace.() -> Unit) = trikita.anvil.DSL.space({ DSLSpace().r() })
fun Anvil.Renderable.appWidgetHostView(r: DSLAppWidgetHostView.() -> Unit) = trikita.anvil.DSL.appWidgetHostView({ DSLAppWidgetHostView().r() })
fun Anvil.Renderable.horizontalScrollView(r: DSLHorizontalScrollView.() -> Unit) = trikita.anvil.DSL.horizontalScrollView({ DSLHorizontalScrollView().r() })
fun Anvil.Renderable.ratingBar(r: DSLRatingBar.() -> Unit) = trikita.anvil.DSL.ratingBar({ DSLRatingBar().r() })
fun Anvil.Renderable.imageView(r: DSLImageView.() -> Unit) = trikita.anvil.DSL.imageView({ DSLImageView().r() })
fun Anvil.Renderable.compoundButton(r: DSLCompoundButton.() -> Unit) = trikita.anvil.DSL.compoundButton({ DSLCompoundButton().r() })
fun Anvil.Renderable.checkedTextView(r: DSLCheckedTextView.() -> Unit) = trikita.anvil.DSL.checkedTextView({ DSLCheckedTextView().r() })
fun Anvil.Renderable.zoomButton(r: DSLZoomButton.() -> Unit) = trikita.anvil.DSL.zoomButton({ DSLZoomButton().r() })
fun Anvil.Renderable.listView(r: DSLListView.() -> Unit) = trikita.anvil.DSL.listView({ DSLListView().r() })
fun Anvil.Renderable.gallery(r: DSLGallery.() -> Unit) = trikita.anvil.DSL.gallery({ DSLGallery().r() })
fun Anvil.Renderable.radioGroup(r: DSLRadioGroup.() -> Unit) = trikita.anvil.DSL.radioGroup({ DSLRadioGroup().r() })
fun Anvil.Renderable.textureView(r: DSLTextureView.() -> Unit) = trikita.anvil.DSL.textureView({ DSLTextureView().r() })
fun Anvil.Renderable.digitalClock(r: DSLDigitalClock.() -> Unit) = trikita.anvil.DSL.digitalClock({ DSLDigitalClock().r() })
fun Anvil.Renderable.imageSwitcher(r: DSLImageSwitcher.() -> Unit) = trikita.anvil.DSL.imageSwitcher({ DSLImageSwitcher().r() })
fun Anvil.Renderable.dialerFilter(r: DSLDialerFilter.() -> Unit) = trikita.anvil.DSL.dialerFilter({ DSLDialerFilter().r() })
fun Anvil.Renderable.stackView(r: DSLStackView.() -> Unit) = trikita.anvil.DSL.stackView({ DSLStackView().r() })
fun Anvil.Renderable.absoluteLayout(r: DSLAbsoluteLayout.() -> Unit) = trikita.anvil.DSL.absoluteLayout({ DSLAbsoluteLayout().r() })
fun Anvil.Renderable.viewSwitcher(r: DSLViewSwitcher.() -> Unit) = trikita.anvil.DSL.viewSwitcher({ DSLViewSwitcher().r() })
fun Anvil.Renderable.adapterViewAnimator(r: DSLAdapterViewAnimator.() -> Unit) = trikita.anvil.DSL.adapterViewAnimator({ DSLAdapterViewAnimator().r() })
fun Anvil.Renderable.editText(r: DSLEditText.() -> Unit) = trikita.anvil.DSL.editText({ DSLEditText().r() })

open class DSLAnalogClock : BaseDSL() {
}
open class DSLImageView : BaseDSL() {
	open fun adjustViewBounds(arg: Boolean) = trikita.anvil.DSL.adjustViewBounds(arg)
	open fun baseline(arg: Int) = trikita.anvil.DSL.baseline(arg)
	open fun baselineAlignBottom(arg: Boolean) = trikita.anvil.DSL.baselineAlignBottom(arg)
	open fun colorFilter(arg: ColorFilter) = trikita.anvil.DSL.colorFilter(arg)
	open fun colorFilter(arg: Int) = trikita.anvil.DSL.colorFilter(arg)
	open fun cropToPadding(arg: Boolean) = trikita.anvil.DSL.cropToPadding(arg)
	open fun imageAlpha(arg: Int) = trikita.anvil.DSL.imageAlpha(arg)
	open fun imageBitmap(arg: Bitmap) = trikita.anvil.DSL.imageBitmap(arg)
	open fun imageDrawable(arg: Drawable) = trikita.anvil.DSL.imageDrawable(arg)
	open fun imageLevel(arg: Int) = trikita.anvil.DSL.imageLevel(arg)
	open fun imageMatrix(arg: Matrix) = trikita.anvil.DSL.imageMatrix(arg)
	open fun imageResource(arg: Int) = trikita.anvil.DSL.imageResource(arg)
	open fun imageTintList(arg: ColorStateList) = trikita.anvil.DSL.imageTintList(arg)
	open fun imageTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.imageTintMode(arg)
	open fun imageURI(arg: Uri) = trikita.anvil.DSL.imageURI(arg)
	open fun maxHeight(arg: Int) = trikita.anvil.DSL.maxHeight(arg)
	open fun maxWidth(arg: Int) = trikita.anvil.DSL.maxWidth(arg)
	open fun scaleType(arg: android.widget.ImageView.ScaleType) = trikita.anvil.DSL.scaleType(arg)
}
open class DSLImageButton : DSLImageView() {
}
open class DSLZoomButton : DSLImageButton() {
	open fun zoomSpeed(arg: Long) = trikita.anvil.DSL.zoomSpeed(arg)
}
open class DSLQuickContactBadge : DSLImageView() {
	open fun excludeMimes(arg: Array<String>) = trikita.anvil.DSL.excludeMimes(arg)
	open fun mode(arg: Int) = trikita.anvil.DSL.mode(arg)
	open fun overlay(arg: Drawable) = trikita.anvil.DSL.overlay(arg)
}
open class DSLKeyboardView : BaseDSL() {
	open fun keyboard(arg: Keyboard) = trikita.anvil.DSL.keyboard(arg)
	open fun onKeyboardAction(arg: android.inputmethodservice.KeyboardView.OnKeyboardActionListener) = trikita.anvil.DSL.onKeyboardAction(arg)
	open fun popupParent(arg: View) = trikita.anvil.DSL.popupParent(arg)
	open fun previewEnabled(arg: Boolean) = trikita.anvil.DSL.previewEnabled(arg)
	open fun proximityCorrectionEnabled(arg: Boolean) = trikita.anvil.DSL.proximityCorrectionEnabled(arg)
	open fun shifted(arg: Boolean) = trikita.anvil.DSL.shifted(arg)
	open fun verticalCorrection(arg: Int) = trikita.anvil.DSL.verticalCorrection(arg)
}
open class DSLMediaRouteButton : BaseDSL() {
	open fun extendedSettingsClickListener(arg: View.OnClickListener) = trikita.anvil.DSL.extendedSettingsClickListener(arg)
	open fun routeTypes(arg: Int) = trikita.anvil.DSL.routeTypes(arg)
}
open class DSLProgressBar : BaseDSL() {
	open fun indeterminate(arg: Boolean) = trikita.anvil.DSL.indeterminate(arg)
	open fun indeterminateDrawable(arg: Drawable) = trikita.anvil.DSL.indeterminateDrawable(arg)
	open fun indeterminateDrawableTiled(arg: Drawable) = trikita.anvil.DSL.indeterminateDrawableTiled(arg)
	open fun indeterminateTintList(arg: ColorStateList) = trikita.anvil.DSL.indeterminateTintList(arg)
	open fun indeterminateTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.indeterminateTintMode(arg)
	open fun interpolator(arg: Interpolator) = trikita.anvil.DSL.interpolator(arg)
	open fun max(arg: Int) = trikita.anvil.DSL.max(arg)
	open fun progress(arg: Int) = trikita.anvil.DSL.progress(arg)
	open fun progressBackgroundTintList(arg: ColorStateList) = trikita.anvil.DSL.progressBackgroundTintList(arg)
	open fun progressBackgroundTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.progressBackgroundTintMode(arg)
	open fun progressDrawable(arg: Drawable) = trikita.anvil.DSL.progressDrawable(arg)
	open fun progressDrawableTiled(arg: Drawable) = trikita.anvil.DSL.progressDrawableTiled(arg)
	open fun progressTintList(arg: ColorStateList) = trikita.anvil.DSL.progressTintList(arg)
	open fun progressTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.progressTintMode(arg)
	open fun secondaryProgress(arg: Int) = trikita.anvil.DSL.secondaryProgress(arg)
	open fun secondaryProgressTintList(arg: ColorStateList) = trikita.anvil.DSL.secondaryProgressTintList(arg)
	open fun secondaryProgressTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.secondaryProgressTintMode(arg)
}
open class DSLAbsSeekBar : DSLProgressBar() {
	open fun keyProgressIncrement(arg: Int) = trikita.anvil.DSL.keyProgressIncrement(arg)
	open fun splitTrack(arg: Boolean) = trikita.anvil.DSL.splitTrack(arg)
	open fun thumb(arg: Drawable) = trikita.anvil.DSL.thumb(arg)
	open fun thumbOffset(arg: Int) = trikita.anvil.DSL.thumbOffset(arg)
	open fun thumbTintList(arg: ColorStateList) = trikita.anvil.DSL.thumbTintList(arg)
	open fun thumbTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.thumbTintMode(arg)
}
open class DSLRatingBar : DSLAbsSeekBar() {
	open fun isIndicator(arg: Boolean) = trikita.anvil.DSL.isIndicator(arg)
	open fun numStars(arg: Int) = trikita.anvil.DSL.numStars(arg)
	open fun onRatingBarChange(arg: android.widget.RatingBar.OnRatingBarChangeListener) = trikita.anvil.DSL.onRatingBarChange(arg)
	open fun rating(arg: Float) = trikita.anvil.DSL.rating(arg)
	open fun stepSize(arg: Float) = trikita.anvil.DSL.stepSize(arg)
}
open class DSLSeekBar : DSLAbsSeekBar() {
	open fun onSeekBarChange(arg: android.widget.SeekBar.OnSeekBarChangeListener) = trikita.anvil.DSL.onSeekBarChange(arg)
}
open class DSLSpace : BaseDSL() {
}
open class DSLSurfaceView : BaseDSL() {
	open fun secure(arg: Boolean) = trikita.anvil.DSL.secure(arg)
	open fun zOrderMediaOverlay(arg: Boolean) = trikita.anvil.DSL.zOrderMediaOverlay(arg)
	open fun zOrderOnTop(arg: Boolean) = trikita.anvil.DSL.zOrderOnTop(arg)
}
open class DSLGLSurfaceView : DSLSurfaceView() {
	open fun debugFlags(arg: Int) = trikita.anvil.DSL.debugFlags(arg)
	open fun eGLConfigChooser(arg: android.opengl.GLSurfaceView.EGLConfigChooser) = trikita.anvil.DSL.eGLConfigChooser(arg)
	open fun eGLConfigChooser(arg: Boolean) = trikita.anvil.DSL.eGLConfigChooser(arg)
	open fun eGLContextClientVersion(arg: Int) = trikita.anvil.DSL.eGLContextClientVersion(arg)
	open fun eGLContextFactory(arg: android.opengl.GLSurfaceView.EGLContextFactory) = trikita.anvil.DSL.eGLContextFactory(arg)
	open fun eGLWindowSurfaceFactory(arg: android.opengl.GLSurfaceView.EGLWindowSurfaceFactory) = trikita.anvil.DSL.eGLWindowSurfaceFactory(arg)
	open fun gLWrapper(arg: android.opengl.GLSurfaceView.GLWrapper) = trikita.anvil.DSL.gLWrapper(arg)
	open fun preserveEGLContextOnPause(arg: Boolean) = trikita.anvil.DSL.preserveEGLContextOnPause(arg)
	open fun renderMode(arg: Int) = trikita.anvil.DSL.renderMode(arg)
	open fun renderer(arg: android.opengl.GLSurfaceView.Renderer) = trikita.anvil.DSL.renderer(arg)
}
open class DSLVideoView : DSLSurfaceView() {
	open fun mediaController(arg: MediaController) = trikita.anvil.DSL.mediaController(arg)
	open fun onCompletion(arg: MediaPlayer.OnCompletionListener) = trikita.anvil.DSL.onCompletion(arg)
	open fun onError(arg: MediaPlayer.OnErrorListener) = trikita.anvil.DSL.onError(arg)
	open fun onInfo(arg: MediaPlayer.OnInfoListener) = trikita.anvil.DSL.onInfo(arg)
	open fun onPrepared(arg: MediaPlayer.OnPreparedListener) = trikita.anvil.DSL.onPrepared(arg)
	open fun videoPath(arg: String) = trikita.anvil.DSL.videoPath(arg)
	open fun videoURI(arg: Uri) = trikita.anvil.DSL.videoURI(arg)
}
open class DSLTextureView : BaseDSL() {
	open fun opaque(arg: Boolean) = trikita.anvil.DSL.opaque(arg)
	open fun surfaceTexture(arg: SurfaceTexture) = trikita.anvil.DSL.surfaceTexture(arg)
	open fun surfaceTextureListener(arg: android.view.TextureView.SurfaceTextureListener) = trikita.anvil.DSL.surfaceTextureListener(arg)
	open fun transform(arg: Matrix) = trikita.anvil.DSL.transform(arg)
}
open class DSLTextView : BaseDSL() {
	open fun allCaps(arg: Boolean) = trikita.anvil.DSL.allCaps(arg)
	open fun autoLinkMask(arg: Int) = trikita.anvil.DSL.autoLinkMask(arg)
	open fun compoundDrawablePadding(arg: Int) = trikita.anvil.DSL.compoundDrawablePadding(arg)
	open fun cursorVisible(arg: Boolean) = trikita.anvil.DSL.cursorVisible(arg)
	open fun customSelectionActionModeCallback(arg: ActionMode.Callback) = trikita.anvil.DSL.customSelectionActionModeCallback(arg)
	open fun editableFactory(arg: Editable.Factory) = trikita.anvil.DSL.editableFactory(arg)
	open fun elegantTextHeight(arg: Boolean) = trikita.anvil.DSL.elegantTextHeight(arg)
	open fun ellipsize(arg: TextUtils.TruncateAt) = trikita.anvil.DSL.ellipsize(arg)
	open fun ems(arg: Int) = trikita.anvil.DSL.ems(arg)
	open fun error(arg: CharSequence) = trikita.anvil.DSL.error(arg)
	open fun extractedText(arg: ExtractedText) = trikita.anvil.DSL.extractedText(arg)
	open fun filters(arg: Array<InputFilter>) = trikita.anvil.DSL.filters(arg)
	open fun fontFeatureSettings(arg: String) = trikita.anvil.DSL.fontFeatureSettings(arg)
	open fun freezesText(arg: Boolean) = trikita.anvil.DSL.freezesText(arg)
	open fun gravity(arg: Int) = trikita.anvil.DSL.gravity(arg)
	open fun height(arg: Int) = trikita.anvil.DSL.height(arg)
	open fun highlightColor(arg: Int) = trikita.anvil.DSL.highlightColor(arg)
	open fun hint(arg: Int) = trikita.anvil.DSL.hint(arg)
	open fun hint(arg: CharSequence) = trikita.anvil.DSL.hint(arg)
	open fun hintTextColor(arg: ColorStateList) = trikita.anvil.DSL.hintTextColor(arg)
	open fun hintTextColor(arg: Int) = trikita.anvil.DSL.hintTextColor(arg)
	open fun horizontallyScrolling(arg: Boolean) = trikita.anvil.DSL.horizontallyScrolling(arg)
	open fun imeOptions(arg: Int) = trikita.anvil.DSL.imeOptions(arg)
	open fun includeFontPadding(arg: Boolean) = trikita.anvil.DSL.includeFontPadding(arg)
	open fun inputExtras(arg: Int) = trikita.anvil.DSL.inputExtras(arg)
	open fun inputType(arg: Int) = trikita.anvil.DSL.inputType(arg)
	open fun keyListener(arg: KeyListener) = trikita.anvil.DSL.keyListener(arg)
	open fun letterSpacing(arg: Float) = trikita.anvil.DSL.letterSpacing(arg)
	open fun lines(arg: Int) = trikita.anvil.DSL.lines(arg)
	open fun linkTextColor(arg: ColorStateList) = trikita.anvil.DSL.linkTextColor(arg)
	open fun linkTextColor(arg: Int) = trikita.anvil.DSL.linkTextColor(arg)
	open fun linksClickable(arg: Boolean) = trikita.anvil.DSL.linksClickable(arg)
	open fun marqueeRepeatLimit(arg: Int) = trikita.anvil.DSL.marqueeRepeatLimit(arg)
	open fun maxEms(arg: Int) = trikita.anvil.DSL.maxEms(arg)
	open fun maxHeight(arg: Int) = trikita.anvil.DSL.maxHeight(arg)
	open fun maxLines(arg: Int) = trikita.anvil.DSL.maxLines(arg)
	open fun maxWidth(arg: Int) = trikita.anvil.DSL.maxWidth(arg)
	open fun minEms(arg: Int) = trikita.anvil.DSL.minEms(arg)
	open fun minHeight(arg: Int) = trikita.anvil.DSL.minHeight(arg)
	open fun minLines(arg: Int) = trikita.anvil.DSL.minLines(arg)
	open fun minWidth(arg: Int) = trikita.anvil.DSL.minWidth(arg)
	open fun movementMethod(arg: MovementMethod) = trikita.anvil.DSL.movementMethod(arg)
	open fun onEditorAction(arg: android.widget.TextView.OnEditorActionListener) = trikita.anvil.DSL.onEditorAction(arg)
	open fun paintFlags(arg: Int) = trikita.anvil.DSL.paintFlags(arg)
	open fun privateImeOptions(arg: String) = trikita.anvil.DSL.privateImeOptions(arg)
	open fun rawInputType(arg: Int) = trikita.anvil.DSL.rawInputType(arg)
	open fun scroller(arg: Scroller) = trikita.anvil.DSL.scroller(arg)
	open fun selectAllOnFocus(arg: Boolean) = trikita.anvil.DSL.selectAllOnFocus(arg)
	open fun showSoftInputOnFocus(arg: Boolean) = trikita.anvil.DSL.showSoftInputOnFocus(arg)
	open fun singleLine(arg: Boolean) = trikita.anvil.DSL.singleLine(arg)
	open fun spannableFactory(arg: Spannable.Factory) = trikita.anvil.DSL.spannableFactory(arg)
	open fun text(arg: Int) = trikita.anvil.DSL.text(arg)
	open fun textColor(arg: ColorStateList) = trikita.anvil.DSL.textColor(arg)
	open fun textColor(arg: Int) = trikita.anvil.DSL.textColor(arg)
	open fun textIsSelectable(arg: Boolean) = trikita.anvil.DSL.textIsSelectable(arg)
	open fun textKeepState(arg: CharSequence) = trikita.anvil.DSL.textKeepState(arg)
	open fun textLocale(arg: Locale) = trikita.anvil.DSL.textLocale(arg)
	open fun textScaleX(arg: Float) = trikita.anvil.DSL.textScaleX(arg)
	open fun transformationMethod(arg: TransformationMethod) = trikita.anvil.DSL.transformationMethod(arg)
	open fun typeface(arg: Typeface) = trikita.anvil.DSL.typeface(arg)
	open fun width(arg: Int) = trikita.anvil.DSL.width(arg)
}
open class DSLButton : DSLTextView() {
}
open class DSLCompoundButton : DSLButton() {
	open fun buttonDrawable(arg: Drawable) = trikita.anvil.DSL.buttonDrawable(arg)
	open fun buttonDrawable(arg: Int) = trikita.anvil.DSL.buttonDrawable(arg)
	open fun buttonTintList(arg: ColorStateList) = trikita.anvil.DSL.buttonTintList(arg)
	open fun buttonTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.buttonTintMode(arg)
	open fun checked(arg: Boolean) = trikita.anvil.DSL.checked(arg)
	open fun onCheckedChange(arg: android.widget.CompoundButton.OnCheckedChangeListener) = trikita.anvil.DSL.onCheckedChange(arg)
}
open class DSLCheckBox : DSLCompoundButton() {
}
open class DSLRadioButton : DSLCompoundButton() {
}
open class DSLSwitchView : DSLCompoundButton() {
	open fun showText(arg: Boolean) = trikita.anvil.DSL.showText(arg)
	open fun splitTrack(arg: Boolean) = trikita.anvil.DSL.splitTrack(arg)
	open fun switchMinWidth(arg: Int) = trikita.anvil.DSL.switchMinWidth(arg)
	open fun switchPadding(arg: Int) = trikita.anvil.DSL.switchPadding(arg)
	open fun switchTypeface(arg: Typeface) = trikita.anvil.DSL.switchTypeface(arg)
	open fun textOff(arg: CharSequence) = trikita.anvil.DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = trikita.anvil.DSL.textOn(arg)
	open fun thumbDrawable(arg: Drawable) = trikita.anvil.DSL.thumbDrawable(arg)
	open fun thumbResource(arg: Int) = trikita.anvil.DSL.thumbResource(arg)
	open fun thumbTextPadding(arg: Int) = trikita.anvil.DSL.thumbTextPadding(arg)
	open fun trackDrawable(arg: Drawable) = trikita.anvil.DSL.trackDrawable(arg)
	open fun trackResource(arg: Int) = trikita.anvil.DSL.trackResource(arg)
}
open class DSLToggleButton : DSLCompoundButton() {
	open fun textOff(arg: CharSequence) = trikita.anvil.DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = trikita.anvil.DSL.textOn(arg)
}
open class DSLCheckedTextView : DSLTextView() {
	open fun checkMarkDrawable(arg: Drawable) = trikita.anvil.DSL.checkMarkDrawable(arg)
	open fun checkMarkDrawable(arg: Int) = trikita.anvil.DSL.checkMarkDrawable(arg)
	open fun checkMarkTintList(arg: ColorStateList) = trikita.anvil.DSL.checkMarkTintList(arg)
	open fun checkMarkTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.checkMarkTintMode(arg)
	open fun checked(arg: Boolean) = trikita.anvil.DSL.checked(arg)
}
open class DSLChronometer : DSLTextView() {
	open fun base(arg: Long) = trikita.anvil.DSL.base(arg)
	open fun format(arg: String) = trikita.anvil.DSL.format(arg)
	open fun onChronometerTick(arg: android.widget.Chronometer.OnChronometerTickListener) = trikita.anvil.DSL.onChronometerTick(arg)
}
open class DSLDigitalClock : DSLTextView() {
}
open class DSLEditText : DSLTextView() {
	open fun selection(arg: Int) = trikita.anvil.DSL.selection(arg)
}
open class DSLAutoCompleteTextView : DSLEditText() {
	open fun completionHint(arg: CharSequence) = trikita.anvil.DSL.completionHint(arg)
	open fun dropDownAnchor(arg: Int) = trikita.anvil.DSL.dropDownAnchor(arg)
	open fun dropDownBackgroundDrawable(arg: Drawable) = trikita.anvil.DSL.dropDownBackgroundDrawable(arg)
	open fun dropDownBackgroundResource(arg: Int) = trikita.anvil.DSL.dropDownBackgroundResource(arg)
	open fun dropDownHeight(arg: Int) = trikita.anvil.DSL.dropDownHeight(arg)
	open fun dropDownHorizontalOffset(arg: Int) = trikita.anvil.DSL.dropDownHorizontalOffset(arg)
	open fun dropDownVerticalOffset(arg: Int) = trikita.anvil.DSL.dropDownVerticalOffset(arg)
	open fun dropDownWidth(arg: Int) = trikita.anvil.DSL.dropDownWidth(arg)
	open fun listSelection(arg: Int) = trikita.anvil.DSL.listSelection(arg)
	open fun onDismiss(arg: android.widget.AutoCompleteTextView.OnDismissListener) = trikita.anvil.DSL.onDismiss(arg)
	open fun onItemClick(arg: AdapterView.OnItemClickListener) = trikita.anvil.DSL.onItemClick(arg)
	open fun onItemSelected(arg: AdapterView.OnItemSelectedListener) = trikita.anvil.DSL.onItemSelected(arg)
	open fun threshold(arg: Int) = trikita.anvil.DSL.threshold(arg)
	open fun validator(arg: android.widget.AutoCompleteTextView.Validator) = trikita.anvil.DSL.validator(arg)
}
open class DSLMultiAutoCompleteTextView : DSLAutoCompleteTextView() {
	open fun tokenizer(arg: android.widget.MultiAutoCompleteTextView.Tokenizer) = trikita.anvil.DSL.tokenizer(arg)
}
open class DSLExtractEditText : DSLEditText() {
}
open class DSLTextClock : DSLTextView() {
	open fun format12Hour(arg: CharSequence) = trikita.anvil.DSL.format12Hour(arg)
	open fun format24Hour(arg: CharSequence) = trikita.anvil.DSL.format24Hour(arg)
	open fun timeZone(arg: String) = trikita.anvil.DSL.timeZone(arg)
}
open class DSLViewGroup : BaseDSL() {
	open fun addStatesFromChildren(arg: Boolean) = trikita.anvil.DSL.addStatesFromChildren(arg)
	open fun alwaysDrawnWithCacheEnabled(arg: Boolean) = trikita.anvil.DSL.alwaysDrawnWithCacheEnabled(arg)
	open fun animationCacheEnabled(arg: Boolean) = trikita.anvil.DSL.animationCacheEnabled(arg)
	open fun clipChildren(arg: Boolean) = trikita.anvil.DSL.clipChildren(arg)
	open fun clipToPadding(arg: Boolean) = trikita.anvil.DSL.clipToPadding(arg)
	open fun descendantFocusability(arg: Int) = trikita.anvil.DSL.descendantFocusability(arg)
	open fun layoutAnimation(arg: LayoutAnimationController) = trikita.anvil.DSL.layoutAnimation(arg)
	open fun layoutAnimationListener(arg: Animation.AnimationListener) = trikita.anvil.DSL.layoutAnimationListener(arg)
	open fun layoutMode(arg: Int) = trikita.anvil.DSL.layoutMode(arg)
	open fun layoutTransition(arg: LayoutTransition) = trikita.anvil.DSL.layoutTransition(arg)
	open fun motionEventSplittingEnabled(arg: Boolean) = trikita.anvil.DSL.motionEventSplittingEnabled(arg)
	open fun onHierarchyChange(arg: android.view.ViewGroup.OnHierarchyChangeListener) = trikita.anvil.DSL.onHierarchyChange(arg)
	open fun persistentDrawingCache(arg: Int) = trikita.anvil.DSL.persistentDrawingCache(arg)
	open fun touchscreenBlocksFocus(arg: Boolean) = trikita.anvil.DSL.touchscreenBlocksFocus(arg)
	open fun transitionGroup(arg: Boolean) = trikita.anvil.DSL.transitionGroup(arg)
}
open class DSLAbsoluteLayout : DSLViewGroup() {
}
open class DSLWebView : DSLAbsoluteLayout() {
	open fun downloadListener(arg: DownloadListener) = trikita.anvil.DSL.downloadListener(arg)
	open fun findListener(arg: android.webkit.WebView.FindListener) = trikita.anvil.DSL.findListener(arg)
	open fun horizontalScrollbarOverlay(arg: Boolean) = trikita.anvil.DSL.horizontalScrollbarOverlay(arg)
	open fun initialScale(arg: Int) = trikita.anvil.DSL.initialScale(arg)
	open fun networkAvailable(arg: Boolean) = trikita.anvil.DSL.networkAvailable(arg)
	open fun verticalScrollbarOverlay(arg: Boolean) = trikita.anvil.DSL.verticalScrollbarOverlay(arg)
	open fun webChromeClient(arg: WebChromeClient) = trikita.anvil.DSL.webChromeClient(arg)
	open fun webContentsDebuggingEnabled(arg: Boolean) = trikita.anvil.DSL.webContentsDebuggingEnabled(arg)
	open fun webViewClient(arg: WebViewClient) = trikita.anvil.DSL.webViewClient(arg)
}
open class DSLAdapterView : DSLViewGroup() {
	open fun adapter(arg: Adapter) = trikita.anvil.DSL.adapter(arg)
	open fun emptyView(arg: View) = trikita.anvil.DSL.emptyView(arg)
	open fun onItemClick(arg: android.widget.AdapterView.OnItemClickListener) = trikita.anvil.DSL.onItemClick(arg)
	open fun onItemLongClick(arg: android.widget.AdapterView.OnItemLongClickListener) = trikita.anvil.DSL.onItemLongClick(arg)
	open fun onItemSelected(arg: android.widget.AdapterView.OnItemSelectedListener) = trikita.anvil.DSL.onItemSelected(arg)
	open fun selection(arg: Int) = trikita.anvil.DSL.selection(arg)
}
open class DSLAbsListView : DSLAdapterView() {
	open fun cacheColorHint(arg: Int) = trikita.anvil.DSL.cacheColorHint(arg)
	open fun choiceMode(arg: Int) = trikita.anvil.DSL.choiceMode(arg)
	open fun drawSelectorOnTop(arg: Boolean) = trikita.anvil.DSL.drawSelectorOnTop(arg)
	open fun fastScrollAlwaysVisible(arg: Boolean) = trikita.anvil.DSL.fastScrollAlwaysVisible(arg)
	open fun fastScrollEnabled(arg: Boolean) = trikita.anvil.DSL.fastScrollEnabled(arg)
	open fun fastScrollStyle(arg: Int) = trikita.anvil.DSL.fastScrollStyle(arg)
	open fun filterText(arg: String) = trikita.anvil.DSL.filterText(arg)
	open fun friction(arg: Float) = trikita.anvil.DSL.friction(arg)
	open fun multiChoiceModeListener(arg: android.widget.AbsListView.MultiChoiceModeListener) = trikita.anvil.DSL.multiChoiceModeListener(arg)
	open fun onScroll(arg: android.widget.AbsListView.OnScrollListener) = trikita.anvil.DSL.onScroll(arg)
	open fun recyclerListener(arg: android.widget.AbsListView.RecyclerListener) = trikita.anvil.DSL.recyclerListener(arg)
	open fun remoteViewsAdapter(arg: Intent) = trikita.anvil.DSL.remoteViewsAdapter(arg)
	open fun scrollingCacheEnabled(arg: Boolean) = trikita.anvil.DSL.scrollingCacheEnabled(arg)
	open fun selector(arg: Drawable) = trikita.anvil.DSL.selector(arg)
	open fun selector(arg: Int) = trikita.anvil.DSL.selector(arg)
	open fun smoothScrollbarEnabled(arg: Boolean) = trikita.anvil.DSL.smoothScrollbarEnabled(arg)
	open fun stackFromBottom(arg: Boolean) = trikita.anvil.DSL.stackFromBottom(arg)
	open fun textFilterEnabled(arg: Boolean) = trikita.anvil.DSL.textFilterEnabled(arg)
	open fun transcriptMode(arg: Int) = trikita.anvil.DSL.transcriptMode(arg)
	open fun velocityScale(arg: Float) = trikita.anvil.DSL.velocityScale(arg)
}
open class DSLGridView : DSLAbsListView() {
	open fun columnWidth(arg: Int) = trikita.anvil.DSL.columnWidth(arg)
	open fun gravity(arg: Int) = trikita.anvil.DSL.gravity(arg)
	open fun horizontalSpacing(arg: Int) = trikita.anvil.DSL.horizontalSpacing(arg)
	open fun numColumns(arg: Int) = trikita.anvil.DSL.numColumns(arg)
	open fun stretchMode(arg: Int) = trikita.anvil.DSL.stretchMode(arg)
	open fun verticalSpacing(arg: Int) = trikita.anvil.DSL.verticalSpacing(arg)
}
open class DSLListView : DSLAbsListView() {
	open fun divider(arg: Drawable) = trikita.anvil.DSL.divider(arg)
	open fun dividerHeight(arg: Int) = trikita.anvil.DSL.dividerHeight(arg)
	open fun footerDividersEnabled(arg: Boolean) = trikita.anvil.DSL.footerDividersEnabled(arg)
	open fun headerDividersEnabled(arg: Boolean) = trikita.anvil.DSL.headerDividersEnabled(arg)
	open fun itemsCanFocus(arg: Boolean) = trikita.anvil.DSL.itemsCanFocus(arg)
	open fun overscrollFooter(arg: Drawable) = trikita.anvil.DSL.overscrollFooter(arg)
	open fun overscrollHeader(arg: Drawable) = trikita.anvil.DSL.overscrollHeader(arg)
}
open class DSLExpandableListView : DSLListView() {
	open fun adapter(arg: ExpandableListAdapter) = trikita.anvil.DSL.adapter(arg)
	open fun childDivider(arg: Drawable) = trikita.anvil.DSL.childDivider(arg)
	open fun childIndicator(arg: Drawable) = trikita.anvil.DSL.childIndicator(arg)
	open fun groupIndicator(arg: Drawable) = trikita.anvil.DSL.groupIndicator(arg)
	open fun onChildClick(arg: android.widget.ExpandableListView.OnChildClickListener) = trikita.anvil.DSL.onChildClick(arg)
	open fun onGroupClick(arg: android.widget.ExpandableListView.OnGroupClickListener) = trikita.anvil.DSL.onGroupClick(arg)
	open fun onGroupCollapse(arg: android.widget.ExpandableListView.OnGroupCollapseListener) = trikita.anvil.DSL.onGroupCollapse(arg)
	open fun onGroupExpand(arg: android.widget.ExpandableListView.OnGroupExpandListener) = trikita.anvil.DSL.onGroupExpand(arg)
	open fun selectedGroup(arg: Int) = trikita.anvil.DSL.selectedGroup(arg)
}
open class DSLAbsSpinner : DSLAdapterView() {
}
open class DSLGallery : DSLAbsSpinner() {
	open fun animationDuration(arg: Int) = trikita.anvil.DSL.animationDuration(arg)
	open fun callbackDuringFling(arg: Boolean) = trikita.anvil.DSL.callbackDuringFling(arg)
	open fun gravity(arg: Int) = trikita.anvil.DSL.gravity(arg)
	open fun spacing(arg: Int) = trikita.anvil.DSL.spacing(arg)
	open fun unselectedAlpha(arg: Float) = trikita.anvil.DSL.unselectedAlpha(arg)
}
open class DSLSpinner : DSLAbsSpinner() {
	open fun dropDownHorizontalOffset(arg: Int) = trikita.anvil.DSL.dropDownHorizontalOffset(arg)
	open fun dropDownVerticalOffset(arg: Int) = trikita.anvil.DSL.dropDownVerticalOffset(arg)
	open fun dropDownWidth(arg: Int) = trikita.anvil.DSL.dropDownWidth(arg)
	open fun gravity(arg: Int) = trikita.anvil.DSL.gravity(arg)
	open fun popupBackgroundDrawable(arg: Drawable) = trikita.anvil.DSL.popupBackgroundDrawable(arg)
	open fun popupBackgroundResource(arg: Int) = trikita.anvil.DSL.popupBackgroundResource(arg)
	open fun prompt(arg: CharSequence) = trikita.anvil.DSL.prompt(arg)
	open fun promptId(arg: Int) = trikita.anvil.DSL.promptId(arg)
}
open class DSLAdapterViewAnimator : DSLAdapterView() {
	open fun animateFirstView(arg: Boolean) = trikita.anvil.DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = trikita.anvil.DSL.displayedChild(arg)
	open fun inAnimation(arg: ObjectAnimator) = trikita.anvil.DSL.inAnimation(arg)
	open fun outAnimation(arg: ObjectAnimator) = trikita.anvil.DSL.outAnimation(arg)
	open fun remoteViewsAdapter(arg: Intent) = trikita.anvil.DSL.remoteViewsAdapter(arg)
}
open class DSLAdapterViewFlipper : DSLAdapterViewAnimator() {
	open fun autoStart(arg: Boolean) = trikita.anvil.DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = trikita.anvil.DSL.flipInterval(arg)
}
open class DSLStackView : DSLAdapterViewAnimator() {
}
open class DSLFragmentBreadCrumbs : DSLViewGroup() {
	open fun activity(arg: Activity) = trikita.anvil.DSL.activity(arg)
	open fun maxVisible(arg: Int) = trikita.anvil.DSL.maxVisible(arg)
	open fun onBreadCrumbClick(arg: android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) = trikita.anvil.DSL.onBreadCrumbClick(arg)
}
open class DSLFrameLayout : DSLViewGroup() {
	open fun foreground(arg: Drawable) = trikita.anvil.DSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = trikita.anvil.DSL.foregroundGravity(arg)
	open fun foregroundTintList(arg: ColorStateList) = trikita.anvil.DSL.foregroundTintList(arg)
	open fun foregroundTintMode(arg: PorterDuff.Mode) = trikita.anvil.DSL.foregroundTintMode(arg)
	open fun measureAllChildren(arg: Boolean) = trikita.anvil.DSL.measureAllChildren(arg)
}
open class DSLAppWidgetHostView : DSLFrameLayout() {
}
open class DSLCalendarView : DSLFrameLayout() {
	open fun date(arg: Long) = trikita.anvil.DSL.date(arg)
	open fun dateTextAppearance(arg: Int) = trikita.anvil.DSL.dateTextAppearance(arg)
	open fun firstDayOfWeek(arg: Int) = trikita.anvil.DSL.firstDayOfWeek(arg)
	open fun focusedMonthDateColor(arg: Int) = trikita.anvil.DSL.focusedMonthDateColor(arg)
	open fun maxDate(arg: Long) = trikita.anvil.DSL.maxDate(arg)
	open fun minDate(arg: Long) = trikita.anvil.DSL.minDate(arg)
	open fun onDateChange(arg: android.widget.CalendarView.OnDateChangeListener) = trikita.anvil.DSL.onDateChange(arg)
	open fun selectedDateVerticalBar(arg: Drawable) = trikita.anvil.DSL.selectedDateVerticalBar(arg)
	open fun selectedDateVerticalBar(arg: Int) = trikita.anvil.DSL.selectedDateVerticalBar(arg)
	open fun selectedWeekBackgroundColor(arg: Int) = trikita.anvil.DSL.selectedWeekBackgroundColor(arg)
	open fun showWeekNumber(arg: Boolean) = trikita.anvil.DSL.showWeekNumber(arg)
	open fun shownWeekCount(arg: Int) = trikita.anvil.DSL.shownWeekCount(arg)
	open fun unfocusedMonthDateColor(arg: Int) = trikita.anvil.DSL.unfocusedMonthDateColor(arg)
	open fun weekDayTextAppearance(arg: Int) = trikita.anvil.DSL.weekDayTextAppearance(arg)
	open fun weekNumberColor(arg: Int) = trikita.anvil.DSL.weekNumberColor(arg)
	open fun weekSeparatorLineColor(arg: Int) = trikita.anvil.DSL.weekSeparatorLineColor(arg)
}
open class DSLDatePicker : DSLFrameLayout() {
	open fun calendarViewShown(arg: Boolean) = trikita.anvil.DSL.calendarViewShown(arg)
	open fun firstDayOfWeek(arg: Int) = trikita.anvil.DSL.firstDayOfWeek(arg)
	open fun maxDate(arg: Long) = trikita.anvil.DSL.maxDate(arg)
	open fun minDate(arg: Long) = trikita.anvil.DSL.minDate(arg)
	open fun spinnersShown(arg: Boolean) = trikita.anvil.DSL.spinnersShown(arg)
}
open class DSLGestureOverlayView : DSLFrameLayout() {
	open fun eventsInterceptionEnabled(arg: Boolean) = trikita.anvil.DSL.eventsInterceptionEnabled(arg)
	open fun fadeEnabled(arg: Boolean) = trikita.anvil.DSL.fadeEnabled(arg)
	open fun fadeOffset(arg: Long) = trikita.anvil.DSL.fadeOffset(arg)
	open fun gesture(arg: Gesture) = trikita.anvil.DSL.gesture(arg)
	open fun gestureColor(arg: Int) = trikita.anvil.DSL.gestureColor(arg)
	open fun gestureStrokeAngleThreshold(arg: Float) = trikita.anvil.DSL.gestureStrokeAngleThreshold(arg)
	open fun gestureStrokeLengthThreshold(arg: Float) = trikita.anvil.DSL.gestureStrokeLengthThreshold(arg)
	open fun gestureStrokeSquarenessTreshold(arg: Float) = trikita.anvil.DSL.gestureStrokeSquarenessTreshold(arg)
	open fun gestureStrokeType(arg: Int) = trikita.anvil.DSL.gestureStrokeType(arg)
	open fun gestureStrokeWidth(arg: Float) = trikita.anvil.DSL.gestureStrokeWidth(arg)
	open fun gestureVisible(arg: Boolean) = trikita.anvil.DSL.gestureVisible(arg)
	open fun orientation(arg: Int) = trikita.anvil.DSL.orientation(arg)
	open fun uncertainGestureColor(arg: Int) = trikita.anvil.DSL.uncertainGestureColor(arg)
}
open class DSLHorizontalScrollView : DSLFrameLayout() {
	open fun fillViewport(arg: Boolean) = trikita.anvil.DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = trikita.anvil.DSL.smoothScrollingEnabled(arg)
}
open class DSLMediaController : DSLFrameLayout() {
	open fun anchorView(arg: View) = trikita.anvil.DSL.anchorView(arg)
	open fun mediaPlayer(arg: android.widget.MediaController.MediaPlayerControl) = trikita.anvil.DSL.mediaPlayer(arg)
}
open class DSLScrollView : DSLFrameLayout() {
	open fun fillViewport(arg: Boolean) = trikita.anvil.DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = trikita.anvil.DSL.smoothScrollingEnabled(arg)
}
open class DSLTabHost : DSLFrameLayout() {
	open fun currentTab(arg: Int) = trikita.anvil.DSL.currentTab(arg)
	open fun currentTabByTag(arg: String) = trikita.anvil.DSL.currentTabByTag(arg)
	open fun onTabChanged(arg: android.widget.TabHost.OnTabChangeListener) = trikita.anvil.DSL.onTabChanged(arg)
	open fun up(arg: LocalActivityManager) = trikita.anvil.DSL.up(arg)
}
open class DSLTimePicker : DSLFrameLayout() {
	open fun currentHour(arg: Int) = trikita.anvil.DSL.currentHour(arg)
	open fun currentMinute(arg: Int) = trikita.anvil.DSL.currentMinute(arg)
	open fun is24HourView(arg: Boolean) = trikita.anvil.DSL.is24HourView(arg)
	open fun onTimeChanged(arg: android.widget.TimePicker.OnTimeChangedListener) = trikita.anvil.DSL.onTimeChanged(arg)
}
open class DSLViewAnimator : DSLFrameLayout() {
	open fun animateFirstView(arg: Boolean) = trikita.anvil.DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = trikita.anvil.DSL.displayedChild(arg)
	open fun inAnimation(arg: Animation) = trikita.anvil.DSL.inAnimation(arg)
	open fun outAnimation(arg: Animation) = trikita.anvil.DSL.outAnimation(arg)
}
open class DSLViewFlipper : DSLViewAnimator() {
	open fun autoStart(arg: Boolean) = trikita.anvil.DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = trikita.anvil.DSL.flipInterval(arg)
}
open class DSLViewSwitcher : DSLViewAnimator() {
	open fun factory(arg: android.widget.ViewSwitcher.ViewFactory) = trikita.anvil.DSL.factory(arg)
}
open class DSLImageSwitcher : DSLViewSwitcher() {
	open fun imageDrawable(arg: Drawable) = trikita.anvil.DSL.imageDrawable(arg)
	open fun imageResource(arg: Int) = trikita.anvil.DSL.imageResource(arg)
	open fun imageURI(arg: Uri) = trikita.anvil.DSL.imageURI(arg)
}
open class DSLTextSwitcher : DSLViewSwitcher() {
	open fun currentText(arg: CharSequence) = trikita.anvil.DSL.currentText(arg)
}
open class DSLGridLayout : DSLViewGroup() {
	open fun alignmentMode(arg: Int) = trikita.anvil.DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = trikita.anvil.DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = trikita.anvil.DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = trikita.anvil.DSL.orientation(arg)
	open fun rowCount(arg: Int) = trikita.anvil.DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = trikita.anvil.DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = trikita.anvil.DSL.useDefaultMargins(arg)
}
open class DSLLinearLayout : DSLViewGroup() {
	open fun baselineAligned(arg: Boolean) = trikita.anvil.DSL.baselineAligned(arg)
	open fun baselineAlignedChildIndex(arg: Int) = trikita.anvil.DSL.baselineAlignedChildIndex(arg)
	open fun dividerDrawable(arg: Drawable) = trikita.anvil.DSL.dividerDrawable(arg)
	open fun dividerPadding(arg: Int) = trikita.anvil.DSL.dividerPadding(arg)
	open fun gravity(arg: Int) = trikita.anvil.DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = trikita.anvil.DSL.horizontalGravity(arg)
	open fun measureWithLargestChildEnabled(arg: Boolean) = trikita.anvil.DSL.measureWithLargestChildEnabled(arg)
	open fun orientation(arg: Int) = trikita.anvil.DSL.orientation(arg)
	open fun showDividers(arg: Int) = trikita.anvil.DSL.showDividers(arg)
	open fun verticalGravity(arg: Int) = trikita.anvil.DSL.verticalGravity(arg)
	open fun weightSum(arg: Float) = trikita.anvil.DSL.weightSum(arg)
}
open class DSLActionMenuView : DSLLinearLayout() {
	open fun onMenuItemClick(arg: android.widget.ActionMenuView.OnMenuItemClickListener) = trikita.anvil.DSL.onMenuItemClick(arg)
	open fun popupTheme(arg: Int) = trikita.anvil.DSL.popupTheme(arg)
}
open class DSLNumberPicker : DSLLinearLayout() {
	open fun displayedValues(arg: Array<String>) = trikita.anvil.DSL.displayedValues(arg)
	open fun formatter(arg: android.widget.NumberPicker.Formatter) = trikita.anvil.DSL.formatter(arg)
	open fun maxValue(arg: Int) = trikita.anvil.DSL.maxValue(arg)
	open fun minValue(arg: Int) = trikita.anvil.DSL.minValue(arg)
	open fun onLongPressUpdateInterval(arg: Long) = trikita.anvil.DSL.onLongPressUpdateInterval(arg)
	open fun onScroll(arg: android.widget.NumberPicker.OnScrollListener) = trikita.anvil.DSL.onScroll(arg)
	open fun onValueChanged(arg: android.widget.NumberPicker.OnValueChangeListener) = trikita.anvil.DSL.onValueChanged(arg)
	open fun value(arg: Int) = trikita.anvil.DSL.value(arg)
	open fun wrapSelectorWheel(arg: Boolean) = trikita.anvil.DSL.wrapSelectorWheel(arg)
}
open class DSLRadioGroup : DSLLinearLayout() {
	open fun onCheckedChange(arg: android.widget.RadioGroup.OnCheckedChangeListener) = trikita.anvil.DSL.onCheckedChange(arg)
}
open class DSLSearchView : DSLLinearLayout() {
	open fun iconified(arg: Boolean) = trikita.anvil.DSL.iconified(arg)
	open fun iconifiedByDefault(arg: Boolean) = trikita.anvil.DSL.iconifiedByDefault(arg)
	open fun imeOptions(arg: Int) = trikita.anvil.DSL.imeOptions(arg)
	open fun inputType(arg: Int) = trikita.anvil.DSL.inputType(arg)
	open fun maxWidth(arg: Int) = trikita.anvil.DSL.maxWidth(arg)
	open fun onClose(arg: android.widget.SearchView.OnCloseListener) = trikita.anvil.DSL.onClose(arg)
	open fun onQueryText(arg: android.widget.SearchView.OnQueryTextListener) = trikita.anvil.DSL.onQueryText(arg)
	open fun onQueryTextFocusChange(arg: View.OnFocusChangeListener) = trikita.anvil.DSL.onQueryTextFocusChange(arg)
	open fun onSearchClick(arg: View.OnClickListener) = trikita.anvil.DSL.onSearchClick(arg)
	open fun onSuggestion(arg: android.widget.SearchView.OnSuggestionListener) = trikita.anvil.DSL.onSuggestion(arg)
	open fun queryHint(arg: CharSequence) = trikita.anvil.DSL.queryHint(arg)
	open fun queryRefinementEnabled(arg: Boolean) = trikita.anvil.DSL.queryRefinementEnabled(arg)
	open fun searchableInfo(arg: SearchableInfo) = trikita.anvil.DSL.searchableInfo(arg)
	open fun submitButtonEnabled(arg: Boolean) = trikita.anvil.DSL.submitButtonEnabled(arg)
	open fun suggestionsAdapter(arg: CursorAdapter) = trikita.anvil.DSL.suggestionsAdapter(arg)
}
open class DSLTableLayout : DSLLinearLayout() {
	open fun shrinkAllColumns(arg: Boolean) = trikita.anvil.DSL.shrinkAllColumns(arg)
	open fun stretchAllColumns(arg: Boolean) = trikita.anvil.DSL.stretchAllColumns(arg)
}
open class DSLTableRow : DSLLinearLayout() {
}
open class DSLTabWidget : DSLLinearLayout() {
	open fun currentTab(arg: Int) = trikita.anvil.DSL.currentTab(arg)
	open fun dividerDrawable(arg: Int) = trikita.anvil.DSL.dividerDrawable(arg)
	open fun leftStripDrawable(arg: Drawable) = trikita.anvil.DSL.leftStripDrawable(arg)
	open fun leftStripDrawable(arg: Int) = trikita.anvil.DSL.leftStripDrawable(arg)
	open fun rightStripDrawable(arg: Drawable) = trikita.anvil.DSL.rightStripDrawable(arg)
	open fun rightStripDrawable(arg: Int) = trikita.anvil.DSL.rightStripDrawable(arg)
	open fun stripEnabled(arg: Boolean) = trikita.anvil.DSL.stripEnabled(arg)
}
open class DSLZoomControls : DSLLinearLayout() {
	open fun isZoomInEnabled(arg: Boolean) = trikita.anvil.DSL.isZoomInEnabled(arg)
	open fun isZoomOutEnabled(arg: Boolean) = trikita.anvil.DSL.isZoomOutEnabled(arg)
	open fun onZoomInClick(arg: View.OnClickListener) = trikita.anvil.DSL.onZoomInClick(arg)
	open fun onZoomOutClick(arg: View.OnClickListener) = trikita.anvil.DSL.onZoomOutClick(arg)
	open fun zoomSpeed(arg: Long) = trikita.anvil.DSL.zoomSpeed(arg)
}
open class DSLRelativeLayout : DSLViewGroup() {
	open fun gravity(arg: Int) = trikita.anvil.DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = trikita.anvil.DSL.horizontalGravity(arg)
	open fun ignoreGravity(arg: Int) = trikita.anvil.DSL.ignoreGravity(arg)
	open fun verticalGravity(arg: Int) = trikita.anvil.DSL.verticalGravity(arg)
}
open class DSLDialerFilter : DSLRelativeLayout() {
	open fun digitsWatcher(arg: TextWatcher) = trikita.anvil.DSL.digitsWatcher(arg)
	open fun filterWatcher(arg: TextWatcher) = trikita.anvil.DSL.filterWatcher(arg)
	open fun lettersWatcher(arg: TextWatcher) = trikita.anvil.DSL.lettersWatcher(arg)
	open fun mode(arg: Int) = trikita.anvil.DSL.mode(arg)
}
open class DSLTwoLineListItem : DSLRelativeLayout() {
}
open class DSLSlidingDrawer : DSLViewGroup() {
	open fun onDrawerClose(arg: android.widget.SlidingDrawer.OnDrawerCloseListener) = trikita.anvil.DSL.onDrawerClose(arg)
	open fun onDrawerOpen(arg: android.widget.SlidingDrawer.OnDrawerOpenListener) = trikita.anvil.DSL.onDrawerOpen(arg)
	open fun onDrawerScroll(arg: android.widget.SlidingDrawer.OnDrawerScrollListener) = trikita.anvil.DSL.onDrawerScroll(arg)
}
open class DSLToolbar : DSLViewGroup() {
	open fun logo(arg: Drawable) = trikita.anvil.DSL.logo(arg)
	open fun logo(arg: Int) = trikita.anvil.DSL.logo(arg)
	open fun logoDescription(arg: Int) = trikita.anvil.DSL.logoDescription(arg)
	open fun logoDescription(arg: CharSequence) = trikita.anvil.DSL.logoDescription(arg)
	open fun navigationContentDescription(arg: Int) = trikita.anvil.DSL.navigationContentDescription(arg)
	open fun navigationContentDescription(arg: CharSequence) = trikita.anvil.DSL.navigationContentDescription(arg)
	open fun navigationIcon(arg: Drawable) = trikita.anvil.DSL.navigationIcon(arg)
	open fun navigationIcon(arg: Int) = trikita.anvil.DSL.navigationIcon(arg)
	open fun navigationOnClickListener(arg: View.OnClickListener) = trikita.anvil.DSL.navigationOnClickListener(arg)
	open fun onMenuItemClick(arg: android.widget.Toolbar.OnMenuItemClickListener) = trikita.anvil.DSL.onMenuItemClick(arg)
	open fun popupTheme(arg: Int) = trikita.anvil.DSL.popupTheme(arg)
	open fun subtitle(arg: Int) = trikita.anvil.DSL.subtitle(arg)
	open fun subtitle(arg: CharSequence) = trikita.anvil.DSL.subtitle(arg)
	open fun subtitleTextColor(arg: Int) = trikita.anvil.DSL.subtitleTextColor(arg)
	open fun title(arg: Int) = trikita.anvil.DSL.title(arg)
	open fun title(arg: CharSequence) = trikita.anvil.DSL.title(arg)
	open fun titleTextColor(arg: Int) = trikita.anvil.DSL.titleTextColor(arg)
}
open class DSLTvView : DSLViewGroup() {
	open fun callback(arg: android.media.tv.TvView.TvInputCallback) = trikita.anvil.DSL.callback(arg)
	open fun captionEnabled(arg: Boolean) = trikita.anvil.DSL.captionEnabled(arg)
	open fun onUnhandledInputEvent(arg: android.media.tv.TvView.OnUnhandledInputEventListener) = trikita.anvil.DSL.onUnhandledInputEvent(arg)
	open fun streamVolume(arg: Float) = trikita.anvil.DSL.streamVolume(arg)
}
open class DSLViewStub : BaseDSL() {
	open fun inflatedId(arg: Int) = trikita.anvil.DSL.inflatedId(arg)
	open fun layoutInflater(arg: LayoutInflater) = trikita.anvil.DSL.layoutInflater(arg)
	open fun layoutResource(arg: Int) = trikita.anvil.DSL.layoutResource(arg)
	open fun onInflate(arg: android.view.ViewStub.OnInflateListener) = trikita.anvil.DSL.onInflate(arg)
}
