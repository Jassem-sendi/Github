package com.example.github.ui.home.component



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.github.ui.theme.GithubTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeSearchBar(
    userName:String="",
    onUserNameChange:(String)->Unit={},
    modifier: Modifier=Modifier
){
    var active by rememberSaveable { mutableStateOf(false) }
    SearchBar(
        query = userName,
        onQueryChange = {
            onUserNameChange (it)
        } ,
        onSearch = {
            active = false

        } ,
        active = active ,
        onActiveChange = {
            active = it
        } ,
        modifier=modifier
            .fillMaxWidth()
            .heightIn(max= 90.dp),
        leadingIcon = { Icon(
            imageVector = Icons.Default.Search ,
            contentDescription = "Search Bar",
            tint = MaterialTheme.colorScheme.primary
        ) },
        placeholder = { Text("Search Github username ...") },
        trailingIcon = {
            if (!active){
                Button(onClick = {}, shape = RoundedCornerShape(40.dp)) {
                    Text("Search")
                }
            }
            else{
                Icon(
                    imageVector = Icons.Default.Close ,
                    contentDescription = "Close",
                    modifier=Modifier
                        .padding(end=10.dp)
                        .clickable {
                            active = false
                            onUserNameChange ("")
                        }
                )
            }
        }
    ){}
}



@Preview(device = "spec:width=411dp,height=891dp" , name = "portrait" , showSystemUi = true ,)
@Preview(device = "spec:width=411dp,height=891dp,orientation=landscape" , name = "landscape",showSystemUi=true)
@Composable
fun SearchBarPreview(modifier: Modifier=Modifier){
    GithubTheme (darkTheme = true) {
        HomeSearchBar()
    }
}