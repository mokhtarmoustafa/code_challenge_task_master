package com.cct.codechallengetask.util

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.cct.codechallengetask.R
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {

    if (!imageUrl.isNullOrEmpty()) {
        view.load(imageUrl) {
            listener(
                // pass two arguments
                onSuccess = { _, _ ->
                    crossfade(0)
                },
                onError = { request: ImageRequest, throwable: Throwable ->
                    request.error

                })
            // setup error image
            error(R.drawable.no_image)
        }
    }
}

@BindingAdapter("date")
fun bindDateFromString(textView: TextView, dateValue: String) {
    if (dateValue.isNotEmpty()) {
        val input = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val output = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

        var d: Date? = null
        try {
            d = input.parse("2018-02-02T06:54:57.744Z")
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        val formatted: String = output.format(d)
        textView.text = formatted
    }
}