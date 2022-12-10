package com.example.gestion_de_cours.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Table( name = "CoursClassroom")
public class CoursClassroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private String nom;
   private int nbHeures;
   private Boolean archive;
   @ManyToOne
    Classe classe;

}
