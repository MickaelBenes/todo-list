/*
 * Copyright 2014 by Etat de Genève (Switzerland)
 * All rights reserved.
 *
 * Author: ELCA Informatique SA
 */
package com.github.mickaelbenes.todolist.service;

import com.github.mickaelbenes.todolist.persistence.PersistenceConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Spring configuration class for the service layer.
 */
@Configuration
@ComponentScan(basePackages = "com.github.mickaelbenes.todolist.service")
@Import({PersistenceConfiguration.class})
public class ServiceConfiguration
{
}
