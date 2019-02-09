package com.example.android.camera2basic

import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.core.Rect
import org.opencv.imgcodecs.Imgcodecs
import org.opencv.imgproc.Imgproc

object de {
    /**
    @JvmStatic
    fun main(args: Array<String>) {


        System.loadLibrary(Core.NATIVE_LIBRARY_NAME)

        val im = Imgcodecs.imread("test.jpg")

        val roi = Rect(280, 60, 120, 100)

        val im2 = Mat(im, roi)

        Imgcodecs.imwrite("anime.png", im2)

        //Imgproc.resize(im,im,)
    }
    */
}
