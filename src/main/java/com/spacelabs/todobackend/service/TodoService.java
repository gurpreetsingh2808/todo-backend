package com.spacelabs.todobackend.service;

import com.spacelabs.todobackend.repository.TodoRepository;
import com.spacelabs.todobackend.dto.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gurpreet on 27-02-2018.
 */

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        List<Todo> listTodos = new ArrayList<>();
        todoRepository.findAll().forEach(listTodos::add);
        return listTodos;
    }

    public Todo getTodo(int id) {
        return todoRepository.findOne(id);
    }

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void updateTodo(int id, Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(int id) {
        todoRepository.delete(id);
    }
}
