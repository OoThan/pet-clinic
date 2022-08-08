package com.oothan.springdev.petclinic.repositories;

import com.oothan.springdev.petclinic.models.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By oothan on Jun, 2022
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
