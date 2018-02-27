package com.spacelabs.todobackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Gurpreet on 26-02-2018.
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    private int id;
    private String title;
    private String description;
    private String time;
    private boolean completed;
}
