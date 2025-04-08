package com.msgroups.ms_scolarite.api;

import com.msgroups.ms_scolarite.entities.Etudiant;
import com.msgroups.ms_scolarite.models.Formation;
import com.msgroups.ms_scolarite.proxy.FormationProxy;
import com.msgroups.ms_scolarite.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api")
public class Controller {
    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    FormationProxy formationProxy;
    @GetMapping("etudiant/{id}")
    public Etudiant getEtudiantWithFormation(@PathVariable("id") Long ide)
    {
        Etudiant e = etudiantRep.findById(ide).get();
        Formation f = formationProxy.getFormation(e.getIdFormation());
        e.setFormation(f);
        return e;
    }

    @GetMapping("etdiant/name")
    public String getNameOfStudent(){
        return "hi";

    }

}