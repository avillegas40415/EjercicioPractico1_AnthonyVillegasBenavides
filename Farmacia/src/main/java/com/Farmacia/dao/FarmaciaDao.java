package com.Farmacia.dao;

import com.Farmacia.Domain.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaDao extends JpaRepository <Farmacia,Long>{
    
}
