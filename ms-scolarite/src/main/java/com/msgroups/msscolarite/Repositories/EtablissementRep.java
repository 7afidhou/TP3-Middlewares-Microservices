package com.msgroups.msscolarite.Repositories;

import com.msgroups.msscolarite.Entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface EtablissementRep extends JpaRepository<Etablissement, Long> { }