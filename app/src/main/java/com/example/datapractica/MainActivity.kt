package com.example.datapractica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.datapractica.DtoEntradaYSalida.presentacion.screens.VerInformacion
import com.example.datapractica.DtoEntradaYSalida.presentacion.ViewModel.PostViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = PostViewModel()
        setContent {
           val listaDePost by viewModel.posts.collectAsState()
            LaunchedEffect(Unit) {
                viewModel.getPosts()
            }
            VerInformacion(posts = listaDePost)
        }
    }
}