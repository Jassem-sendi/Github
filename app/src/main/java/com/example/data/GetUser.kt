package com.example.data


import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

suspend fun getUser(client: HttpClient = client() , userName: String): HttpResponse {
    return client.get("https://api.github.com/users/$userName")
}
