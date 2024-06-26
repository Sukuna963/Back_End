package com.example.cities_api.controller;

import com.example.cities_api.model.State;
import com.example.cities_api.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public Page<State> pageState(Pageable page) {
        return stateRepository.findAll(page);
    }
}
