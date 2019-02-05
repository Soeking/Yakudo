package com.example.android.camera2basic

import android.support.v4.app.FragmentActivity
import android.support.v4.content.ContextCompat
import android.widget.Toast

fun FragmentActivity.showToast(text: String) {
    runOnUiThread { Toast.makeText(this, text, Toast.LENGTH_SHORT).show() }
}
