package com.todo.ToDoManager.Controller

import com.todo.ToDoManager.Service.ToDoService
import com.todo.ToDoManager.entities.Todo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("todo")
class TodoController(val todoService:ToDoService) {

    //create
    @PostMapping
    fun create(@RequestBody todo: Todo):Todo=todoService.createTodo(todo)

    @PutMapping("/{todoId}")
    fun update(@PathVariable todoId:String ,@RequestBody todo:Todo)=todoService.updateTodo(todoId,todo)

    @GetMapping
    fun getAll()=todoService.getAllTodos()

    @GetMapping("/{todoId}")
    fun getTodo(@PathVariable todoId:String)=todoService.getTodo(todoId)

    @DeleteMapping("/{todoId}")
    fun delete(@PathVariable todoId:String)=todoService.deleteTodo(todoId)
}