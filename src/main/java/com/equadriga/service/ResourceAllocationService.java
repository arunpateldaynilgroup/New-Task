package com.equadriga.service;

import java.util.List;

import com.equadriga.entity.ResourceAllocation;
import com.equadriga.request.ResourceAllocationRequest;

public interface ResourceAllocationService {

	List<ResourceAllocation> findAll();
	
	ResourceAllocation findById(Long id) throws Exception;
	
	Long save(ResourceAllocationRequest request) throws Exception;

	Long update(Long id, ResourceAllocationRequest request) throws Exception;
	
	void deleteById(Long id);

	List<ResourceAllocation> findByEmployee(Long empId);
	
}
