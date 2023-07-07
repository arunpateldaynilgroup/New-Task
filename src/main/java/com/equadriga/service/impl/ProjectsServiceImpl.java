package com.equadriga.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.equadriga.entity.Projects;
import com.equadriga.repository.ProjectsRepository;
import com.equadriga.service.ProjectsService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectsServiceImpl implements ProjectsService {
	
	ProjectsRepository repository;

	@Override
	public List<Projects> findAll() {
		return repository.findAll();
	}

	@Override
	public Projects findById(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new Exception("Not Found"));
	}

	@Override
	public Long save(Projects role) throws Exception {
		return repository.save(role).getId();
	}

	@Override
	public Long update(Long id, Projects req) throws Exception {
		Projects projects = findById(id);
		projects.setName(req.getName());
		return repository.save(projects).getId();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	

}
