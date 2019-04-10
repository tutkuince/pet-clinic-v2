package com.muditasoft.petclinicv2.service;

import com.muditasoft.petclinicv2.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
