package com.spacelabs.todobackend.service;

import com.spacelabs.todobackend.dto.Task;
import com.spacelabs.todobackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gurpreet on 28-02-2018.
 */

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(int id) {
        List<Task> listTasks = new ArrayList<>();
        taskRepository.findByTodoId(id).forEach(listTasks::add);
        return listTasks;
    }

    public Task getTask(int id) {
        return taskRepository.findOne(id);
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    public void deleteTask(int id) {
        taskRepository.delete(id);
    }
}
