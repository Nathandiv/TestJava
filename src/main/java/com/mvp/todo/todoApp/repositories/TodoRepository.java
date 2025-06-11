package com.mvp.todo.todoApp.repositories;


import com.mvp.todo.todoApp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
