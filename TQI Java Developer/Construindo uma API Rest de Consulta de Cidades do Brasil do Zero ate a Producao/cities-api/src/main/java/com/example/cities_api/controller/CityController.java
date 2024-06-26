package com.example.cities_api.controller;

import com.example.cities_api.model.City;
import com.example.cities_api.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> pageCity(Pageable page) {
        return cityRepository.findAll(page);
    }
}
