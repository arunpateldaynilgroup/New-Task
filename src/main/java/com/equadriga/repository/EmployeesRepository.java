package com.equadriga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equadriga.entity.Employees;

@Repository
public interface EmployeesRepository  extends JpaRepository<Employees, Long>{

}
