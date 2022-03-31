package com.example.mvpapplication.view

import com.example.domain.model.Article


interface CountryView {
    fun showMovies(moviesList:ArrayList<Article>)
    fun showProgressBar(filesLoaded:Boolean)

}