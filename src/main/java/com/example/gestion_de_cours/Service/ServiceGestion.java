package com.example.gestion_de_cours.Service;

import com.example.gestion_de_cours.Repository.ClasseRepo;
import com.example.gestion_de_cours.Repository.CoursClassRoomRepo;
import com.example.gestion_de_cours.Repository.UtilisateurRepo;
import com.example.gestion_de_cours.entities.*;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceGestion implements IServiceGestion{

    private UtilisateurRepo utilisateurRepo;
    private ClasseRepo classeRepo;
    private CoursClassRoomRepo coursClassRoomRepo;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepo.save(c);
    }

    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe classe = classeRepo.findById(codeClasse).orElse(null);
        cc.setClasse(classe);
        return coursClassRoomRepo.save(cc);
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur utilisateur = utilisateurRepo.findById(idUtilisateur).orElse(null);
        Classe classe = classeRepo.findById(codeClasse).orElse(null);

        utilisateur.setClasse(classe);
        utilisateurRepo.save(utilisateur);
    }

    @Override
    public Integer nbUtilisateursParNiveau(Niveau nv) {
         return utilisateurRepo.countByClasseNiveau(nv);
    }
    @Scheduled(cron = "*/60 * * * * *")
    @Override
    public void archiverCoursClassrooms() {
        List<CoursClassroom> coursClassrooms = coursClassRoomRepo.findAll();
        for (CoursClassroom cc: coursClassrooms ){
            cc.setArchive(true);
            coursClassRoomRepo.save(cc);
        }
    }

    @Override
    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv) {

        return coursClassRoomRepo.findCoursClassroomBySpecialiteAndClasseNiveau(sp,nv).getNbHeures();
    }
}
