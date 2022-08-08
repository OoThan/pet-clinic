package com.oothan.springdev.petclinic.repositories;

import com.oothan.springdev.petclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By oothan on Jun, 2022
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
