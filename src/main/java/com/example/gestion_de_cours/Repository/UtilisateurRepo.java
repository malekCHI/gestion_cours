package com.example.gestion_de_cours.Repository;

import com.example.gestion_de_cours.entities.Niveau;
import com.example.gestion_de_cours.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Utilisateur,Integer>{
    Integer countByClasseNiveau(Niveau niveau);
}
