package com.exercises.microservice.dto.house;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SortingHat {

    @JsonProperty("sorting-hat-choice")
    private String sortingHatChoice;
}
