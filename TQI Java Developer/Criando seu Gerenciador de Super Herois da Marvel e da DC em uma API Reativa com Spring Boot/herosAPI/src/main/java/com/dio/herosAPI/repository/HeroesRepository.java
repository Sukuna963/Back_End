package com.dio.herosAPI.repository;

import com.dio.herosAPI.model.Hero;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Hero, String> {
}
