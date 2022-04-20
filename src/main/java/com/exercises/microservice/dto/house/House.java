package com.exercises.microservice.dto.house;

import com.exercises.microservice.model.Wizard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {

    private String name;
    private String animal;
    private String founder;
    private List<Values> values;
}
