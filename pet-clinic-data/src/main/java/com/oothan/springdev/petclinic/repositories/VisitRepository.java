package com.oothan.springdev.petclinic.repositories;

import com.oothan.springdev.petclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By oothan on Jun, 2022
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
