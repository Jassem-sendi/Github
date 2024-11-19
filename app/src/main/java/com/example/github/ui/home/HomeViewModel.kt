package com.example.github.ui.home

import androidx.lifecycle.ViewModel
import com.example.domain.GitHubUser
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class HomeViewModel ():ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()
    fun updateUserName(userName: String) {
        _state.value = _state.value.copy(userName = userName)
    }
    fun updateTheme (theme: Boolean){
        _state.value = _state.value.copy(theme = theme)
    }


}
data class HomeState(
    val userName: String = "",
    val user: GitHubUser? = null,
    val theme : Boolean = false,
    val error: String? = null,

)
