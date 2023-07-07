package com.equadriga.service;

import java.util.List;

import com.equadriga.entity.Projects;

public interface ProjectsService {

	List<Projects> findAll();
	
	Projects findById(Long id) throws Exception;
	
	Long save(Projects role) throws Exception;

	Long update(Long id, Projects role) throws Exception;
	
	void deleteById(Long id);
	
}
