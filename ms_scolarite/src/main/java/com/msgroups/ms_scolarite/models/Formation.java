package com.msgroups.ms_scolarite.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class Formation {
    private Long idFormation;
    private String nom;
    private int duree;
}