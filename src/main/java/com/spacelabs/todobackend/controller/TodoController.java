package com.spacelabs.todobackend.controller;

import com.spacelabs.todobackend.dto.Task;
import com.spacelabs.todobackend.dto.Todo;
import com.spacelabs.todobackend.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gurpreet on 26-02-2018.
 */
@RestController
public class TodoController {

    @Inject
    private TodoService todoService;

    @RequestMapping("/api/todos")
    public List<Todo> getAllTodo() {
        return todoService.getAllTodos();
    }

    @RequestMapping("/api/todos/{id}")
    public Todo getTodo(@PathVariable int id) {
        return todoService.getTodo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/addtodo")
    public HttpStatus addTodo(@RequestBody Todo todo) {
        try {
            todoService.addTodo(todo);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/updatetodo/{id}")
    public HttpStatus updateTodo(@RequestBody Todo todo, @PathVariable int id) {
        try {
            todoService.updateTodo(id, todo);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/deletetodo/{id}")
    public HttpStatus deleteTodo(@PathVariable int id) {
        try {
            todoService.deleteTodo(id);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
