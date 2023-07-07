package com.equadriga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equadriga.entity.ResourceAllocation;

@Repository
public interface ResourceAllocationRepository extends JpaRepository<ResourceAllocation, Long>{

	List<ResourceAllocation> findByEmployeeIdId(Long empId);

}
