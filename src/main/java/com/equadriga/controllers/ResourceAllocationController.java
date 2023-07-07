package com.equadriga.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equadriga.request.ResourceAllocationRequest;
import com.equadriga.service.ResourceAllocationService;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@AllArgsConstructor
@RequestMapping("/api/resourceAllocation")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResourceAllocationController {

	ResourceAllocationService service;
	
	@GetMapping
	public ResponseEntity<Object> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) throws Exception {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("/findByEmployee/{empId}")
	public ResponseEntity<Object> findByEmployee(@PathVariable Long empId) throws Exception {
		return ResponseEntity.ok(service.findByEmployee(empId));
	}
	
	@PostMapping
	public ResponseEntity<Object> save(@RequestBody ResourceAllocationRequest request)  throws Exception  {
		return new ResponseEntity<>(service.save(request), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody ResourceAllocationRequest request)  throws Exception  {
		return ResponseEntity.ok(service.update(id, request));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.ok("Successful");
	}
	
}
