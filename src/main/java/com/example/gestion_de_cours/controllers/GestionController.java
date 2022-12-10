package com.example.gestion_de_cours.controllers;

import com.example.gestion_de_cours.Service.IServiceGestion;
import com.example.gestion_de_cours.entities.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class GestionController {

    private IServiceGestion iServiceGestion;

    @PostMapping("/addutilisateur")
    @ResponseBody
    Utilisateur addutilisateur(@RequestBody Utilisateur utilisateur) {
        return iServiceGestion.ajouterUtilisateur(utilisateur);
    }

    @PostMapping("/ajouterClasse")
    Classe ajouterClasse(@RequestBody Classe classe) {
        return iServiceGestion.ajouterClasse(classe);
    }

    @PostMapping("/ajouterCoursClassroom{codeClasse}")
    CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom cc, @PathVariable("codeClasse") Integer codeClasse) {
        return iServiceGestion.ajouterCoursClassroom(cc,codeClasse);
    }

    @GetMapping("/nbHeuresParSpecEtNiv")
    Integer nbHeuresParSpecEtNiv(@RequestBody Specialite sp, @RequestBody Niveau nv) {
        return iServiceGestion.nbHeuresParSpecEtNiv(sp,nv);
    }


}
