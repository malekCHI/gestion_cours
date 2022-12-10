package com.example.gestion_de_cours.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Table( name = "Classe")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer codeClasse ;
    String titre;
    //hadhy nhoutha khtre 9ali f base yhebha type string ken nhouthech tjini f base type int
    @Enumerated(EnumType.STRING)
    Niveau niveau;


    @OneToMany(mappedBy ="classe")
    private Set<CoursClassroom> coursClassrooms =new HashSet<>();
    @ManyToOne
    private Utilisateur utilisateur;
}
