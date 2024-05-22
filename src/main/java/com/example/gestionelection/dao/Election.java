package com.example.gestionelection.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idElection;
    private Date dateDebut;
    private Date dateFin;

    @OneToMany(mappedBy = "election")
    private List<Vote> votes;

}
