package com.salesianostriana.dam.EjercicioEvaluacion.Controller;

import com.salesianostriana.dam.EjercicioEvaluacion.DTO.MuseumResponseDto;
import com.salesianostriana.dam.EjercicioEvaluacion.Service.MuseumService;
import com.salesianostriana.dam.EjercicioEvaluacion.model.Museum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(name = "Controlador museos", description = "Controlador para gestionar los museos locales")
public class MainController {

    private final MuseumService museumService;




    @GetMapping("/museum")
    @Operation(description = "Obtiene todos los museos")
    @ApiResponses({
        @ApiResponse(responseCode = "200", content = @Content(
                mediaType = "application/json",
                array = @ArraySchema( arraySchema = @Schema(implementation = MuseumResponseDto.class))

        )),
        @ApiResponse(responseCode = "404", content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = ProblemDetail.class
                )
        ))
    })
    public List<Museum> getAll(){
        return museumService.getAll();
    }

    @GetMapping("/museum/{id}")
    @Operation(description = "Obtiene un museo en concreto")
    @ApiResponses({
        @ApiResponse(responseCode = "200", content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Museum.class),
                examples = @ExampleObject(

                )

        )),
        @ApiResponse(responseCode = "404", content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = Problem.class)
        ))
    })
    public Museum getMuseum (@PathVariable Long id) {
        return museumService.getById(id);
    }


    @PostMapping("/museum")
    public void newMuseum(@ModelAttribute Museum m){
        museumService.newMuseum(m);
    }

    @PutMapping("/museum/{id}")
    public void editMuseum (@PathVariable Long id){

    }


}
