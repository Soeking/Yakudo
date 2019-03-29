package com.example.android.camera2basic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.opencv.android.OpenCVLoader
import java.io.File

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
                .replace(R.id.container, Camera2BasicFragment.newInstance())
                .commit()

        OpenCVLoader.initDebug()

        val dir = File("/storage/emulated/0/DCIM/Yakudo/")
        if (!dir.exists()){
            dir.mkdir()
        }
    }
}
