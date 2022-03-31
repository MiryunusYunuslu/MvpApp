package com.example.domain.usecase

import com.example.domain.repository.NewsRepository
import retrofit2.Response
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(private val repository: NewsRepository) {

    suspend fun getAllNews() = repository.getNews()

}