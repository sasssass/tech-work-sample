package ir.sass.base_ui.utils

import android.content.Context
import android.widget.Toast

/*
extension function for showing toasts
*/

fun Context.toast(msg : String){
    Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
}