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

inline fun Anvil.Renderable.numberPicker(crossinline r: DSLNumberPicker<ViewGroup.LayoutParams>.() -> Unit) = DSL.numberPicker({ DSLNumberPicker<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.numberPicker(crossinline r: DSLNumberPicker<T>.() -> Unit) = DSL.numberPicker({ DSLNumberPicker<T>().r() })
inline fun Anvil.Renderable.ratingBar(crossinline r: DSLRatingBar<ViewGroup.LayoutParams>.() -> Unit) = DSL.ratingBar({ DSLRatingBar<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.ratingBar(crossinline r: DSLRatingBar<T>.() -> Unit) = DSL.ratingBar({ DSLRatingBar<T>().r() })
inline fun Anvil.Renderable.switchView(crossinline r: DSLSwitchView<ViewGroup.LayoutParams>.() -> Unit) = DSL.switchView({ DSLSwitchView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.switchView(crossinline r: DSLSwitchView<T>.() -> Unit) = DSL.switchView({ DSLSwitchView<T>().r() })
inline fun Anvil.Renderable.absoluteLayout(crossinline r: DSLAbsoluteLayout<AbsoluteLayout.LayoutParams>.() -> Unit) = DSL.absoluteLayout({ DSLAbsoluteLayout<AbsoluteLayout.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.absoluteLayout(crossinline r: DSLAbsoluteLayout<T>.() -> Unit) = DSL.absoluteLayout({ DSLAbsoluteLayout<T>().r() })
inline fun Anvil.Renderable.timePicker(crossinline r: DSLTimePicker<ViewGroup.LayoutParams>.() -> Unit) = DSL.timePicker({ DSLTimePicker<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.timePicker(crossinline r: DSLTimePicker<T>.() -> Unit) = DSL.timePicker({ DSLTimePicker<T>().r() })
inline fun Anvil.Renderable.viewAnimator(crossinline r: DSLViewAnimator<ViewGroup.LayoutParams>.() -> Unit) = DSL.viewAnimator({ DSLViewAnimator<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.viewAnimator(crossinline r: DSLViewAnimator<T>.() -> Unit) = DSL.viewAnimator({ DSLViewAnimator<T>().r() })
inline fun Anvil.Renderable.radioGroup(crossinline r: DSLRadioGroup<RadioGroup.LayoutParams>.() -> Unit) = DSL.radioGroup({ DSLRadioGroup<RadioGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.radioGroup(crossinline r: DSLRadioGroup<T>.() -> Unit) = DSL.radioGroup({ DSLRadioGroup<T>().r() })
inline fun Anvil.Renderable.dialerFilter(crossinline r: DSLDialerFilter<ViewGroup.LayoutParams>.() -> Unit) = DSL.dialerFilter({ DSLDialerFilter<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.dialerFilter(crossinline r: DSLDialerFilter<T>.() -> Unit) = DSL.dialerFilter({ DSLDialerFilter<T>().r() })
inline fun Anvil.Renderable.searchView(crossinline r: DSLSearchView<ViewGroup.LayoutParams>.() -> Unit) = DSL.searchView({ DSLSearchView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.searchView(crossinline r: DSLSearchView<T>.() -> Unit) = DSL.searchView({ DSLSearchView<T>().r() })
inline fun Anvil.Renderable.tabWidget(crossinline r: DSLTabWidget<ViewGroup.LayoutParams>.() -> Unit) = DSL.tabWidget({ DSLTabWidget<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.tabWidget(crossinline r: DSLTabWidget<T>.() -> Unit) = DSL.tabWidget({ DSLTabWidget<T>().r() })
inline fun Anvil.Renderable.extractEditText(crossinline r: DSLExtractEditText<ViewGroup.LayoutParams>.() -> Unit) = DSL.extractEditText({ DSLExtractEditText<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.extractEditText(crossinline r: DSLExtractEditText<T>.() -> Unit) = DSL.extractEditText({ DSLExtractEditText<T>().r() })
inline fun Anvil.Renderable.absSeekBar(crossinline r: DSLAbsSeekBar<ViewGroup.LayoutParams>.() -> Unit) = DSL.absSeekBar({ DSLAbsSeekBar<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.absSeekBar(crossinline r: DSLAbsSeekBar<T>.() -> Unit) = DSL.absSeekBar({ DSLAbsSeekBar<T>().r() })
inline fun Anvil.Renderable.chronometer(crossinline r: DSLChronometer<ViewGroup.LayoutParams>.() -> Unit) = DSL.chronometer({ DSLChronometer<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.chronometer(crossinline r: DSLChronometer<T>.() -> Unit) = DSL.chronometer({ DSLChronometer<T>().r() })
inline fun Anvil.Renderable.zoomControls(crossinline r: DSLZoomControls<ViewGroup.LayoutParams>.() -> Unit) = DSL.zoomControls({ DSLZoomControls<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.zoomControls(crossinline r: DSLZoomControls<T>.() -> Unit) = DSL.zoomControls({ DSLZoomControls<T>().r() })
inline fun Anvil.Renderable.tabHost(crossinline r: DSLTabHost<ViewGroup.LayoutParams>.() -> Unit) = DSL.tabHost({ DSLTabHost<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.tabHost(crossinline r: DSLTabHost<T>.() -> Unit) = DSL.tabHost({ DSLTabHost<T>().r() })
inline fun Anvil.Renderable.expandableListView(crossinline r: DSLExpandableListView<ViewGroup.LayoutParams>.() -> Unit) = DSL.expandableListView({ DSLExpandableListView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.expandableListView(crossinline r: DSLExpandableListView<T>.() -> Unit) = DSL.expandableListView({ DSLExpandableListView<T>().r() })
inline fun Anvil.Renderable.adapterViewFlipper(crossinline r: DSLAdapterViewFlipper<ViewGroup.LayoutParams>.() -> Unit) = DSL.adapterViewFlipper({ DSLAdapterViewFlipper<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.adapterViewFlipper(crossinline r: DSLAdapterViewFlipper<T>.() -> Unit) = DSL.adapterViewFlipper({ DSLAdapterViewFlipper<T>().r() })
inline fun Anvil.Renderable.imageButton(crossinline r: DSLImageButton<ViewGroup.LayoutParams>.() -> Unit) = DSL.imageButton({ DSLImageButton<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.imageButton(crossinline r: DSLImageButton<T>.() -> Unit) = DSL.imageButton({ DSLImageButton<T>().r() })
inline fun Anvil.Renderable.radioButton(crossinline r: DSLRadioButton<ViewGroup.LayoutParams>.() -> Unit) = DSL.radioButton({ DSLRadioButton<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.radioButton(crossinline r: DSLRadioButton<T>.() -> Unit) = DSL.radioButton({ DSLRadioButton<T>().r() })
inline fun Anvil.Renderable.view(crossinline r: DSLView<ViewGroup.LayoutParams>.() -> Unit) = DSL.view({ DSLView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.view(crossinline r: DSLView<T>.() -> Unit) = DSL.view({ DSLView<T>().r() })
inline fun Anvil.Renderable.videoView(crossinline r: DSLVideoView<ViewGroup.LayoutParams>.() -> Unit) = DSL.videoView({ DSLVideoView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.videoView(crossinline r: DSLVideoView<T>.() -> Unit) = DSL.videoView({ DSLVideoView<T>().r() })
inline fun Anvil.Renderable.digitalClock(crossinline r: DSLDigitalClock<ViewGroup.LayoutParams>.() -> Unit) = DSL.digitalClock({ DSLDigitalClock<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.digitalClock(crossinline r: DSLDigitalClock<T>.() -> Unit) = DSL.digitalClock({ DSLDigitalClock<T>().r() })
inline fun Anvil.Renderable.calendarView(crossinline r: DSLCalendarView<ViewGroup.LayoutParams>.() -> Unit) = DSL.calendarView({ DSLCalendarView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.calendarView(crossinline r: DSLCalendarView<T>.() -> Unit) = DSL.calendarView({ DSLCalendarView<T>().r() })
inline fun Anvil.Renderable.tableLayout(crossinline r: DSLTableLayout<TableLayout.LayoutParams>.() -> Unit) = DSL.tableLayout({ DSLTableLayout<TableLayout.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.tableLayout(crossinline r: DSLTableLayout<T>.() -> Unit) = DSL.tableLayout({ DSLTableLayout<T>().r() })
inline fun Anvil.Renderable.textView(crossinline r: DSLTextView<ViewGroup.LayoutParams>.() -> Unit) = DSL.textView({ DSLTextView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.textView(crossinline r: DSLTextView<T>.() -> Unit) = DSL.textView({ DSLTextView<T>().r() })
inline fun Anvil.Renderable.adapterView(crossinline r: DSLAdapterView<ViewGroup.LayoutParams>.() -> Unit) = DSL.adapterView({ DSLAdapterView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.adapterView(crossinline r: DSLAdapterView<T>.() -> Unit) = DSL.adapterView({ DSLAdapterView<T>().r() })
inline fun Anvil.Renderable.imageSwitcher(crossinline r: DSLImageSwitcher<ViewGroup.LayoutParams>.() -> Unit) = DSL.imageSwitcher({ DSLImageSwitcher<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.imageSwitcher(crossinline r: DSLImageSwitcher<T>.() -> Unit) = DSL.imageSwitcher({ DSLImageSwitcher<T>().r() })
inline fun Anvil.Renderable.autoCompleteTextView(crossinline r: DSLAutoCompleteTextView<ViewGroup.LayoutParams>.() -> Unit) = DSL.autoCompleteTextView({ DSLAutoCompleteTextView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.autoCompleteTextView(crossinline r: DSLAutoCompleteTextView<T>.() -> Unit) = DSL.autoCompleteTextView({ DSLAutoCompleteTextView<T>().r() })
inline fun Anvil.Renderable.fragmentBreadCrumbs(crossinline r: DSLFragmentBreadCrumbs<ViewGroup.LayoutParams>.() -> Unit) = DSL.fragmentBreadCrumbs({ DSLFragmentBreadCrumbs<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.fragmentBreadCrumbs(crossinline r: DSLFragmentBreadCrumbs<T>.() -> Unit) = DSL.fragmentBreadCrumbs({ DSLFragmentBreadCrumbs<T>().r() })
inline fun Anvil.Renderable.frameLayout(crossinline r: DSLFrameLayout<FrameLayout.LayoutParams>.() -> Unit) = DSL.frameLayout({ DSLFrameLayout<FrameLayout.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.frameLayout(crossinline r: DSLFrameLayout<T>.() -> Unit) = DSL.frameLayout({ DSLFrameLayout<T>().r() })
inline fun Anvil.Renderable.gestureOverlayView(crossinline r: DSLGestureOverlayView<ViewGroup.LayoutParams>.() -> Unit) = DSL.gestureOverlayView({ DSLGestureOverlayView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.gestureOverlayView(crossinline r: DSLGestureOverlayView<T>.() -> Unit) = DSL.gestureOverlayView({ DSLGestureOverlayView<T>().r() })
inline fun Anvil.Renderable.webView(crossinline r: DSLWebView<ViewGroup.LayoutParams>.() -> Unit) = DSL.webView({ DSLWebView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.webView(crossinline r: DSLWebView<T>.() -> Unit) = DSL.webView({ DSLWebView<T>().r() })
inline fun Anvil.Renderable.tableRow(crossinline r: DSLTableRow<TableRow.LayoutParams>.() -> Unit) = DSL.tableRow({ DSLTableRow<TableRow.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.tableRow(crossinline r: DSLTableRow<T>.() -> Unit) = DSL.tableRow({ DSLTableRow<T>().r() })
inline fun Anvil.Renderable.scrollView(crossinline r: DSLScrollView<ViewGroup.LayoutParams>.() -> Unit) = DSL.scrollView({ DSLScrollView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.scrollView(crossinline r: DSLScrollView<T>.() -> Unit) = DSL.scrollView({ DSLScrollView<T>().r() })
inline fun Anvil.Renderable.stackView(crossinline r: DSLStackView<ViewGroup.LayoutParams>.() -> Unit) = DSL.stackView({ DSLStackView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.stackView(crossinline r: DSLStackView<T>.() -> Unit) = DSL.stackView({ DSLStackView<T>().r() })
inline fun Anvil.Renderable.viewStub(crossinline r: DSLViewStub<ViewGroup.LayoutParams>.() -> Unit) = DSL.viewStub({ DSLViewStub<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.viewStub(crossinline r: DSLViewStub<T>.() -> Unit) = DSL.viewStub({ DSLViewStub<T>().r() })
inline fun Anvil.Renderable.checkBox(crossinline r: DSLCheckBox<ViewGroup.LayoutParams>.() -> Unit) = DSL.checkBox({ DSLCheckBox<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.checkBox(crossinline r: DSLCheckBox<T>.() -> Unit) = DSL.checkBox({ DSLCheckBox<T>().r() })
inline fun Anvil.Renderable.twoLineListItem(crossinline r: DSLTwoLineListItem<ViewGroup.LayoutParams>.() -> Unit) = DSL.twoLineListItem({ DSLTwoLineListItem<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.twoLineListItem(crossinline r: DSLTwoLineListItem<T>.() -> Unit) = DSL.twoLineListItem({ DSLTwoLineListItem<T>().r() })
inline fun Anvil.Renderable.viewSwitcher(crossinline r: DSLViewSwitcher<ViewGroup.LayoutParams>.() -> Unit) = DSL.viewSwitcher({ DSLViewSwitcher<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.viewSwitcher(crossinline r: DSLViewSwitcher<T>.() -> Unit) = DSL.viewSwitcher({ DSLViewSwitcher<T>().r() })
inline fun Anvil.Renderable.spinner(crossinline r: DSLSpinner<ViewGroup.LayoutParams>.() -> Unit) = DSL.spinner({ DSLSpinner<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.spinner(crossinline r: DSLSpinner<T>.() -> Unit) = DSL.spinner({ DSLSpinner<T>().r() })
inline fun Anvil.Renderable.textureView(crossinline r: DSLTextureView<ViewGroup.LayoutParams>.() -> Unit) = DSL.textureView({ DSLTextureView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.textureView(crossinline r: DSLTextureView<T>.() -> Unit) = DSL.textureView({ DSLTextureView<T>().r() })
inline fun Anvil.Renderable.editText(crossinline r: DSLEditText<ViewGroup.LayoutParams>.() -> Unit) = DSL.editText({ DSLEditText<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.editText(crossinline r: DSLEditText<T>.() -> Unit) = DSL.editText({ DSLEditText<T>().r() })
inline fun Anvil.Renderable.surfaceView(crossinline r: DSLSurfaceView<ViewGroup.LayoutParams>.() -> Unit) = DSL.surfaceView({ DSLSurfaceView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.surfaceView(crossinline r: DSLSurfaceView<T>.() -> Unit) = DSL.surfaceView({ DSLSurfaceView<T>().r() })
inline fun Anvil.Renderable.space(crossinline r: DSLSpace<ViewGroup.LayoutParams>.() -> Unit) = DSL.space({ DSLSpace<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.space(crossinline r: DSLSpace<T>.() -> Unit) = DSL.space({ DSLSpace<T>().r() })
inline fun Anvil.Renderable.checkedTextView(crossinline r: DSLCheckedTextView<ViewGroup.LayoutParams>.() -> Unit) = DSL.checkedTextView({ DSLCheckedTextView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.checkedTextView(crossinline r: DSLCheckedTextView<T>.() -> Unit) = DSL.checkedTextView({ DSLCheckedTextView<T>().r() })
inline fun Anvil.Renderable.multiAutoCompleteTextView(crossinline r: DSLMultiAutoCompleteTextView<ViewGroup.LayoutParams>.() -> Unit) = DSL.multiAutoCompleteTextView({ DSLMultiAutoCompleteTextView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.multiAutoCompleteTextView(crossinline r: DSLMultiAutoCompleteTextView<T>.() -> Unit) = DSL.multiAutoCompleteTextView({ DSLMultiAutoCompleteTextView<T>().r() })
inline fun Anvil.Renderable.gLSurfaceView(crossinline r: DSLGLSurfaceView<ViewGroup.LayoutParams>.() -> Unit) = DSL.gLSurfaceView({ DSLGLSurfaceView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.gLSurfaceView(crossinline r: DSLGLSurfaceView<T>.() -> Unit) = DSL.gLSurfaceView({ DSLGLSurfaceView<T>().r() })
inline fun Anvil.Renderable.listView(crossinline r: DSLListView<ViewGroup.LayoutParams>.() -> Unit) = DSL.listView({ DSLListView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.listView(crossinline r: DSLListView<T>.() -> Unit) = DSL.listView({ DSLListView<T>().r() })
inline fun Anvil.Renderable.appWidgetHostView(crossinline r: DSLAppWidgetHostView<ViewGroup.LayoutParams>.() -> Unit) = DSL.appWidgetHostView({ DSLAppWidgetHostView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.appWidgetHostView(crossinline r: DSLAppWidgetHostView<T>.() -> Unit) = DSL.appWidgetHostView({ DSLAppWidgetHostView<T>().r() })
inline fun Anvil.Renderable.analogClock(crossinline r: DSLAnalogClock<ViewGroup.LayoutParams>.() -> Unit) = DSL.analogClock({ DSLAnalogClock<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.analogClock(crossinline r: DSLAnalogClock<T>.() -> Unit) = DSL.analogClock({ DSLAnalogClock<T>().r() })
inline fun Anvil.Renderable.button(crossinline r: DSLButton<ViewGroup.LayoutParams>.() -> Unit) = DSL.button({ DSLButton<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.button(crossinline r: DSLButton<T>.() -> Unit) = DSL.button({ DSLButton<T>().r() })
inline fun Anvil.Renderable.slidingDrawer(crossinline r: DSLSlidingDrawer<ViewGroup.LayoutParams>.() -> Unit) = DSL.slidingDrawer({ DSLSlidingDrawer<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.slidingDrawer(crossinline r: DSLSlidingDrawer<T>.() -> Unit) = DSL.slidingDrawer({ DSLSlidingDrawer<T>().r() })
inline fun Anvil.Renderable.keyboardView(crossinline r: DSLKeyboardView<ViewGroup.LayoutParams>.() -> Unit) = DSL.keyboardView({ DSLKeyboardView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.keyboardView(crossinline r: DSLKeyboardView<T>.() -> Unit) = DSL.keyboardView({ DSLKeyboardView<T>().r() })
inline fun Anvil.Renderable.linearLayout(crossinline r: DSLLinearLayout<LinearLayout.LayoutParams>.() -> Unit) = DSL.linearLayout({ DSLLinearLayout<LinearLayout.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.linearLayout(crossinline r: DSLLinearLayout<T>.() -> Unit) = DSL.linearLayout({ DSLLinearLayout<T>().r() })
inline fun Anvil.Renderable.seekBar(crossinline r: DSLSeekBar<ViewGroup.LayoutParams>.() -> Unit) = DSL.seekBar({ DSLSeekBar<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.seekBar(crossinline r: DSLSeekBar<T>.() -> Unit) = DSL.seekBar({ DSLSeekBar<T>().r() })
inline fun Anvil.Renderable.datePicker(crossinline r: DSLDatePicker<ViewGroup.LayoutParams>.() -> Unit) = DSL.datePicker({ DSLDatePicker<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.datePicker(crossinline r: DSLDatePicker<T>.() -> Unit) = DSL.datePicker({ DSLDatePicker<T>().r() })
inline fun Anvil.Renderable.zoomButton(crossinline r: DSLZoomButton<ViewGroup.LayoutParams>.() -> Unit) = DSL.zoomButton({ DSLZoomButton<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.zoomButton(crossinline r: DSLZoomButton<T>.() -> Unit) = DSL.zoomButton({ DSLZoomButton<T>().r() })
inline fun Anvil.Renderable.relativeLayout(crossinline r: DSLRelativeLayout<RelativeLayout.LayoutParams>.() -> Unit) = DSL.relativeLayout({ DSLRelativeLayout<RelativeLayout.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.relativeLayout(crossinline r: DSLRelativeLayout<T>.() -> Unit) = DSL.relativeLayout({ DSLRelativeLayout<T>().r() })
inline fun Anvil.Renderable.gallery(crossinline r: DSLGallery<Gallery.LayoutParams>.() -> Unit) = DSL.gallery({ DSLGallery<Gallery.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.gallery(crossinline r: DSLGallery<T>.() -> Unit) = DSL.gallery({ DSLGallery<T>().r() })
inline fun Anvil.Renderable.gridView(crossinline r: DSLGridView<ViewGroup.LayoutParams>.() -> Unit) = DSL.gridView({ DSLGridView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.gridView(crossinline r: DSLGridView<T>.() -> Unit) = DSL.gridView({ DSLGridView<T>().r() })
inline fun Anvil.Renderable.toggleButton(crossinline r: DSLToggleButton<ViewGroup.LayoutParams>.() -> Unit) = DSL.toggleButton({ DSLToggleButton<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.toggleButton(crossinline r: DSLToggleButton<T>.() -> Unit) = DSL.toggleButton({ DSLToggleButton<T>().r() })
inline fun Anvil.Renderable.mediaController(crossinline r: DSLMediaController<ViewGroup.LayoutParams>.() -> Unit) = DSL.mediaController({ DSLMediaController<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.mediaController(crossinline r: DSLMediaController<T>.() -> Unit) = DSL.mediaController({ DSLMediaController<T>().r() })
inline fun Anvil.Renderable.viewGroup(crossinline r: DSLViewGroup<ViewGroup.LayoutParams>.() -> Unit) = DSL.viewGroup({ DSLViewGroup<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.viewGroup(crossinline r: DSLViewGroup<T>.() -> Unit) = DSL.viewGroup({ DSLViewGroup<T>().r() })
inline fun Anvil.Renderable.viewFlipper(crossinline r: DSLViewFlipper<ViewGroup.LayoutParams>.() -> Unit) = DSL.viewFlipper({ DSLViewFlipper<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.viewFlipper(crossinline r: DSLViewFlipper<T>.() -> Unit) = DSL.viewFlipper({ DSLViewFlipper<T>().r() })
inline fun Anvil.Renderable.quickContactBadge(crossinline r: DSLQuickContactBadge<ViewGroup.LayoutParams>.() -> Unit) = DSL.quickContactBadge({ DSLQuickContactBadge<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.quickContactBadge(crossinline r: DSLQuickContactBadge<T>.() -> Unit) = DSL.quickContactBadge({ DSLQuickContactBadge<T>().r() })
inline fun Anvil.Renderable.horizontalScrollView(crossinline r: DSLHorizontalScrollView<ViewGroup.LayoutParams>.() -> Unit) = DSL.horizontalScrollView({ DSLHorizontalScrollView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.horizontalScrollView(crossinline r: DSLHorizontalScrollView<T>.() -> Unit) = DSL.horizontalScrollView({ DSLHorizontalScrollView<T>().r() })
inline fun Anvil.Renderable.gridLayout(crossinline r: DSLGridLayout<GridLayout.LayoutParams>.() -> Unit) = DSL.gridLayout({ DSLGridLayout<GridLayout.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.gridLayout(crossinline r: DSLGridLayout<T>.() -> Unit) = DSL.gridLayout({ DSLGridLayout<T>().r() })
inline fun Anvil.Renderable.adapterViewAnimator(crossinline r: DSLAdapterViewAnimator<ViewGroup.LayoutParams>.() -> Unit) = DSL.adapterViewAnimator({ DSLAdapterViewAnimator<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.adapterViewAnimator(crossinline r: DSLAdapterViewAnimator<T>.() -> Unit) = DSL.adapterViewAnimator({ DSLAdapterViewAnimator<T>().r() })
inline fun Anvil.Renderable.textSwitcher(crossinline r: DSLTextSwitcher<ViewGroup.LayoutParams>.() -> Unit) = DSL.textSwitcher({ DSLTextSwitcher<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.textSwitcher(crossinline r: DSLTextSwitcher<T>.() -> Unit) = DSL.textSwitcher({ DSLTextSwitcher<T>().r() })
inline fun Anvil.Renderable.absSpinner(crossinline r: DSLAbsSpinner<ViewGroup.LayoutParams>.() -> Unit) = DSL.absSpinner({ DSLAbsSpinner<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.absSpinner(crossinline r: DSLAbsSpinner<T>.() -> Unit) = DSL.absSpinner({ DSLAbsSpinner<T>().r() })
inline fun Anvil.Renderable.absListView(crossinline r: DSLAbsListView<AbsListView.LayoutParams>.() -> Unit) = DSL.absListView({ DSLAbsListView<AbsListView.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.absListView(crossinline r: DSLAbsListView<T>.() -> Unit) = DSL.absListView({ DSLAbsListView<T>().r() })
inline fun Anvil.Renderable.progressBar(crossinline r: DSLProgressBar<ViewGroup.LayoutParams>.() -> Unit) = DSL.progressBar({ DSLProgressBar<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.progressBar(crossinline r: DSLProgressBar<T>.() -> Unit) = DSL.progressBar({ DSLProgressBar<T>().r() })
inline fun Anvil.Renderable.compoundButton(crossinline r: DSLCompoundButton<ViewGroup.LayoutParams>.() -> Unit) = DSL.compoundButton({ DSLCompoundButton<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.compoundButton(crossinline r: DSLCompoundButton<T>.() -> Unit) = DSL.compoundButton({ DSLCompoundButton<T>().r() })
inline fun Anvil.Renderable.imageView(crossinline r: DSLImageView<ViewGroup.LayoutParams>.() -> Unit) = DSL.imageView({ DSLImageView<ViewGroup.LayoutParams>().r() })
inline fun <T : ViewGroup.LayoutParams> DSLViewGroup<T>.imageView(crossinline r: DSLImageView<T>.() -> Unit) = DSL.imageView({ DSLImageView<T>().r() })

open class DSLView <T : ViewGroup.LayoutParams>() : BaseDSL() {
	private fun __foo_justexample__() {}
	constructor(r: DSLView<T>.() -> Unit) : this() { r() }
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
	constructor(r: DSLAnalogClock<T>.() -> Unit) : this() { r() }
}
open class DSLImageView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLImageView<T>.() -> Unit) : this() { r() }
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
	constructor(r: DSLImageButton<T>.() -> Unit) : this() { r() }
}
open class DSLZoomButton<T : ViewGroup.LayoutParams>() : DSLImageButton<T>() {
	constructor(r: DSLZoomButton<T>.() -> Unit) : this() { r() }
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}
open class DSLQuickContactBadge<T : ViewGroup.LayoutParams>() : DSLImageView<T>() {
	constructor(r: DSLQuickContactBadge<T>.() -> Unit) : this() { r() }
	open fun excludeMimes(arg: Array<String>) = DSL.excludeMimes(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}
open class DSLKeyboardView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLKeyboardView<T>.() -> Unit) : this() { r() }
	open fun keyboard(arg: Keyboard) = DSL.keyboard(arg)
	open fun onKeyboardAction(arg: android.inputmethodservice.KeyboardView.OnKeyboardActionListener) = DSL.onKeyboardAction(arg)
	open fun popupParent(arg: View) = DSL.popupParent(arg)
	open fun previewEnabled(arg: Boolean) = DSL.previewEnabled(arg)
	open fun proximityCorrectionEnabled(arg: Boolean) = DSL.proximityCorrectionEnabled(arg)
	open fun shifted(arg: Boolean) = DSL.shifted(arg)
	open fun verticalCorrection(arg: Int) = DSL.verticalCorrection(arg)
}
open class DSLProgressBar<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLProgressBar<T>.() -> Unit) : this() { r() }
	open fun indeterminate(arg: Boolean) = DSL.indeterminate(arg)
	open fun indeterminateDrawable(arg: Drawable) = DSL.indeterminateDrawable(arg)
	open fun interpolator(arg: Interpolator) = DSL.interpolator(arg)
	open fun max(arg: Int) = DSL.max(arg)
	open fun progress(arg: Int) = DSL.progress(arg)
	open fun progressDrawable(arg: Drawable) = DSL.progressDrawable(arg)
	open fun secondaryProgress(arg: Int) = DSL.secondaryProgress(arg)
}
open class DSLAbsSeekBar<T : ViewGroup.LayoutParams>() : DSLProgressBar<T>() {
	constructor(r: DSLAbsSeekBar<T>.() -> Unit) : this() { r() }
	open fun keyProgressIncrement(arg: Int) = DSL.keyProgressIncrement(arg)
	open fun thumb(arg: Drawable) = DSL.thumb(arg)
	open fun thumbOffset(arg: Int) = DSL.thumbOffset(arg)
}
open class DSLRatingBar<T : ViewGroup.LayoutParams>() : DSLAbsSeekBar<T>() {
	constructor(r: DSLRatingBar<T>.() -> Unit) : this() { r() }
	open fun isIndicator(arg: Boolean) = DSL.isIndicator(arg)
	open fun numStars(arg: Int) = DSL.numStars(arg)
	open fun onRatingBarChange(arg: android.widget.RatingBar.OnRatingBarChangeListener) = DSL.onRatingBarChange(arg)
	open fun rating(arg: Float) = DSL.rating(arg)
	open fun stepSize(arg: Float) = DSL.stepSize(arg)
}
open class DSLSeekBar<T : ViewGroup.LayoutParams>() : DSLAbsSeekBar<T>() {
	constructor(r: DSLSeekBar<T>.() -> Unit) : this() { r() }
	open fun onSeekBarChange(arg: android.widget.SeekBar.OnSeekBarChangeListener) = DSL.onSeekBarChange(arg)
}
open class DSLSpace<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLSpace<T>.() -> Unit) : this() { r() }
}
open class DSLSurfaceView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLSurfaceView<T>.() -> Unit) : this() { r() }
	open fun zOrderMediaOverlay(arg: Boolean) = DSL.zOrderMediaOverlay(arg)
	open fun zOrderOnTop(arg: Boolean) = DSL.zOrderOnTop(arg)
}
open class DSLGLSurfaceView<T : ViewGroup.LayoutParams>() : DSLSurfaceView<T>() {
	constructor(r: DSLGLSurfaceView<T>.() -> Unit) : this() { r() }
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
	constructor(r: DSLVideoView<T>.() -> Unit) : this() { r() }
	open fun mediaController(arg: MediaController) = DSL.mediaController(arg)
	open fun onCompletion(arg: MediaPlayer.OnCompletionListener) = DSL.onCompletion(arg)
	open fun onError(arg: MediaPlayer.OnErrorListener) = DSL.onError(arg)
	open fun onPrepared(arg: MediaPlayer.OnPreparedListener) = DSL.onPrepared(arg)
	open fun videoPath(arg: String) = DSL.videoPath(arg)
	open fun videoURI(arg: Uri) = DSL.videoURI(arg)
}
open class DSLTextureView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLTextureView<T>.() -> Unit) : this() { r() }
	open fun opaque(arg: Boolean) = DSL.opaque(arg)
	open fun surfaceTextureListener(arg: android.view.TextureView.SurfaceTextureListener) = DSL.surfaceTextureListener(arg)
	open fun transform(arg: Matrix) = DSL.transform(arg)
}
open class DSLTextView<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLTextView<T>.() -> Unit) : this() { r() }
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
	constructor(r: DSLButton<T>.() -> Unit) : this() { r() }
}
open class DSLCompoundButton<T : ViewGroup.LayoutParams>() : DSLButton<T>() {
	constructor(r: DSLCompoundButton<T>.() -> Unit) : this() { r() }
	open fun buttonDrawable(arg: Drawable) = DSL.buttonDrawable(arg)
	open fun buttonDrawable(arg: Int) = DSL.buttonDrawable(arg)
	open fun checked(arg: Boolean) = DSL.checked(arg)
	open fun onCheckedChange(arg: android.widget.CompoundButton.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}
open class DSLCheckBox<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	constructor(r: DSLCheckBox<T>.() -> Unit) : this() { r() }
}
open class DSLRadioButton<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	constructor(r: DSLRadioButton<T>.() -> Unit) : this() { r() }
}
open class DSLSwitchView<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	constructor(r: DSLSwitchView<T>.() -> Unit) : this() { r() }
	open fun switchTypeface(arg: Typeface) = DSL.switchTypeface(arg)
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
}
open class DSLToggleButton<T : ViewGroup.LayoutParams>() : DSLCompoundButton<T>() {
	constructor(r: DSLToggleButton<T>.() -> Unit) : this() { r() }
	open fun textOff(arg: CharSequence) = DSL.textOff(arg)
	open fun textOn(arg: CharSequence) = DSL.textOn(arg)
}
open class DSLCheckedTextView<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	constructor(r: DSLCheckedTextView<T>.() -> Unit) : this() { r() }
	open fun checkMarkDrawable(arg: Drawable) = DSL.checkMarkDrawable(arg)
	open fun checkMarkDrawable(arg: Int) = DSL.checkMarkDrawable(arg)
	open fun checked(arg: Boolean) = DSL.checked(arg)
}
open class DSLChronometer<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	constructor(r: DSLChronometer<T>.() -> Unit) : this() { r() }
	open fun base(arg: Long) = DSL.base(arg)
	open fun format(arg: String) = DSL.format(arg)
	open fun onChronometerTick(arg: android.widget.Chronometer.OnChronometerTickListener) = DSL.onChronometerTick(arg)
}
open class DSLDigitalClock<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	constructor(r: DSLDigitalClock<T>.() -> Unit) : this() { r() }
}
open class DSLEditText<T : ViewGroup.LayoutParams>() : DSLTextView<T>() {
	constructor(r: DSLEditText<T>.() -> Unit) : this() { r() }
	open fun selection(arg: Int) = DSL.selection(arg)
}
open class DSLAutoCompleteTextView<T : ViewGroup.LayoutParams>() : DSLEditText<T>() {
	constructor(r: DSLAutoCompleteTextView<T>.() -> Unit) : this() { r() }
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
	constructor(r: DSLMultiAutoCompleteTextView<T>.() -> Unit) : this() { r() }
	open fun tokenizer(arg: android.widget.MultiAutoCompleteTextView.Tokenizer) = DSL.tokenizer(arg)
}
open class DSLExtractEditText<T : ViewGroup.LayoutParams>() : DSLEditText<T>() {
	constructor(r: DSLExtractEditText<T>.() -> Unit) : this() { r() }
}
open class DSLViewGroup<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLViewGroup<T>.() -> Unit) : this() { r() }
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
open class DSLAbsoluteLayout<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLAbsoluteLayout<T>.() -> Unit) : this() { r() }
}
open class DSLWebView<T : ViewGroup.LayoutParams>() : DSLAbsoluteLayout<T>() {
	constructor(r: DSLWebView<T>.() -> Unit) : this() { r() }
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
open class DSLAdapterView<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLAdapterView<T>.() -> Unit) : this() { r() }
	open fun adapter(arg: Adapter) = DSL.adapter(arg)
	open fun emptyView(arg: View) = DSL.emptyView(arg)
	open fun onItemClick(arg: android.widget.AdapterView.OnItemClickListener) = DSL.onItemClick(arg)
	open fun onItemLongClick(arg: android.widget.AdapterView.OnItemLongClickListener) = DSL.onItemLongClick(arg)
	open fun onItemSelected(arg: android.widget.AdapterView.OnItemSelectedListener) = DSL.onItemSelected(arg)
	open fun selection(arg: Int) = DSL.selection(arg)
}
open class DSLAbsListView<T : ViewGroup.LayoutParams>() : DSLAdapterView<T>() {
	constructor(r: DSLAbsListView<T>.() -> Unit) : this() { r() }
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
open class DSLGridView<T : ViewGroup.LayoutParams>() : DSLAbsListView<T>() {
	constructor(r: DSLGridView<T>.() -> Unit) : this() { r() }
	open fun columnWidth(arg: Int) = DSL.columnWidth(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalSpacing(arg: Int) = DSL.horizontalSpacing(arg)
	open fun numColumns(arg: Int) = DSL.numColumns(arg)
	open fun stretchMode(arg: Int) = DSL.stretchMode(arg)
	open fun verticalSpacing(arg: Int) = DSL.verticalSpacing(arg)
}
open class DSLListView<T : ViewGroup.LayoutParams>() : DSLAbsListView<T>() {
	constructor(r: DSLListView<T>.() -> Unit) : this() { r() }
	open fun divider(arg: Drawable) = DSL.divider(arg)
	open fun dividerHeight(arg: Int) = DSL.dividerHeight(arg)
	open fun footerDividersEnabled(arg: Boolean) = DSL.footerDividersEnabled(arg)
	open fun headerDividersEnabled(arg: Boolean) = DSL.headerDividersEnabled(arg)
	open fun itemsCanFocus(arg: Boolean) = DSL.itemsCanFocus(arg)
	open fun overscrollFooter(arg: Drawable) = DSL.overscrollFooter(arg)
	open fun overscrollHeader(arg: Drawable) = DSL.overscrollHeader(arg)
}
open class DSLExpandableListView<T : ViewGroup.LayoutParams>() : DSLListView<T>() {
	constructor(r: DSLExpandableListView<T>.() -> Unit) : this() { r() }
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
open class DSLAbsSpinner<T : ViewGroup.LayoutParams>() : DSLAdapterView<T>() {
	constructor(r: DSLAbsSpinner<T>.() -> Unit) : this() { r() }
}
open class DSLGallery<T : ViewGroup.LayoutParams>() : DSLAbsSpinner<T>() {
	constructor(r: DSLGallery<T>.() -> Unit) : this() { r() }
	open fun animationDuration(arg: Int) = DSL.animationDuration(arg)
	open fun callbackDuringFling(arg: Boolean) = DSL.callbackDuringFling(arg)
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun spacing(arg: Int) = DSL.spacing(arg)
	open fun unselectedAlpha(arg: Float) = DSL.unselectedAlpha(arg)
}
open class DSLSpinner<T : ViewGroup.LayoutParams>() : DSLAbsSpinner<T>() {
	constructor(r: DSLSpinner<T>.() -> Unit) : this() { r() }
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun prompt(arg: CharSequence) = DSL.prompt(arg)
	open fun promptId(arg: Int) = DSL.promptId(arg)
}
open class DSLAdapterViewAnimator<T : ViewGroup.LayoutParams>() : DSLAdapterView<T>() {
	constructor(r: DSLAdapterViewAnimator<T>.() -> Unit) : this() { r() }
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: ObjectAnimator) = DSL.inAnimation(arg)
	open fun outAnimation(arg: ObjectAnimator) = DSL.outAnimation(arg)
	open fun remoteViewsAdapter(arg: Intent) = DSL.remoteViewsAdapter(arg)
}
open class DSLAdapterViewFlipper<T : ViewGroup.LayoutParams>() : DSLAdapterViewAnimator<T>() {
	constructor(r: DSLAdapterViewFlipper<T>.() -> Unit) : this() { r() }
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}
open class DSLStackView<T : ViewGroup.LayoutParams>() : DSLAdapterViewAnimator<T>() {
	constructor(r: DSLStackView<T>.() -> Unit) : this() { r() }
}
open class DSLFragmentBreadCrumbs<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLFragmentBreadCrumbs<T>.() -> Unit) : this() { r() }
	open fun activity(arg: Activity) = DSL.activity(arg)
	open fun maxVisible(arg: Int) = DSL.maxVisible(arg)
	open fun onBreadCrumbClick(arg: android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) = DSL.onBreadCrumbClick(arg)
}
open class DSLFrameLayout<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLFrameLayout<T>.() -> Unit) : this() { r() }
	open fun foreground(arg: Drawable) = DSL.foreground(arg)
	open fun foregroundGravity(arg: Int) = DSL.foregroundGravity(arg)
	open fun measureAllChildren(arg: Boolean) = DSL.measureAllChildren(arg)
}
open class DSLAppWidgetHostView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLAppWidgetHostView<T>.() -> Unit) : this() { r() }
}
open class DSLCalendarView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLCalendarView<T>.() -> Unit) : this() { r() }
	open fun date(arg: Long) = DSL.date(arg)
	open fun firstDayOfWeek(arg: Int) = DSL.firstDayOfWeek(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun onDateChange(arg: android.widget.CalendarView.OnDateChangeListener) = DSL.onDateChange(arg)
	open fun showWeekNumber(arg: Boolean) = DSL.showWeekNumber(arg)
}
open class DSLDatePicker<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLDatePicker<T>.() -> Unit) : this() { r() }
	open fun calendarViewShown(arg: Boolean) = DSL.calendarViewShown(arg)
	open fun maxDate(arg: Long) = DSL.maxDate(arg)
	open fun minDate(arg: Long) = DSL.minDate(arg)
	open fun spinnersShown(arg: Boolean) = DSL.spinnersShown(arg)
}
open class DSLGestureOverlayView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLGestureOverlayView<T>.() -> Unit) : this() { r() }
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
	constructor(r: DSLHorizontalScrollView<T>.() -> Unit) : this() { r() }
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}
open class DSLMediaController<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLMediaController<T>.() -> Unit) : this() { r() }
	open fun anchorView(arg: View) = DSL.anchorView(arg)
	open fun mediaPlayer(arg: android.widget.MediaController.MediaPlayerControl) = DSL.mediaPlayer(arg)
}
open class DSLScrollView<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLScrollView<T>.() -> Unit) : this() { r() }
	open fun fillViewport(arg: Boolean) = DSL.fillViewport(arg)
	open fun smoothScrollingEnabled(arg: Boolean) = DSL.smoothScrollingEnabled(arg)
}
open class DSLTabHost<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLTabHost<T>.() -> Unit) : this() { r() }
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun currentTabByTag(arg: String) = DSL.currentTabByTag(arg)
	open fun onTabChanged(arg: android.widget.TabHost.OnTabChangeListener) = DSL.onTabChanged(arg)
	open fun up(arg: LocalActivityManager) = DSL.up(arg)
}
open class DSLTimePicker<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLTimePicker<T>.() -> Unit) : this() { r() }
	open fun currentHour(arg: Int) = DSL.currentHour(arg)
	open fun currentMinute(arg: Int) = DSL.currentMinute(arg)
	open fun is24HourView(arg: Boolean) = DSL.is24HourView(arg)
	open fun onTimeChanged(arg: android.widget.TimePicker.OnTimeChangedListener) = DSL.onTimeChanged(arg)
}
open class DSLViewAnimator<T : ViewGroup.LayoutParams>() : DSLFrameLayout<T>() {
	constructor(r: DSLViewAnimator<T>.() -> Unit) : this() { r() }
	open fun animateFirstView(arg: Boolean) = DSL.animateFirstView(arg)
	open fun displayedChild(arg: Int) = DSL.displayedChild(arg)
	open fun inAnimation(arg: Animation) = DSL.inAnimation(arg)
	open fun outAnimation(arg: Animation) = DSL.outAnimation(arg)
}
open class DSLViewFlipper<T : ViewGroup.LayoutParams>() : DSLViewAnimator<T>() {
	constructor(r: DSLViewFlipper<T>.() -> Unit) : this() { r() }
	open fun autoStart(arg: Boolean) = DSL.autoStart(arg)
	open fun flipInterval(arg: Int) = DSL.flipInterval(arg)
}
open class DSLViewSwitcher<T : ViewGroup.LayoutParams>() : DSLViewAnimator<T>() {
	constructor(r: DSLViewSwitcher<T>.() -> Unit) : this() { r() }
	open fun factory(arg: android.widget.ViewSwitcher.ViewFactory) = DSL.factory(arg)
}
open class DSLImageSwitcher<T : ViewGroup.LayoutParams>() : DSLViewSwitcher<T>() {
	constructor(r: DSLImageSwitcher<T>.() -> Unit) : this() { r() }
	open fun imageDrawable(arg: Drawable) = DSL.imageDrawable(arg)
	open fun imageResource(arg: Int) = DSL.imageResource(arg)
	open fun imageURI(arg: Uri) = DSL.imageURI(arg)
}
open class DSLTextSwitcher<T : ViewGroup.LayoutParams>() : DSLViewSwitcher<T>() {
	constructor(r: DSLTextSwitcher<T>.() -> Unit) : this() { r() }
	open fun currentText(arg: CharSequence) = DSL.currentText(arg)
}
open class DSLGridLayout<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLGridLayout<T>.() -> Unit) : this() { r() }
	open fun alignmentMode(arg: Int) = DSL.alignmentMode(arg)
	open fun columnCount(arg: Int) = DSL.columnCount(arg)
	open fun columnOrderPreserved(arg: Boolean) = DSL.columnOrderPreserved(arg)
	open fun orientation(arg: Int) = DSL.orientation(arg)
	open fun rowCount(arg: Int) = DSL.rowCount(arg)
	open fun rowOrderPreserved(arg: Boolean) = DSL.rowOrderPreserved(arg)
	open fun useDefaultMargins(arg: Boolean) = DSL.useDefaultMargins(arg)
}
open class DSLLinearLayout<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLLinearLayout<T>.() -> Unit) : this() { r() }
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
open class DSLNumberPicker<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLNumberPicker<T>.() -> Unit) : this() { r() }
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
open class DSLRadioGroup<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLRadioGroup<T>.() -> Unit) : this() { r() }
	open fun onCheckedChange(arg: android.widget.RadioGroup.OnCheckedChangeListener) = DSL.onCheckedChange(arg)
}
open class DSLSearchView<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLSearchView<T>.() -> Unit) : this() { r() }
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
open class DSLTableLayout<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLTableLayout<T>.() -> Unit) : this() { r() }
	open fun shrinkAllColumns(arg: Boolean) = DSL.shrinkAllColumns(arg)
	open fun stretchAllColumns(arg: Boolean) = DSL.stretchAllColumns(arg)
}
open class DSLTableRow<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLTableRow<T>.() -> Unit) : this() { r() }
}
open class DSLTabWidget<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLTabWidget<T>.() -> Unit) : this() { r() }
	open fun currentTab(arg: Int) = DSL.currentTab(arg)
	open fun dividerDrawable(arg: Int) = DSL.dividerDrawable(arg)
	open fun leftStripDrawable(arg: Drawable) = DSL.leftStripDrawable(arg)
	open fun leftStripDrawable(arg: Int) = DSL.leftStripDrawable(arg)
	open fun rightStripDrawable(arg: Drawable) = DSL.rightStripDrawable(arg)
	open fun rightStripDrawable(arg: Int) = DSL.rightStripDrawable(arg)
	open fun stripEnabled(arg: Boolean) = DSL.stripEnabled(arg)
}
open class DSLZoomControls<T : ViewGroup.LayoutParams>() : DSLLinearLayout<T>() {
	constructor(r: DSLZoomControls<T>.() -> Unit) : this() { r() }
	open fun isZoomInEnabled(arg: Boolean) = DSL.isZoomInEnabled(arg)
	open fun isZoomOutEnabled(arg: Boolean) = DSL.isZoomOutEnabled(arg)
	open fun onZoomInClick(arg: View.OnClickListener) = DSL.onZoomInClick(arg)
	open fun onZoomOutClick(arg: View.OnClickListener) = DSL.onZoomOutClick(arg)
	open fun zoomSpeed(arg: Long) = DSL.zoomSpeed(arg)
}
open class DSLRelativeLayout<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLRelativeLayout<T>.() -> Unit) : this() { r() }
	open fun gravity(arg: Int) = DSL.gravity(arg)
	open fun horizontalGravity(arg: Int) = DSL.horizontalGravity(arg)
	open fun ignoreGravity(arg: Int) = DSL.ignoreGravity(arg)
	open fun verticalGravity(arg: Int) = DSL.verticalGravity(arg)
}
open class DSLDialerFilter<T : ViewGroup.LayoutParams>() : DSLRelativeLayout<T>() {
	constructor(r: DSLDialerFilter<T>.() -> Unit) : this() { r() }
	open fun digitsWatcher(arg: TextWatcher) = DSL.digitsWatcher(arg)
	open fun filterWatcher(arg: TextWatcher) = DSL.filterWatcher(arg)
	open fun lettersWatcher(arg: TextWatcher) = DSL.lettersWatcher(arg)
	open fun mode(arg: Int) = DSL.mode(arg)
}
open class DSLTwoLineListItem<T : ViewGroup.LayoutParams>() : DSLRelativeLayout<T>() {
	constructor(r: DSLTwoLineListItem<T>.() -> Unit) : this() { r() }
}
open class DSLSlidingDrawer<T : ViewGroup.LayoutParams>() : DSLViewGroup<T>() {
	constructor(r: DSLSlidingDrawer<T>.() -> Unit) : this() { r() }
	open fun onDrawerClose(arg: android.widget.SlidingDrawer.OnDrawerCloseListener) = DSL.onDrawerClose(arg)
	open fun onDrawerOpen(arg: android.widget.SlidingDrawer.OnDrawerOpenListener) = DSL.onDrawerOpen(arg)
	open fun onDrawerScroll(arg: android.widget.SlidingDrawer.OnDrawerScrollListener) = DSL.onDrawerScroll(arg)
}
open class DSLViewStub<T : ViewGroup.LayoutParams>() : DSLView<T>() {
	constructor(r: DSLViewStub<T>.() -> Unit) : this() { r() }
	open fun inflatedId(arg: Int) = DSL.inflatedId(arg)
	open fun layoutResource(arg: Int) = DSL.layoutResource(arg)
	open fun onInflate(arg: android.view.ViewStub.OnInflateListener) = DSL.onInflate(arg)
}