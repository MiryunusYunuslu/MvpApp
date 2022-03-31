package com.example.data.util

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.data.model.ArticleResponse
import com.example.domain.model.Article

fun ImageView.setImageWithGlide(url: String?) =
    Glide.with(context).load(url).placeholder(this.drawable).into(this)


fun View.show() {
    this.visibility = View.VISIBLE
}


fun View.hide() {
    this.visibility = View.INVISIBLE
}

fun ArticleResponse.mapToResponse() = Article(title, description, urlToImage)