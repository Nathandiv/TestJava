package com.mvp.todo.todoApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,columnDefinition = "varchar",length = 100,updatable = false)
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
    @UpdatedTimestamp;
    Timestamp updatedTimestamp;
}
