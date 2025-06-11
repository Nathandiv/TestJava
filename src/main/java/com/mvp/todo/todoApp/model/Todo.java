package com.mvp.todo.todoApp.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "varchar", length = 100, updatable = false)
    Long id;
    @Column(nullable = false)
    String title;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    TodoStatus todoStatus;

    @CreationTimestamp
    @Column(updatable = false)
    Timestamp timestamp;
    @UpdateTimestamp
    Timestamp updatedTimestamp;


    public TodoStatus getTodoStatus() {
        return todoStatus;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTodoStatus(TodoStatus status) {
        this.todoStatus = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}