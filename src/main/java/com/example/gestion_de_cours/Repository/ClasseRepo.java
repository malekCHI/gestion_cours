package com.example.gestion_de_cours.Repository;

import com.example.gestion_de_cours.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepo extends JpaRepository<Classe,Integer> {
}
