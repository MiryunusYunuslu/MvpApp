package com.example.mvpapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.domain.model.Article
import com.example.mvpapplication.adapter.MainAdapter
import com.example.mvpapplication.databinding.ActivityMainBinding
import com.example.mvpapplication.presenter.MoviePresenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), CountryView {
    @Inject
    lateinit var moviePresenter: MoviePresenter

    lateinit var binding: ActivityMainBinding

    lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        moviePresenter.setView(this)
        moviePresenter.getMovies()
    }

    override fun showMovies(moviesList: ArrayList<Article>) {
        adapter = MainAdapter(moviesList)
        binding.rvMain.adapter = adapter
    }

    override fun showProgressBar(filesLoaded: Boolean) {
        binding.pbMain.isVisible = !filesLoaded
    }

}