package com.spacelabs.todobackend;

import com.spacelabs.todobackend.dto.Task;
import com.spacelabs.todobackend.dto.Todo;
import com.spacelabs.todobackend.repository.TaskRepository;
import com.spacelabs.todobackend.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TodoBackendApplication implements CommandLineRunner {

    @Inject
    private TodoRepository todoRepository;
    @Inject
    private TaskRepository taskRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoBackendApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        //  add todos
        //  Note : Creating separate variables just to make code more readable.
        Todo todoWork = new Todo (1, null, "Work", new Date().toString());
        todoRepository.save(todoWork);
        Todo todoPersonal = new Todo (2, null, "Personal", new Date().toString());
        todoRepository.save(todoPersonal);
        Todo todoArchive = new Todo (3, null, "Archive", new Date().toString());
        todoRepository.save(todoArchive);

        //  add tasks in todos
        //  make a list of work tasks
        List<Task> listWorkTasks = new ArrayList<>();
        Task task = new Task(1, "Create icons", false, todoWork.getId());
        listWorkTasks.add(task);
        task = new Task(2, "Client meeting", true, todoWork.getId());
        listWorkTasks.add(task);
        taskRepository.save(listWorkTasks);

        //  make a list of personal tasks
        List<Task> listPersonalTasks = new ArrayList<>();
        task = new Task(3, "Buy gift", false, todoPersonal.getId());
        listPersonalTasks.add(task);
        task = new Task(4, "Collect documents", false, todoPersonal.getId());
        listPersonalTasks.add(task);
        taskRepository.save(listPersonalTasks);


    }


}
