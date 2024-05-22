package com.example.gestionelection.services;

import com.example.gestionelection.dao.Poste;
import com.example.gestionelection.dao.Utilisateur;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class GestionUtilisateur {
    private final IGestionUtilisateur igu;



    public void ajouterUtilisateur(Utilisateur u){
        igu.save(u);

    }

    public List<Utilisateur> listerUtilisateur(){
        return igu.findAll();

    }

   public void supprimerUtilisateur(Integer id){
        igu.deleteById(id);


    }

   public void modifierUtilisateur(Utilisateur u){
        igu.save(u);

    }

  public   Utilisateur rechercherUtilisateur(Integer id) {

        return igu.findById(id).orElse(null);

    }

}
