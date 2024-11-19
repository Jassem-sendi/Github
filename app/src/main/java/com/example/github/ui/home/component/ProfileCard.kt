package com.example.github.ui.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.github.ui.theme.GithubTheme

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary) ,
        modifier = modifier
            .padding(20.dp)
            .fillMaxWidth()
    ) {
        CardHeader()
        Spacer(modifier = Modifier.height(5.dp))
        CardBio()
        CardInfos()
        Column (modifier = Modifier.padding(10.dp)) {
            repeat(4) {
                CardAbout(
                    icon = Icons.Default.LocationOn ,
                    text = "Germany" ,
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
    }

}

@Preview(device = "spec:width=411dp,height=891dp" , name = "portrait" , showSystemUi = true)
@Preview(
    device = "spec:width=411dp,height=891dp,orientation=landscape" ,
    name = "landscape" ,
    showSystemUi = true
)
@Composable
fun ProfileCardPreview(modifier: Modifier = Modifier) {
    GithubTheme(darkTheme = false) {
        ProfileCard()
    }
}