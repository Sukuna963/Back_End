package com.dio.herosAPI.controller;

import com.dio.herosAPI.model.Hero;
import com.dio.herosAPI.repository.HeroesRepository;
import com.dio.herosAPI.service.HeroesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/heroes")
@Slf4j
public class HeroesController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HeroesController.class);

    HeroesService heroesService;
    HeroesRepository heroesRepository;

    public HeroesController(HeroesService heroesService, HeroesRepository heroesRepository) {
        this.heroesService = heroesService;
        this.heroesRepository = heroesRepository;
    }

    @GetMapping
    public Flux<Hero> getAllHeroes() {
        log.info("requesting the list off all heroes");
        return heroesService.findAllHeroes();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Hero>> findByIdHero(@PathVariable String id) {
        log.info("requesting the hero with id {}", id);
        return heroesService.findByIdHero(id)
                .map(item -> new ResponseEntity<>(item, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Hero> createHero(@RequestBody Hero heroes) {
        log.info("a new hero was created");
        return heroesService.saveHero(heroes);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Mono<HttpStatus> deleteByIdHero(@PathVariable String id) {
        log.info("deleting a hero with id {}", id);
        heroesService.deleteHero(id);
        return Mono.just(HttpStatus.ACCEPTED);
    }
}
