package com.nwaproject.domki.repository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Property {
    @Id
 private Long id;

}
