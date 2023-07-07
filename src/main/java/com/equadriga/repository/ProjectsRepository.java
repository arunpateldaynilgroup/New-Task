package com.equadriga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equadriga.entity.Projects;

@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Long>{

}
