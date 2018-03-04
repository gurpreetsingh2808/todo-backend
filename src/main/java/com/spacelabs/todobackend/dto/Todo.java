package com.spacelabs.todobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gurpreet on 26-02-2018.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {

    @Id
    private int id;
    private String title;
//    @OneToOne
//    private Task task;
//    private List<Task> tasks;
    private String time;


//    public Todo(int id, String title, String time) {
//        this.id = id;
//        this.title = title;
//        this.task = new Task(taskId, id, "desc",false);
//        this.time = time;
//    }
}
