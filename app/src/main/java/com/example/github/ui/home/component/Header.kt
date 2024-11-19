package com.example.github.ui.home.component


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.github.R
import com.example.github.ui.theme.GithubTheme

@Composable
fun Header(
    theme: Boolean ,
    toggleTheme: (Boolean) -> Unit = {} ,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically ,
        horizontalArrangement = Arrangement.SpaceBetween ,
        modifier = modifier
            .fillMaxWidth()
            .safeDrawingPadding()
            .padding(20.dp)
    ) {
        AsyncImage(
            model = "https://cdn3.iconfinder.com/data/icons/social-media-2169/24/social_media_social_media_logo_github_2-512.png" ,
            contentDescription = "Github Logo" ,
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Github" ,
            style = MaterialTheme.typography.titleLarge ,
            color = MaterialTheme.colorScheme.onBackground ,

            )
        Row(
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = if (!theme) "Dark" else "Light" ,
                style = MaterialTheme.typography.titleSmall ,
                color = MaterialTheme.colorScheme.onBackground ,
            )
            Icon(
                painter = if (!theme) painterResource(R.drawable.dark_mode_24) else painterResource(R.drawable.baseline_light_mode_24) ,
                contentDescription = "Theme" ,
                modifier = Modifier
                    .size(24.dp)
                    .clickable {
                        toggleTheme (!theme)
                    } ,
                tint = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}


@Preview(device = "spec:width=411dp,height=891dp" , name = "portrait" , showSystemUi = true)
@Preview(
    device = "spec:width=411dp,height=891dp,orientation=landscape" ,
    name = "landscape" ,
    showSystemUi = true
)
@Composable
fun HeaderPreview(modifier: Modifier = Modifier) {
    GithubTheme(darkTheme = true) {
        Header(
            theme = TODO() ,
            modifier = TODO()
        )
    }
}