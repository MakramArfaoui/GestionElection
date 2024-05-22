package com.example.gestionelection.services;


import com.example.gestionelection.dao.Electeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionElecteur extends JpaRepository<Electeur,Integer> {
}
