package com.salesianostriana.dam.EjercicioEvaluacion.DTO;

import com.salesianostriana.dam.EjercicioEvaluacion.model.Museum;

public record MuseumResponseDto(Long id, String nombre, String ciudad, String anioApertura, int numSalas, String descripcion,
                                String urlInfo, String urlFoto) {

}
