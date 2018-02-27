package com.spacelabs.todobackend.service;

import com.spacelabs.todobackend.dto.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Gurpreet on 27-02-2018.
 */

@Service
public class TodoService {

    private List<Todo> listTodos = new ArrayList<>(Arrays.asList(
            new Todo(1, "Title", "Desc", "3:14", true),
                    new Todo(2, "Title", "Desc", "6:56", false),
                    new Todo(3, "Title", "Desc", "1:00", true)
            ));

    public List<Todo> getAllTodos() {
        return listTodos;
    }

    public Todo getTodo(int id) {
        return listTodos.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public void addTodo(Todo todo) {
        listTodos.add(todo);
    }

    public void updateTodo(int id, Todo todo) {
        for (Todo currentTodo : listTodos) {
            if(todo.getId() == currentTodo.getId()) {
                listTodos.set(id, todo);
                return;
            }
        }
    }

    public void deleteTodo(int id) {
        listTodos.removeIf(t -> t.getId() == id);
    }
}
