package com.terceros.terceros.service;

import com.terceros.terceros.models.TercerosModel;

import java.util.List;
import java.util.Optional;

public interface iservice {
    List<TercerosModel> findAll();
    Optional<TercerosModel> findById(Long id);
    void save(TercerosModel clientEntity);
    void deleteById(Long id);
}

