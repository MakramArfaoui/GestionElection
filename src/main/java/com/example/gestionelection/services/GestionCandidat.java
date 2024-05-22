package com.example.gestionelection.services;

import com.example.gestionelection.dao.Candidat;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class GestionCandidat {
    private final IGestionCandidat igc;



    public void ajouterCandidat (Candidat c){
        igc.save(c);

    }

    public List<Candidat> listerCandidat(){
        return igc.findAll();

    }

    public void supprimerCandidat (Integer id){
        igc.deleteById(id);


    }

    public void modifierElecteur (Candidat c){
        igc.save(c);

    }

    public Candidat rechercherCandidat(Integer id) {

        return igc.findById(id).orElse(null);

    }

}


