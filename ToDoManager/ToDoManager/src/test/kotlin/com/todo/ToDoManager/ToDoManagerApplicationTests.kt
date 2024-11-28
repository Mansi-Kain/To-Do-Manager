package com.todo.ToDoManager

import com.todo.ToDoManager.entities.Todo
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ToDoManagerApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun kotlinTest(){
		val todo= Todo("124","This is Title","this is content ",true);
		println(todo)
	}

}
