package com.example.gestionelection.services;

import com.example.gestionelection.dao.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionElection extends JpaRepository<Election,Integer> {

}
