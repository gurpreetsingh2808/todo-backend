package com.spacelabs.todobackend.controller;

import com.spacelabs.todobackend.dto.Task;
import com.spacelabs.todobackend.dto.Todo;
import com.spacelabs.todobackend.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Gurpreet on 26-02-2018.
 */
@RestController
public class TaskController {

    @Inject
    private TaskService taskService;

    @RequestMapping("/api/todo/{id}/tasks")
    public List<Task> getAllTask(@PathVariable int id) {
        return taskService.getAllTasks(id);
    }

    @RequestMapping("/api/tasks/{id}")
    public Task getTask(@PathVariable int id) {
        return taskService.getTask(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/tasks/addtask/{todoId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpStatus addTask(@RequestBody Task task, @PathVariable int todoId) {
        try {
            task.setTodo(new Todo(todoId, "titlenew", "timenew"));
            taskService.addTask(task);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/tasks/updatetask/{todoId}")
    public HttpStatus updateTask(@RequestBody Task task, @PathVariable int todoId) {
        try {
            task.setTodo(new Todo(todoId, "", ""));
            taskService.updateTask(task);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/tasks/deletetask/{id}")
    public HttpStatus deleteTask(@PathVariable int id) {
        try {
            taskService.deleteTask(id);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
