package com.msgroups.msscolarite.Entities;

import jakarta.persistence.*;
import lombok.*;
import com.msgroups.msscolarite.Models.Formation;

import java.sql.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nom;

    @Temporal(TemporalType.DATE)
    private Date dateN;

    private String promo;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;

    @ManyToOne
    private Etablissement etablissement;

    private Long idFormation;

    @Transient
    private Formation formation;
}