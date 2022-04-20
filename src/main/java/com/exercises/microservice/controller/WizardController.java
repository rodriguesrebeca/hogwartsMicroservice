package com.exercises.microservice.controller;

import com.exercises.microservice.dto.WizardRequest;
import com.exercises.microservice.dto.WizardResponse;
import com.exercises.microservice.service.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/wizard")
public class WizardController {

    @Autowired
    WizardService wizardService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public WizardResponse createWizard(@RequestBody WizardRequest wizardRequest){
        return wizardService.createWizard(wizardRequest);
    }

    @GetMapping("/{id}")
    public WizardResponse getWizardById(@PathVariable UUID id){
        return wizardService.getWizardById(id);
    }
}
