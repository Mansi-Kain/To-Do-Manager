package com.todo.ToDoManager.Service.Impl

import com.todo.ToDoManager.Repository.TodoRepository
import com.todo.ToDoManager.Service.ToDoService
import com.todo.ToDoManager.entities.Todo
import org.springframework.stereotype.Service
import java.util.*

@Service
class ToDoServiceImpl(var todoRepository: TodoRepository):ToDoService {
    override fun createTodo(todo: Todo): Todo{
        todo.id= UUID.randomUUID().toString()
        return this.todoRepository.save(todo)
    }

    override fun updateTodo(todoId: String, todo: Todo): Todo {
       val oldTodo=todoRepository.findById(todoId).orElseThrow{RuntimeException("Todo not found")}
        oldTodo.title=todo.title
        oldTodo.content=todo.content
        val updatedTodo=todoRepository.save(oldTodo)
        return updatedTodo
    }

    override fun deleteTodo(todoId: String) {
        val oldTodo=todoRepository.findById(todoId).orElseThrow{RuntimeException("Todo not found")}
        this.todoRepository.delete(oldTodo)
    }

    override fun getAllTodos(): List<Todo> =todoRepository.findAll()

    override fun getTodo(todoId: String): Todo =todoRepository.findById(todoId).orElseThrow{RuntimeException("Todo not found")}

}