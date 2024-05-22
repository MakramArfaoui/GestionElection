package com.example.gestionelection.services;


import com.example.gestionelection.dao.Poste;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class GestionPoste {

        private final IGestionPoste igp;



        public void ajouterPoste(Poste p){
            igp.save(p);

        }

        public List<Poste> listerPoste(){
            return igp.findAll();

        }

        public void supprimerPoste(Integer id){
            igp.deleteById(id);


        }

        public void modifierUtilisateur(Poste p){
            igp.save(p);

        }

        public   Poste rechercherPoste(Integer id) {

            return igp.findById(id).orElse(null);

        }

    }

