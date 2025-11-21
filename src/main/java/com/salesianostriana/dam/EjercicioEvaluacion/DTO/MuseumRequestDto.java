package com.salesianostriana.dam.EjercicioEvaluacion.DTO;

import com.salesianostriana.dam.EjercicioEvaluacion.model.Museum;

public record MuseumRequestDto(Long id, String nombre, String ciudad, String anioApertura, int numSalas, String descripcion,
                               String urlInfo, String urlFoto) {

    public Museum toEntity (MuseumRequestDto dto) {
        return new Museum(dto.id, dto.nombre, dto.ciudad, dto.anioApertura, dto.numSalas, dto.descripcion,
                dto.urlInfo, dto.urlFoto);
    }
}
