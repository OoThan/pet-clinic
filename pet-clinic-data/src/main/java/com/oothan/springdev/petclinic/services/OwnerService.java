package com.oothan.springdev.petclinic.services;

import com.oothan.springdev.petclinic.models.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
