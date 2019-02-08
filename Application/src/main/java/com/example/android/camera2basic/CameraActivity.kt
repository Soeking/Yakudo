package com.example.android.camera2basic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import org.opencv.android.OpenCVLoader

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
                .replace(R.id.container, Camera2BasicFragment.newInstance())
                .commit()

        if (OpenCVLoader.initDebug()){
            Log.i("SUCCESS","OK")
        }
    }
}
