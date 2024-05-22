package com.example.gestionelection.services;


import com.example.gestionelection.dao.Poste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionPoste extends JpaRepository<Poste,Integer> {
}
