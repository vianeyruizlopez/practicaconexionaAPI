package com.example.datapractica.DtoEntradaYSalida.data.Mappers

import com.example.datapractica.DtoEntradaYSalida.domain.Entities.Post
import com.example.datapractica.DtoEntradaYSalida.data.models.PostsDTO

fun PostsDTO.toDomain(): Post{
    return Post(
        id =this.id,
        title = this.title,
        body = this.body
    )

}