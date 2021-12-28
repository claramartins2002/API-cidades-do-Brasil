package com.estudos.Apicidades.repository;

import com.estudos.Apicidades.entities.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estados, Long> {
}
