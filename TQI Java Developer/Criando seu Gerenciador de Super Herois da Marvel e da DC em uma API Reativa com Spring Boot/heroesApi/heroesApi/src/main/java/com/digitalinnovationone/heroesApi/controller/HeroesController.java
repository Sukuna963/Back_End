package com.digitalinnovationone.heroesApi.controller;


import com.digitalinnovationone.heroesApi.model.Heroes;
import com.digitalinnovationone.heroesApi.repository.HeroesRepository;
import com.digitalinnovationone.heroesApi.service.HeroesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.digitalinnovationone.heroesApi.constans.HeroesConstant.HEROES_ENDPOINT_LOCAL;

@RestController
@Slf4j
public class HeroesController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HeroesController.class);

    HeroesService heroesService;
    HeroesRepository heroesRepository;

    public HeroesController(HeroesService heroesService, HeroesRepository heroesRepository) {
        this.heroesService = heroesService;
        this.heroesRepository = heroesRepository;
    }

    @GetMapping(HEROES_ENDPOINT_LOCAL)
    public Flux<Heroes> getAllHeroes() {
        log.info("requesting the list off all heroes");
        return heroesService.findAllHeroes();
    }

    @GetMapping(HEROES_ENDPOINT_LOCAL + "id")
    public Mono<ResponseEntity<Heroes>> findByIdHero(@PathVariable String id) {
        log.info("requesting the hero with id {}", id);
        return heroesService.findByIdHero(id)
                .map(item -> new ResponseEntity<>(item, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(HEROES_ENDPOINT_LOCAL)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Heroes> createHero(@RequestBody Heroes heroes) {
        log.info("a new hero was created");
        return heroesService.saveHero(heroes);
    }

    @DeleteMapping(HEROES_ENDPOINT_LOCAL + "id")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Mono<HttpStatus> deleteByIdHero(@PathVariable String id) {
        log.info("deleteing a hero with id {}", id);
        heroesService.deleteHero(id);
        return Mono.just(HttpStatus.ACCEPTED);
    }

}
