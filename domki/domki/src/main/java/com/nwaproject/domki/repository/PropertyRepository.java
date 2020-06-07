package com.nwaproject.domki.repository;

import com.nwaproject.domki.repository.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {

}
