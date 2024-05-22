package com.example.gestionelection.services;


import com.example.gestionelection.dao.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionVote extends JpaRepository<Vote,Integer> {
}
