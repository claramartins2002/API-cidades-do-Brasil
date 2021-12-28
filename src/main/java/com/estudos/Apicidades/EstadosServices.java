package com.estudos.Apicidades;

import com.estudos.Apicidades.entities.Estados;
import com.estudos.Apicidades.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadosServices {
    private final EstadoRepository estadoRepository;

    public EstadosServices(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estados> listar() {
        return estadoRepository.findAll();
    }
}
