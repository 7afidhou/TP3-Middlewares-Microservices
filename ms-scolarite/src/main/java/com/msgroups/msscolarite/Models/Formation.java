package com.msgroups.msscolarite.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
    private Long idFormation;
    private String nom;
    private int duree; }