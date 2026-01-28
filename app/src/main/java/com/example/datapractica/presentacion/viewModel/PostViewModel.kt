package com.example.datapractica.presentacion.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datapractica.data.Post
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    private val _posts = MutableStateFlow<List<Post>>(value = emptyList())//para las listas se debe inicializar con emptyList()
    val posts: StateFlow<List<Post>> = _posts
    fun getPosts(){
        viewModelScope.launch {
            val respuestaApi = RetrofitClient.apiService.getAllPosts()
            _posts.value = respuestaApi
        }
    }

}