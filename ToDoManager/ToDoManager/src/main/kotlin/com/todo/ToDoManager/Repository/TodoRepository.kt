package com.todo.ToDoManager.Repository

import com.todo.ToDoManager.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository:JpaRepository<Todo,String> {
}