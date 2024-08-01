package com.dio.herosAPI.service;

import com.dio.herosAPI.model.Hero;
import com.dio.herosAPI.repository.HeroesRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeroesService {

    private final HeroesRepository heroesRepository;

    public HeroesService(HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
    }

    public Flux<Hero> findAllHeroes() {
        return Flux.fromIterable(this.heroesRepository.findAll());
    }

    public Mono<Hero> findByIdHero(String id) {
        return Mono.justOrEmpty(this.heroesRepository.findById(id));
    }

    public Mono<Hero> saveHero(Hero heroes) {
        return Mono.justOrEmpty(this.heroesRepository.save(heroes));
    }

    public Mono<Boolean> deleteHero(String id) {
        this.heroesRepository.deleteById(id);
        return Mono.just(true);
    }
}
