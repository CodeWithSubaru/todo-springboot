package com.app.todoapp.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // getter and setter
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", length = 255)
	private String title;
	
	@Column(name = "is_completed", columnDefinition = "TINYINT(1)")
	private boolean isCompleted;
}
