package com.example.pokotsun.qiitaclient

/**
 * Created by pokotsun on 17/09/15.
 */

import android.content.Context
import android.support.annotation.IdRes
import android.view.View
import android.widget.Toast

// クラスViewに対する拡張関数

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}