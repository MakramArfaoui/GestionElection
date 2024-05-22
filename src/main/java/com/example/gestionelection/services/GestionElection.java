package com.example.gestionelection.services;

import com.example.gestionelection.dao.Election;
import lombok.Data;
import org.springframework.stereotype.Service;


import java.util.List;

@Data
@Service
public class GestionElection {


    private final IGestionElection ige;



    public void ajouterElection (Election  e){
        ige.save(e);

    }

    public List<Election > listerElection (){
        return ige.findAll();

    }

    public void supprimerElection (Integer id){
        ige.deleteById(id);


    }

    public void modifierElection (Election  e){
        ige.save(e);

    }

    public Election  rechercherElection (Integer id) {

        return ige.findById(id).orElse(null);

    }

}

