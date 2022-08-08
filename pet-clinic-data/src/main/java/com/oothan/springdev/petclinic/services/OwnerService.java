package com.oothan.springdev.petclinic.services;

import com.oothan.springdev.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
