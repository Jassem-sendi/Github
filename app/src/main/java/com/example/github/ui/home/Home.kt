package com.example.github.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.github.ui.home.component.Header
import com.example.github.ui.home.component.HomeSearchBar
import com.example.github.ui.home.component.ProfileCard
import com.example.github.ui.theme.GithubTheme


@Composable
fun Home(homeViewModel: HomeViewModel = viewModel()) {
    val state by homeViewModel.state.collectAsState()
    GithubTheme(darkTheme = state.theme) {
        Box(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .safeDrawingPadding()
        ) {
            LazyColumn {
                item {
                    Header(theme = state.theme, toggleTheme = { homeViewModel.updateTheme(it) })
                }
                item {
                    HomeSearchBar(
                        userName = state.userName ,
                        onUserNameChange = { homeViewModel.updateUserName(it) } ,
                    )
                }
                item {
                    Text(text = state.error ?: "")
                    if (state.user != null) {
                        ProfileCard()
                    }
                }
            }
        }
    }
}