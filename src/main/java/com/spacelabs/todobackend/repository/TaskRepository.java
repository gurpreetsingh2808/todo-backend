package com.spacelabs.todobackend.repository;

import com.spacelabs.todobackend.dto.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Gurpreet on 04-03-2018.
 */
public interface TaskRepository extends CrudRepository<Task, Integer> {

//    public List<Task> findByTaskId(int id);
}
