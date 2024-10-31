package com.Farmacia.service.ServiceImplementation;

import com.Farmacia.dao.ProductosDao;
import com.Farmacia.Domain.Productos;
import com.Farmacia.service.ProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosServiceImp implements ProductosService{
    
    @Autowired
    private ProductosDao productosDao;
    
    @Override
    @Transactional(readOnly=true)

    public List<Productos> getProductos() {
        var lista=productosDao.findAll();

        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Productos getCategoria(Productos productos) {
        return productosDao.findById(productos.getId()).orElse(null);
    }
}
