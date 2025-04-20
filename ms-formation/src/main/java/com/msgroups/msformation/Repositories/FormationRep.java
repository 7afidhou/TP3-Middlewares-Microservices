package com.msgroups.msformation.Repositories;
import com.msgroups.msformation.Entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface FormationRep extends JpaRepository<Formation, Long> {

}