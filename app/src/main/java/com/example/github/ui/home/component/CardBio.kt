package com.example.github.ui.home.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardBio(modifier: Modifier = Modifier) {
    Text(
        text = "I post awesome Android stuff on my Instagram page @_philipplackner_ and on my YouTube channel Philipp Lackner.",
        modifier = modifier
            .padding(20.dp)
        ,
        style = MaterialTheme.typography.bodyMedium,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        fontSize = 17.sp
    )
}