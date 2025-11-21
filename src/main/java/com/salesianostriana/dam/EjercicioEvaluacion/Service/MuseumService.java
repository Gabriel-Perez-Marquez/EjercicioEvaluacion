package com.salesianostriana.dam.EjercicioEvaluacion.Service;

import com.salesianostriana.dam.EjercicioEvaluacion.DTO.MuseumResponseDto;
import com.salesianostriana.dam.EjercicioEvaluacion.Repository.MuseumRepository;
import com.salesianostriana.dam.EjercicioEvaluacion.model.Museum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MuseumService {

    private final MuseumRepository museumRepository;

    public List<Museum> getAll(){
        return museumRepository.findAll();
    }

    public Museum getById(Long id){
        return museumRepository.findById(id).orElseThrow();
    }

    public void newMuseum(Museum m){
        museumRepository.save(m);
    }

    public void editMuseum (Museum m){
        museumRepository.save(m);
    }


}
