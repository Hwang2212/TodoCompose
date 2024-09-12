package com.andy.todocompose.services

import com.andy.todocompose.todo.TodoListResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit = Retrofit.Builder().baseUrl("https://dummyjson.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val todoService: ApiService = retrofit.create(ApiService::class.java)

interface ApiService {

    @GET("/todos")
    suspend fun getTodos(): TodoListResponse

}