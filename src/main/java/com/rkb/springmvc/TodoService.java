package com.rkb.springmvc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rkb.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", false, LocalDate.now()));
		todos.add(new Todo(2, "in28Minutes", "Learn Struts",false, LocalDate.now()));
		todos.add(new Todo(3, "in28Minutes", "Learn Hibernate",false,  LocalDate.now()));
	}

	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

	public void addTodo(String name, String desc, LocalDate targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, isDone,targetDate ));
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}

}
