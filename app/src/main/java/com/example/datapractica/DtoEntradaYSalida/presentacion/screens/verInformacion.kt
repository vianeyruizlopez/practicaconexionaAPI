package com.example.datapractica.DtoEntradaYSalida.presentacion.screens

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.datapractica.DtoEntradaYSalida.data.models.PostsDTO
import com.example.datapractica.DtoEntradaYSalida.presentacion.componente.PostCard

@Composable
fun VerInformacion(posts: List<PostsDTO>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(posts) { post ->//propidedad de lizi colums
            PostCard(post)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun VerInformacionPreview(){
    VerInformacion(posts = listOf())
}