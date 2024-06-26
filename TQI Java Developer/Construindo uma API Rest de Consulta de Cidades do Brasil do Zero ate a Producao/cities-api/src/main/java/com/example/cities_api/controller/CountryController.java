package com.example.cities_api.controller;

import com.example.cities_api.repository.CountryRepository;
import com.example.cities_api.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Page<Country> pageCountries(Pageable page) {
        return countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        Optional<Country> optional = countryRepository.findById(id);

        if(optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
