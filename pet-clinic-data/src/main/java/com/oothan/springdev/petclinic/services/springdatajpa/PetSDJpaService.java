package com.oothan.springdev.petclinic.services.springdatajpa;

import com.oothan.springdev.petclinic.models.Pet;
import com.oothan.springdev.petclinic.repositories.PetRepository;
import com.oothan.springdev.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By oothan on Jul, 2022
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

 private final PetRepository petRepository;

 public PetSDJpaService(PetRepository petRepository) {
  this.petRepository = petRepository;
 }

 @Override
 public Set<Pet> findAll() {
  Set<Pet> pets = new HashSet<>();
  petRepository.findAll().forEach(pets::add);
  return pets;
 }

 @Override
 public Pet findById(Long aLong) {
  return petRepository.findById(aLong).orElse(null);
 }

 @Override
 public Pet save(Pet object) {
  return petRepository.save(object);
 }

 @Override
 public void delete(Pet object) {
  petRepository.delete(object);
 }

 @Override
 public void deleteById(Long aLong) {
  petRepository.deleteById(aLong);
 }
}
