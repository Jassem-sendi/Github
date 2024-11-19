package com.example.domain

import kotlinx.serialization.Serializable

@Serializable
class GitHubUser (
    val avatar_url: String ,
    val company: String ,
    val created_at: String ,
    val url : String ,
    val repos_url: String ,
    val followers: Int,
    val following: Int,
    val location: String ,
    val name: String ,
)
