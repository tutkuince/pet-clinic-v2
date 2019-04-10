package com.muditasoft.petclinicv2.service;

import com.muditasoft.petclinicv2.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
