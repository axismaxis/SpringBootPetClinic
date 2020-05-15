package borg.timon.springbootpetclinic.services;

import borg.timon.springbootpetclinic.model.Owner;
import borg.timon.springbootpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    void save(Vet vet);
    Set<Vet> findAll();
}
