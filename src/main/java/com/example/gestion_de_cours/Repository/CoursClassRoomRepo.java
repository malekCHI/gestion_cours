package com.example.gestion_de_cours.Repository;

import com.example.gestion_de_cours.entities.CoursClassroom;
import com.example.gestion_de_cours.entities.Niveau;
import com.example.gestion_de_cours.entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursClassRoomRepo  extends JpaRepository<CoursClassroom,Integer> {

    CoursClassroom findCoursClassroomBySpecialiteAndClasseNiveau(Specialite sp, Niveau nv);
}
