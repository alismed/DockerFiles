package com.itau.agro.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String description;
    private String release_train;
    private String squad;
    private String owner;
    private String plan;
    private Boolean closed;
    private String planned_for;
    private Date created_at;
    private Date updated_at;
}
