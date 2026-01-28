package com.example.datapractica.data

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
private var myPost = Post(1, 1, "Título de ejemplo", "Cuerpo del post aquí")
