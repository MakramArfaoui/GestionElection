package com.example.gestionelection.dao;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCandidat;
    private String libNom;
    private String libPoste;
    private String libPhoto;
    @ManyToOne
    private Poste poste;
}