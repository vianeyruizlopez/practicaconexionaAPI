package com.example.datapractica.DtoEntradaYSalida.data

import com.example.datapractica.DtoEntradaYSalida.data.models.PostsDTO
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getAllPosts(): List<PostsDTO>
}