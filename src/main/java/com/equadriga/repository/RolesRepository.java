package com.equadriga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equadriga.entity.Roles;

@Repository
public interface RolesRepository  extends JpaRepository<Roles, Long>{

}
