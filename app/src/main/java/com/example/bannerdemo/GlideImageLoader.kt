package com.example.bannerdemo

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.youth.banner.loader.ImageLoader

class GlideImageLoader : ImageLoader() {

    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
        Glide.with(context)
//            .let { if (path is Int) it.load(path) else if (path is String) it.load(path) else it.load(path) }
            .load(path)
            .thumbnail(0.1f)
            //.diskCacheStrategy(DiskCacheStrategy.NONE)
            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
            //.skipMemoryCache(true)
            .placeholder(R.drawable.imag_loading)
            .fitCenter()
            .error(R.drawable.image_error)
            .into(imageView)
    }

}