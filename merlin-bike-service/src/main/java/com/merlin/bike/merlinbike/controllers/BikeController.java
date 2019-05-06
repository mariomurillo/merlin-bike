package com.merlin.bike.merlinbike.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merlin.bike.merlinbike.dtos.BikeDto;
import com.merlin.bike.merlinbike.service.BikeService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bike")
public class BikeController {

    private BikeService service;

    @PostMapping
    public Mono<ResponseEntity<BikeDto>> createBike(final BikeDto bike) {

        return service.save(bike);
    }
}
