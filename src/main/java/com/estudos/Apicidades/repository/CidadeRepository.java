package com.estudos.Apicidades.repository;

import com.estudos.Apicidades.entities.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidades, Long> {
    @Query(value = "select * from cidade where codigo_estado =(select codigo_estado from estado where sigla = :estado)", nativeQuery = true)
    List<Cidades> cidadePorEstado(@Param("estado") String estado);

    @Query(value = "select * from cidade order by codigo_estado", nativeQuery = true)
    List<Cidades> cidadesOrdenadas();
}
