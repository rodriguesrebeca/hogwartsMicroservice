package com.exercises.microservice.dto;

import com.exercises.microservice.model.Wizard;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.exercises.microservice.dto.house.House;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WizardResponse {

    private UUID id;
    private String name;
    private String grade;
    @JsonProperty(value = "sorting-hat")
    private String sortingHat;
    private House house;

    public WizardResponse(Wizard wizard){
        id = wizard.getId();
        name = wizard.getName();
        grade = wizard.getGrade();
        sortingHat = wizard.getSortingHat();
    }

    public WizardResponse(Wizard wizard, House house){
        id = wizard.getId();
        name = wizard.getName();
        grade = wizard.getGrade();
        sortingHat = wizard.getSortingHat();
        this.house = house;
    }
}
