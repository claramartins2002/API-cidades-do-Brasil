package com.estudos.Apicidades;

import com.estudos.Apicidades.entities.Cidades;
import com.estudos.Apicidades.repository.CidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadesService {
    private final CidadeRepository cidadeRepository;

    public CidadesService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public List<Cidades> cidadePorEstado(String estado) {
        return cidadeRepository.cidadePorEstado(estado);
    }

    public List<Cidades> cidades(){
        return cidadeRepository.cidadesOrdenadas();
    }
}
