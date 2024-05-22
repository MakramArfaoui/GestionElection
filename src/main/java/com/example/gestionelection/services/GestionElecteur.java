package com.example.gestionelection.services;



import com.example.gestionelection.dao.Electeur;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service

public class GestionElecteur {


    private final IGestionElecteur ige;



    public void ajouterElecteur (Electeur e){
        ige.save(e);

    }

    public List<Electeur> listerElecteur (){
        return ige.findAll();

    }

    public void supprimerElecteur (Integer id){
        ige.deleteById(id);


    }

    public void modifierElecteur (Electeur  e){
        ige.save(e);

    }

    public Electeur  rechercherElecteur (Integer id) {

        return ige.findById(id).orElse(null);

    }

}



