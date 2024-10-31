package com.Farmacia.service.ServiceImplementation;

import com.Farmacia.dao.FarmaciaDao;
import com.Farmacia.Domain.Farmacia;
import com.Farmacia.service.FarmaciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FarmaciaServiceImp implements FarmaciaService{
    
    @Autowired
    private FarmaciaDao farmaciaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Farmacia> getCategorias() {
        var lista=farmaciaDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Farmacia getCategoria(Farmacia farmacia) {
        return farmaciaDao.findById(farmacia.getId()).orElse(null);
    }
}
