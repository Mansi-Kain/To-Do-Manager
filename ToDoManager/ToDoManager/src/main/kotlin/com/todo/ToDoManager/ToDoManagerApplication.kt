package com.todo.ToDoManager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToDoManagerApplication

fun main(args: Array<String>) {
	runApplication<ToDoManagerApplication>(*args)
}
