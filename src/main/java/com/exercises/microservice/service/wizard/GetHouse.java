package com.exercises.microservice.service.wizard;

import com.exercises.microservice.dto.house.House;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetHouse {

    public House execute(String housekey){

        String url = "https://api-harrypotter.herokuapp.com/house/{housekey}";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<House> house = restTemplate.exchange(url,
                HttpMethod.GET,
                entity,
                House.class,
                housekey);

        if(house.getStatusCode().isError()){
            return null;
        }
        return house.getBody();
    }
}
