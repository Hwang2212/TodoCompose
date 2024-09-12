package com.andy.todocompose.todo

data class TodoModel(
    val id: Int,
    val todo: String,
    val completed: Boolean,
    val userId: Int,
)

data class TodoListResponse(
    val todos: List<TodoModel>,
)

class TodoRepository {

}