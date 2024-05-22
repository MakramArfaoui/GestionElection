package com.example.gestionelection.services;


import com.example.gestionelection.dao.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionAdministrateur extends JpaRepository<Administrateur,Integer> {
}
