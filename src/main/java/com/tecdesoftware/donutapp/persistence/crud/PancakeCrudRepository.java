package com.tecdesoftware.donutapp.persistence.crud;

import com.tecdesoftware.donutapp.persistence.entity.Pancake;
import org.springframework.data.repository.CrudRepository;

public interface PancakeCrudRepository extends CrudRepository<Pancake, Long> {
}
