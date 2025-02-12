package ir.sass.base_ui.utils

import android.view.View
import androidx.databinding.BindingAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


/*
extension function for clicking in dataBinding
*/

@BindingAdapter("ext:click")
fun setClick(view: View, action: () -> Unit) {
    view.setOnClickListener {
        CoroutineScope(Dispatchers.Main).launch {
            it.isClickable = false
            action.invoke()
            delay(200)
            it.isClickable = true
        }
    }
}

/*
extension function for making a view disabled in dataBinding
*/

@BindingAdapter("ext:active")
fun active(view: View, active: Boolean) {
    if (active) {
        view.isEnabled = true
        view.alpha = 1f
    } else {
        view.isEnabled = false
        view.alpha = 0.7f
    }
}