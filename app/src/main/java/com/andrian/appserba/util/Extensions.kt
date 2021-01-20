package com.andrian.appserba.util

import android.content.SharedPreferences

fun <T> SharedPreferences.getObject(key: String, defValue: T? = null): T? {
    val json = getString(key, null)
    val obj =
}