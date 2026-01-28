package com.example.datapractica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.datapractica.presentacion.screens.VerInformacion
import com.example.datapractica.presentacion.viewModel.PostViewModel
import com.example.datapractica.ui.theme.DatapracticaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {rm -rf .git
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