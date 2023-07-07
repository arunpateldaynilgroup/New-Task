package com.equadriga.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.equadriga.entity.Employees;
import com.equadriga.repository.EmployeesRepository;
import com.equadriga.service.EmployeesService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeesServiceImpl implements EmployeesService {
	
	EmployeesRepository repository;

	@Override
	public List<Employees> findAll() {
		return repository.findAll();
	}

	@Override
	public Employees findById(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new Exception("Not Found"));
	}

	@Override
	public Long save(Employees req) throws Exception {
		return repository.save(req).getId();
	}

	@Override
	public Long update(Long id, Employees req) throws Exception {
		Employees emp = findById(id);
		
		emp.setName(req.getName());
		emp.setAge(req.getAge());
		emp.setGender(req.getGender());
		emp.setDoj(req.getDoj());
		
		return repository.save(emp).getId();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}
