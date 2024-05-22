package com.example.gestionelection.services;


import com.example.gestionelection.dao.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGestionUtilisateur  extends JpaRepository<Utilisateur,Integer> {


}
