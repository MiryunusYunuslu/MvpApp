package com.example.domain.repository

import com.example.domain.model.Response

interface NewsRepository {
    suspend fun getNews(): retrofit2.Response<Response>
}