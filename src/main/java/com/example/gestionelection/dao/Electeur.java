package com.example.gestionelection.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Electeur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String numIdent;
    private String libMdp;
    private String libNom;
    private int libAge;
    private String nationalite;
}