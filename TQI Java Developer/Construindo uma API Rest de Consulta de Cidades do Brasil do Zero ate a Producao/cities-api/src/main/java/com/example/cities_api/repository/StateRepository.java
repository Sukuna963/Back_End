package com.example.cities_api.repository;

import com.example.cities_api.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
