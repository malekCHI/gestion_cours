package com.example.gestion_de_cours.Service;

import com.example.gestion_de_cours.entities.*;

public interface IServiceGestion {

    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);

    public Classe ajouterClasse (Classe c);
    public CoursClassroom ajouterCoursClassroom (CoursClassroom cc, Integer codeClasse);

    public void affecterUtilisateurClasse (Integer idUtilisateur, Integer codeClasse);

    public Integer nbUtilisateursParNiveau(Niveau nv);

    public void archiverCoursClassrooms();

    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv);
}
