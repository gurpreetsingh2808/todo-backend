package com.spacelabs.todobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
    @ManyToMany
    @JoinColumn(name = "id", referencedColumnName = "todoId")
    private List<Task> tasks;
    private String title;
    private String time;

}
