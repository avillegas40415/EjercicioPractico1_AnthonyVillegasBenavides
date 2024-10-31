package com.Farmacia.dao;

import com.Farmacia.Domain.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosDao extends JpaRepository <Productos,Long>{
    
}
