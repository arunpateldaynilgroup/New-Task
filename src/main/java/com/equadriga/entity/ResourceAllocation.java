package com.equadriga.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResourceAllocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@ManyToOne(targetEntity = Projects.class)
	@JoinColumn(name = "project_id")
	Projects projectId;

	@ManyToOne(targetEntity = Employees.class)
	@JoinColumn(name = "employee_id")
	Employees employeeId;
	
	LocalDate date;
	
	Integer hours;
	
	String task;

}
