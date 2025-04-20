package com.msgroups.msscolarite.Api;

import com.msgroups.msscolarite.Models.Formation;
import com.msgroups.msscolarite.Entities.Etudiant;
import com.msgroups.msscolarite.Proxy.FormationProxy;
import com.msgroups.msscolarite.Repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("api")
public class Controller {
    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    FormationProxy formationProxy;

    @GetMapping("/etudiant/{ide}")
    public Etudiant getEtudiantWithFormation(@PathVariable("ide") Long ide) {
        Etudiant e = etudiantRep.findById(ide).get();
        Formation f1 = formationProxy.getFormation(e.getIdFormation());
        e.setFormation(f1);
        return e;
    }

    @GetMapping("/etudiant/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantRep.findAll();

    }
}