package com.github.mickaelbenes.todolist.rest;

import com.github.mickaelbenes.todolist.service.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ServiceConfiguration.class})
public class TodoListBackendApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TodoListBackendApplication.class, args);
    }
}
