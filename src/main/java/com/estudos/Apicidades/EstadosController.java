package com.estudos.Apicidades;

import com.estudos.Apicidades.entities.Estados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstadosController {
    private final EstadosServices estadosServices;

    public EstadosController(EstadosServices estadosServices) {
        this.estadosServices = estadosServices;
    }

    @GetMapping
    public List<Estados> listar(){
        return estadosServices.listar();
    }
}
