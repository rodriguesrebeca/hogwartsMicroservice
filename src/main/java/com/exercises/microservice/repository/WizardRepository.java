package com.exercises.microservice.repository;

import com.exercises.microservice.model.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, UUID> {
}
