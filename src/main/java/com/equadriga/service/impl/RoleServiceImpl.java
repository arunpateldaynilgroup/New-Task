package com.equadriga.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.equadriga.entity.Roles;
import com.equadriga.repository.RolesRepository;
import com.equadriga.service.RolesService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleServiceImpl implements RolesService {
	
	RolesRepository repository;

	@Override
	public List<Roles> findAll() {
		return repository.findAll();
	}

	@Override
	public Roles findById(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new Exception("Not Found"));
	}

	@Override
	public Long save(Roles role) throws Exception {
		return repository.save(role).getId();
	}

	@Override
	public Long update(Long id, Roles role) throws Exception {
		Roles roles = findById(id);
		roles.setRole(role.getRole());
		return repository.save(role).getId();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	

}
