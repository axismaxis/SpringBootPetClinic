package borg.timon.springbootpetclinic.services;

import borg.timon.springbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName();
}
