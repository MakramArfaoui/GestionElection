package com.example.gestionelection.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Poste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_poste;
    private String lib_nom_poste;

    @OneToMany(mappedBy = "poste")
    private List<Candidat> candidats;


    public String listerPoste() {
        return "Poste{" + "id_poste=" + id_poste + ", lib_nom_poste='" + lib_nom_poste + '\'' + '}';
    }}