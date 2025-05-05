//Imports, vscode should auto add these as needed
package com.terceros.terceros.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terceros.terceros.models.TercerosModel;
import com.terceros.terceros.repository.repository;



@RestController
@RequestMapping("/api")
public class TercerosController {

    // Property to hold our repository
    public repository repoterceros;

    // Constructor that receives the repository via dependency injection
    public TercerosController(repository terceros){
        this.repoterceros = terceros;
    }

    // Get to /terceros that returns list of terceros
    @GetMapping("/terceros")
    public List<TercerosModel> getTerceros(){
        return repoterceros.findAll(); // Returns all terceros!
    }

    // Post to /terceros, takes in request body which must be of type terceros
    @PostMapping("/terceros")
    public List<TercerosModel> createTerceros(@RequestBody TercerosModel newTerceros){
        repoterceros.save(newTerceros); //creates new tercero
        return repoterceros.findAll(); // returns all 
    }

    // put to /terceros/:id, takes in the body and url param id
    @PutMapping("/terceros/{id}")
    public TercerosModel getById(@PathVariable("id") Long id) throws Exception {
        TercerosModel std = repoterceros.findById(id).orElseThrow(() -> new Exception("No existe"));
        return std;
    }

    // delete request to /terceros/:id, deletes terceros based on id param
    @DeleteMapping("/terceros/{id}")
    public List<TercerosModel> deleteCat(@PathVariable Long id){
        repoterceros.deleteById(id);
        return repoterceros.findAll();
    }

}