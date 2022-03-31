package com.example.data.repository

import com.example.data.api.ApiService
import com.example.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val api: ApiService) : NewsRepository {
    override suspend fun getNews() = api.getMovies()
}