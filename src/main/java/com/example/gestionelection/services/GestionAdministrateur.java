package com.example.gestionelection.services;



import com.example.gestionelection.dao.Administrateur;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class GestionAdministrateur {

    private final IGestionAdministrateur iga;



    public void ajouterAdministrateur (Administrateur a){
        iga.save(a);

    }

    public List<Administrateur> listerAdministrateur(){
        return iga.findAll();

    }

    public void supprimerAdministrateur(Integer id){
        iga.deleteById(id);


    }

    public void modifierAdministrateur (Administrateur a){
        iga.save(a);

    }

    public Administrateur rechercherAdministrateur(Integer id) {

        return iga.findById(id).orElse(null);

    }

}
