package com.salesianostriana.dam.EjercicioEvaluacion.Repository;


import com.salesianostriana.dam.EjercicioEvaluacion.model.Museum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuseumRepository extends JpaRepository<Museum, Long> {
}
