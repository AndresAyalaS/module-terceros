package com.terceros.terceros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terceros.terceros.models.TercerosModel;
import com.terceros.terceros.repository.repository;

@Service
public class service implements iservice {

    @Autowired
    repository tercerosRepository;
    @Override
    public List<TercerosModel> findAll() {
        return tercerosRepository.findAll();
    }
    @Override
    public Optional<TercerosModel> findById(Long id) {
        return tercerosRepository.findById(id);
    }
    @Override
    public void save(TercerosModel tercerosModel) { tercerosRepository.save(tercerosModel); }
    @Override
    public void deleteById(Long id) {
        tercerosRepository.deleteById(id);

    }
}
