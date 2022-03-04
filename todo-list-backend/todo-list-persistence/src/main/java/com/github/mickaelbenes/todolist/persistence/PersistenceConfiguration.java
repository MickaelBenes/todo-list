package com.github.mickaelbenes.todolist.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring configuration class data persistence.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.github.mickaelbenes.todolist.persistence")
@EntityScan(basePackages = "com.github.mickaelbenes.todolist.persistence")
public class PersistenceConfiguration
{
}
