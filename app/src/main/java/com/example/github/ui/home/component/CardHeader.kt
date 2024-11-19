package com.example.github.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CardHeader(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically ,
        horizontalArrangement = Arrangement.SpaceEvenly ,
        modifier = modifier
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        AsyncImage(
            model = "https://i.pinimg.com/736x/69/a4/d9/69a4d9afcec8aefef5e1430f5587c273.jpg" ,
            contentDescription = "Profile Picture" ,
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .size(100.dp)
        )
        Column {
            Text(
                text = "User Name" ,
                modifier = Modifier.padding(bottom = 5.dp) ,
                style = MaterialTheme.typography.titleLarge

                )
            Text(
                text = "@Username" ,
                modifier = Modifier.padding(bottom = 5.dp) ,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.scrim
            )
            Text(
                text = "Joined at xx/xx/xxxx" ,
                modifier = Modifier.padding(bottom = 5.dp) ,
                style = MaterialTheme.typography.titleSmall
            )

        }
    }
}