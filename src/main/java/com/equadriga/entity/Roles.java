package com.equadriga.entity;

import com.equadriga.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Enumerated(EnumType.STRING)
	Role role;
}
