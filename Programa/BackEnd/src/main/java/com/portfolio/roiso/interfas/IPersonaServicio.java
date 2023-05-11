package com.portfolio.roiso.interfas;

import com.portfolio.roiso.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void delletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPerson(Long Id);
}
