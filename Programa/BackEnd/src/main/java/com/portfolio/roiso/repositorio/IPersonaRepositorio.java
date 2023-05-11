package com.portfolio.roiso.repositorio;

import com.portfolio.roiso.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository <Persona, Long> {
    
}
