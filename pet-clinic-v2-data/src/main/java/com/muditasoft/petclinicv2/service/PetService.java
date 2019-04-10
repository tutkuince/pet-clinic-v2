package com.muditasoft.petclinicv2.service;


import com.muditasoft.petclinicv2.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
