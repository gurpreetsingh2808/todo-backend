package com.spacelabs.todobackend.controller;

import com.spacelabs.todobackend.service.TodoService;
import com.spacelabs.todobackend.dto.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gurpreet on 26-02-2018.
 */
@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/todos")
    public List<Todo> getAllTodo() {
        return todoService.getAllTodos();
    }

    @RequestMapping("/todos/{id}")
    public Todo getTodo(@PathVariable int id) {
        return todoService.getTodo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addtodo")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updatetodo/{id}")
    public void updateTodo(@RequestBody Todo todo, @PathVariable int id) {
        todoService.updateTodo(id, todo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletetodo/{id}")
    public void deleteTodo(@PathVariable int id) {
        todoService.deleteTodo(id);
    }
}
