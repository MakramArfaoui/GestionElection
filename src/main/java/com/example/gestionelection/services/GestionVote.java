package com.example.gestionelection.services;


import com.example.gestionelection.dao.Vote;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;


@Data
@Service

    public class GestionVote {

        private final IGestionVote igv;



        public void ajouterVote(Vote v){
            igv.save(v);

        }

        public List<Vote> listerVote(){
            return igv.findAll();

        }

        public void supprimerVote(Integer id){
            igv.deleteById(id);


        }

        public void modifierUtilisateur(Vote v){
            igv.save(v);

        }

        public   Vote rechercherVote(Integer id) {

            return igv.findById(id).orElse(null);

        }

    }

