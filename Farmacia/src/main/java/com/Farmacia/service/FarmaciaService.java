package com.Farmacia.service;

import com.Farmacia.Domain.Farmacia;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface FarmaciaService {
    //Se obtiene un listado de categorias en un List
    //public List<Farmacia> getCategorias(boolean activos);
    public List<Farmacia> getCategorias();
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Farmacia getCategoria(Farmacia categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    //public void save(Farmacia categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    //public void delete(Farmacia categoria);
}
