package com.example.gestionelection.services;


import com.example.gestionelection.dao.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionCandidat extends JpaRepository<Candidat,Integer> {
}
