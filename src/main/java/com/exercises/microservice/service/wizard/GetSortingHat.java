package com.exercises.microservice.service.wizard;

import com.exercises.microservice.dto.house.SortingHat;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetSortingHat {

    public SortingHat execute() {

        String url = "https://api-harrypotter.herokuapp.com/sortinghat";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, SortingHat.class);
    }

}
