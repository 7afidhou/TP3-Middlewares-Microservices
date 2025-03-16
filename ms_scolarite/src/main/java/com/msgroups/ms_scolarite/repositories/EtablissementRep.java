package com.msgroups.ms_scolarite.repositories;

import com.msgroups.ms_scolarite.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface EtablissementRep extends JpaRepository<Etablissement,Long> {
}