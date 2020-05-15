package borg.timon.springbootpetclinic.services;

import borg.timon.springbootpetclinic.model.Owner;
import borg.timon.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    void save(Pet pet);
    Set<Pet> findAll();
}
