package com.estudos.Apicidades;

import com.estudos.Apicidades.entities.Cidades;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/cidades")
public class CidadesController {
    private final CidadesService cidadesService;

    public CidadesController(CidadesService cidadesService) {
        this.cidadesService = cidadesService;
    }

    @GetMapping("{estado}")
    public ResponseEntity<List<Cidades>> cidades_por_estado(@PathVariable String estado) {
        return ResponseEntity.ok(cidadesService.cidadePorEstado(estado));
    }
    @GetMapping
    public ResponseEntity<List<Cidades>> cidades(){
        return ResponseEntity.ok(cidadesService.cidades());
    }
}
