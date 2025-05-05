package com.terceros.terceros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.terceros.terceros.models.TercerosModel;



public interface repository extends JpaRepository<TercerosModel, Long> {

}