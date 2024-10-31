package com.Farmacia.service;

import com.Farmacia.Domain.Productos;
import java.util.List;
import org.springframework.stereotype.Service;

public interface ProductosService {
    public List<Productos> getProductos();
    
    public Productos getCategoria(Productos producto);
}
