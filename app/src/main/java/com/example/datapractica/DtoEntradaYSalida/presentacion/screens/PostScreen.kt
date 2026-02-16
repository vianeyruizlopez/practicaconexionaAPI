/*package com.example.datapractica.DtoEntradaYSalida.presentacion.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import com.example.datapractica.DtoEntradaYSalida.presentacion.ViewModel.PostViewModel

// Este código iría en screens/PostScreen.kt
@Composable
fun PostScreen(viewModel: PostViewModel = hiltViewModel()) {
    // 1. "Observamos" los datos del ViewModel
    val listaDePosts by viewModel.posts.collectAsState()

    // 2. Cargamos los datos al entrar a la pantalla
    LaunchedEffect(Unit) {
        viewModel.getPosts()
    }

    // 3. Se los pasamos a tu función "VerInformacion"
    VerInformacion(posts = listaDePosts)
}

 */