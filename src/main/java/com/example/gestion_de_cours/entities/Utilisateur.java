package com.example.gestion_de_cours.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Table( name = "utilisateur")
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private  int idUtilisateur;
    private String prenom;
    private String nom;
    private String password;



    @ManyToOne Classe classe;
    @OneToMany(mappedBy = "utilisateur")
    Set<Classe>classes= new HashSet<>();

}
