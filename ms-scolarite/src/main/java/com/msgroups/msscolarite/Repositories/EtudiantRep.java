package com.msgroups.msscolarite.Repositories;
import com.msgroups.msscolarite.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface EtudiantRep extends JpaRepository<Etudiant, Long> { }