package com.spacelabs.todobackend.repository;

import com.spacelabs.todobackend.dto.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gurpreet on 04-03-2018.
 */
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
