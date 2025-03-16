package com.msgroups.ms_formation.repositories;

import com.msgroups.ms_formation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FormationRep extends JpaRepository<Formation,Long> {
}
