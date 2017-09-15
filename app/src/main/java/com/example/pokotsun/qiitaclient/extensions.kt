package com.example.pokotsun.qiitaclient

/**
 * Created by pokotsun on 17/09/15.
 */

import android.support.annotation.IdRes
import android.view.View

// クラスViewに対する拡張関数

fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}