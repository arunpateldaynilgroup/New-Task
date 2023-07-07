package com.equadriga.service;

import java.util.List;

import com.equadriga.entity.Employees;

public interface EmployeesService {

	List<Employees> findAll();
	
	Employees findById(Long id) throws Exception;
	
	Long save(Employees role) throws Exception;

	Long update(Long id, Employees role) throws Exception;
	
	void deleteById(Long id);
	
}
