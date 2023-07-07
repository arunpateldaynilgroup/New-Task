package com.equadriga.service;

import java.util.List;

import com.equadriga.entity.Roles;

public interface RolesService {

	List<Roles> findAll();
	
	Roles findById(Long id) throws Exception;
	
	Long save(Roles role) throws Exception;

	Long update(Long id, Roles role) throws Exception;
	
	void deleteById(Long id);
	
}
