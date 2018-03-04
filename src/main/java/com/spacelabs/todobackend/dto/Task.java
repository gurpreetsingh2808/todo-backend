package com.spacelabs.todobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Gurpreet on 01-03-2018.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Todo todo;
    private String description;
    private boolean completed;

    public Task(int id, String description, boolean completed, int todoId) {
        this.id = id;
        this.todo = new Todo(todoId, "title", "time");
        this.description = description;
        this.completed = completed;
    }
}
