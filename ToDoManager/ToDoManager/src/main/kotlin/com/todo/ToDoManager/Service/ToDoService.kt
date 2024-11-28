package com.todo.ToDoManager.Service;

import com.todo.ToDoManager.entities.Todo;

interface ToDoService {
    fun createTodo(todo: Todo):Todo
    fun updateTodo(todoId: String , todo: Todo):Todo
    fun deleteTodo(todoId: String)
    fun getAllTodos():List<Todo>
    fun getTodo(todoId: String):Todo
}
