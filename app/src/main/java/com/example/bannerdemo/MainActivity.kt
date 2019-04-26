package com.example.bannerdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mBasePath = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPath()
        initBanner()
    }


    private fun initPath() {
        mBasePath = Environment.getExternalStorageDirectory().absolutePath + "/imageDemo/"
        Log.e("BannerLog", "basePath: $mBasePath")
    }

    private fun initBanner() {
        mBanner.setImageLoader(GlideImageLoader())
            .setOffscreenPageLimit(8)
            .setImages(
                arrayListOf(
                    mBasePath + "image1.jpg", mBasePath + "image2.jpg", mBasePath + "image3.jpg", mBasePath + "image4.jpg",
                    mBasePath + "image5.jpg", mBasePath + "image6.jpg", mBasePath + "image7.jpg", mBasePath + "image8.jpg",
                    mBasePath + "image10.jpg",mBasePath + "image1.jpg", mBasePath + "image2.jpg", mBasePath + "image3.jpg", mBasePath + "image4.jpg",
                    mBasePath + "image5.jpg", mBasePath + "image6.jpg", mBasePath + "image7.jpg", mBasePath + "image8.jpg",
                    mBasePath + "image10.jpg"
                )
            )
            .isAutoPlay(true)
            .start()
    }
}
