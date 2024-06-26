package com.example.cities_api.repository;

import com.example.cities_api.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
