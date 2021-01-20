package com.andrian.appserba.data.local

import android.content.Context
import android.content.SharedPreferences

class AuthPref(val context: Context) {
    private val sp: SharedPreferences by lazy {
        context.getSharedPreferences(
            AuthPref::class.java.name,
            Context.MODE_PRIVATE
        )
    }
}