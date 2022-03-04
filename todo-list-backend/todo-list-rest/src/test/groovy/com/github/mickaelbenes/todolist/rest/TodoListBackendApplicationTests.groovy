package com.github.mickaelbenes.todolist.rest

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import spock.lang.Specification

@SpringBootTest
@DirtiesContext
class TodoListBackendApplicationTest extends Specification
{
    def "Context loads with no profile"()
    {
        expect: "When we reach this point, context has been loaded"
        true
    }
}
