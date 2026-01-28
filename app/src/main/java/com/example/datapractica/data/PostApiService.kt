package com.example.datapractica.data

import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getAllPosts(): List<Post>
}