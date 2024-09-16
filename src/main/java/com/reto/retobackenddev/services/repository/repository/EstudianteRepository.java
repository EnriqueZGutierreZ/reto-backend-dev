package com.reto.retobackenddev.services.repository.repository;

/**
 * Created by [EnriqueZGutierreZ]
 */


import com.reto.retobackenddev.data.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
