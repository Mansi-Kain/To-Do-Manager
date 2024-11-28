package com.todo.ToDoManager.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="todos")
data class Todo(
    @Id
    var id:String,
    var title:String,
    var content:String,
    var complete:Boolean,
){
    constructor():this("","","",false){}
}