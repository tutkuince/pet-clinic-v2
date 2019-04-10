package com.muditasoft.petclinicv2.service;

import com.muditasoft.petclinicv2.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
