package com.example.data.api

import com.example.domain.model.Response
import retrofit2.http.GET

interface ApiService {
    @GET("everything?q=tesla&from=2022-02-28&sortBy=publishedAt&apiKey=02a50775a2fc445bb056fae4a9950bd2")
    suspend fun getMovies(
    ): retrofit2.Response<Response>

}