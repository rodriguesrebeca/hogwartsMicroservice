package com.exercises.microservice.model;

import com.exercises.microservice.dto.house.House;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "aluno")
@Data
@Entity
@NoArgsConstructor
public class Wizard {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private String grade;

    @Column(name = "sorting_hat")
    private String sortingHat;

}
