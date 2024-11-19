package com.example.github.ui.home.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CardAbout(
    icon: ImageVector ,
    text: String ,
    modifier: Modifier = Modifier
) {
    Row (modifier = modifier
        .fillMaxWidth()
        .padding(10.dp)
    ) {
        Icon(
            imageVector = icon ,
            contentDescription = null ,
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = text)
    }
}