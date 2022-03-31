package com.example.mvpapplication.presenter

import com.example.domain.usecase.GetNewsUseCase
import com.example.mvpapplication.view.CountryView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


class MoviePresenter @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase

) {
    private lateinit var countryView: CountryView

    fun setView(view: CountryView) {
        countryView = view
        countryView.showProgressBar(false)

    }

    fun getMovies() {
        CoroutineScope(Dispatchers.Main).launch {

              val response = getNewsUseCase.getAllNews()
            if (response.isSuccessful && response.body() != null) {
                countryView.showMovies(response.body()!!.articles)
                countryView.showProgressBar(true)
            }


        }

    }

}