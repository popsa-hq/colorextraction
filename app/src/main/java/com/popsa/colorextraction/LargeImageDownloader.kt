package com.popsa.colorextraction

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.core.graphics.scale
import okhttp3.OkHttpClient
import okhttp3.Request

class LargeImageDownloader {

    val okHttpClient = OkHttpClient()

    /**
     * The images from picsum are quite small so we are
     * scaling them here to give the impression of larger
     * images
     */
    fun downloadImage(imageUrl: String): Bitmap? {
        val request = Request.Builder()
            .url(imageUrl)
            .build()

        val response = okHttpClient.newCall(request).execute()
        if (response.isSuccessful) {
            val inputStream = response.body.byteStream()
            val bitmap = BitmapFactory.decodeStream(inputStream).let {
                it.scale((it.width * 10), (it.height * 10), false)
            }

            return bitmap
        } else {
            return null
        }
    }

}