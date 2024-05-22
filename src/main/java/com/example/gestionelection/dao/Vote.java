package com.example.gestionelection.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "poste_id")
    private Poste poste;

    @ManyToOne
    @JoinColumn(name = "electeur_id")
    private Electeur electeur;

    @ManyToOne
    @JoinColumn(name = "election_id")
    private Election election;

    // En supposant que chaque vote est émis pour un seul candidat
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat;
}