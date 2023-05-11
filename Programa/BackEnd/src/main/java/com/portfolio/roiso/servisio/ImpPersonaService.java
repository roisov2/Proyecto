package com.portfolio.roiso.servisio;

import com.portfolio.roiso.Entidad.Persona;
import com.portfolio.roiso.interfas.IPersonaServicio;
import com.portfolio.roiso.repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaServicio {
@Autowired IPersonaRepositorio ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void delletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPerson(Long Id) {
      Persona persona = ipersonaRepository.findById(Id).orElse(null);
              return persona;
    }
    
}
