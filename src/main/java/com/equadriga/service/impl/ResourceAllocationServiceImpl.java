package com.equadriga.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.equadriga.entity.ResourceAllocation;
import com.equadriga.repository.ResourceAllocationRepository;
import com.equadriga.request.ResourceAllocationRequest;
import com.equadriga.service.EmployeesService;
import com.equadriga.service.ProjectsService;
import com.equadriga.service.ResourceAllocationService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResourceAllocationServiceImpl implements ResourceAllocationService {
	
	ResourceAllocationRepository repository;
	ProjectsService projectsService;
	EmployeesService employeesService;

	@Override
	public List<ResourceAllocation> findAll() {
		return repository.findAll();
	}

	@Override
	public ResourceAllocation findById(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new Exception("Not Found"));
	}

	@Override
	public Long save(ResourceAllocationRequest request) throws Exception {
		ResourceAllocation resourceAllocation = new ResourceAllocation();
		setResourceAllocationvalue(resourceAllocation, request);
		return repository.save(resourceAllocation).getId();
	}
	
	private void setResourceAllocationvalue(ResourceAllocation resourceAllocation, ResourceAllocationRequest request) throws Exception{
		resourceAllocation.setProjectId(projectsService.findById(request.getProjectId()));
		resourceAllocation.setEmployeeId(employeesService.findById(request.getEmployeeId()));
		resourceAllocation.setDate(request.getDate());
		resourceAllocation.setHours(request.getHours());
		resourceAllocation.setTask(request.getTask());
	}

	@Override
	public Long update(Long id, ResourceAllocationRequest request) throws Exception {
		ResourceAllocation resourceAllocation = findById(id);
		setResourceAllocationvalue(resourceAllocation, request);
		return repository.save(resourceAllocation).getId();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<ResourceAllocation> findByEmployee(Long empId) {
		return repository.findByEmployeeIdId(empId);
	}

}
