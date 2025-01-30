package com.etms.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.etms.pojos.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	  Optional<Person> findByEmail(String email);
	  boolean existsByEmail(String email);
}
