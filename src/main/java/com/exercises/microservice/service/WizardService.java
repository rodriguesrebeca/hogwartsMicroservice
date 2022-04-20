package com.exercises.microservice.service;

import com.exercises.microservice.dto.WizardRequest;
import com.exercises.microservice.dto.WizardResponse;
import com.exercises.microservice.dto.house.House;
import com.exercises.microservice.model.Wizard;
import com.exercises.microservice.repository.WizardRepository;
import com.exercises.microservice.service.wizard.GetHouse;
import com.exercises.microservice.service.wizard.GetSortingHat;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WizardService {

    @Autowired
    private final WizardRepository wizardRepository;

    @Autowired
    private final GetSortingHat getSortingHat;

    @Autowired
    private final GetHouse getHouse;


    public WizardResponse createWizard(WizardRequest wizardRequest){
        Wizard wizard = new Wizard();

        wizard.setName(wizardRequest.getName());
        wizard.setGrade(wizardRequest.getGrade());
        wizard.setSortingHat(getSortingHat.execute().getSortingHatChoice());

        wizardRepository.save(wizard);

        return new WizardResponse(wizard);
    }

    public WizardResponse getWizardById(UUID id){
        Wizard wizard = wizardRepository.findById(id).orElseThrow();

        String findHouse = wizard.getSortingHat();

        House house = getHouse.execute(findHouse);

        return new WizardResponse(wizard, house);
    }

}
