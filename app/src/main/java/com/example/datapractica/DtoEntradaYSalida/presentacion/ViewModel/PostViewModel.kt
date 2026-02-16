package com.example.datapractica.DtoEntradaYSalida.presentacion.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datapractica.DtoEntradaYSalida.data.models.PostsDTO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val _posts =
        MutableStateFlow<List<PostsDTO>>(value = emptyList())//para las listas se debe inicializar con emptyList()
    val posts: StateFlow<List<PostsDTO>> = _posts
    fun getPosts(){
        viewModelScope.launch {
            val respuestaApi = RetrofitClient.apiService.getAllPosts()
            _posts.value = respuestaApi
        }
    }

}